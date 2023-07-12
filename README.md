# PluginAPI
A project containing some useful utilities for Minecraft plugin development.
This project is a work in progress, but it currently contains:
* ItemBuilder factory class
* GUI interface class
* Inventory utilities
* File management

## Maven
This API can be included via Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>me.ezrichards</groupId>
        <artifactId>PluginAPI</artifactId>
        <version>1.0.1</version>
    </dependency>
</dependencies>
```
## API Reference
### File Management
In order to use the file management system, you need to initialize the utility with the name of your plugin as a parameter. 
This ensures that all file management is done in the plugin's data folder.
```java
import org.bukkit.plugin.java.JavaPlugin;

public class Example extends JavaPlugin {
    @Override
    public void onEnable() {
        FileManager.init("MyPlugin");
        FileManager.loadFile("config2.yml");
    }
}
```
