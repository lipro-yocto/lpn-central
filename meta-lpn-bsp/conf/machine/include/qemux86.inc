# Common definitions for Yocto QEMU x86 machine

# derived from qemux86
require conf/machine/qemux86.conf
MACHINEOVERRIDES_prepend = "qemux86:"

# derived this machine back to qemux86 for the Linux kernel
KMACHINE = "qemux86"
