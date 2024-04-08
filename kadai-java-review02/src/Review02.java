
public class Review02 {

    public static void main(String[] args) {
        //iが1〜100まで繰り返す
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 ==0) {
                //3,5両方で割り切れる場合
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
               //3で割り切れる場合
                System.out.println("Fizz");
            }else if(i % 5 == 0) {
               //5で割り切れる場合
                System.out.println("Buzz");
            }else {
                //3でも5でも割り切れない時
                System.out.println(i);
            }
        }
    }
}
