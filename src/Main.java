public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача №3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var weightOneBoxer = 78.2;
        System.out.println("Масса одного боксёра " + weightOneBoxer + " кг.");
        var weightTwoBoxer = 82.7;
        System.out.println("Масса второго боксёра " + weightTwoBoxer + " кг.");
        var totalWeightBoxers = (weightOneBoxer + weightTwoBoxer);
        System.out.println("Общая масса боксёров " + totalWeightBoxers + " кг.");
        var differenceWeightBoxers = (weightOneBoxer - weightTwoBoxer);
        System.out.println("Разница массы боксёров " + differenceWeightBoxers + " кг.");

        System.out.println("Задача №7");
        var differenceWeightBoxers2 = (weightTwoBoxer % weightOneBoxer);
        System.out.println("Разница массы боксёров " + differenceWeightBoxers2 + " кг.");

        System.out.println("Задача №8");
        var numberHours = 640;
        System.out.println(numberHours + " часов работы поделено между сотрудниками.");
        var oneWorkerHours = 8;
        System.out.println("Один сотрудник работает " + oneWorkerHours + " часов.");
        var numberWorkers = numberHours / oneWorkerHours;
        System.out.println("Всего работников в компании " + numberWorkers + " человек.");
        var newNumberWorkers = numberWorkers + 94;
        var newNumberHours = newNumberWorkers * oneWorkerHours;
        System.out.println("Если в компании работает " + newNumberWorkers + " человек," + " то всего " + newNumberHours + " часов работы может быть поделено между сотрудниками.");
    }
}