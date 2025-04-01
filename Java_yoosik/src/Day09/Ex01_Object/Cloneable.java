package Day09.Ex01_Object;

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() 재정의
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // equals() 재정의
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    // hashCode() 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // clone() 재정의 (예외 처리 필요)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("Aloha", 25);
            Person p2 = new Person("Aloha", 25);
            Person p3 = (Person) p1.clone(); // 복제

            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);
            System.out.println("p1 == p2: " + (p1 == p2)); // false (다른 객체)
            System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (동일한 값 비교)
            System.out.println("p1.hashCode(): " + p1.hashCode());
            System.out.println("p2.hashCode(): " + p2.hashCode());
            System.out.println("p3 (clone): " + p3);
            System.out.println("p1 == p3: " + (p1 == p3)); // false (다른 객체)
            System.out.println("p1.equals(p3): " + p1.equals(p3)); // true (동일한 값 비교)

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

