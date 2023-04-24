Built-In Functional Interface: In order to reduce the frequent usage of User-Defined Functional Interfaces, Java provides a series of inbuilt functional interfaces. A lambda expression can be of any of these types. Some of them being:

Function – It represents a function that takes a single input parameter and returns a single value/object. For example:

Function<Long, Long> addNum = (value) -> value + 10;
Predicate – It represents a function that takes a single value/object as a parameter, and returns true or false. For example:

Predicate<Integer> checkAge = (age) -> age > 18;
Supplier – It represents a function that produces a value/an object without taking any input parameter. For example:

Supplier<Integer> generateRandom = ()-> new Integer((int) (Math.random() * 100));
Consumer – It represents a function that consumes or processes a value/an object without returning anything. For example:

Consumer<String> printValue = (name)-> System.out.println(name);
For a detailed study on all the Inbuilt Functional Interfaces present in Java 11, please refer the following link:  List of Functional Interfaces in Java 11