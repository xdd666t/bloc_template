# bloc_template

语言： [中文简体](https://juejin.cn/post/6968272002515894303)

## provider usage

- 掘金：[]() 

# Some Statement

- The wrap snippet come form [intellij_generator_plugin](https://github.com/felangel/bloc/blob/master/extensions/intellij/intellij_generator_plugin/src/main/java/com/bloc/intellij_generator_plugin/intention_action/Snippets.java)
- The fast code snippet prompt come from [intellij_generator_plugin](https://github.com/felangel/bloc/blob/master/extensions/intellij/intellij_generator_plugin/src/main/resources/liveTemplates/Bloc.xml)

## Renderings

- Plug-in effect

   - There are some optional functions, so make it into a multi-button style 
   - you can operate according to your own needs

![bloc_plugin]()

## Description

The description of the plugin

- Model: generates the provider mode,

    - Default: the Default mode. two files are generated: view, provider
    - High: in simple mode, three files are generated: view, provider, state
    - Extended: a extended usage

- Function: Function selection
    - useFolder: use a file. After you select it, a folder is generated. The Hump name is automatically converted to lowercase + underscore.
    - usePrefix: use the prefix, the generated file front prefix, prefix for: large hump named automatically converted to: lowercase + underline
    - null-safety: support to null-safety

- Module Name: the Name of the Module. Use the hump Name.
