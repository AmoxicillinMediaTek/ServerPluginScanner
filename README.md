# PluginScan

PluginScan is a client-side Fabric mod for Minecraft 1.21.11 that scans a connected server for likely installed plugins by inspecting command suggestions and namespaces.

## Features

- Scan a connected server with `/pluginscan`
- Detect plugin command namespaces and common plugin aliases
- Report detected plugins in chat
- Highlight likely anti-cheat plugins
- Track evidence sources such as command trees, namespaces, and known packs

## Requirements

- Minecraft 1.21.11
- Fabric Loader 0.18.1 or newer
- Fabric API for Minecraft 1.21.11
- Java 21 or newer

## Installation

1. Install Fabric Loader for Minecraft 1.21.11.
2. Install the matching Fabric API jar.
3. Copy `build/libs/pluginscan-1.0.0.jar` into the Minecraft `mods` folder.
4. Launch the Fabric client and connect to a server.

## Usage

Run this command in the client chat while connected to a server:

```text
/pluginscan
```

PluginScan will send a series of command suggestion probes and print the results when the scan finishes. A server may block or restrict these probes, so an empty result does not prove that no plugins are installed.

## Building

Build the mod with the included Gradle wrapper:

```bash
./gradlew build
```

The compiled mod is written to `build/libs/pluginscan-1.0.0.jar`.

## Project Information

- **Mod ID:** `pluginscan`
- **Display name:** PluginScan
- **Version:** `1.0.0`
- **Author:** AmoxicillinMediaTek
- **License:** Not specified
