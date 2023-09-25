Блок 1. Работа на занятии

Задача 1:

Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
из классов так, чтобы он выводил: «I draw» + имя класса и «I erase» + имя класса. Показать
работа каждого из методов в main другого класса.

Задача 2:

Создать класс Person. Написать статическое финальное поле name и статический метод,
который выводит его имя в консоль. Реализовать в методе main другого класса вызов
поля и метода не создания объекта класса Person.

Блок 2. Домашнее задание

Задача 1:

Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен.

Задача *:

Написать такой конструктор, который запретит создание объекта класса Dog в других
классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
способа.