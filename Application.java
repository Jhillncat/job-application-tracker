public class Application {
    private String company;
    private String position;
    private String status;

    public Application(String company, String position, String status) {
        this.company = company;
        this.position = position;
        this.status = status;

    }
    public String getCompany() {
        return company;
    }
    public String getPosition() {
        return position;
    }
    public String getStatus() {
        return status;
    }
    @Override
    public String toString(){
        return company + " | " + position + " | " + status;
    }

}
