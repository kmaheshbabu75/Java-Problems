package basics;

public class NoOfOddNums {
    static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = 8;
        int d = 15;
        int e = 20;
        int count = 0;

        if(a % 2 != 0){
            count++;
        }
        if(b % 2 != 0){
            count++;
        }
        if(c % 2 != 0){
            count++;
        }
        if(d % 2 != 0){
            count++;
        }
        if(e % 2 != 0){
            count++;
        }
        System.out.println(count);
    }
}
