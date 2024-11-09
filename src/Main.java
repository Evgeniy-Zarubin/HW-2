public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(dog+4);
        System.out.println(cat+4);
        System.out.println(paper+4);
        System.out.println(dog-3.5);
        System.out.println(cat-1.6);
        System.out.println(paper-7639);
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend+2);
        System.out.println(friend/7);
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog+10);
        System.out.println(frog/3.5);
        System.out.println((frog/3.5)+4);
        var Fighter1 = 78.2;
        var Fighter2 = 82.7;
        System.out.println(Fighter1+Fighter2);
        System.out.println(Fighter1-Fighter2);
        System.out.println(Fighter2 % Fighter1);
        var allTime = 640;
        var workDay = 8;
        System.out.println("Всего работников в компании - " + allTime/workDay);
        System.out.println("Если в компании работает " + ((allTime/workDay)+94) + " человек то всего " + ((allTime/workDay)+94)*8 + " часов");
    }
}