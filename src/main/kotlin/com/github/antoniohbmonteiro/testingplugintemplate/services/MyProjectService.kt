package com.github.antoniohbmonteiro.testingplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.antoniohbmonteiro.testingplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
