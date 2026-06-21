package basics;

public class NoOfEvenNumbers {
    static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = 8;
        int d = 15;
        int e = 20;
        int count = 0;

        if(a % 2 == 0){
            count++;
        }
        if(b % 2 == 0){
            count++;
        }
        if(c % 2 == 0){
            count++;
        }
        if(d % 2 == 0){
            count++;
        }
        if(e % 2 == 0){
            count++;
        }
        System.out.println(count);
    }
}
//int count = 0;
//
//count += (a % 2 == 0) ? 1 : 0;
//count += (b % 2 == 0) ? 1 : 0;
//count += (c % 2 == 0) ? 1 : 0;
//count += (d % 2 == 0) ? 1 : 0;
//count += (e % 2 == 0) ? 1 : 0;

//public static void main(String[] args) {
//    int[] nums = {12, 7, 8, 15, 20};
//    int count = 0;
//
//    for (int num : nums) {
//        if (num % 2 == 0) {
//            count++;
//        }
//    }
//
//    System.out.println(count);
//}
