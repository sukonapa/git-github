package com.info.demo;

import java.util.*;
import java.util.stream.Collectors;

public class UnitExpressionJava8 {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("null","Neeti",60),
                new Person("Deepa1","Neeti",60),
                new Person("Prasad","Dentu",60),
                new Person("Ramesh","Kumar",60)
        );


        Collections.sort(people,( Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        people.stream()
                .filter(p3-> p3.getLastName().startsWith("N"))
                .forEach(p3 -> System.out.println(p3.getFirstName()));
       // people.stream().collect(Collectors.partitioningBy());

        Optional<Object> emptied = Optional.empty();
        //emptied.map
        System.out.println("emptied"+emptied);

        Person personlObj = new Person(null,"wer",20);
        //Optional<String> firstName = Optional.of(personlObj.getFirstName());
        //System.out.println(firstName);
       // Optional<String> firstName1 = Optional.ofNullable(personlObj.getFirstName());
        //firstName1.map(String::trim)

        //people.forEach(p-> UnitExpressionJava8::test);


        FuncInterface fobj = new DemoInterface();
        int m = fobj.strLength("");
        System.out.println("interher "+m);
        FuncInterface.staticInter();
        fobj.defalutInt();


    }
    public  static void test(){
        System.out.println("test");
    }

}
class DemoInterface implements FuncInterface{

    @Override
    public int strLength(String s) {
        return num;
    }


}
