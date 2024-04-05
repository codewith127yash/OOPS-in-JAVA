class ObjectCounter {
    // Static variable to count the number of objects created
    private static int numberOfObjects = 0;

    // Constructor increments the count each time an object is created
    public ObjectCounter() {
        numberOfObjects++;
    }

    // Static method to get the count of objects created
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of ObjectCounter class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Displaying the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getNumberOfObjects());
    }
}
