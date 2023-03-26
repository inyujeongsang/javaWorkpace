package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요.");
        //\t: tab
        System.out.println("자바가\t너무\t재밌어요.");
        // \\: \역슬래시
        System.out.println("C:\\Program Files\\Java");
        // \": " 큰따옴표 (작은따옴표도 마찬가지 방식)
        System.out.println("유상이는 \"절\"이라고 했어요.");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
