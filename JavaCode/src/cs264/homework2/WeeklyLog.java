package cs264.homework2;

import java.util.Date;

public class WeeklyLog extends Log{
    private String name;
    private Date date;
    private Object content;
    @Override
    public WeeklyLog clone() throws CloneNotSupportedException {
        return (WeeklyLog)super.clone();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
}
