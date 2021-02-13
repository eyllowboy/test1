package Practic12;

import java.util.LinkedList;
import java.util.List;

/*Создайте класс очереди для работы с символьными
значениями. Требуется создать реализации для операций
над элементами:
■■ IsEmpty — проверка очереди на пустоту;
■■ IsFull — проверка очереди на заполнение;
■■ Enqueue — добавление элемента в очередь;
■■ Dequeue — удаление элемента из очереди;
■■ Show — отображение всех элементов очереди на экран.
При старте приложения нужно отобразить меню
с помощью, которого пользователь может выбрать не-
обходимую операцию.*/
public class Stack {
    LinkedList<String> list;

    public Stack(LinkedList<String> list) {
        this.list = list;
    }

    public boolean listIsEmpty() {
        if (list.isEmpty()) {
            return true;
        } else return false;
    }


}
