package classes;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Building building = Building.getBuilding();
        Building.display();

        Person teacher1 = new Person("Miruna", "Popescu", 36, 123456L, "Math Teacher");
        Person teacher2 = new Person("Ion", "Vasile", 45, 123458L, "Computer Science Teacher");

        Room room1 = new Room(36, "Math Lab", 3);
        Room room2 = new Room(18, "Computer Science Lab", 1);

        Subject subject1 = new Subject(room1, 30, teacher1);
        Subject subject2 = new Subject(room2, 20, teacher2);

        subject1.display();
        subject2.display();
    }
}
