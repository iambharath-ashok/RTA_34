package day1.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int z = 10;

        z += 5;  // Equivalent to z = z + 5
        System.out.println("z += 5: " + z);

        z -= 3;  // Equivalent to z = z - 3
        System.out.println("z -= 3: " + z);

        z *= 2;  // Equivalent to z = z * 2
        System.out.println("z *= 2: " + z);

        z /= 4;  // Equivalent to z = z / 4
        System.out.println("z /= 4: " + z);

        z %= 3;  // Equivalent to z = z % 3
        System.out.println("z %= 3: " + z);
    }
}
