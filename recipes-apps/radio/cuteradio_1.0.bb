SUMMARY = "CuteRadio - Simple Internet radio for showing QML and Qt on embedded systems"
AUTHOR = "Burkhard Stubert (burkhard.stubert@embeddeduse.com)"
HOMEPAGE = "https://github.com/bstubert/cuteradio"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ef68d7e526c164e11da8965fdbed52c"

inherit cmake_qt5

SRC_URI = "git://github.com/bstubert/cuteradio.git;branch=master;protocol=https"
SRCREV = "b001def4b119118ff58fc3489a8fef4bb2fbfc5e"

PV = "1.0+git${SRCREV}"

DEPENDS = "qtmultimedia"

S = "${WORKDIR}/git"


FILES_${PN} += "/usr/local/bin/${PN}"
