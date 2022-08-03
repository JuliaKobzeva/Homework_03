public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        int clientOS = 1;
        boolean OS = clientOS == 1;
        if (OS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {

        int Year = 2000;
        if (Year % 4 == 0 && Year % 100 > 0) {
            System.out.println( Year + " год является високосным");
        } else if (Year % 400 == 0) {
            System.out.println( Year + " год является високосным");
        } else if (Year % 4 > 0) {
            System.out.println( Year + " год не является високосным");
        }
    }

    public static void task4() {
       int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 дня");
        }
    }

    public static void task5() {
         int Month = 11;
         switch (Month) {
             case 1:
                 System.out.println("Зима");
                 break;
             case 2:
                 System.out.println("Зима");
                 break;
             case 3:
                 System.out.println("Весна");
                 break;
             case 4:
                 System.out.println("Весна");
                 break;
             case 5:
                 System.out.println("Весна");
                 break;
             case 6:
                 System.out.println("Лето");
                 break;
             case 7:
                 System.out.println("Лето");
                 break;
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
                 System.out.println("Осень");
                 break;
             case 10:
                 System.out.println("Осень");
                 break;
             case 11:
                 System.out.println("Осень");
                 break;
             case 12:
                 System.out.println("Зима");
                 break;
             default:
                 System.out.println("Такого месяца не существует");

         }
    }
}