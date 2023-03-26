package chap_05;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index);
        for (int i = 0; i < data.length()-index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "나코딩";//이름
        String manNum = "990130-1234567";//주민등록번호
        String phoneNum = "010-1234-5678";//전화번호

        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(manNum, 8));
        System.out.println("전화번호: " + getHiddenData(phoneNum, 9));
    }
}
