# Welcome to PoC explaining Serialization-Deserialization in JAVA and the security flaws associated with it.

### Developing a web application sometimes requires you to transfer an object. In simple terms, the object contains a bunch of variables that in turn contain information. However, an object cannot be transferred directly, so it has be converted into something else first.This conversion is called serialization.

#### Java provides serialization where object represented as sequence of bytes,
Serialization process is JVM independent, which means an object can be serialized
in a platform and de-serialized on different platform.
Java implements serialization using class interface Java.io.Serializable, to serialize
an object to implement classes ObjectInputStream ,ObjectOutputStream those
classes contains several methods to write/read objects.

Serialization is the process of taking an object and translating it into plaintext. This plaintext can then be encrypted or signed, as well as simply used the way it is. The reverse process is called deserialization, i.e. when the plaintext is converted back to an object.

### Deserialization vulnerability in JAVA
Even when developers know that user input is not to be trusted, serialized objects are seen as something different and the security mindset is forgotten. In these scenarios, Insecure Deserialization is just another way of sending the payload which then affects an underlying vulnerability.
