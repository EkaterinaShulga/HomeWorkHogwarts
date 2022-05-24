package ru.skypro;

public class SlytherinStudents extends HogwartsStudents {

    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;//амбициозность
    private int resourcefulness;//находчивость
    private int thirstPower; // жажда власти


    public SlytherinStudents(String nameStudent, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(nameStudent, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизерин - " + super.toString() + ", хитрость = " + getCunning() + ", решительность = " +
                getDetermination() + ", амбициозность = " + getAmbition() + ", находчивость = " + getResourcefulness() +
                ", жажда власти = " + getThirstPower() + ".";
    }

    public static void findBestOfTwoStudentsSlytherin(SlytherinStudents student1, SlytherinStudents student2) {
        int result1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstPower();
        int result2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstPower();
        if (result1 > result2) {
            System.out.println(student1.getNameStudent() + " лучший Слизеринец, чем " + student2.getNameStudent() + ".");
        } else if (result1 < result2) {
            System.out.println(student2.getNameStudent() + " лучший Слизеринец, чем " + student1.getNameStudent() + ".");
        } else if (result1 == result2) {
            System.out.println("Нет лучшего среди равных.");
        }
    }

}



