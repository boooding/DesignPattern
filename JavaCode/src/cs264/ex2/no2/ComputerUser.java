package cs264.ex2.no2;
import java.util.LinkedList;

/*
    A User class has the required attributes of last name and first name,
    and the optional attributes of age, name, and telephone number.
    Use the Builder pattern to create a ComputerUser class.
    Write a test class to test the creation of different types of users.
 */

public class ComputerUser implements IBuilder {
    private User user;
    private String firstName;
    private String lastName;
    private Integer age;
    private String name;
    private String telephone;

    public ComputerUser( String firstName, String lastName, Integer age, String name, String telephone) {
        this.user = new User();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.name = name;
        this.telephone = telephone;
    }

    public ComputerUser( String firstName, String lastName) {
        this.user = new User();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void addFirstName() {
        if(firstName != null){
            user.add("firstName = "+firstName);
        }
    }
    @Override
    public void addLastName() {
        if(lastName != null){
            user.add("lastName = " + lastName);
        }
    }
    @Override
    public void addAge() {
        if(age != null){
            user.add("Age = " + age);
        }
    }

    @Override
    public void addName() {
        if(name!=null){
            user.add("Name= " + name);
        }
    }

    @Override
    public void addTelephone() {
        if(telephone!=null){
            user.add("Telephone= " + telephone);
        }
    }

    @Override
    public User getUser() {
        return user;
    }
}

class User {
    private LinkedList<String> person;
    public User (){
        person = new LinkedList<String>();
    }
    public void add(String part){
        person.addLast(part);
    }
    public void showUser(){
        for(String part:person){
            System.out.println(part);
        }
    }
}

class Director {
    IBuilder builder;
    public void construct(IBuilder builder){
        this.builder=builder;
        builder.addFirstName();
        builder.addLastName();
        builder.addName();
        builder.addTelephone();
        builder.addAge();
    }
}