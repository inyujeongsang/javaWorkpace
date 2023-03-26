package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < 3; i++) {
            System.out.println(coffees[i]+"하나");
        }
        System.out.println("주세요.");

        //for-each반복문 (배열 모든요소를 순회할때)
        for(String coffee: coffees){
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");
    }
}
