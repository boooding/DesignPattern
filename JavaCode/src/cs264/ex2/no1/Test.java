package cs264.ex2.no1;

/*
1.	Use the prototype to realize the rapid creation of weekly work reports.
Weeklylog acts as a concrete prototype class, Prototype acts as an abstract prototype class, and the clone () method is the prototype method.
The private members of Weeklylog are:
String name;
String date;
String content;

output:
****weekly****
Week number: Week 12
Name: Zhang Wuji
Content: I am very busy at work this week, working overtime every day!
--------------------------------
****weekly****
Week number: Week 13
Name: Zhang Wuji
Content: I am very busy at work this week, working overtime every day!

 */
class Test {
    public static void main(String args[])
    {
        WeeklyLog log_previous = new WeeklyLog(); //Create prototype object
        log_previous.setName("Zhang Wuji");
        log_previous.setDate("Week 12");
        log_previous.setContent("I am very busy at work this week, work overtime every day!");

        System.out.println("****Weekly Report****");
        System.out.println("week:" + log_previous.getDate());
        System.out.println("Name:" + log_previous.getName());
        System.out.println("Content:" + log_previous.getContent());
        System.out.println("--------------------------------");
        WeeklyLog log_new;
        log_new = log_previous.clone(); //Call the clone method to create a clone object
        log_new.setDate("Week 13");
        System.out.println("****Weekly Report****");
        System.out.println("week:" + log_new.getDate());
        System.out.println("Name:" + log_new.getName());
        System.out.println("Content:" + log_new.getContent());
    }

}

class WeeklyLog extends Prototype{
    private String name;
    private String date;
    private String content;

    public WeeklyLog() {}
    public WeeklyLog(String name, String date, String content) {
        this.name = name;
        this.date = date;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public WeeklyLog clone() {
        return ( WeeklyLog)super.clone();
    }
}


