package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //정해진 숫자 제한이 없을 때, 조건으로 제한을 둘때
        //수영장에서 수영하는 모습
        int distance = 25; //전체 거리 25m
        int move = 0; //현재 이동거리 0m
        while(move < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+move);
            move ++;//1미터 이동
        }
        System.out.println("도착하였습니다.");
    }
}
