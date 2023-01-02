import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
    }

    private static void task5() {
        var timeWork = 640;
        var timeWorkOne = 8;
        var personal = timeWork / timeWorkOne;
        System.out.println("Всего работников в компании - "+ personal + " человек");
        personal = personal + 94;
        System.out.println(personal);
        timeWork = personal * timeWorkOne;
        System.out.println("Если в компании работает " + personal + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");

    }

    private static void task4() {
        var boxerOne = 78.2;
        var boxerTwo = 87.2;
        System.out.println(boxerOne+boxerTwo);
        System.out.println(boxerTwo-boxerOne);
        var raznica1 = boxerTwo-boxerOne;
        System.out.println(raznica1);
        var raznica2 = boxerTwo % boxerOne;
        System.out.println(raznica2);
    }

    private static void task3() {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    private static void task2() {
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task1() {
        var dog = 8.0;
        var cat = 3.0;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

    }
}