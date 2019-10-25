Data Abstraction is to show essential details to user and hiding irrelivent deatils.
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Abstract classes and Abstract methods :

An abstract class is a class that is declared with abstract keyword.
An abstract method is a method that is declared without an implementation.
An abstract class may or may not have all abstract methods. Some of them can be concrete methods
A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
Any class that contains one or more abstract methods must also be declared with abstract keyword.
There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
An abstract class can have parametrized constructors and default constructor is always present in an abstract class.

Advantages of Abstraction

It reduces the complexity of viewing the things.
Avoids code duplication and increases reusability.
Helps to increase security of an application or program as only important details are provided to the user.

When to use Abstract class:
There are situations in which we will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method. That is, sometimes we will want to create a superclass that only defines a generalization form that will be shared by all of its subclasses, leaving it to each subclass to fill in the details.
