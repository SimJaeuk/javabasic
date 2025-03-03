public class TvTest4 {
    public static void main(String args[]) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열

        // Tv객체를 생성해서 각 요소에 저장
        for(int i=0; i < tvArr.length;i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10; // tvArr[i]의 채널에 i+10을 저장
        }
        
        for(int i=0; i < tvArr.length;i++) {
            tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출, 채널 1증가
            System.out.printf("tvArr[%d].channel=%d%n",i, tvArr[i].channel);
        }
    }
    
}

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;
    
    // Tv의 기능 (메서드)
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { -- channel; }
}