## Definition
- A creational design pattern that lets you ensure that a class has only one instance
- while providing a global access point to this instance.
## problem
1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.
3. violating the Single Responsibility Principle ()
## Steps
1. Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
2. Create a static creation method that acts as a constructor. 
   1. Under the hood, this method calls the private constructor to create 
   2. an object and saves it in a static field. All following calls to this method return the cached object.

## Pseudocode
``` javascript
// The Database class defines the 'getInstance' method that lets 
// clients access the same instance of a database connection 
// throughout the program.
class Database is
    // The field for storing the singleton instance should be 
    // declared static.
    private static field instance: Database
    
    // The singleton's constructor should always be private to 
    // prevent direct construction calls with the `new` operator.
    private constructor Database() is
    // Some initialization code, such as the actual
    // connection to a database server.
    
// The static method that controls access to the singleton instance.
public static method getInstance() is
    if (this.instance == null) then
        acquireThreadLock() and then
        if (this.instance == null) then
            this.instance = new Database()
    return this.instance
```