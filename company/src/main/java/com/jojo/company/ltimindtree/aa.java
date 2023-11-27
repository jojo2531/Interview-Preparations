package com.jojo.company.ltimindtree;

public class aa {

    final int a = 10;

    void display()  {

        int a = 15;
        Runnable rr = new Runnable() {

            final int a = 20;
            @Override
            public void run() {

                int a = 25;
                System.out.println(this.a);
            }
        };
    }

    public static void main(String[] args) {
        aa aa = new aa();
        aa.display();
    }
}
