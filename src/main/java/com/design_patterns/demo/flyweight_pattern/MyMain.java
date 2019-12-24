package com.design_patterns.demo.flyweight_pattern;

/**
 * @author DucDT
 */
public class MyMain implements Runnable{
    Thread thread;
    public static void main(String[] args) {

        MyMain m = new MyMain();

    }

    public MyMain() {
        String[] names = {"Ralph", "Alice", "Sam"};
        int[] ids = {1001, 1002, 1003};
        int[] scores = {45,55,65};

        double total = 0;
        for(int i = 0; i < scores.length; i++) {
            total  += scores[i];
        }

        double averageScore = total/scores.length;
        Student student = Student.getInstance();

        student.setAverageScore(averageScore);
        student.setName("Ralph");
        student.setId(1002);
        student.setScore(45);

        thread = new Thread(this, "second");
        thread.start();

        System.out.println("Name: " + student.getName() + " Standing: " + Math.round(student.getStanding()));
        System.out.println("INSEOff:" + thread.currentThread().getName() );
    }


    @Override
    public void run() {
        Student student = Student.getInstance();
        System.out.println("Name: " + student.getName() + " Standing: " + Math.round(student.getStanding()));
        System.out.println("INSEO:" + thread.currentThread().getName() );
    }
}
