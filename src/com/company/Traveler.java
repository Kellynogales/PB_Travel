package com.company;

public class Traveler {
    private String name;
    private int age;
    private  int phone;

    public Traveler(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

     public void displayTraveler () {
         System.out.println( "-------------------------" +
                             "\nDATA OF TRAVELER " +
                             "\n-------------------------");
         System.out.println("Name: " +  name);
         System.out.println("Age: " +  age + " years");
         System.out.println("Phone: " +  phone);
     }
}
