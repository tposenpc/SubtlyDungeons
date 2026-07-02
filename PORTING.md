# Forge 1.20.1 port

This branch is a **Forge 1.20.1** scaffold. Original code is **Fabric + MC 26.1** and lives under `src/main/javaFabricRef/`.

## Current state

- **Build**: Forge 1.20.1 (Gradle + mods.toml). `gradlew build` produces a loadable mod JAR.
- **Entrypoint**: `SubtlyDungeonsForge` (@Mod) in `src/main/java`. No gameplay yet.
- **Fabric reference**: All original Java moved to `src/main/javaFabricRef/` (Fabric API, mixins, 26.1 APIs). Use as reference when porting features.

## To finish the port

1. Replace Fabric APIs with Forge/vanilla equivalents (events, registries, networking, datagen).
2. Reimplement or drop mixins (Forge mixins possible; many cases are better as events/ATs).
3. Adapt to 1.20.1 mappings and API (registries, world gen, entities, etc.).
4. Move ported code into `src/main/java` and remove or trim `javaFabricRef` as needed.
