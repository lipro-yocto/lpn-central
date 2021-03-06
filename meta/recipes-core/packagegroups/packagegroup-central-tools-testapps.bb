#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#
# ACTIVE: <<image::inherit::central-image>>
#     &&  <<image::feature::tools-testapps>>
#

SUMMMARY = "Central Testing tools/applications"
DESCRIPTION = "The testing set of packages required for a Central system"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

# Event device test tools
EVTOOLS = " \
    evtest \
"

# Simple memmory access tools
MEMTOOLS = " \
    devmem2 \
    libuio \
"

# Simple serial bus tools
SERBUSTOOLS = " \
    i2c-tools \
    spitools \
"

# Requires Serial to work
USE_SERIAL = " \
    picocom \
    serial-forward \
"

RDEPENDS_${PN} = " \
    ${EVTOOLS} \
    ${MEMTOOLS} \
    ${SERBUSTOOLS} \
    ${@bb.utils.contains('MACHINE_FEATURES', 'serial', '${USE_SERIAL}', '',d)} \
"

RRECOMMENDS_${PN} = " \
"
