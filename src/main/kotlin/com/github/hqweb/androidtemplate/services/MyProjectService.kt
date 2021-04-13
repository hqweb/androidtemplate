package com.github.hqweb.androidtemplate.services

import com.github.hqweb.androidtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
