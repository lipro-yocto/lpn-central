#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

SUMMARY = "A console-only image that fully supports the target device \
hardware for debugging development provided by Central."

LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-openssh \
    eclipse-debug \
    tools-debug \
    tools-profile \
    tools-cross \
    tools-sdk \
    dev-pkgs \
    dbg-pkgs \
    src-pkgs \
"

inherit central-image
