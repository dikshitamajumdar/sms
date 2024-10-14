// Java Program to Illustrate StudentRecordManagement Class



// Importing required classes
import java.util.*;

// Class
public class StudentManager {

    // Creating an empty LinkedList
    LinkedList<Student> list;

    // Default Constructor
    public StudentManager()
    {
        list = new LinkedList<>();
    }

    // Method 1
    // Adding Record
    // @param record
    public void addStudent(Student student)
    {

        // Checking if a record already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
        if (!find(student.getRoll())) {
            list.add(student);
        }
        else {

            // Print statement
            System.out.println(
                    "Student already exists");
        }
    }

    // Method 2
    // Searching Record
    // @param idNumber
    // @return
    public boolean find(int idNumber)
    {

        // Iterating record list
        // using for each loop
        for (Student l : list) {

            // Checking record by id Number
            if (l.getRoll() == idNumber) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    // Method 3
    // Delete Record
    // @param recIdNumber
    public void delete(int recIdNumber)
    {
        Student recordDel = null;

        // Iterating record list
        for (Student ll : list) {

            // Finding record to be deleted by id Number
            if (ll.getRoll() == recIdNumber) {
                recordDel = ll;
            }
        }

        // If recordDel is null, then show error message,
        // otherwise remove the record from Record list
        if (recordDel == null) {

            // Displaying no record found
            System.out.println("Invalid Student roll");
        }
        else {

            list.remove(recordDel);

            // Display message for successful deletion of
            // record
            System.out.println(
                    "Successfully removed record from the list");
        }
    }

    // Method 4
    // Finding Record
    // @param idNumber
    // @return
    public Student findStudent(int idNumber)
    {

        // Iterate Record list
        // using for each loop
        for (Student l : list) {

            // Checking record by id Number.
            if (l.getRoll() == idNumber) {
                return l;
            }
        }

        return null;
    }

    // Method 5
    // Update Record
    // @param id
    // @param input
    public void update(int id, Scanner input)
    {

        if (find(id)) {
            Student rec = findStudent(id);

            // Display message only
            System.out.print(
                    "What is the new Student roll no ? ");
            int idNumber = input.nextInt();

            // Display message only
            System.out.print(
                    "What is the new Student age ");
            int age = input.nextInt();
            input.nextLine();

            // Display message only
            System.out.print(
                    "What is the new Student Name ? ");
            String name = input.nextLine();

            System.out.print(
                    "What is the new Student department ? ");
            String department = input.nextLine();

            rec.setRoll(idNumber);
            rec.setName(name);
            rec.setAge(age);
            rec.setDept(department);
            System.out.println(
                    "Student Updated Successfully");
        }
        else {

            // Print statement
            System.out.println(
                    "Student Not Found in the Student list");
        }
    }

    // Method 6
    // Display Records
    public void display()
    {

        // If record list is empty then
        // print the message below
        if (list.isEmpty()) {

            // Print statement
            System.out.println("The list has no records\n");
        }
        // Iterating Record list
        // using for each loop
        for (Student student : list) {

            // Printing the list
            System.out.println(student.toString());
        }
    }
}
