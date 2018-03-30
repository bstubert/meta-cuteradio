DESCRIPTION = "core-image-base extended by Qt libaries and CuteRadio application"
LICENSE = "MIT"

require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "ssh-server-dropbear debug-tweaks"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

