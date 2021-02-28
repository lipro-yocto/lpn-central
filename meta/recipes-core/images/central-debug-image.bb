#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require central-image-debug.bb
require central-image.bb

SUMMARY = "A debugging image just capable of allowing an Central device \
to boot."

DESCRIPTION = "A developer image just capable of allowing an Central \
device to boot in graphical mode and is suitable for full featured \
debugging and development work."

LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += " \
    qt5-sdk \
"

inherit central-image
