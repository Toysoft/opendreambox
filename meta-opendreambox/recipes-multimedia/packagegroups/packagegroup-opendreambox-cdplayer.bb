SUMMARY = "OpenDreambox: CD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"

inherit packagegroup

#
# packagegroup-opendreambox-cdplayer
#
SUMMARY_${PN} = "OpenDreambox: CD-Player Support"
RDEPENDS_${PN} = "\
 cdfs \
 cdtextinfo \
 gst-plugins-ugly-cdio \
"

