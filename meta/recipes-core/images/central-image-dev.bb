#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

SUMMARY = "A console-only image that fully supports the target device \
hardware for development provided by Central."

LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-openssh \
    tools-cross \
    tools-sdk \
    tools-testapps \
    ptest-pkgs \
"

inherit central-image
