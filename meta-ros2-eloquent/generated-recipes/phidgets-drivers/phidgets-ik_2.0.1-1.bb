# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Driver for the Phidgets InterfaceKit devices"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "James Sarrett"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_ik"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    phidgets-analog-inputs \
    phidgets-digital-inputs \
    phidgets-digital-outputs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/phidgets_drivers-release/archive/release/eloquent/phidgets_ik/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/phidgets_ik"
SRC_URI = "git://github.com/ros2-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "37cd6b785fcb0e3c95448e1f8579462c6f995d52"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
