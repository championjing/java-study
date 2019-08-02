package com.rzwl.study.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : championjing
 * @ClassName: TestStream
 * @Description:
 * @Date: 7/31/2019 2:34 PM
 */
public class TestStream {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            Person p = new Person();
            p.setId(i);
            p.setName( i + "ABC");
            list.add( p );
        }
        Stream<Person> stream = list.stream();
        stream.forEach( (p) -> {
            CharSequence charSequence = p.getName().subSequence(0, 2);
            String s = charSequence.toString();
            p.setFirstName( s );
        } );
        
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
class Person{
    private int id;
    private String name;
    private String firstName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
