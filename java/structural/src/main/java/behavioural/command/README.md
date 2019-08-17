# Command Pattern

### Terminology
* **Command object**: Knows about a Receiver and invokes a method on it.  
* **Receiver object**:  
* Invoker: 
* Client:

#### Usage

#### What problems can the Command design pattern solve?
Coupling the invoker of a request to a particular request should be avoided. That is, hard-wired requests should be avoided.
It should be possible to configure an object (that invokes a request) with a request.
Implementing (hard-wiring) a request directly into a class is inflexible because it couples the class to a particular request at compile-time, which makes it impossible to specify a request at run-time.

##### What solution does the Command design pattern describe?
Define separate (command) objects that encapsulate a request.
A class delegates a request to a command object instead of implementing a particular request directly.