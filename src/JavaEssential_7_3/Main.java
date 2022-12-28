package JavaEssential_7_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
public class Main {
    public static void main(String[] args) throws NoCorrectShopRequestException {

        Scanner sc = new Scanner(System.in);

        ArrayList<Price> list=new ArrayList<Price>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name of the product:");
            String productName = sc.nextLine();
            System.out.println("Enter store name:");
            String store = sc.nextLine();
            System.out.println("Enter price in UAH:");
            float price = Float.parseFloat(sc.nextLine());
            list.add(new Price(productName, store, price));
            Collections.sort(list);
        }

        System.out.println("Enter store you are looking for:");
        String shopRequest= sc.nextLine();
        boolean isCorrectStore =false;
        for (Price tmp:list) {
            if (tmp.shopName.equals(shopRequest)){isCorrectStore=true;}}
            if (isCorrectStore==true){
                System.out.println("Products available in the store "+shopRequest+" :" );
                for (Price tmp:list) {
                if (tmp.shopName.equals(shopRequest)){System.out.println(tmp.productName+" price : "+tmp.price +"UAH");}}}

                if(isCorrectStore==false){throw new NoCorrectShopRequestException("Shop "+shopRequest+" not found!");}}}








