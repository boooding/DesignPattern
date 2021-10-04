package design.pattern.factory.abstrctf.ex1;

public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourse = new JavaCourseFactory();
        Video video = javaCourse.getVideo();
        Article article = javaCourse.getArticle();
        video.produce();
        article.produce();
    }
}
