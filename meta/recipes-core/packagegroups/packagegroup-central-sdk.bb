#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#
# ACTIVE: <<image::inherit::central-image>>
#     &&  <<image::feature::tools-sdk>>
#

SUMMMARY = "Central Development System"
DESCRIPTION = "The development set of packages required for a Central system"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

# For backwards compatibility after rename
RPROVIDES_packagegroup-central-sdk = "packagegroup-central-dev"
RREPLACES_packagegroup-central-sdk = "packagegroup-central-dev"
RCONFLICTS_packagegroup-central-sdk = "packagegroup-central-dev"

RDEPENDS_${PN} = " \
"

RRECOMMENDS_${PN} = " \
"
