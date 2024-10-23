package day5.java8.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaProvidedFunctionalInterfaces {

    public static void main(String[] args) {


        //Predicate
        Predicate<Integer> variable = x -> x == 1;

        boolean isTrueOfFalse = variable.test(10);

        System.out.println(isTrueOfFalse);


        Predicate<String> namePredicate = (x) -> {
            System.out.println("x:: " +x);
            return x.isEmpty();
        };

        boolean isEmpty = namePredicate.test("");

        System.out.println(isEmpty);



        //Consumer
        Consumer<String> printSomething =  (name) -> {
            System.out.println("Name:: "+ name);
            System.out.println("Name Length:: "+ name.length());
        };

        printSomething.accept("What ever");


        Consumer<Integer> integerConsumer = (intVarible) -> {
            System.out.println("Variable Value:: "+ intVarible);
            int calc = intVarible * 100;
            //Perform amount deduction from customer account
        };


        Consumer<User> userConsumer = user -> {
            System.out.println("User Name;: " + user.getName() + " :=: Number:: "+ user.getMobileNumber());
            //Send sms notification to user number
            System.out.println("Sending notification to ::"  + user.getMobileNumber());
        };


        userConsumer.accept(new User("Bh", 999999999));



        Consumer<List<String>> fruitsCosumer = fruits -> {

            for (String fruit : fruits) {
                switch (fruit) {
                    case "Apple" :
                        System.out.println("Send to America");
                        break;
                    case "Mongo" :
                        System.out.println("Send to Russia");
                        break;
                    default:
                        System.out.println("Send to Japan");
                }
            }
        };

        fruitsCosumer.accept(Arrays.asList("Apple", "Mongo", "grapes", "cherry"));




        // Function
        Function<String, Integer> stringLength = string -> string.length();

       List<String> fruitsList =  Arrays.asList("Apple", "Mongo", "grapes", "cherry");

       for (String fruit : fruitsList) {
         int lengthOfFruit  = stringLength.apply(fruit);
           System.out.println(fruit + " Length: "+ lengthOfFruit);
       }


       Function<User, Integer> userFunction = user -> user.getMobileNumber();

       List<User> usersList = new ArrayList<>();
       usersList.add(new User("aaa", 2355455));
       usersList.add(new User("fff", 4444444));
       usersList.add(new User("rrr", 11111));
       usersList.add(new User("tttt", 3333333));
       usersList.add(new User("qqqq", 22222222));
       usersList.add(new User("ooooo", 5555555));

        List<Integer> userMobileNumberList = new ArrayList<>();
       for (User user: usersList) {
           int userMobileNumber = userFunction.apply(user);
           userMobileNumberList.add(userMobileNumber);
       }

        System.out.println("Users Mobile Number List: "+ userMobileNumberList);


       // Supplier

        Supplier<Double> randomNumber = () -> Math.random();
        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();


        System.out.println("==============================================================");
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());


        System.out.println(localDateTimeSupplier.get());
        System.out.println(localDateTimeSupplier.get());
        System.out.println(localDateTimeSupplier.get());
        System.out.println(localDateTimeSupplier.get());
        System.out.println(localDateTimeSupplier.get());



    }
}


class User {
    public User(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    private int mobileNumber;

}