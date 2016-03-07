# TornadoFX Maven Quick Start Archetype

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/no.tornado/tornadofx-quickstart-archetype/badge.svg)](https://search.maven.org/#search|ga|1|no.tornado.tornadofx-quickstart-archetype)

Creates a simple [TornadoFX](https://github.com/edvin/tornadofx) project to get you started 
quickly.

### Generate a new project

```bash
mvn archetype:generate -DarchetypeGroupId=no.tornado \
  -DarchetypeArtifactId=tornadofx-quickstart-archetype \
  -DarchetypeVersion=1.0.1
```

### Run the application

```bash
mvn jfx:run
```

### Gradle support

After you have created your project skeleton, you can convert it to a Gradle project:

```bash
gradle init
```

This will build the jar, you might still want to customize the build process for JavaFX deployment.

### What's included in the quickstart?

This project demonstrates basic usage of TornadoFX, including:

- Generate a `View` from *FXML*
- Interact asynchroniusly with a Controller
- Use the REST interface and JSON object model
- Styling with CSS
- Internationalization with resource bundles
- Logging

### Deployment

If you need installer and/or auto update capabilities for your TornadoFX app, check out
[FXLauncher](https://github.com/edvin/fxlauncher) for more information.
