# Fluent API for Vaadin 8

This library is a Vaadin 8 server side complement to code components fluently (like builder pattern).

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to [http://vaadin.com/addon/fluent](http://vaadin.com/addon/fluent)

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:

- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- Vaadin Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine. 

 
## Release notes

### Version 1.0
- FTextField
- FTextArea
- FComboBox
- FFormLayout
- FVerticalLayout
- FHorizontalLayout
- FCssLayout
- FGridLayout
- FPanel
- FCheckBoxGroup
- FListSelect
- FTwinColSelect
- FAction

### Version 1.1
- FButton
- FNativeButton
- FNativeSelect
- FRadionButtonGroup
- FLabel
- FLink
- FCheckBox
- FTabSheet
- fix missing methods for FluentComboBox
- update javadoc

### Version 1.2

- FMenuBar
- FProgressBar
- FPopupView
- FHorizontalSplitPanel
- FVerticalSplitPanel
- FSlider
- FRichTextArea
- FDateField
- FInlineDateField
- FDateTimeField

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:

- FGrid
- FTreeGrid
- FAudio
- FVideo
- FTree


## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

This library is written by Jean-Christophe Fortier.
Thanks to the viritin add-on which have inspired me greatly.

# Developer Guide

## Getting started

Each ui component class is available with their fluent counter part working out-of-the-box.

Ex : TextField => FTextField

Each setter has also its fluent version prefixed with the word "with" instead of "set".

Ex: `new FTextField().withCaption("test").withRequiredIndicatorVisible(true).withWidth("100px").withPlaceholder("enter text");`

Each fluent class implements a fluent interface which adds the fluent methods. 
Therefore, it's easy to add fluent functionality to an existing component : just implement the right interface.

Lets say you have a custom ComboBox doing fancy stuff in your project and you want to add fluent way to code it. Implement the FluentComboBox interface.

Ex :
    public class MyComboBox<T> extends ComboBox<T> implements FluentComboBox<MyComboBox<T>, T> {
     
    }

## Limitations

When using a component using a listing (with T generic type) like FComboBox for example, the generic type must be specified with the constructor when using fluent methods.

Ex: `FComboBox<MyPojo> myComboBox = new FComboBox<MyPojo>().withCaption("My combo box");`

## API

Fluent API for Vaadin JavaDoc is available online at [https://viydaag.github.io/vaadin-fluent-api/docs/javadoc](https://viydaag.github.io/vaadin-fluent-api/docs/javadoc)