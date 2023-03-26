package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환
        //정수형에서 실수형으로, 실수형에서 정수형으로
        int score = 93;
        System.out.println((float) score + 98.8);

        score = 93 + (int)98.8;
        System.out.println(score);

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(50)+Integer.toString(05);
        System.out.println(s1);
        //문자를 숫자로
        String s2 = "5";
        s2 = String.valueOf(5);

    }
}
