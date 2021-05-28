package com.company.Weak4Day4.Task3;

import com.company.Weak4Day4.Task4.Something;

public class Task4 extends Something {
    @Override
    protected void printWeakDay() {
        System.out.println(super.month +" "+super.a);
    }

    public static void main(String[] args) {
        Task4 task = new Task4();
        task.printWeakDay();
    }
}
