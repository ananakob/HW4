public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int airTemperature = 10;
        if (airTemperature >=5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (airTemperature <5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        if (speed <=60) {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 19;
        if (age>=2 && age<=6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        }
        if (age>=7 && age<18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу.");
        }
        if (age>=18 && age<=24){
            System.out.println("Если возраст человека равен "+age+", то его место в университете.");
        }
        if (age>24){
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 10;
        if (age<5){
            System.out.println("Если возраст ребенка равен "+age+", то он не может кататься на аттракционах.");
        }
        if (age>=5 && age<14){
            System.out.println("Если возраст ребенка равен "+age+", то он может кататься на аттракционах в сопровождении взрослого.");
        }
        if (age>=14){
            System.out.println("Если возраст ребенка равен "+age+", то он может кататься на аттракционах без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int busySite = 60;
        if (busySite<60){
            System.out.println("В вагоне есть сидячие места.");
        }
        else if (busySite>=60 && busySite<102) {
            System.out.println("В вагоне остались только стоячие места.");
        }else{
            System.out.println("В вагоне свободных мест нет.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 15;
        int two = 7;
        int three = 9;
        if (one>two && one>three){
            System.out.println("Число ONE равное "+one+" больше числел TWO - "+two+" и THREE - "+three);
        } else if (two>one && two>three) {
            System.out.println("Число TWO равное "+two+" больше числел ONE - "+one+" и THREE - "+three);
        }else{
            System.out.println("Число THREE равное "+three+" больше числел ONE - "+one+" и TWO - "+two);
        }
    }
}
