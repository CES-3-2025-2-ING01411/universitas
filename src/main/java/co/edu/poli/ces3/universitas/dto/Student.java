package co.edu.poli.ces3.universitas.dto;

import java.util.Date;

public class Student {
    private String name;

    private String lastName;

    private boolean isMarried;

    private Date birthDate;

    public int age;

    protected String ID;

    public Student(){
        name = "Pedro";
        lastName = "Meneses";
        age = 20;
        isMarried = false;
        birthDate = new Date("1988-10-10");
        System.out.println(birthDate.getTime());
    }

    public Student(String name, String lastName, boolean isMarried, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.isMarried = isMarried;
        this.birthDate = birthDate;
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Numero " + i
            );
        }
    }

    public static void main(String[] args) {
        int x = 5,y = 8;
        float sum = x + y;
        Student pepe;
        pepe = new Student("Andres","Perez", true, new Date(1986,10,9));
        System.out.println("La suma es" + sum);
        System.out.println(pepe.suma());
    }

    public static int suma(){
        return 1 + 9;
    }

    public String myName(){
        System.out.println(this.suma());
        System.out.println(this.name);
        return "mi nombre";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
