# TutorialMulPlat

![badge](https://img.shields.io/github/downloads/FlyUltra/TutorialMulPlat/total)
![badge](https://img.shields.io/github/last-commit/FlyUltra/TutorialMulPlat)
![badge](https://img.shields.io/badge/platform-spigot%20%7C%20bungeecord-lightgrey)
[![badge](https://img.shields.io/discord/896466173166747650?label=discord)](https://discord.gg/2PpdrfxhD4)
[![badge](https://img.shields.io/github/license/FlyUltra/TutorialMulPlat)](https://github.com/FlyUltra/TutorialMulPlat/blob/master/LICENSE.txt)

Do you want to have 1 plugin for two and more platforms?<br>
This is tutorial how to do it!<br>

## Table of contents

* [Getting started](#getting-started)
* [Important file](#important-file)
* [Dependencies](#dependencies)
* [Main classes](#main-classes)
* [Resources files](#resources-files)
* [License](#license)

## Getting started

1. Create your file [Important file](#important-file)
2. Add [Dependencies](#dependencies)
3. Add [Main class](#main-classes) for `Spigot`, and `Bungee`
4. Look at [Resources files](#resources-files) to add remaining `.yml` files
4. Have fun!

### Important file

We need to create new File.<br>
File directory like `pom.xml`, but with name `<plugin name>.iml`

<details>
    <summary>The File</summary>

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module version="4">
    <component name="FacetManager">
        <facet type="minecraft" name="Minecraft">
            <configuration>
                <autoDetectTypes>
                    // Here we can type our platforms, that we want to register
                    // Here we want to register Spigot and Bungee platform
                    <platformType>SPIGOT</platformType>
                    <platformType>BUNGEECORD</platformType>
                </autoDetectTypes>
            </configuration>
        </facet>
    </component>
</module>
```

### Dependencies

<details>
    <summary>Maven</summary>

```xml

<repository>
    <id>spigot-repo</id>
    <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
</repository>
<repository>
    <id>bungeecord-repo</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
</repository>

<dependency>
    <groupId>net.md-5</groupId>
    <artifactId>bungeecord-api</artifactId>
    <version>VERSION</version>
    <type>jar</type>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>org.spigotmc</groupId>
    <artifactId>spigot-api</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

</details>

<details>
    <summary>Gradle</summary>

```gradle
allprojects {
    repositories {
        ...
        maven { url = 'https://oss.sonatype.org/content/repositories/snapshots' }
        maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
    }
}


dependencies {
    compileOnly 'net.md-5:bungeecord-api:VERSION'
    compileOnly  'org.spigotmc:spigot-api:VERSION'
}
```

</details>

### Main classes

<details>
    <summary>Spigot</summary>

```java
// Normal main class for Spigot plugin
public class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getLogger().log(Level.INFO, "Cool plugin from Spigot!");
    }

    @Override
    public void onDisable() {

    }

}
```

</details>

<details>
    <summary>Bungee</summary>

```java
// Normal main class for Spigot plugin
public class Bungee extends Plugin {

    @Override
    public void onEnable() {

        getProxy().getLogger().log(Level.INFO, "Cool plugin from Bungee!");
    }

    @Override
    public void onDisable() {

    }

}
```
</details>


### Resources files

<details>
    <summary>Spigot</summary>

```yaml
name: <Plugin name>
author: <Author>
version: VERSION
main: <Path to main><Main class name>
database: <true|false> (can be skipped)

commands:
  yourcmd:

```

</details>

<details>
    <summary>Bungee</summary>

```yaml
name: <Plugin name>
author: <Author>
version: VERSION
main: <Path to main><Main class name>
database: <true|false> (can be skipped)

commands:
  yourcmd:
```
</details>

## License

ForestChannelAPI is licensed under the permissive MIT license. Please
see [`LICENSE.txt`](https://github.com/FlyUltra/TutorialMulPlat/blob/master/LICENSE.txt) for more information.