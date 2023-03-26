package chap_05;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        //배열: 같은 자료형의 값 여러개를 저장하는 연속된 공간.
        //이런 값들이 몇개만 상관없는데 100개 1000개가 되면 문제가 된다.
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요.");

        //배열 선언 첫 번째 방법
        //String[] coffees = new String[4];

        //배열 선언 두 번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //배열 선언 세 번째 방법
        //String[] coffees = new String[]{"아메리카노","카페모카","라떼","카푸치노"};

        //배열 선언 네 번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        String[] coffees2  = {"아메리카노","카페모카","라떼","카푸치노"};
        System.out.println(coffees == coffees2);
        System.out.println(Arrays.equals(coffees,coffees2)); //배열 같은지 확인하는 방법.

        //배열 요소 바꾸기
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + "로 바꿔주세요.");
    }
}
