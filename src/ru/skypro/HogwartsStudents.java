package ru.skypro;

public class HogwartsStudents {


    private String nameStudent;
    private int powerOfMagic; // сила магии
    private int transgressionDistance; //расстояние трансгрессии


    public HogwartsStudents(String nameStudent, int powerOfMagic, int transgressionDistance) {
        this.nameStudent = nameStudent;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }


    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return getNameStudent() + ":" + " сила магии = " + getPowerOfMagic() + ", расстояние трансгрессии = " + getTransgressionDistance();
    }

    public int comparAbilities() {
        return getPowerOfMagic() + getTransgressionDistance();
    }

    public void findBestOfTwoHogwartsStudents(HogwartsStudents hogwartsStudents) {
        int result1 = comparAbilities();
        int result2 = hogwartsStudents.comparAbilities();
        if (result1 > result2) {
            System.out.println(getNameStudent() + " лучший студент Хогвартса по силе магии - " + getPowerOfMagic() +
                    " и силе трансгрессии - " + getTransgressionDistance() + ", чем " + hogwartsStudents.getNameStudent() + ", с силой магии равной " + hogwartsStudents.getPowerOfMagic() +
                    " и силой трансгрессии, равной - " + hogwartsStudents.getTransgressionDistance() + ".");
        } else if (result1 > result2) {
            System.out.println(hogwartsStudents.getNameStudent() + "лучший студент Хогвартса по силе магии" + hogwartsStudents.getPowerOfMagic() +
                    "и силе трансгрессии " + hogwartsStudents.getTransgressionDistance() + ", чем " + getNameStudent() + ", с силой магии = "
                    + getPowerOfMagic() + " и силой трансгрессии, = " + getTransgressionDistance() + ".");
        } else if (result1 == result2) {
            System.out.println("Студенты равны в силе магии и трансгрессии" + ".");
        }

    }

}
