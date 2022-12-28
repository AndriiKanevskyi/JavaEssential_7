package JavaEssential_7_2;

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

public class Worker implements Comparable<Worker> {
     String fio;
     String title;

    public void setYearOfEmp(int yearOfEmp)throws yearOfEmpExceptio {
  if (yearOfEmp<=1994||yearOfEmp>2022){
      throw new yearOfEmpExceptio();
  }else this.yearOfEmp=yearOfEmp;
    }

    private int yearOfEmp;

    public Worker(String fio,String title,int yearOfEmp) throws yearOfEmpExceptio {
        this.fio=fio;
        this.title=title;
        this.setYearOfEmp(yearOfEmp);
    }

    @Override
    public int compareTo(Worker o) {
        return this.fio.compareTo(o.fio);    }

    @Override
    public String toString() {
        return fio+" "+title+" "+yearOfEmp;
    }
}
