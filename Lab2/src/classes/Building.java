package classes;

// Implement a Singleton class as you learned in the course.

// the school has one building
public class Building {
        private static Building building;
        private static String buildingName;
        private Building(){
            buildingName = "Highschool Building";
        }

        public static Building getBuilding(){
            if (building == null)
                building = new Building();
            return building; }

        public static void display(){
            System.out.println("Building: " + buildingName);
        }
}
