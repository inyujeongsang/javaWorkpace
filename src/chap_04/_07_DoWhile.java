package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 While
        //정해진 숫자 제한이 없을 때, 조건으로 제한을 둘때
        //수영장에서 수영하는 모습
        int distance = 25; //전체 거리 25m
        int move = 0; //현재 이동거리 0m
        int height = 2;//키 2m
        while(move +height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+move);
            move ++;//1미터 이동
        }
        System.out.println("도착하였습니다.");
        System.out.println("반복문#1");
        //키가 엄청나게 큰 사람이 수영한다면?
        move = 0;
        height = 25; //키가 25m

        while(move +height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+move);
            move ++;//1미터 이동
        }
        System.out.println("도착하였습니다.");
        System.out.println("반복문#2");

        //Do While 반복문 일단 무조건 do문을 실행.
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+move);
            move ++;//1미터 이동
        } while (move +height < distance);
        System.out.println("도착하였습니다.");
        System.out.println("반복문#3");
    }
}
