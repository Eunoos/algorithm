import java.util.*;



public class bj10825 {
    static class Students{
        String name;
        int korean;
        int english;
        int math;

        public Students(String name, int k, int e, int m) {
            this.name = name;
            this.korean = k;
            this.english = e;
            this.math = m;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Students> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] strings = sc.nextLine().split(" ");
            String name = strings[0];
            int k = Integer.parseInt(strings[1]);
            int e = Integer.parseInt(strings[2]);
            int m = Integer.parseInt(strings[3]);
            students.add(new Students(name, k, e, m));
        }
        Collections.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.korean == o2.korean) {
                    if (o1.english == o2.english) {
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        } else {
                            return o2.math - o1.math;
                        }
                    } else {
                        return o1.english - o2.english;
                    }
                } else {
                    return o2.korean - o1.korean;
                }
            }
        });

        for (Students s : students) {
            System.out.println(s.name);
        }
    }
}
