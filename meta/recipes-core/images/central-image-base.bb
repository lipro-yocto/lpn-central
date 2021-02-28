#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

SUMMARY = "A console-only image that fully supports the target device \
hardware provided by Central."

LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += " \
    package-management \
    splash \
"

inherit central-image
