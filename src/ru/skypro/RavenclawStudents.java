package ru.skypro;

public class RavenclawStudents extends HogwartsStudents {

    private int intelligence; //ум
    private int wisdom;//мудрость
    private int wit; //остроумие
    private int creative; //творчество


    public RavenclawStudents(String nameStudent, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creative) {
        super(nameStudent, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Студент факультета Когтевран - " + super.toString() + ", ум = " + getIntelligence() + ", мудрость = " +
                getWisdom() + ", остроумие = " + getWit() + ", творчество = " + getCreative() + ".";
    }

    public static void findBestOfTwoStudentsRavenclaw(RavenclawStudents student1, RavenclawStudents student2) {
        int result1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreative();
        int result2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreative();
        if (result1 > result2) {
            System.out.println(student1.getNameStudent() + " лучший Когтевранец, чем " + student2.getNameStudent() + ".");
        } else if (result1 < result2) {
            System.out.println(student2.getNameStudent() + " лучший Когтевранец, чем " + student1.getNameStudent() + ".");
        } else if (result1 == result2) {
            System.out.println("Нет лучшего среди равных.");
        }
    }
}


