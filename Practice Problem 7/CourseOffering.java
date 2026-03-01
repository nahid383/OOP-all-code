import java.util.Date;
public class CourseOffering{
    long studentId;
    long instructorId;
    long courseId;
    Date time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    public CourseOffering(long studentId, long instructorId, long courseId,
                          Date time, int sectionNo, int roomId, int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "studentId=" + studentId +
                ", instructorId=" + instructorId +
                ", courseId=" + courseId +
                ", time=" + time +
                ", sectionNo=" + sectionNo +
                ", roomId=" + roomId +
                ", year=" + year +
                ", semester='" + semester + '\'' +
                '}';
    }
}

