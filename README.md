# Massey University Club Activity Registration System

A console Java program that simulates a club activity registration system for
Massey University. It stores a set of club activities and students, randomly
registers the students to the activities, and prints eight reports to the screen.

**Course:** 158.710 Practical Software Engineering — Assignment 1
**Author:** Istiaq Hossain (Student ID: 25014618)

---

## Requirements

- JDK 8 or later (any version with `javac` and `java` on the PATH)

Check your installation with:

```
javac -version
java -version
```

## How to run

All the classes are in the default package, so the six `.java` files must stay
in the same folder.

```
cd Assignment1_25014618
javac *.java
java Main
```

`Main` is the only class with a `main` method, so it is always the one
you run. 

 

## Class design

| File | Description |
| --- | --- |
| `Person.java` | Abstract superclass holding the ID and the name. Uses `protected` fields and declares the abstract method `getRole()`. |
| `Student.java` | Subclass of `Person`. Adds the campus and an array of `Registration` objects. |
| `Activity.java` | Holds the details of one club activity: ID, name, categories, time slot, check-in flag, competition flag and modes. |
| `Registration.java` | Joins one student to one activity and remembers the mode used for it. |
| `ClubRegistrationSystem.java` | Stores the activities and the students in arrays, assigns the students randomly, and displays Task 1 to Task 8. |
| `Main.java` | Main class. Adds the test data, adds my own student record, runs the random assignment and calls the eight tasks in order. |

All the data fields are `private` (or `protected` in the superclass) and they are
read or changed through public getter and setter methods, so the classes are
properly encapsulated. Information is stored in arrays with a counter, and
`Math.random()` is used for the random assignment.

## Output

The program prints the following eight tasks in order:

1. The full name of the system.
2. The details of all the activities.
3. The activities in the "Sport" category.
4. The activities that require a check-in.
5. The activities that require a check-in but have no competition.
6. All the students and the activity clubs they registered for.
7. The activities selected by me.
8. The names of the Auckland students who selected A106 (Hiking Group).

### Test data

Six activities (`A101` to `A106`) and nine students, plus my own record, are
added by `Main`.

 
## Notes

- No package name is declared in any file, and the program never clears the
  screen, as required by the assignment specification.
- Only features covered in the course lectures are used: arrays, loops, string
  concatenation, classes and constructors, access modifiers, inheritance,
  abstract classes, method overriding and `Math.random()`.
