package _08_Array;

public class Ex08_02 {
    public static void main(String[] args) {
        // 배열이 없다면? (끔찍함)
        int score1 = 80;
        int score2 = 90;
        int score3 = 70;
        System.out.println(score1 + score2 + score3);

        // 배열과 반복문의 만남 (우아함)
        int[] scores = {80, 90, 70, 85, 95}; // 5명을 한 번에!
        int sum = 0;

        for (int i = 0; i < scores.length; i++) { // 키워드 Length도 쓰임
            sum += scores[i]; // 기계가 알아서 0번부터 4번까지 더함
        }
        System.out.println("평균: " + (sum / scores.length));
    }
}
