package chap_07;

public class BlackBox {
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상

    //클래스 변수
    //클래스 변수는 클래스의 모든 인스턴스에서 공유되기 때문에
    // 한 인스턴스에서 값을 변경하면 다른 인스턴스에서도 그 값을 공유한다.
    //기능 개발
    static boolean canAutoReport = false; //자동 신고 기능

    //반환값 없는 메소드, 반환값(return)이 있는 메소드 만들어봄.
    void autoReport() { //반환값이 없을 때, void를 씀.
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 "+capacity+"GB 입니다.");
    }

    int getvideoFileCount( int type ) {
        if(type == 1) {
            return 9;
        } else if(type == 2) {
            return 1;
        } return 10;
    }
}
