package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "변인정";

        int hour = 15;

        System.out.println(name + "님, 배송이 완료되었습니다.");
        System.out.println(name + "님, 배송이 완료되었습니다." + "배송시간: " + hour +"시");

        double score = 90.6;
        char grade = 'A';
        System.out.println(name +"학생의 점수는"+ score +"점 입니다." +"따라서 학점은 "+grade +"입니다.");
        System.out.println(name +"은 깃 테스트 중 입니다.");
    }
}
