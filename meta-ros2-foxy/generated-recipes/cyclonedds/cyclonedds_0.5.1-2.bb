# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Eclipse Cyclone DDS is a very performant and robust open-source DDS implementation. Cyclone DDS is developed completely in the open as an Eclipse IoT project."
AUTHOR = "Eclipse Foundation, Inc. <cyclonedds-dev@eclipse.org>"
HOMEPAGE = "https://projects.eclipse.org/projects/iot.cyclonedds"
SECTION = "devel"
LICENSE = "Eclipse-Public-License-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=7532470dee289492e850d7d3e8a32b32"

ROS_CN = "cyclonedds"
ROS_BPN = "cyclonedds"

ROS_BUILD_DEPENDS = " \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_java-native} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_maven-native} \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libcunit-dev} \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/cyclonedds-release/archive/release/foxy/cyclonedds/0.5.1-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/cyclonedds"
SRC_URI = "git://github.com/ros2-gbp/cyclonedds-release;${ROS_BRANCH};protocol=https"
SRCREV = "2f5553582c5e854ae9689848edfc709077c17239"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
