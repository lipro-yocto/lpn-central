#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#
# ACTIVE: <<image::inherit::central-image>>
#

SUMMMARY = "Central Minimal Boot Requirements"
DESCRIPTION = "The minimal set of packages required to boot a Central system"
LICENSE = "MIT"
PR = "r0"

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

#
# Set by the machine configuration with packages essential
# for Central device bootup.
#
MACHINE_ESSENTIAL_EXTRA_CENTRAL_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_CENTRAL_RRECOMMENDS ?= ""

# For backwards compatibility after rename
RPROVIDES_packagegroup-central-boot = "packagegroup-boot-central"
RREPLACES_packagegroup-central-boot = "packagegroup-boot-central"
RCONFLICTS_packagegroup-central-boot = "packagegroup-boot-central"

RDEPENDS_${PN} = " \
    ${MACHINE_ESSENTIAL_EXTRA_CENTRAL_RDEPENDS} \
"

RRECOMMENDS_${PN} = " \
    ${MACHINE_ESSENTIAL_EXTRA_CENTRAL_RRECOMMENDS} \
"
