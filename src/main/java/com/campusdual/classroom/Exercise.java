package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> surnameStack =new Stack<>();

        surnameStack.push("Smith");
        surnameStack.push("Montessori");
        surnameStack.push("Peralta");
        surnameStack.push("House");

        return surnameStack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            String element = stack.pop();
            System.out.println(element);

        }

    }

    public static void main(String[] args) {
        Stack<String> mysurname = createStack();
        System.out.println("Elemetos de la cola: ");
        printAndEmptyStack(mysurname);
        System.out.println("¿Cola vacía? " + mysurname.isEmpty());


    }



}
