package com.github.alexreagan.securityeditor.services

import com.intellij.openapi.project.Project
import com.github.alexreagan.securityeditor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
