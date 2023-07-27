# Codescribe

![Build](https://github.com/cyenite/codescribe/workflows/Build/badge.svg)
<!-- Plugin description -->

A documentation plugin that uses the power of artificial intelligence to make coding swifter and simpler. It is compatible with popular autocomplete-based AI plugins such as GitHub Copilot and AWS CodeWhisperer, and is explicitly invoked through the context menu.

To use Codescribe, you must have an OpenAI access token. With this token, you can access a variety of features, including code comments and function documentation.


# Code Actions

The following actions are available for coding in the AI Coder plugin:

| Text              | Description                                                                                                                                                                                                                                |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Add Code Comments | The `Add Code Comments` action allows you to quickly add comments to selected code. It will generally add a comment for each line with a description. This is useful for quickly documenting your code and making it easier to understand. |
| Document Function | The `Document Function` action allows you to quickly add a technical documentation to your code that describes the current function selection. This is useful for quickly documenting your code and making it easier to understand.        |


<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Codescribe"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/cyenite/codescribe/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Usage

After installation, edit the settings and add your API key. If desired, customize your style!


Use the context menu to access features by selecting the code you want to describe and right-clicking. You can also use the keyboard shortcut `Ctrl+Shift+A` to access the action menu.

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
