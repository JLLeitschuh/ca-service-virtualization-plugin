package com.ca.devtest.jenkins.plugin.postbuild.DevTestResultAction


f = namespace(lib.FormTagLib)
l = namespace(lib.LayoutTagLib)
t = namespace("/lib/hudson")
st = namespace("jelly:stapler")

//displayed on the build summary page

t.summary(icon: "clipboard.png") {
    a(href: "${my.urlName}") {
        text("${my.displayName}")
    }
    p() {

    }
}