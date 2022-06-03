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
    - [interfaces](#interfaces)
    - [Iterators](#iterators)

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
### interfaces
```java
public interface Iterator<E> {
  boolean hasNext();// Are there more elements?
  E next();// Get the next element in the iteration
  void remove();// Remove the last element returned by iterator
  default void forEachRemaining(Consumer<? super E> action) 
}
```
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
### Iterators
* each iterator has its own state(every time you get a iterator form .iterator(), it returns a new iterator)
* iterator does not like the collection to be modified