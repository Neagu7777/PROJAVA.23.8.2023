
//1 уровень сложности: 1)Создать класс Person.

//2) В нем добавить такие поля:

//    а) Имя человека (выбрать самостоятельно тип данных)
//    б) Возраст человека (выбрать самостоятельно тип данных)
//    в) Рост (выбрать самостоятельно тип данных)
//    г) Вес (выбрать самостоятельно тип данных)данных

//3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому

//4) Добавить методы:
//    a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//    б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"

//            5) Создать несколько объектов и заполнить их

//    Доп. задание:

//            6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.
//            7) перед int money переменной поставить ключевое слово private. Описать, чт
package ConstructorPerson;
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private int money;


    public Person(String name, int age, double height, double weight, int money) {
        //конструктор класса Персон
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " age");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Money: " + money + " euro");
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Relaxing home");

        } else System.out.println("Working");


    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void die() {
        System.out.println("Человек погиб");


    }
}



/*
1 уровень сложности: 1)Создать класс Person.

2) В нем добавить такие поля:


а) Имя человека (выбрать самостоятельно тип данных)
б) Возраст человека (выбрать самостоятельно тип данных)
в) Рост (выбрать самостоятельно тип данных)
г) Вес (выбрать самостоятельно тип данных)


3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому


4) Добавить методы:
a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"


5) Создать несколько объектов и заполнить их


Доп. задание:


6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.


7) перед int money переменной поставить ключевое слово private. Описать, что произойдет в программе.


1) Создать классы Pensioner и Worker. Унаследовать их от класса Person.
В класс Pensioner добавить дробное поле pension (пенсия),
в класс Worker добавить два поля minSalary и maxSalary (минимальная и максимальная зарплата).


2) В класс Person добавляем метод die(), который ничего не возвращает, но пишет "Человек погиб".


3) В классе Worker переопределеяем этот метод (override) таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"


4) В классе Pensioner переопределяем так: пишем на экран "Этот пенсионер умер, он заработал: x".
Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"



 */