# MCKotlin
[![WorkFlow](https://img.shields.io/github/actions/workflow/status/4drian3d/MCKotlin/gradle.yml?style=flat-square)](https://github.com/MCKotlin/MCKotlin/actions)
[![Latest Version](https://img.shields.io/github/v/release/4drian3d/MCKotlin?style=flat-square)](https://modrinth.com/plugin/mckotlin)
[![Discord](https://img.shields.io/discord/899740810956910683?color=7289da&logo=Discord&label=Discord&style=flat-square)](https://discord.gg/5NMMzK5mAn)
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/1iWA0pjH?logo=Modrinth&style=flat-square)](https://modrinth.com/plugin/mckotlin)
[![GitHub Downloads](https://img.shields.io/github/downloads/4drian3d/MCKotlin/total?logo=GitHub&style=flat-square)](https://github.com/4drian3d/MCKotlin/releases)

Get the ability to run and develop Kotlin plugins on your Minecraft server or proxy.

This plugin includes the necessary Kotlin libraries to the server to avoid including them independently in several plugins at the same time

[![](https://www.bisecthosting.com/partners/custom-banners/6fa909d5-ad2b-42c2-a7ec-1c51f8b6384f.webp)](https://www.bisecthosting.com/4drian3d)

## Requirements
- Java 11+

## Compatibility
- Velocity 3.4+
- Sponge 8.2+
- Paper/forks 1.20+

## How to use

### Server Admin
Simply install the latest version of the plugin on your server or proxy

### Developers
Add MCKotlin as a dependency

#### Spigot

**plugin.yml**
```yaml
depend: MCKotlin-Paper
```

#### Paper 1.19.4+

**paper-plugin.yml**
```yaml
dependencies:
  server:
    MCKotlin-Paper:
      required: true
```

#### Velocity

```java
@Plugin(
  id = "myplugin",
  dependencies = {
      @Dependency(id = "mckotlin-velocity")
  }
)
public class VelocityPlugin {}
```

#### Sponge

**build.gradle**
```groovy
dependency('mckotlin-sponge') {
    version '1.4.0'
    loadOrder PluginDependency.LoadOrder.AFTER
    optional false
}
```

**build.gradle.kts**
```kts
dependency("mckotlin-sponge") {
  version("1.5.0")
  loadOrder(PluginDependency.LoadOrder.AFTER)
  optional(false)
}
```

## Libraries included
- Kotlin StdLib 2.0.21
- Kotlin Reflect 2.0.21
- KotlinX Coroutines

### How does this plugin differ from other plugins such as [Kotlin](https://modrinth.com/plugin/kotlin)?
Unfortunately there are no plugins available that provide the necessary libraries to make kotlin plugins for environments like Velocity or Bungeecord. That was my motivation to develop this plugin that includes Kotlin-stlib 1.9.0 (created by Jetbrains, Apache 2 license)
