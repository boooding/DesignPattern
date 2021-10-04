package design.pattern.creational.builder.ex1;

public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);

    public abstract Course makeCourse();
}
