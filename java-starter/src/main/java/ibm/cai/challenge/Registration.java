package ibm.cai.challenge;

public class Registration {

    private String first;
    private String last;
    private String address;
    private String id;
    private String fiid;

    public Registration() {

    }
    public Registration(String first, String last, String address, String id) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public void setFirst(String f) {
        this.first = f;
    }

    public void setLast(String l) {
        this.last = l;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public void setId(String i) {
        this.id = i;
    }

    public String getFiid() {
        return fiid;
    }

    public void setFiid(String f) {
        this.fiid = f;
    }
}