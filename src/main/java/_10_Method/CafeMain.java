package _10_Method;

class CoffeeOrder {
    // 필드: 커피 상태 데이터를 저장하는 공간
    String menuName;
    int price;
    boolean isIced;

    // 생성자: 커피 정보를 받아서 "내 거(this)"에 채워주는 역할
    public CoffeeOrder(String menuName, int price, boolean isIced) {
        // 주석에서 말씀하신 것처럼 "내 변수야!"라고 확실히 점 찍어주기
        this.menuName = menuName;
        this.price = price;
        this.isIced = isIced;
    }

    // 메서드: 영수증을 예쁘게 출력하는 기능
    public void printReceipt() {
        String temp = isIced ? "아이스" : "따뜻한";
        System.out.println("------ 주문 영수증 --------");
        System.out.println("메뉴: " + temp + " " + this.menuName);
        System.out.println("가격: " + this.price + "원");
        System.out.println("-----------------------");
    }
}

// 실행 클래스: 실제 주문이 들어가는 곳
public class CafeMain {
    public static void main(String[] args) {
        // 객체 생성 (c1, c2라는 주문서 만들기)
        CoffeeOrder c1 = new CoffeeOrder("아메리카노", 4500, true);
        CoffeeOrder c2 = new CoffeeOrder("청포도에이드", 6000, false);

        // 결과 출력 (메서드 호출)
        c1.printReceipt();
        c2.printReceipt();
    }
}