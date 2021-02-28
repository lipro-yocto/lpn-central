#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#
# ACTIVE: <<image::inherit::central-image>>
#

SUMMMARY = "Central Base System"
DESCRIPTION = "The basic set of packages required for a Central system"
LICENSE = "MIT"
PR = "r0"

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# For backwards compatibility after rename
RPROVIDES_packagegroup-base-central = "packagegroup-central-base"
RREPLACES_packagegroup-base-central = "packagegroup-central-base"
RCONFLICTS_packagegroup-base-central = "packagegroup-central-base"

RDEPENDS_${PN} = " \
"

RRECOMMENDS_${PN} = " \
"
