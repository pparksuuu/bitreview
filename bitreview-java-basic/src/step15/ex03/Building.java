// 디자인 패턴과 추상 클래스 - 템플릿 메서드 패턴
package step15.ex03;


// 슈퍼 클래스에서 추상적으로 표현하고, 서브 클래스에서 그 구체적인 내용을 결정하는 설계 방식
// 즉 수퍼 클래스에서 전체적인 논리 흐름을 정의하고,
// 서브 클래스에서 각 흐름에 따라 구체적인 동작을 정의
public abstract class Building {

    public void build() {
        System.out.println("건축하겠습니다");
        startEffect();
        System.out.println("건축이 완료되었습니다.");
        endEffect();
    }
    
    public abstract void startEffect();
    public abstract void endEffect();
}
