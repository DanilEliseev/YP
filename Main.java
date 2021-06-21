package ychebka;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     
        Arendator k = new Arendator("Fastarenda", "89524335678", "г.Белгород, Спортивная 1", "308666", "1415 234567");
        Rieltor k1 = new Rieltor("Лютенко Игорь Алексеевич", "89674563456", "1415 123654", "pomik223@mail.ru", "с. Таврово, Лесная 5");
        Rieltor k2 = new Rieltor("Елисеев Данил Витальевич", "89524388940", "1415 709252", "Danikkk1996@mail.ru", "Белгородский проспект 67");
        Rieltor k3 = new Rieltor("Пащенко Вячеслав Игоревич", "89806594570", "1415 134642", "Slava345@mail.ru", "Губкина 12");
        Arenda z1 = new Arenda("ТЦ Мега Гринн", "3", "45", "есть", "20000", "45кв/м");
        Arenda z2 = new Arenda("ТРЦ РИО", "1", "22", "есть", "15000", "30кв/м");
        Arenda z3 = new Arenda("ТЦ Сити-Молл", "2", "33", "есть", "25000", "50кв/м");

        Scanner a = new Scanner(System.in);
        Scanner m = new Scanner(System.in);

        int a3 = 0;

        do{

            System.out.println("1. Вывести информацию о риелторе.\n2. Вывести информацию о арендаторе."
                    + "\n3. Вывести информацию о аренде.\n0. Выход.");
            int a1 = a.nextInt();

            do {

                if (a1 == 1) {
                    k.printAboutObject();
                    System.out.println();

                } else if (a1 == 2) {
                    k1.printAboutObject();
                    System.out.println();
                    k2.printAboutObject();
                    System.out.println();
                    k3.printAboutObject();
                    System.out.println();
                } else if (a1 == 3) {
                    z1.printAboutObject();
                    System.out.println();
                    z2.printAboutObject();
                    System.out.println();
                    z3.printAboutObject();
                    System.out.println();
                }


                a3 = m.nextInt();
            } while (a3 != 0);

            System.out.println("Введите 0 для выхода.");
            System.out.println("Введите другое число для возврата в меню.");
            //0 для выхода из программы
            //другое число для возврата в меню

            a3 = m.nextInt();
        } while (a3 != 0);
    }
}
