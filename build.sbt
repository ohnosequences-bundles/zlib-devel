name := "zlib-devel"

description := "A bundle for zlib-devel tool"

homepage := Some(url("https://github.com/ohnosequences/zlib-devel"))

organization := "ohnosequences"

organizationHomepage := Some(url("http://ohnosequences.com"))

licenses := Seq("AGPLv3" -> url("http://www.gnu.org/licenses/agpl-3.0.txt"))

bundleObjects := Seq("ohnosequences.statika.ZlibDevel")


statikaVersion := "0.15.0-SNAPSHOT"

awsStatikaVersion := "0.2.0-SNAPSHOT"
