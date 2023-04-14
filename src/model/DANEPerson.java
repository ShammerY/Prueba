package model;

public class DANEPerson implements Comparable<DANEPerson>{
    private String name;
    private String lastname;
    private int age;
    private int id;
    public DANEPerson(String name, String lastname, int age, int id) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compareTo(DANEPerson o){
        //Comparamos 2 objetos
        //This comparandi con o
        return this.lastname.compareTo(o.getLastname());
    }





}
