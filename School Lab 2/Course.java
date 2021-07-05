public class Course {

    private String number;
    private String title;
    private int unit;


    public Course(String number, String title, int unit) {
        this.number = number;
        this.title = title;
        this.unit = unit;


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
