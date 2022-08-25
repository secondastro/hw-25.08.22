public class Main {
    public static void main (String [] args) {
        //Задача 1
        int i = 1; byte b = 8; short s = 3; long l = 300L;
        float f = 1.3f; double d = 1.243;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        //Задача 2
        double D = 27.12;
        long L = 987_678_965_549L;
        byte B = 2;
        short S = 569;
        short S1 = -159;
        short S2 = 27897;
        byte B1 = 67;
        //Задача 3
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int listQ = 480;
        int listPerStudent = listQ/(class1+class2+class3);
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги");
        //Задача 4
        int quantity = 16;
        int time = 2;
        int efficiency = quantity/time;
        int eff20 = efficiency * 20;
        int effPerDay = efficiency*60*24;
        int eff3Days = effPerDay*3;
        int effMonth = effPerDay*31;
        System.out.println("За 20 минут машина произвела бутылок " + eff20 + " штук");
        System.out.println("За 1 сутки машина произвела бутылок " + effPerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + eff3Days + " штук");
        System.out.println("За 1 месяц дня машина произвела бутылок " + effMonth + " штук");
        //Задача 5
        int sum = 120;
        int white = 2;
        int brown = 4;
        int colorClass = white + brown;
        int numClass = sum/colorClass;
        System.out.println("В школе, где " + numClass + " классов, нужно " + white*numClass + " банок белой краски и " + brown*numClass + " банок коричневой краски");
        //Задача 6
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int blendWeight = (bananaWeight*banana+milkWeight*milk+iceCreamWeight*iceCream+eggWeight*egg);
        int grams = 1000;

        double total = blendWeight/(grams*1.0);
        System.out.println("Масса завтрака: " + total);
        //Задание 7
        int aim = 7;
        int gramsInKg = 1000;
        int dayWeight1=250;
        int dayWeight2=500;
        int days1 = aim*gramsInKg/dayWeight1; int days2=aim*gramsInKg/dayWeight2;
        int daysMid = (days1+days2)/2;
        System.out.println("Максимальное кол-во дней: " + days1);
        System.out.println("Минимальное кол-во дней: " + days2);
        System.out.println("Среднее количество дней: " + daysMid);
        //Задание 8
        int misha = 67760; int denis =83690; int kristina = 76230;
        int mishaNew = misha + misha/10;
        int denisNew = denis + denis/10;
        int kristinaNew = kristina + kristina/10;
        int mishaDiff = (mishaNew-misha)*12;
        int denisDiff = (denisNew-denis)*12;
        int kristinaDiff = (kristinaNew-kristina)*12;
        System.out.println("Миша теперь получает " + mishaNew + " рублей. Годовой доход вырос на " + mishaDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей.");
    }
}

