package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        //객체 지향 프로그래밍
        //유지보수 용이
        //높은 재사용성

        //ex. 차량용 블랙박스
        //모델명, 해상도, 가격, 색상

        //첫 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "black";

        //새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "white";

        //제품만들어질때마다 변수추가하면 비효율적임. 이럴때 클래스를 쓴다.
        BlackBox bbox = new BlackBox();
        //BlackBox 클래스로부터 bbox 객체 생성
        //bbox 객체는 BlackBox의 인스턴스
        BlackBox bbox2 = new BlackBox();
    }
}
