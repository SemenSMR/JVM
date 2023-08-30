package org.example;

public class Main {
    public static void main(String[] args) {
        // ClassLoader-ы обычно участвуют в процессе загрузки и инициализации классов в Java
        int i = 1;                      // Записывается в Stack Memory создаются в стеке в методе main
        Object o = new Object();        // создается в куче, так как это экземпляр класса , позже очищается сборщиком мусора
        Integer ii = 2;                 // создаются в куче так как примитив , позже очищается сборщиком мусора
        printAll(o, i, ii);             // создается фрейм стека для этого метода
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // создаются в куче так как примитив , позже очищается сборщиком мусора
        System.out.println(o.toString() + i + ii);  //  Создаются и находятся в куче , соответственно тут работает сборщик мусора
    }
}