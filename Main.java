public class Main {
    public static void main(String[] args) {

        // 1
        int age = 12;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        // 2
        String name = "Иванов Иван";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));

        // 3
        System.out.println(10 + 15);
        System.out.println(10 - 2);
        System.out.println(2 * 2);
        System.out.println(10 / 5);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3.0);

        System.out.println(10 % 3);

        System.out.println("a" + "b");

        // 4
        System.out.println(1 > 2);
        System.out.println(2 == 2);
        System.out.println(2 >= 2);
        System.out.println(3 != 3);

        // 5
        System.out.println(2 == 2 && 3 != 2); // true && true -> true
        System.out.println(2 == 2 && 3 != 3); // true && false -> false
        System.out.println(!((2 + 2) == 4)); // !(4 == 4) -> !(true) -> false
        System.out.println(!((2 + 2) == 4) || true); // false || true -> true

        // 6
        /**
         * привет
         * привет
         */
        System.out.println("Привет, я " + name + "! Мне " + age + " лет.");
        System.out.printf("Привет, я %s! Мне %s лет.", name, age);

        int oddNumber = 2;
        System.out.println();
        System.out.printf("Число четное? %s", oddNumber % 2 == 0);

        System.out.println();
        System.out.println("    *    ");
        System.out.println("  * * *  ");
        System.out.println("* * * * *");

        //homework 2
        //1 Напишите функциональность, которая вычисляет площадь круга

        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.printf("Площадь круга с радиусом %s = %s", radius, area);

        System.out.println();

        //2 Переведите температуру в градусах Цельсия в Фаренгейты

        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Температура %.2f°C = %.2f°F%n", celsius, fahrenheit);

        System.out.println();

        //3 Проверьте, является ли длина сроки "Hello" равной длине другой строки

        String str1 = "Hello";
        String str2 = "World!";
        boolean isEqual = str1.length() == str2.length();
        System.out.printf("Длины строк \"%s\" и \"%s\" %s%n",
                str1, str2, isEqual ? "равны" : "не равны");

        System.out.println();

        //4 Напишите функциональность, которая определяет, является ли год високосным

        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //true - год делится на 4 и не делится на 100 или делится на 400
        System.out.printf("Год %d %s високосным.%n", year, isLeap ? "является" : "не является");

        System.out.println();

        //5 Напишите калькулятор ИМТ

        double weight = 100.0; // вес в кг
        double height = 2.0; // рост в метрах
        double bmi = weight / (height * height);
        System.out.printf("Индекс массы тела (ИМТ) для веса %s кг и роста %s м = %s",
                weight, height, bmi);

        System.out.println();

        //6 Выведите в консоль таблицу истинности для операторов && и ||

        System.out.println("A     | B     | A && B | A || B");
        System.out.println("--------------------------------");
        System.out.printf("%5b | %5b | %6b | %6b%n", false, false, false && false, false || false);
        System.out.printf("%5b | %5b | %6b | %6b%n", false, true, false && true, false || true);
        System.out.printf("%5b | %5b | %6b | %6b%n", true, false, true && false, true || false);
        System.out.printf("%5b | %5b | %6b | %6b%n\n", true, true, true && true, true || true);

        System.out.println();

        //7 Выведите в консоль квадрат

        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");

        System.out.println();

        //8 Выведите в консоль полый квадрат

        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");

        System.out.println();

        //9 Выведите в консоль ромб

        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");

        //10 Выведите в консоль смайлик

        System.out.println();

        System.out.println("   *****   ");
        System.out.println(" *       * ");
        System.out.println("*  O   O  *");
        System.out.println("*    ^    *");
        System.out.println("*   \\_/   *");
        System.out.println(" *       * ");
        System.out.println("   *****   ");
    }
}