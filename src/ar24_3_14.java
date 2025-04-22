import java.util.*;

//객체끼리 비교를 할 때
// comparator, comepareTo
// 정렬은 비교해야할 대상이 2개 이상이어야한다. 즉 두 개를 비교해서 그 대소관계를 리턴
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o){
//        if(this.age>o.age) return 1;
//        else if(this.age == o.age) return 0;
//        else return -1
        return this.age - o.age;
    }
}
public class ar24_3_14 {
    public static void main(String[] args){
        Student a= new Student(20, "홍길동");
        Student b= new Student(17, "뽀로로");
        Student c= new Student(18, "김철수");
        Student d= new Student(39, "박태양");

        ArrayList<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        Collections.sort(students);

        for (Student s: students) {
            System.out.println(s.name+","+s.age);
        }
    }
}
