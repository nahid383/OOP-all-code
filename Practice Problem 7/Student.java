public class Student {
    long id;
    String name;
    String program;

    public Student(long id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public long getId() {
        return id;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
