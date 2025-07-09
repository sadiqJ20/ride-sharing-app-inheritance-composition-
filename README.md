----------------Ride_Sharing_App-----------------
--> Overview
This is a simple object-oriented Java program simulating a ride-sharing app (like Ola/Uber).
It demonstrates inheritance, composition, and object interaction in a real-world scenario.


--> Class Structure
Class         Role                                      
------------------------------------------------------------------------ 
`User`      | Base class representing a user in the system               
`Driver`    | Inherits from `User`, represents a driver with a `Car`     
`Passenger` | Inherits from `User`, represents a passenger                
`Car`       | Represents the driver's car (used via composition)          
`Location`  | Represents a location/city (used for pickup/drop etc.)
`Trip`      | Connects `Driver`, `Passenger`, and `Location` for the ride 
`Main`      | The entry point that runs the program and simulates a trip  

-->  Concepts Demonstrated

1.Inheritance: Driver and Passenger inherit from User

2. Composition:

   Driver has a Car

   Trip has a Driver, Passenger, Locations

3. Constructor Chaining

4. Object Interaction


