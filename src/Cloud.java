public class Cloud {
    private String location;
    private String temorature;
    private String time;
    private String date;

    public Cloud(String location, String temorature, String time, String date) {
        this.location = location;
        this.temorature = temorature;
        this.time = time;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemorature() {
        return temorature;
    }

    public void setTemorature(String temorature) {
        this.temorature = temorature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
