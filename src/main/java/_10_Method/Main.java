package _10_Method;

// 클래스 구성요소: 필드, 생성자, 메서드
// 클래스는 객체를 만들기 위한 '설계도'입니다.
class GameCharacter {
    // 1. 필드 (Field): 캐릭터의 상태 데이터를 저장하는 변수
    String name;
    int level;
    String job;

    // 2. 생성자 (Constructor): 객체가 생성될 때 호출되며, 필드를 초기화(데이터를 채움)합니다.
    public GameCharacter(String name, int level, String job) {
        // this는 '현재 객체 자신'을 가리킵니다.
        // 매개변수(name)와 필드(this.name)의 이름이 같을 때,
        // "이 name은 내(클래스) 필드야!"라고 확실하게 구분해 주는 역할을 합니다.
        this.name = name;
        this.level = level;
        this.job = job;
    }

    // 3. 메서드 (Method): 객체의 동작이나 기능을 정의합니다.
    // 여기서는 저장된 데이터를 양식에 맞춰 출력하는 역할을 합니다.
    public void printInfo() {
        System.out.println("------ 캐릭터 정보 --------");
        System.out.println("이름: " + this.name);
        System.out.println("레벨: " + this.level);
        System.out.println("직업: " + this.job);
        System.out.println("-------------------");
    }
}

// 실행 클래스: 실제 프로그램이 시작되는 곳
public class Main {
    public static void main(String[] args) {
        // GameCharacter 설계도를 바탕으로 'warrior'라는 실체(객체)를 만듭니다.
        GameCharacter warrior = new GameCharacter("호날두", 10, "공격수");

        // 생성된 객체의 메서드를 호출하여 정보를 출력합니다.
        warrior.printInfo();
    }
}
// 김희성 s23 삼성 name, model, group