# Custom Annotations

## Runtime Annotation
Based on the tutorial [How to create a custom annotation in Spring Boot?
](https://fullstackdeveloper.guru/2021/06/15/how-to-create-a-custom-annotation-in-spring-boot/)

To execute start the [Application](./src/main/java/ie/gannons/Application.java) and send a http GET to http://localhost:8080/test

## Source Annotation
Based on 

* [Java Annotation Processors](https://www.javacodegeeks.com/2015/09/java-annotation-processors.html)
* [Compile time processing using annotation processor](https://riptutorial.com/java/example/19926/compile-time-processing-using-annotation-processor)
* [Adding a Processor Jar to the Classpath](https://www.baeldung.com/java-annotation-processing-builder#4-adding-a-processor-jar-to-the-classpath)

It generates an error when calling `mvn verify`. 

> Class 'TestController' is annotated as @Immutable, but field 'test' is not declared as final