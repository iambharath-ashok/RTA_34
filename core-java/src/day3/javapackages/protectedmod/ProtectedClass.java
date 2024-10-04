package day3.javapackages.protectedmod;

public class ProtectedClass {

    protected ProtectedClass(){}

    public ProtectedClass(String name){

    }


    protected String protectedField = "Protected Field";

    protected void protectedMethod() {
        System.out.println("Protected method in a public class");
    }
}
