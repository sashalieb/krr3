/* 8. Задать два стека, поменять информацию местами. */

import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Добавляем примерные данные в стеки для демонстрации
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println("Исходный стек 1: " + stack1);
        System.out.println("Исходный стек 2: " + stack2);

        // Обмен информацией между стеками
        swapStacks(stack1, stack2);

        System.out.println("Обновленный стек 1: " + stack1);
        System.out.println("Обновленный стек 2: " + stack2);
    }

    public static void swapStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tempStack = new Stack<>();

        // Перемещаем все элементы из stack1 в tempStack
        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }

        // Перемещаем все элементы из stack2 в stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        // Перемещаем все элементы из tempStack в stack2
        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }
    }
}

