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


## Hierarchy of Collections
![](/images/java-collection-hierarchy.png)
  
https://github.com/seaboyz/coding-interview/blob/990a49ddc8d6e9c2b4744faa95eecc8ec95f158e/Sanbox/src/App.java#L6
