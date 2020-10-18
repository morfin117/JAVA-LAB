package ru.mirea.Byrin.pr1;
import java.lang.*;

public class Dog {
    private String moniker;
    private String breed;
    private double age;

    public Dog(String moniker, String breed, double age) {
        this.moniker = moniker;
        this.breed = breed;
        this.age = age;
    }

    public String getMoniker() {
        return moniker;
    }

    public void setMoniker(String moniker) {
        this.moniker = moniker;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "moniker='" + moniker + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
