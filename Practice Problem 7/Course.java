public class Course {
    long id;
    String syllabus;
    String title;
    int credits;
    String prerequisite;

    public Course(long id, String syllabus, String title, int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", syllabus='" + syllabus + '\'' +
                ", title='" + title + '\'' +
                ", credits=" + credits +
                ", prerequisite='" + prerequisite + '\'' +
                '}';
    }
}
