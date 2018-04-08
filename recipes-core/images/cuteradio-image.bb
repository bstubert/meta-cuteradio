DESCRIPTION = "core-image-base extended by Qt libaries and CuteRadio application"
LICENSE = "MIT"

#require recipes-core/images/core-image-base.bb
inherit core-image

DEPENDS += "bcm2835-bootfiles"

IMAGE_FEATURES += "splash ssh-server-dropbear debug-tweaks"

PKG_FONTS = "\
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

PKG_GRAPHICS = "\
    userland \
"

PKG_QT5 = "\
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtquickcontrols2 \
    qtmultimedia \
"

PKG_WIFI = "\
    crda \
    iw \
    linux-firmware-bcm43430 \
    wireless-tools \
    wpa-supplicant \
"

IMAGE_INSTALL += "\
    ${PKG_FONTS} \
    ${PKG_GRAPHICS} \
    ${PKG_QT5} \
    ${PKG_WIFI} \
    tzdata \
    cuteradio \
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

