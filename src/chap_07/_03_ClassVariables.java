package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("-개발 후-");
        //객체로 클래스 변수에 접근할수도 있지만,
        System.out.println(b1.modelName + "자동신고기능: " + b1.canAutoReport);
        System.out.println(b1.modelName + "자동신고기능: " + b2.canAutoReport);
        //클래스로 클래스 변수에 접근하는게 권장된다.
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox.canAutoReport);

        //활용법: 어떤 클래스에 공통적으로 적용해야하는 상황이 있다면 인스턴스변수가 아니라
        //       클래스 변수로 만드는 것이 좋다.
    }
}
