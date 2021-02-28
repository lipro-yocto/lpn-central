#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require central-image-minimal.bb

DESCRIPTION = "A small image capable of booting a Central device with \
support for the Minimal MTD Utilities, which let the user interact with \
the MTD subsystem in the kernel to perform operations on flash devices."

PR .= ".0"

IMAGE_INSTALL += "mtd-utils"
