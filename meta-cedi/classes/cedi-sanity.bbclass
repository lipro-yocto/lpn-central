# Provide some extensions to poky/meta/classes/sanity.bbclass to handle
# Cedi specific configuration file upgrades on demand if needed.
#
# BBLAYERS_CONF_UPDATE_FUNCS
#     Functions added to this variable MUST throw a NotImplementedError()
#     exception unless they successfully changed the config version in the
#     configuration file. Exceptions are used since exec_func doesn't handle
#     return values.
#

python cedi_update_bblayersconf() {
    current_version = int(d.getVar('CEDI_BBLAYERS_CONF_VERSION', True) or -1)
    latest_version = int(d.getVar('REQUIRED_CEDI_BBLAYERS_CONF_VERSION', True) or -1)
    if current_version == -1 or latest_version == -1:
        # one or the other missing => malformed configuration
        raise NotImplementedError("You need to update bblayers.conf manually for this version transition")

    success = True
    lines = []

    # add any additional layer checks/changes here

    if success:
        current_version = latest_version
        bblayers_fn = bblayers_conf_file(d)
        lines = sanity_conf_read(bblayers_fn)
        # sanity_conf_update() will erroneously find a match when the var name
        # is used in a comment, so do our own here. The code below can be
        # removed when sanity_conf_update() is fixed in OE-Core.
        #sanity_conf_update(bblayers_fn, lines, 'CEDI_BBLAYERS_CONF_VERSION', current_version)
        index, line = sanity_conf_find_line(r'^CEDI_BBLAYERS_CONF_VERSION', lines)
        lines[index] = 'CEDI_BBLAYERS_CONF_VERSION = "%d"\n' % current_version
        with open(bblayers_fn, "w") as f:
            f.write(''.join(lines))
        bb.note("Your conf/bblayers.conf has been automatically updated.")
    if success:
        return

    raise NotImplementedError("You need to update bblayers.conf manually for this version transition")
}

# ensure our function runs after the Poky and OE-Core one
BBLAYERS_CONF_UPDATE_FUNCS += "conf/bblayers.conf:CEDI_BBLAYERS_CONF_VERSION:REQUIRED_CEDI_BBLAYERS_CONF_VERSION:cedi_update_bblayersconf"
