public class Homework1Task2 {
    public static void main(String[] args) {
        // 2) Вывести все простые числа от 1 до 1000

        for (int num = 2; num <= 1000; num++) {
            boolean primeNumb = true;
            for (int i = 2;i<=1000;i++){
                if (num%i==0){
                    primeNumb=false;
                    break;

                }
            }
            if (primeNumb) {
                System.out.println(num);
            }
        }
    }
}
