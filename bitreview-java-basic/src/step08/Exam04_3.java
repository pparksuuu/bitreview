// 생성자 - 여러 개의 생성자 정의하기
package step08;

public class Exam04_3 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        // 생성자가 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다
        Score() {
            System.out.println("Score() 생성자 호출");
        }
        
        Score(String name) {
            System.out.println("name만 있는 생성자 호출");
            this.name = name;
        }
        
        Score(String name, int kor, int eng, int math) {
            System.out.println("Score(String, int, int, int) 생성자 호출");
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.compute();
        }
        
        public void compute() {
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum / 3f;
        }
    }
    
    public static void main(String[] args) {
        Score s1 = new Score();
        Score s2 = new Score("박수현");
        Score s3 = new Score("임꺽정", 80, 88, 87);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.average);
        }
}
