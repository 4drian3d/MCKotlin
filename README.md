# MCKotlin
[![WorkFlow](https://img.shields.io/github/actions/workflow/status/4drian3d/MCKotlin/gradle.yml?style=flat-square)](https://github.com/MCKotlin/MCKotlin/actions)
[![Latest Version](https://img.shields.io/github/v/release/4drian3d/MCKotlin?style=flat-square)](https://modrinth.com/plugin/mckotlin)
[![Discord](https://img.shields.io/discord/899740810956910683?color=7289da&logo=Discord&label=Discord&style=flat-square)](https://discord.gg/5NMMzK5mAn)
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/1iWA0pjH?logo=Modrinth&style=flat-square)](https://modrinth.com/plugin/mckotlin)
[![GitHub Downloads](https://img.shields.io/github/downloads/4drian3d/MCKotlin/total?logo=GitHub&style=flat-square)](https://github.com/4drian3d/MCKotlin/releases)

Get the ability to run and develop Kotlin plugins on your Minecraft server or proxy.

This plugin includes the necessary Kotlin libraries to the server to avoid including them independently in several plugins at the same time

## Requirements
- Java 8+

## Compatibility
- Velocity 3+
- Sponge 8
- CraftBukkit/Spigot/Paper/forks 1.8+
- BungeeCord/Waterfall

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

#### Paper 1.19.3+

**paper-plugin.yml**
```yaml
dependencies:
  - name: MCKotlin-Paper
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

## Libraries included
- Kotlin StdLib 1.8.20
- Kotlin Reflect 1.8.20
- KotlinX Coroutines
