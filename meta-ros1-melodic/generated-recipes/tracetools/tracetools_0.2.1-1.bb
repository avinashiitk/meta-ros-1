# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Wrapper interface for tracing libraries"
AUTHOR = "Ingo Luetkebohle <ingo.luetkebohle@de.bosch.com>"
ROS_AUTHOR = "Ingo Luetkebohle <ingo.luetkebohle@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "APLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=7b404913b4819f2321770961dc72a54f"

ROS_CN = "tracetools"
ROS_BPN = "tracetools"

ROS_BUILD_DEPENDS = " \
    boost \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbash \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/boschresearch/ros1-tracetools-release/archive/release/melodic/tracetools/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tracetools"
SRC_URI = "git://github.com/boschresearch/ros1-tracetools-release;${ROS_BRANCH};protocol=https"
SRCREV = "043770f3add566077c39d251ce7ab98b5ba2966b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
