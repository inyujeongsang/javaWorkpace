package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        //문자열 변환
        System.out.println(s.replace(" and",","));
        //문장 자르기
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //시작위치는 문장에 포함, 끝위치는 문장에 포함하지 않는다.

        //공백 제거
        s = "                I like Java and Python and C.         ";
        System.out.println(s);
        System.out.println(s.trim());//불필요한 공백제거

    }
}
