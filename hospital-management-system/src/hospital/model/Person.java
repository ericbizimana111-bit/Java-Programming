package hospital.model;

import hospital.interfaces.Describable;

/**
 * Abstract base class for anyone in the hospital system.
 * Patient, Doctor and Staff all extend this (OOP: inheritance + abstraction).
 */
public abstract class Person implements Describable {

    protected String id;
    protected String name;
    protected int age;
    protected Gender gender;
    protected String phone;

    public Person(String id, String name, int age, Gender gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    // ---- getters ----
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    // ---- setters ----
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // every subclass must say what role it plays (abstraction)
    public abstract String getRole();

    @Override
    public String describe() {
        return String.format("[%s] %s | Age: %d | Gender: %s | Phone: %s | Role: %s",
                id, name, age, gender, phone, getRole());
    }

    @Override
    public String toString() {
        return describe();
    }
}
