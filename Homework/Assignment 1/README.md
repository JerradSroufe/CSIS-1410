# Homework 1
---
## Description
#### Design a class named Time. The class contains:
- The data fields hour, minute, and second.
- A no-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.)
- A constructor that constructs a Time object with the specified hour, minute, and second.
- Three get methods for the data fields hour, minute, and second, respectively.
- A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10*.


#### Draw the UML diagram for the class and then implement the class. Write a test program that creates two Time objects (using new Time() and new Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second.

(Hint: The first two constructors will extract the hour, minute, and second from the elapsed time, for the no-arg constructor, the current time can be obtained using System.currentTimeMillis(), as shown in Listing 2.6, ShowCurrentTime.java)

*: This is only true in regions with a timezone of +0, here in SLC, (-7) this will instead give you 3:19:10, set your System to UTC time and it will show 10:19:10

---

## Contents


#### HW1.pdf:
PDF that was given with the assignment.
#### Time Class Diagram.png:
A UML class diagram for the Time class.


#### /Java/
##### - Run Me.bat:
 - I couldn't remember how to make a .jar open on double clicking, so I made this to open it, runs:
 ` java -jar Time.jar ` in Windows.
 -Tester.java:
 - Everything the program does that wasn't outlined by the Time class, such as printing, telling you to read this for an explanation on why the thing that was supposed to say 10 said 3, etc.
 Time.jar:
 - The executable .jar for this project.
 -Time.java:
 - Handles time related things, outlined in the description, HW1.pdf, and Time Class Description.png
