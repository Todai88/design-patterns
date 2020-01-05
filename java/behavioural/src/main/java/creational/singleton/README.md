## Singleton

:bulb: The Singleton object is only instantiated the first time, and will make sure you only create one instance of a particular class.

:bulb: You get global access to the Singleton object.  

:bulb: The Singleton pattern decreases the system resources required to use a shared object.

:bulb: Violates the [Single Responsibility Pricinple](https://deviq.com/single-responsibility-principle/).

:bug: Can be implemented due to bad-habits. Components should not necessarily need know too much about each other. 

:bug: Requires special treatment in a multithreaded environment.

:bug: May be difficult to test properly.