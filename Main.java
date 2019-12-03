package cscc.edu;

/*
Name Tihitina Hade, Date 10/10/2019

Description-- The main purpose of this program is to
create a java class that simulates a water holding tank .
*/
public class Main {
    public static void main(String[] args){
       //the main method that tests the class holdingTank.
        HoldingTank tank = new HoldingTank(600, 1000);
        tank.print();
        tank.add(300);
        tank.drain(50);
        tank.print();
        tank.add(500);
        tank.drain(250);
        tank.print();
        tank.drain(1200);
        tank.add(200);
        tank.drain(25);
        tank.print();

    }

}
