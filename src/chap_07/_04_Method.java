package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport();// 지원 됨

        b1.insertMemoryCard(256);

        int fileCount = b1.getvideoFileCount(1);
        System.out.println("일반영상은 " + fileCount +"개 입니다.");

        fileCount = b1.getvideoFileCount(2);
        System.out.println("이벤트영상은 "+fileCount+"개 입니다.");
    }
}
