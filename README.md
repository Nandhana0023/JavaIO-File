# JavaFile IO - Notes App
Author: Nandhana MA

Description: A simple text-based application to write and read notes using file handling in Java. Users can enter a file name, store notes, and later read the saved content.
##  Technologies Used

- Java

- VScode

- FileWriter - To append and store notes

- BufferedReader / FileReader - To read notes from file

- Exception Handling
## Features

- Write notes to a text file using FileWriter

- Read notes from a file using FileReader / BufferedReader

- Menu-driven console interface

- Simple file-based data storage (no database)
## Sample Output
``` text
--- Notes Manager ---
1. Write Notes
2. Read Notes
3. Exit
Enter choice: 1
Enter file name: notes.java
Enter notes (type 'N' to stop):
Welcome to the world of JAVA
N
Notes saved successfully!

--- Notes Manager ---
1. Write Notes
2. Read Notes
3. Exit
Enter choice: 2
Enter file name: notes.java

--- File Content ---
public class notes {
    
}
Welcome to the world of JAVA

--- Notes Manager ---
1. Write Notes
2. Read Notes
3. Exit
Enter choice: 3
Exiting ... Thank you!
```
