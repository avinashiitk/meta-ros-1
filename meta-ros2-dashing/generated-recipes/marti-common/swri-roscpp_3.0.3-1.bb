# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "swri_roscpp"
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_roscpp"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-updater \
    marti-common-msgs \
    nav-msgs \
    rclcpp \
    rosidl-cmake \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-updater \
    marti-common-msgs \
    nav-msgs \
    rclcpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-updater \
    marti-common-msgs \
    nav-msgs \
    rclcpp \
    rosidl-default-runtime \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/marti_common-release/archive/release/dashing/swri_roscpp/3.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/swri_roscpp"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "6b5913bff894c3834c6448eac844362519b69b9d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
