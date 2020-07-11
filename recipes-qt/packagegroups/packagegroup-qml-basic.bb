SUMMARY = "Minimal set of Qt packages needed for QML apps"

inherit packagegroup

RDEPENDS_${PN} = " \
    fontconfig \
    ttf-bitstream-vera \
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtquickcontrols2 \
"

