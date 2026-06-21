package basics;

public class SumOfLastTwoNum {
    static void main(String[] args) {
        int a = 123;
        int b = 456;
        int SumOfLastTwoNum = (a % 10) + (b % 10);
        System.out.println(SumOfLastTwoNum);
    }
}
