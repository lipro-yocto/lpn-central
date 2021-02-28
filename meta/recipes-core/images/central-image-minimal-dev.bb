#
# Copyright (c) 2016-2021 Li-Pro.Net, Stephan Linz
#

require central-image-minimal.bb

DESCRIPTION = "A small image just capable of allowing an Central device to \
boot and is suitable for development work."

PR .= ".0"

IMAGE_FEATURES += "dev-pkgs"

