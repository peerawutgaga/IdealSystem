package P1;

public class A5 extends A3 {
    @Override
    public double process(double input1, double input2) {
        return input1+input2;
    }
    public double process(double input1, double input2,double input3) {
        return (input1+input2)*input3;
    }
    @Override
    public int calculate(int input1, int input2) {
        return input1+input2;
    }
}
