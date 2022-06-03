- [Collections](#collections)
  - [Defintion](#defintion)
  - [Agenda](#agenda)
    - [Concept](#concept)
      - [Collections](#collections-1)
    - [Roadmap](#roadmap)
  - [Pre-Collection API](#pre-collection-api)
    - [arrays](#arrays)
      - [work with primitive types and object references](#work-with-primitive-types-and-object-references)
      - [The problem with arrays](#the-problem-with-arrays)
      - [Arrays class](#arrays-class)
    - [Vector](#vector)
    - [Hashtable](#hashtable)
  - [The diffrent collection needs](#the-diffrent-collection-needs)
    - [Arrays and the Arrays class](#arrays-and-the-arrays-class)
    - [Position based access](#position-based-access)
    - [Uniqueness](#uniqueness)
    - [Retrieval mechanisms](#retrieval-mechanisms)
    - [Others](#others)
  - [Collection Types](#collection-types)
    - [Collections types](#collections-types)
    - [Implementations](#implementations)
    - [Examples](#examples)
  - [Hierarchy of Collections](#hierarchy-of-collections)
  - [ArrayList](#arraylist)
  - [O notation](#o-notation)
    - [Tradeoffs](#tradeoffs)
    - [Time Effieciency](#time-effieciency)
      - [How do you measure time efficiency?](#how-do-you-measure-time-efficiency)
      - [O(N)](#on)
        - [Linear Time](#linear-time)
        - [Constant Time](#constant-time)
        - [Logarithmic Time](#logarithmic-time)
        - [Quadratic Time](#quadratic-time)
        - [How O-Notation matters](#how-o-notation-matters)
  - [How iterators work?](#how-iterators-work)
    - [Feature](#feature)
    - [for each loop](#for-each-loop)
    - [Iterator vs Iterable](#iterator-vs-iterable)
      - [Iterator](#iterator)
      - [Iterable](#iterable)
    - [Example: ArrayList](#example-arraylist)
  - [Equality in OOP](#equality-in-oop)
  - [Hashing and hash codes](#hashing-and-hash-codes)
    - [The hashing concept](#the-hashing-concept)
    - [hashcode in java](#hashcode-in-java)
    - [does two object with the same hashcode equal?](#does-two-object-with-the-same-hashcode-equal)
    - [What is hashcode for?](#what-is-hashcode-for)
  - [Object ordering](#object-ordering)
    - [Comparison](#comparison)
    - [Comparable interface](#comparable-interface)
    - [why the return type is `int`?](#why-the-return-type-is-int)
    - [Return values](#return-values)
    - [Implementing the Comparable interface](#implementing-the-comparable-interface)
    - [sorting](#sorting)
    - [Custom comparators](#custom-comparators)
    - [Comparable vs Comparator](#comparable-vs-comparator)

# Collections 

## Defintion
* Language API to manage "groups" of things

## Agenda
* Understanding the overall Collection API
* Learning individual types of collections
* When to use what? What's the fifference?

### Concept
* Coding to interfaces
* Iterator pattern
* Efficency discussions
* Equality and hash code
* Natual ordering and comparisons

#### Collections
* Set
  * HashSet
  * TreeSet
* Lists
  * ArrayList
  * LinkedList
* Maps
  * HashMap

### Roadmap
* Pre-Collection API
* Diffent Collection needs
* Introducing ArrayList
* Concepts and fundamentals
* Zoom up to Collections interface
* Tackle individual collections types
* Lear the collection type, usages and code examples
  



## Pre-Collection API
### arrays
```java
int[] numbers;
numbers = new int[10];
numbers[0] = 1;
System.out.println(numbers[0]);
```
#### work with primitive types and object references
```java
Date[] dates = new Date[10];
dates[0] = new Date();
```
#### The problem with arrays
```java
* Limited data structure
* Does not have methods on its own
* Have to use `Arrays` class to do things
```
#### Arrays class
* `Arrays.asList()`
* `Arrays.compare()`
* `Arrays.copyOf()`
```java
// String[] names = {"John", "Jane", "Joe"};
String[] names = new String[10];
Arrays.fill(names, "name ");
for(int i = 0; i < names.length; i++) {
  names[i] = names[i] + i;
}
Arrays.binarySearch(names, "name 4");
```
### Vector
### Hashtable

## The diffrent collection needs
### Arrays and the Arrays class
  * Isn't that enough?
### Position based access
  * Strorage and retrieval by index
  * Needs sorting methods
  * Ordered vs Unordered
### Uniqueness
  * Are duplicates allowed?
  * Affects adding behavior
  * No need for position based access
### Retrieval mechanisms
  * Index based retrieval
  * Key based retrieval
  * Presence-only retrieval
### Others
  * Mutability
  * Concurrency requirements

## Collection Types
### Collections types
* Define the contract of the collection
  * List
  * Set
  * Map Queue
### Implementations
* How it acturally works behind the scenes
### Examples
* #### List
  * Defines the contract/behavior
* ##### ArrayList
  * An implementation of List contract
* ##### LinkedList
  * Another implementation of List contract
* #### Set
  * HashSet
  * LinkedHashSet
  * TreeSet
* Q
* #### Map
  * HashMap
  * TreeMap
* #### Queue
  * PriorityQueue
* #### Tradeoffs
  * finding what is the right tool for the job

## Hierarchy of Collections
![](/images/java-collection-hierarchy.png)
  
https://github.com/seaboyz/coding-interview/blob/990a49ddc8d6e9c2b4744faa95eecc8ec95f158e/Sanbox/src/App.java#L6

## ArrayList
* "Replacement" for arrays
![](/images/ArrayList.png)
```java
ArrayList<String> names = new ArrayList<>();
for(int i = 0; i < 20; i++){
    names.add("name " + i);
}
for(int i = 0; i < 20; i++){
    System.out.println(names.get(i));
}
```

## O notation
### Tradeoffs
* Feature requirements
* Efficiency
  * Time
  * Space
    * Usualy proportional to size to be stored.

### Time Effieciency
  * How long does it take?
  * Storage time - single item
  * Retrieval time - sigle item
  * Retrival time - search
#### How do you measure time efficiency?
* Bigger collecion = longer times
* A factor of N (number of elements)
#### O(N)
* Big O notation
* How good / bad is the depencency on N?
* Rough imprecise measurement/classification
* Broad buckets
* it assumes the worst case estimate
* Rough/board estimate

##### Linear Time
* O(N) - depends on number of elements

##### Constant Time
* O(1)

##### Logarithmic Time
* O(log N) 
* Binary search
  1. Look at the middle
  2. if greater, take first half
  3. if lesser, take second half
  4. Repeat
* has to be sorted first
* Time doesn't linearly increase with size of N

##### Quadratic Time
* find duplecated element
* O(N<sup>2</sup>)

##### How O-Notation matters
* Inherent performance characteristics
  * Search a list(not sorted)
* Implementation-based characteristics
  * Looking up by index(ArrayList vs LinkedList)
* Underlying factor

## How iterators work?
### Feature
* each iterator has its own state(every time you get a iterator form .iterator(), it returns a new iterator)
* iterator does not like the collection to be modified

### for each loop
```java
for(String name : names){
    System.out.println(name);
}
```
### Iterator vs Iterable
#### Iterator
```java
public interface Iterator<E> {
  boolean hasNext();// Are there more elements?
  E next();// Get the next element in the iteration
  void remove();// Remove the last element returned by iterator
  default void forEachRemaining(Consumer<? super E> action) 
}
```
#### Iterable
```java
public interface Iterable<E> {
  Iterator<E> iterator();
  default Spliterator<E> spliterator() {
    return Spliterators.spliteratorUnknownSize(iterator(), 0);
  }
  default void forEach(Consumer<? super E> action) {
    Objects.requireNonNull(action);
    Spliterator<E> spliterator = spliterator();
    while (spliterator.tryAdvance(action)) {
      // Empty
    }
  }
}
```

### Example: ArrayList
```java
ArrayList<String> names = new ArrayList<>();
for(int i = 0; i < 20; i++){
    names.add("name " + i);
}
Iterator<String> iterator = names.iterator();
// String element = iterator.next();

while(iterator.hasNext()){
    element = iterator.next();
    System.out.println(element);
}
```

## Equality in OOP
* `==`
* `equals()`
* Equality with objects(You have to define it)
* Only you know what equivalence means
* The `equals()` method is used to compare objects
* The `==` operator is used to compare references
```java
public class Students {
  private String name;
  private int age;
  public Students(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public boolean equals(Object o){
    if(o == null){
      return false;
    }
    if(o == this){
      return true;
    }
    if(!(o instanceof Students)){
      return false;
    }
    Students s = (Students) o;
    return s.getName().equals(this.getName()) && s.getAge() == this.getAge();
  }
  public int hashCode(){
    return Objects.hash(name, age);
  }
}
```

## Hashing and hash codes
### The hashing concept
* using hash function to convert a object to a string value
  ![](/images/hashing.png)
  ![](/images/hash-function.png)
* hash mapping is not one-to-one, it is one-to-many, but it could be one
  ![](/images/hash-mapping.png)
### hashcode in java
```java
public int hashCode(){
  return Objects.hash(name, age);
}
```
### does two object with the same hashcode equal?
* No.
* It dependes the implementation of `equals()`

### What is hashcode for?
*The purpose of the hashCode() method is to provide a numeric representation of an object's contents so as to provide an alternate mechanism to loosely identify it. By default the hashCode() returns an integer that represents the internal memory address of the object

## Object ordering
### Comparison
* what to compare?
* there is object state in two objects
* there is a clear definition of comparison of those values
* Individual values or combination of values
* not all objects are comparable 
  * two database connection instances are not comparable
* comparison is not defaut
  
### Comparable interface
  * Indicates that an object is comparable
``` java
public interface Comparable<T>{
  public int compareTo(T o);
}
```
### why the return type is `int`?
* Argument object is greater than this object
* Argument object is lesser than this object
* They are both the same(things that are compared are same)
   
### Return values
* Negative value
  * object `o` is greater than `this` object.
* Positive value
  * object `o` is lesser than `this` object.
* Zero 
  * they are both the same.

### Implementing the Comparable interface
```java
public class Student implements Comparable<Student> {

  @Override
  public int compareTo(Student o){
    if(this.id > o.getId()){
      return 1;
    }
    if(this.id < o.getId()>){
      return -1;
    }
    return 0;
  }

  // another way
  public int compareTo(Student o){
    return this.id - o.getId();
  }

}
```

### sorting
```java
Student s1 = new Student(1,"john","doe","science");
Student s1 = new Student(2,"tom","cat","history");
Student s1 = new Student(3,"jane","doe","arts");
ArrayList<Student> students = new ArrayList<>();
students.add(student1);
students.add(student2);
students.add(student3);

students.sort(null);
```
https://github.com/seaboyz/java-collection/blob/1483adbbbf89aeb3e4b26770065c8edd9d2f3d15/Sanbox/src/Student.java#L14

### Custom comparators
* By cource enrollment
* But this is only one `compareTo()` method
* Compartor here to sovle the problem

### Comparable vs Comparator
* Comparable 
  * means I am a object that can be compared
  * please compare me to other objects
* Comparator
  * for creating the object instance for `Comparable` to use
```java
public interface Comparator<T>{
  public int compare(T o1, T o2);
}
```
```java
import java.util.Comparator;

public class StudentLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getLastname().compareTo(s2.getLastname());
    }
}
```
  