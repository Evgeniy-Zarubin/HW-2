public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Вывод переменной dog = " + dog);
        System.out.println("Вывод переменной cat = " + cat);
        System.out.println("Вывод переменной paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Вывод переменной dog + 4 = " + dog);
        System.out.println("Вывод переменной cat + 4 = " + cat);
        System.out.println("Вывод переменной paper + 4 = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Вывод переменной dog - 3.5 = " + dog);
        System.out.println("Вывод переменной cat - 1.6 = " + cat);
        System.out.println("Вывод переменной paper - 7639 = " + paper);
        var friend = 19;
        System.out.println("Вывод переменной friend = " + friend);
        friend = friend + 2;
        System.out.println("Вывод переменной friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("Вывод переменной friend / 7 = " + friend);
        var frog = 3.5;
        System.out.println("Вывод переменной frog = " + frog);
        frog = frog * 10;
        System.out.println("Вывод переменной frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("Вывод переменной frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("Вывод переменной frog + 4 после деления на 3.5 = " + frog);
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        System.out.println("Сумма веса бойцов = " + (fighter1 + fighter2));
        System.out.println("Разница веса бойцов = " + (fighter1 - fighter2));
        System.out.println("Остаток от деления веса бойцов = " + (fighter2 % fighter1));
        var allTime = 640;
        var workDay = 8;
        var employers = allTime / workDay + 94;
        System.out.println("Всего работников в компании - " + allTime / workDay);
        System.out.println("Если в компании работает " + employers + " человек то всего " + employers * 8 + " часов");
    }
}