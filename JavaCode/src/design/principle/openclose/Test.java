package design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(001, "beginOfJava", 100d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println("id:" + javaCourse.getId() + " name:" + javaCourse.getName() + " originalPrice:" + javaCourse.getOriginalPrice() + " price:" + javaCourse.getPrice());
    }

}
