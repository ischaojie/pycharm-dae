package com.github.ischaojie.pycharmdae.services

import com.intellij.openapi.project.Project
import com.github.ischaojie.pycharmdae.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
