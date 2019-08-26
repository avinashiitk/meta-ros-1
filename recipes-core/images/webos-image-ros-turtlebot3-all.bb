# Copyright (c) 2019 LG Electronics, Inc.

# Prevent error when parsing if meta-webos layer isn't present.
LAYERDIR_meta-webos = "${@(d.getVar('BBFILE_PATTERN_meta-webos', True) or '')[1:]}"
include ${LAYERDIR_meta-webos}/recipes-core/images/webos-image.bb

SUMMARY = "ROS with webOS OSE image containing all TurtleBot 3 packages"
DESCRIPTION = "${SUMMARY}"

require image-turtlebot3-all.inc
