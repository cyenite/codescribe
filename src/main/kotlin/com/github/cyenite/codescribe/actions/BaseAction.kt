package com.github.cyenite.codescribe.actions

import com.github.cyenite.codescribe.util.UITools
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.simiacryptus.openai.OpenAIClient
import javax.swing.Icon

abstract class BaseAction(
    name: String? = null,
    description: String? = null,
    icon: Icon? = null,
    ) : AnAction(name, description, icon) {

    //override fun getActionUpdateThread(): ActionUpdateThread = ActionUpdateThread.BGT

    val api: OpenAIClient
        get() = UITools.api

    override fun update(event: AnActionEvent) {
        event.presentation.isEnabledAndVisible = isEnabled(event)
        super.update(event)
    }

    open fun isEnabled(event: AnActionEvent): Boolean = true
}