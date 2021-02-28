#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of allowing an Central device \
to boot."

PR .= ".0"

CENTRAL_IMAGE_EXTRA_INSTALL ?= ""
CORE_IMAGE_EXTRA_INSTALL += "${CENTRAL_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL += "packagegroup-central-boot"

inherit central-image-version
