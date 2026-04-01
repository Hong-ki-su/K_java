package _08_Array;

public class Ex08_03 {
    public static void main(String[] args) {
        // 2층짜리 빌라에 층마다 방이 3개씩 있는 구조
        int[][] apartment = {
                {101, 102, 103}, // 0층 (1층)
                {201, 202, 203}  // 1층 (2층)
        };

        // 2층의 두 번째 방(202호)을 가리킬 때
        System.out.println(apartment[0][0]);

//        // 1~45번까지 담긴 배열에서 랜덤으로 번호 뽑기 맛보기
//        int[] lotto = new int[6];
//        // ... (랜덤 로직 생략) ...
//        System.out.println("이번 주 추천 번호는: " + lotto[1] + ", " + lotto[4] + "...");
    }
}
