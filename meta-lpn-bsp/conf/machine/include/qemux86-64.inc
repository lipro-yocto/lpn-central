# Common definitions for Yocto QEMU x86-64 machine

# derived from qemux86-64
require conf/machine/qemux86-64.conf
MACHINEOVERRIDES_prepend = "qemux86-64:"

# remap derived machine back to qemux86-64 for the Linux kernel
KMACHINE = "qemux86-64"
