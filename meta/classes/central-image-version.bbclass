# Common code for generating Central version file
#
# Copyright (C) 2016-2021 Li-Pro.Net, Stephan Linz
#

LIC_FILES_CHKSUM = "file://${CENTRALCOREBASE}/LICENSE;md5=4d183b8707e22082e5a8c5ad268e5149"

CENTRAL_VERSION_FILE = "${IMAGE_ROOTFS}${sysconfdir}/central_version"

write_central_version() {
        cat > ${CENTRAL_VERSION_FILE} <<EOF
[build information]
vendor-id=LPN
manufacturer-name=Li-Pro.Net
device-variant=${MACHINE}
purpose=${IMAGE_BASENAME}
feature=${IMAGE_FEATURES}
build-number=${BUILD_NUMBER}
EOF
}

ROOTFS_POSTPROCESS_COMMAND += "write_central_version;"

