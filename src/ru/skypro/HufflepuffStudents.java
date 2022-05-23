package ru.skypro;

public class HufflepuffStudents extends HogwartsStudents {

    private int diligence; // трудолюбие
    private int loyalty; // верность
    private int honor; // честь


    public HufflepuffStudents(String nameStudent, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(nameStudent, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй - " + super.toString() + ", трудолюбие = " + getDiligence() + ", верность = " +
                getLoyalty() + ", честь = " + getHonor() + ".";
    }

    public static void findBestOfTwoStudentsHufflepuff(HufflepuffStudents student1, HufflepuffStudents student2) {
        int result1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonor();
        int result2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonor();
        if (result1 > result2) {
            System.out.println(student1.getNameStudent() + " лучший Пуффендуец, чем " + student2.getNameStudent() + ".");
        } else if (result1 < result2) {
            System.out.println(student2.getNameStudent() + " лучший Пуффендуец, чем " + student1.getNameStudent() + ".");
        } else if (result1 == result2) {
            System.out.println("Нет лучшего среди равных.");
        }
    }

}

