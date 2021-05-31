public class Course {
    private String name;
    private Lecturer lecturer;

    public void print () throws Exception {
        System.out.println("Course Name: " + this.name);
        this.lecturer.print();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
