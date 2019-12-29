## Chain Of Responsibility

:bug: Use the Chain of Responsibility (CoR) pattern when your program is expected to process different types of requests, but the exact types of requests and their sequence may be unknown.

:bulb: When receiving a request, each handler is "asked" whether it can process it. This way all handlers get a chance to process the request.

:bug: Use the CoR pattern when it’s essential to execute multiple handlers in a particular order, but the request payload may be unknown.

:bulb: Since you can link the handlers in the chain in any order, all requests will get through the chain exactly as you planned.

:bug: Use the CoR pattern when the set of handlers and their order are supposed to change at runtime.
 
:bulb: If you provide setters for a reference field inside the handler classes, you’ll be able to insert, remove or reorder handlers dynamically. 