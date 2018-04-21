DESCRIPTION = "core-image-base extended by Qt libaries and CuteRadio application"
LICENSE = "MIT"

#require recipes-core/images/core-image-base.bb
inherit core-image

DEPENDS += "bcm2835-bootfiles"

IMAGE_FEATURES += "splash ssh-server-dropbear debug-tweaks"

PKG_FONTS = " \
    fontconfig \
    ttf-bitstream-vera \
"

PKG_MULTIMEDIA = " \
    alsa-utils \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-ugly \
"

PKG_QT5 = " \
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtquickcontrols2 \
    qtmultimedia \
    qtmultimedia-qmlplugins \
"

IMAGE_INSTALL += " \
    ${PKG_FONTS} \
    ${PKG_MULTIMEDIA} \
    ${PKG_QT5} \
    cuteradio \
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

