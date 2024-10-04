package day4.collections.advantagesoverarray;

public class ArrayTypeSafetyProblem {

    public static void main(String[] args) {


        //Create an array of Object typ
        // Below Object array is called Global Array, since it can hold any type of object
        Object[] objectsArray = new Object[5];

        objectsArray[0] = "Hello"; //Adding a String
        objectsArray[1] = 123; // Adding a Integer
        objectsArray[2] = 99.99; //Adding a Double
        objectsArray[3] = new Person(); //Adding a Person
        objectsArray[4] = new Dog(); // Adding a Dog

        //No compile-time error, but potential runtime error
        for(Object object : objectsArray) {
            // we will assume all elmeents are String and try to cast them
            String str = (String) object;
            System.out.println(str);
        }

        //Disadvantages
        // Lack of type Safety
        // Runtime Error and bug in the code and systems


    }
}

class Person {

}

class Dog {}
