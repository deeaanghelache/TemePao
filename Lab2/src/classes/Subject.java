package classes;

// Write a program to create an object Subject with the following
// attributes:
//        - room as Room
//        - noOfStudents as integer
//        - teacher as Person
// Define a constructor for this class as well as accessors and
// mutators for all the attributes. Create two objects of type
// Subject and display the information for them on separate lines.

public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    void display(){
        System.out.println("--------------------------------");
        System.out.println("ROOM");
        room.display();
        System.out.println("\nNumber of Students: " + noOfStudents + "\n");
        System.out.println("TEACHER");
        teacher.display();
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }
}
