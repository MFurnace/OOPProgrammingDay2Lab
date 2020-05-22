## Object Relationships

### Association
* loose relationship, lifetime of object are independent of one another
* "is-a" relationship(Does not apply in evry instance of an Association)

### Composition
* "has-a" relationship or a "part-of"
* A dealership "has a : Department
    * The Departments dont exist outside of a Dealership, therefore its a 
    Composition relationship

    ### Aggregation
    * Dealership also "has" Vehicles, but its a less tightly coupled
    relationship
    * Vehicles come and go through the Dealership and the Dealership can 
    manipulate them while it "own" them
    * But, ultimately, a Vehicle_can_exist outside of a Dealership- this is called **aggregation**

## Generics
* allows us to create classes an methods that can be used on multiple kinds
of data types, elements, etc
*<E> for elements, <T> for data type, <K> key, <V> for value
* we can "bound" our generics to specific user-generate object/type by using
the "Extends" keyword
-example: <E exteds Vehicle>

## OOP Design Patterns
* Sounds really intimidating, but its not
* A convention so well recognized that it has a name and when someone calls a 
pattern by its name, everyone knows what they are talking about


### Factory Pattern
* a method for creating objects w/o exposing the logic needed for creation
* SUPER common pattern in OOP
* using a Factory insulates the consumer from the actual class implementation
* Why is this important? Why use a factory instead of relying on trhe new keyword?
* **abstraction** and **insulation**

## New Stuff we covered Today
1.Factory pattern (and Abstraction0)
2.
3.
4.


----
## When to use abstract classes, generic classes and interfaces

### Abstract Classes--blueprint/scaffold  to use for something else
* Do you need both abstarct and non abstract methods?
* are u okay w/ a class only being anle to implement 1 of you?
* do u expressly need to add new functionality or deo you need some other stuff too?

if answer is Yes, you need an abstract class

### Generic class
* Do you need to work w/ multiple data types or object types?

### Interface- adds functionality to something that already exist
* if u only need non-abstract methods?
* are u easily named as an adjective? (has -ible or -able at the end)
* Can u be paired w/ other interfaces and work 2gether 2 add more functionality?
