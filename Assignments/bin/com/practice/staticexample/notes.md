Static method and variables belong to Class and instance variable belongs to object.

Normal method can access both instance and static (Class being super class of object)
but we cant access non static/instance variable from static block.

Static is a Non Access Modifier.
The Static modifier can be applied to a variable or Method or block or inner Class.
Static members belong to Class only not an instance.
A Static Method can not access an instance variable.
Static Methods can not be overriden as they are Class specific and don’t belong to an Instance.
Static Methods can be redefined.
If a Class contains any static blocks then that block will be executed only when the Class is loaded in JVM. Creating multiple instances does not execute the static block multiple time. Only the constructor will be executed multiple time.
If Class.forName(“class_name“) is called then the static block of the Class will get executed.