# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "rqt_common_plugins metapackage provides ROS backend graphical tools suite that can be used on/off of robot runtime.<br/>     <br/>     To run any rqt plugins, just type in a single command &quot;rqt&quot;, then select any plugins you want from the GUI that launches afterwards.<br/>     <br/>     rqt consists of three following metapackages:<br/>     <ul>      <li><a href="http://ros.org/wiki/rqt">rqt</a> - core modules of rqt (ROS GUI) framework. rqt plugin developers barely needs to pay attention to this metapackage.</li>      <li>rqt_common_plugins (you're here!)</li>      <li><a href="http://ros.org/wiki/rqt_robot_plugins">rqt_robot_plugins</a> - rqt plugins that are particularly used with robots during their runtime.</li><br/>     </ul>    <br/>"
AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://ros.org/wiki/rqt_common_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_common_plugins"
ROS_BPN = "rqt_common_plugins"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rqt-action \
    rqt-console \
    rqt-graph \
    rqt-image-view \
    rqt-msg \
    rqt-plot \
    rqt-publisher \
    rqt-py-common \
    rqt-py-console \
    rqt-reconfigure \
    rqt-service-caller \
    rqt-shell \
    rqt-srv \
    rqt-top \
    rqt-topic \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_common_plugins-release/archive/release/eloquent/rqt_common_plugins/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/rqt_common_plugins"
SRC_URI = "git://github.com/ros2-gbp/rqt_common_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "529d2d5f8d69456b9c8bc8ea6d7dcc3642842e6b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
