DESCRIPTION = "Tools for target device during Cuteradio development"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

IMAGE_FEATURES += "\
    ssh-server-dropbear \
    debug-tweaks \
"

RDEPENDS_${PN} = "\
    openssh-sftp-server \
    rsync \
"

