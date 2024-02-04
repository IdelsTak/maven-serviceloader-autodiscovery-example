# ServiceLoader Maven Plugin Example

This repository demonstrates the use of the `serviceloader-maven-plugin` for seamless `ServiceLoader` auto service discovery in a Maven multi-module project.

## Key Components

### 1. Service Module

Defines the `TextService` interface.

```java
public interface TextService {
  String process(String text);
}
```

### 2. Provider Module

Implements `UpperCaseTextService`, transforming text to uppercase.

```java
public class UpperCaseTextService implements TextService {
  @Override
  public String process(String text) {
    return text == null ? null : text.toUpperCase();
  }
}
```

### 3. Consumer Module POM

Configures Maven build for the `consumer` module as a service consumer, dynamically discovering implementations.

```xml
<!-- consumer/pom.xml -->
<!-- Dependencies -->
<dependency>
    <groupId>${project.groupId}</groupId>
    <artifactId>service</artifactId>
    <version>${project.version}</version>
</dependency>
<dependency>
    <groupId>${project.groupId}</groupId>
    <artifactId>provider</artifactId>
    <version>${project.version}</version>
    <scope>runtime</scope>
</dependency>

<!-- Properties -->
<properties>
    <exec.mainClass>com.github.idelstak.consumer.Consumer</exec.mainClass>
    <deps.dir>libs</deps.dir>
</properties>

<!-- Build Plugins -->
<build>
    <plugins>
        <!-- maven-compiler-plugin -->
        <!-- maven-dependency-plugin -->
        <!-- maven-jar-plugin -->
    </plugins>
</build>
```

### Runtime Dependency

- `provider` module: Runtime dependency for dynamic service discovery. Scope set to `runtime` to avoid compile-time transitive dependencies.

> Runtime dependency on `provider` is crucial for ServiceLoader to dynamically discover and load `TextService` implementations during execution.

## Parent POM

Configures the `serviceloader-maven-plugin` at the parent level for effective service discovery across modules.
