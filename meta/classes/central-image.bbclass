# Common code for generating Central reference images
#
# Copyright (C) 2016-2021 Li-Pro.Net, Stephan Linz
#

LIC_FILES_CHKSUM = "file://${CENTRALCOREBASE}/LICENSE;md5=4d183b8707e22082e5a8c5ad268e5149"

# IMAGE_FEATURES control content of the Central reference images
#
# By default we install packagegroup-central-boot and packagegroup-base-central packages;
# this gives us working (console only) Central rootfs.
#
# Available IMAGE_FEATURES:
#
# - qt5-sdk          - Qt5/X11 SDK and demo applications
# - tools-cross      - tools usable for basic cross development
FEATURE_PACKAGES_qt5-sdk = "packagegroup-qt5-toolchain-target packagegroup-qt5-qtcreator-debug"
FEATURE_PACKAGES_tools-cross = ""
# Provides the Central specific features 'qt5-sdk' and 'tools-cross'.

# IMAGE_FEATURES_REPLACES_foo = 'bar1 bar2'
# Including image feature foo would replace the image features 'bar1' and 'bar2'.

# IMAGE_FEATURES_CONFLICTS_foo = 'bar1 bar2'
# An error exception would be raised if both image features 'foo' and 'bar1'(or 'bar2') are included.

CENTRAL_IMAGE_BASE_INSTALL = '\
    packagegroup-central-boot \
    packagegroup-base-central \
    \
    ${@bb.utils.contains("IMAGE_FEATURES", "tools-cross", "packagegroup-central-tools-cross", "", d)} \
    ${@bb.utils.contains("IMAGE_FEATURES", "tools-debug", "packagegroup-central-tools-debug", "", d)} \
    ${@bb.utils.contains("IMAGE_FEATURES", "tools-profile", "packagegroup-central-tools-profile", "", d)} \
    ${@bb.utils.contains("IMAGE_FEATURES", "tools-testapps", "packagegroup-central-tools-testapps", "", d)} \
    ${@bb.utils.contains("IMAGE_FEATURES", "tools-sdk", "packagegroup-central-sdk", "", d)} \
    \
    ${CENTRAL_IMAGE_EXTRA_INSTALL} \
    '

CENTRAL_IMAGE_EXTRA_INSTALL ?= ""

CORE_IMAGE_EXTRA_INSTALL += "${CENTRAL_IMAGE_BASE_INSTALL}"

inherit core-image central-image-version

