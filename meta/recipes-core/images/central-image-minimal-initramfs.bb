#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require ${COREBASE}/meta/recipes-core/images/core-image-minimal-initramfs.bb

# Simple initramfs image. Mostly used for live images.
DESCRIPTION = "A small image capable of booting a Central device. The kernel \
includes the Minimal RAM-based Initial Root Filesystem (initramfs), which \
finds the first 'init' program more efficiently."

PR .= ".0"

export IMAGE_BASENAME = "central-image-minimal-initramfs"

CENTRAL_IMAGE_EXTRA_INSTALL ?= ""
CORE_IMAGE_EXTRA_INSTALL += "${CENTRAL_IMAGE_EXTRA_INSTALL}"
