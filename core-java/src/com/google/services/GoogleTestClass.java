package com.google.services;

//Default class can be accessible and can import only with in the same package
//Below line will compilation issue since the DefualtClass is defiened with package-private scope
//import day3.javapackages.defaultmod.DefaultClass;


import day3.javapackages.privatemod.PrivateClass;
import day3.javapackages.protectedmod.ProtectedClass;
import day3.javapackages.publicmod.PublicClass;
public class GoogleTestClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();
        publicClass.publicField = "Updated value from Google Test Class";

        ProtectedClass protectedClass = new ProtectedClass("name");

        // We cannot access the protected members from other package classes
       // protectedClass.protectedMethod();
       // protectedClass.protectedField = "";

        // Default Scoped class can't be imported and instanstiate in different class
     //   DefaultClass defaultClass = new DefaultClass();

        // We cannot access the PrivateClass members since private members has the visibility with in the same package
        PrivateClass privateClass = new PrivateClass();
     //   privateClass.privateField = "";
      //  privateClass.privateMethod();
    }
}
