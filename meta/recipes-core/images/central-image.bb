#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require central-image-base.bb

SUMMARY = "A product image capable of allowing an Central \
device to boot and provides full feature support."

DESCRIPTION = "A product image capable of allowing an Central \
device to boot in graphical mode and provides full feature support."

LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11-base', '', d)} \
"

inherit central-image
