package ru.skypro;

public class Main {


    public static void main(String[] args) {

        GryffindorStudents garry = new GryffindorStudents("Гарри Поттер", 20, 25, 20, 25, 30);
        GryffindorStudents hermione = new GryffindorStudents("Гермиона Грейнджер", 30, 25, 10, 10, 20);
        GryffindorStudents ron = new GryffindorStudents("Рон Уизли", 15, 10, 25, 30, 35);

        HufflepuffStudents zachariah = new HufflepuffStudents("Захария Смит", 10, 15, 20, 20, 20);
        HufflepuffStudents сedric = new HufflepuffStudents("Седрик Диггори", 25, 20, 30, 30, 30);
        HufflepuffStudents justin = new HufflepuffStudents("Джастин Финч-Флетчли", 5, 15, 15, 20, 20);

        RavenclawStudents zhou = new RavenclawStudents("Чжоу Чанг", 15, 10, 10, 10, 15, 20);
        RavenclawStudents padma = new RavenclawStudents("Падма Патил", 15, 20, 15, 15, 20, 15);
        RavenclawStudents marcus = new RavenclawStudents("Маркус Белби", 15, 15, 10, 10, 15, 20);

        SlytherinStudents draco = new SlytherinStudents("Драко Малфой", 10, 10, 20, 5, 30, 5, 30);
        SlytherinStudents graham = new SlytherinStudents("Грэхэм Монтегю", 10, 5, 10, 5, 20, 15, 15);
        SlytherinStudents gregory = new SlytherinStudents("Грегори Гойл", 5, 10, 15, 5, 20, 10, 20);

        System.out.println(ron);
        System.out.println(zachariah);
        System.out.println(padma);
        System.out.println(graham);

        System.out.println();

        hermione.findBestOfTwoStudentsGryffindor(ron);

        HufflepuffStudents.findBestOfTwoStudentsHufflepuff(zachariah, сedric);
        RavenclawStudents.findBestOfTwoStudentsRavenclaw(zhou, marcus);
        SlytherinStudents.findBestOfTwoStudentsSlytherin(draco, graham);
        System.out.println();

        HogwartsStudents potter = new HogwartsStudents("Гарри Поттер", 20, 25);
        HogwartsStudents malfoy = new HogwartsStudents("Драко Малфой", 10, 10);
        potter.findBestOfTwoHogwartsStudents(malfoy);


    }

}




