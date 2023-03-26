package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //짝수만 출력
        for (int i = 0; i < 11; i += 2) {
            System.out.println("반복문 짝수만 출력"+i);
        }

        //홀수만 출력
        for (int i = 1; i < 12; i+=2) {
            System.out.println("반복문 홀수만 출력"+i);
        }

        //1~10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
