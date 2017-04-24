SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=3b634f641fb0d4a1a8dbf77b312564d5"
SRCREV = "${@opendreambox_srcrev('80fe678e3279393b9c669993cdbbdfc83e220a8d', d)}"
PV = "4.3.1+git${SRCPV}"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
