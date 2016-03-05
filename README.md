# TornadoFX Maven Quick Start Archetype

Creates a simple TornadoFX project to get you started quickly

### Generate a new project

```bash
mvn archetype:generate -DarchetypeGroupId=no.tornado \
  -DarchetypeArtifactId=tornadofx-quickstart-archetype \
  -DarchetypeVersion=1.0
```

### Run the application

```bash
mvn jfx:run
```

This project demonstrates basic usage of TornadoFX, including:

- Generate a `View` from *FXML*
- Interact with a Controller
- Use the REST interface and JSON Model objects
- Style with CSS