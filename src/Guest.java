public class Guest {
    String name;
    String id;
    int status;
    int nights;
    double bed;
    String city;

    public Guest(String name, String id, int status, int nights,double bed, String city) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.nights = nights;
        this.bed = bed;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getBed() {
        return bed;
    }

    public void setBed(double bed) {
        this.bed = bed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status +
                ", nights=" + nights +
                ", bed=" + bed +
                ", city='" + city + '\'' +
                '}';
    }
}
