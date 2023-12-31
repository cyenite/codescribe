package com.github.cyenite.codescribe.config

import com.github.cyenite.codescribe.util.UITools
import com.intellij.openapi.options.Configurable
import java.util.*
import javax.swing.JComponent
import javax.swing.JPanel

class AppSettingsConfigurable : Configurable {
    var settingsComponent: AppSettingsComponent? = null

    @Volatile
    private var mainPanel: JPanel? = null
    override fun getDisplayName(): String {
        return "Codescribe Settings"
    }

    override fun getPreferredFocusedComponent(): JComponent? {
        return Objects.requireNonNull(settingsComponent)?.preferredFocusedComponent
    }

    override fun createComponent(): JComponent? {
        if (null == mainPanel) {
            synchronized(this) {
                if (null == mainPanel) {
                    settingsComponent = AppSettingsComponent()
                    mainPanel = UITools.build(settingsComponent!!, false)
                }
            }
        }
        return mainPanel
    }


    override fun isModified(): Boolean {
        val buffer = AppSettingsState()
        if (settingsComponent != null) {
            UITools.readKotlinUI(settingsComponent!!, buffer)
        }
        return buffer != AppSettingsState.instance
    }

    override fun apply() {
        if (settingsComponent != null) {
            UITools.readKotlinUI(settingsComponent!!, AppSettingsState.instance)
        }
    }

    override fun reset() {
        if (settingsComponent != null) {
            UITools.writeKotlinUI(settingsComponent!!, AppSettingsState.instance)
        }
    }

    override fun disposeUIResources() {
        settingsComponent = null
    }
}

