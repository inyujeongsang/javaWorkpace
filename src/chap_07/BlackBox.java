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
    static boolean canAutoReport = true;
}
