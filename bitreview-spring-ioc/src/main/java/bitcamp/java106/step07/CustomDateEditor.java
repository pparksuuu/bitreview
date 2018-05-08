package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

public class CustomDateEditor extends PropertyEditorSupport {
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomDateEditor.setAsText()");
        // 파라미터로 넘어온 String 타입의 프로퍼티 값을
        // 원하는 타입(java.sql.Date)의 값으로 바꿔 내부에 저장한다.
        // => 그러면 스프링 IoC 컨테이너에서 이 값을 꺼내 객체에 주입할 것이다.
        this.setValue(Date.valueOf(text));
    }
    
    @Override
    public void setValue(Object value) {
        // 이 메서드는 호출되었을 때 그것을 표시하기 위해 오버라이딩 했다.
        System.out.println("CustomDateEditor.setValue()");
        super.setValue(value); // 원래 하던 일을 수행한다.
    }
    
    @Override
    public Object getValue() {
        // 이 메서드는 호출되었을 때 그것을 표시하기 위해 오버라이딩 했다.
        System.out.println("CustomDateEditor.getValue()");
        return super.getValue(); // 원래 하던 일을 수행한다.
    }

}
