# m223-hello-world-thorntail-jaxrs

Folgende Schritte sind notwendig, um die Applikation zu erstellen und zu starten:
 1. Stellen Sie sicher, dass OpenJDK in der Version 11 installiert ist.
 1. Wechseln Sie auf der Kommandozeile in den Ordner dieser Applikation. <br> Z. B.: `cd m223-hello-world-thorntail-jaxrs/`
 1. Starten Sie die Applikation mit `./gradlew runApp`
 1. Öffnen Sie im Browser http://localhost:8181/api/hello 

## Fehler
Bei folgendem Fehler, wird JDK 12 anstatt 11 verwendet. Überprüfen Sie die verwendete Java-Version mit `java -version`.
```
java.lang.RuntimeException: org.jboss.weld.exceptions.WeldException: WELD-001524: Unable to load proxy class for bean Implicit Bean [javax.enterprise.event.Event] with qualifiers [@Default] with class interface javax.enterprise.event.Event using classloader ModuleClassLoader for Module "org.jboss.weld.se" from BootModuleLoader@7a6e2815 for finders [JDK Module Finder, BootstrapClasspathModuleFinder, BootstrapModuleFinder(org.wildfly.swarm.bootstrap), ClasspathModuleFinder, ContainerModuleFinder(swarm.container), ApplicationModuleFinder(thorntail.application), org.wildfly.swarm.bootstrap.modules.DynamicModuleFinder@7fcd6585]
```


## Quelle
/gradle-examples/jaxrs-cdiAdaptiert von https://github.com/thorntail/thorntail-examples/tree/master