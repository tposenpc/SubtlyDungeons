#!/usr/bin/env sh
set -e
cd "$(dirname "$0")"
./gradlew build --no-daemon "$@"
JAR=$(ls build/libs/subtlyd-*.jar 2>/dev/null | head -1)
[ -n "$JAR" ] && VER=$(basename "$JAR" .jar | sed 's/^subtlyd-//' | sed 's/-/_/g') && cp "$JAR" "./subtly_dungeons_${VER}.jar" && echo "Copied to ./subtly_dungeons_${VER}.jar"
