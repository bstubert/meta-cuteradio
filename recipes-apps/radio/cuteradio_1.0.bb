SUMMARY = "CuteRadio - Simple Internet radio for showing QML and Qt on embedded systems"
AUTHOR = "Burkhard Stubert (burkhard.stubert@embeddeduse.com)"
HOMEPAGE = "https://github.com/bstubert/cuteradio-apps"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ef68d7e526c164e11da8965fdbed52c"

inherit cmake_qt5 update-rc.d

SRC_URI = "\
    git://github.com/bstubert/cuteradio-apps.git;branch=master;protocol=https \
    file://cuteradio \
"
SRCREV = "5521d9ca291534c63cc9ddee770780b80d30cdb4"

PV = "1.0+git${SRCREV}"

DEPENDS = "qtmultimedia"

INITSCRIPT_NAME = "cuteradio"
INITSCRIPT_PARAMS = "defaults 70"

S = "${WORKDIR}/git"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/cuteradio ${D}${sysconfdir}/init.d/cuteradio
}


FILES_${PN} += "/usr/local/bin/${PN}"
