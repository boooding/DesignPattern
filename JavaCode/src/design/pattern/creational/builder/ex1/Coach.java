package design.pattern.creational.builder.ex1;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse( String courseName, String coursePPt, String courseVideo) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPt);
        this.courseBuilder.buildCourseVideo(courseVideo);
        return  this.courseBuilder.makeCourse();
    }

}
