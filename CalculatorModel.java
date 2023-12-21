public class CalculatorModel
{
    void sum(int a, int b)
    {
        int c = a+b;
        System.out.println("Add 2 numbers" +c);
    }
    void sum(int a, int b, int e)
    {
        int c = a+b+e;
        System.out.println("Addition of these numbers" +c);
    }
    public static void main(String[] args)
    {
        CalculatorModel obj = new CalculatorModel();
        obj.sum ( 30,90);
        obj.sum(45, 80, 34);
    }
}
