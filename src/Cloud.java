public class Cloud {
    private String location;
    private String temprature;
    private String time;
    private String date;

    public Cloud(String location, String temprature, String time, String date) {
        this.location = location;
        this.temprature = temprature;
        this.time = time;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
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
