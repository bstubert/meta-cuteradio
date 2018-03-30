DESCRIPTION = "core-image-base extended by Qt libaries and CuteRadio application"
LICENSE = "MIT"

require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "ssh-server-dropbear debug-tweaks"
