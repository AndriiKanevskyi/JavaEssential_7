package JavaEssential_7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Завдання 2

Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:

  прізвище та ініціали працівника;

  назва посади;

  рік надходження на роботу.

Написати програму, яка виконує такі дії:

  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);

  якщо значення року введено не у відповідному форматі, видає виняток.

  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
 */
public class Main {
    public static void main(String[] args) throws yearOfEmpExceptio {
        Scanner sc = new Scanner(System.in);
        ArrayList<Worker> workersList =new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String nameTmp=null;
            try {
                System.out.println("Введіть в рядок через пробіл наступні данні: ПІБ, ПОСАДА, РІК ПРАЦЕВЛАШТУВАННЯ (від 1994 до 2022) ");
                nameTmp=sc.next();
                workersList.add(new Worker(nameTmp,sc.next(),sc.nextInt()));
                Collections.sort(workersList);
            } catch (yearOfEmpExceptio e) {
                System.out.println("Працівник "+ nameTmp +" ввів неправильний формат року");
                throw e;

            }
        }
    }
}
