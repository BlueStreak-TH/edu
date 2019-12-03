package cscc.edu;

public class HoldingTank {
     //declaration
    private int Current, MaxCapacity;
     //constructor
    public HoldingTank(int Current, int MaxCapacity) {


        this.Current = Current;
        this.MaxCapacity = MaxCapacity;

    }
    // getters
    public int getCurrent() {
        return (Current);
    }

    public int getMaxCapacity() {
        return (MaxCapacity);
    }
    // Add,Drain and print methods
    public void add(int volume) {

        Current = Current + volume;
        if (Current > MaxCapacity)
            Current = MaxCapacity;
    }

    public void drain(int volume) {

        Current = Current - volume;
        if (Current < 0)
        Current = 0;

    }

    public void print() {
        System.out.println("The tank volume " + getCurrent() + " gallons");


    }
}
