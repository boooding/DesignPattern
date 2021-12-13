package pattern.creational.builder.ex1;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("designPattern", "designPattern PPt", "dp video");
        System.out.println(course);
    }
}
