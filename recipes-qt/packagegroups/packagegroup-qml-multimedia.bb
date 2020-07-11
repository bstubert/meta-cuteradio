SUMMARY = "Additional multimedia packages for QML apps"

inherit packagegroup

RDEPENDS_${PN} = " \
    alsa-utils \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-ugly \
    qtmultimedia \
    qtmultimedia-qmlplugins \
"

