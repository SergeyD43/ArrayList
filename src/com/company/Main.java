package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Size: " + list.size());
        list.add(57);
        list.add(45);
        System.out.println("Size: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
    }
}
