package JavaEssential_7_3;

import java.util.Comparator;

/*
Завдання 3
Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:
  назву товару;
  назву магазину, в якому продається товар;
  вартість товару у гривнях.
 Написати програму, яка виконує такі дії:
  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
  виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).
 */
public class Price implements Comparable<Price> {

    String productName;
    String shopName;
    float price;

    public Price(String productName, String shopName, float price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {
        return this.shopName.compareTo(o.shopName);
    }
}
