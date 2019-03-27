DESCRIPTION = "MAVLink message marshaling library"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=54ad3cbe91bebcf6b1823970ff1fb97f"

DEPENDS = "${PYTHON_PN}-setuptools-native ${PYTHON_PN}-future-native"

SRC_URI = "git://github.com/mavlink/mavlink-gbp-release.git;branch=release/kinetic/mavlink"
SRCREV = "release/kinetic/mavlink/2018.4.4-0"

S = "${WORKDIR}/git"

inherit catkin
