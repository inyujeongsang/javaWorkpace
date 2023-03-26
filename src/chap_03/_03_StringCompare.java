package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열 같으면  true, 다르면 false
        System.out.println(s1.equals("Java"));
        //대소문자 구분없이 비교
        System.out.println(s1.equalsIgnoreCase("java"));

        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234"; //s1과 s2은 똑같은 곳을 참조함.
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        s1 = new String("1234");
        s2 = new String("1234"); //s1과 s2는 참조하는 메모리 공간이 다름.
        System.out.println("=======");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //참조하는 곳이 다르면 false나옴.
    }
}
