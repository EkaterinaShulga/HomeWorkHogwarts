package ru.skypro;

public class GryffindorStudents extends HogwartsStudents {


    private int nobility; // блогородство
    private int honor; //честь
    private int bravery;//храбрость


    public GryffindorStudents(String nameStudent, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(nameStudent, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор - " + super.toString() + ", благородство = " + getNobility() + ", честь = " +
                getHonor() + ", храбрость = " + getBravery() + ".";
    }


    public int comparAbilitiesGryffindor() {
        return getNobility() + getHonor() + getBravery();
    }

    public void findBestOfTwoStudentsGryffindor(GryffindorStudents gryffindorStudents) {
        int result1 = comparAbilitiesGryffindor();
        int result2 = gryffindorStudents.comparAbilitiesGryffindor();
        if (result1 > result2) {
            System.out.println(getNameStudent() + " лучший Гриффиндорец, чем " + gryffindorStudents.getNameStudent() + ".");
        } else if (result1 < result2) {
            System.out.println(gryffindorStudents.getNameStudent() + " лучший Гриффиндорец, чем " + getNameStudent() + ".");
        } else if (result1 == result2) {
            System.out.println("Нет лучшего среди равных.");
        }
    }
}


