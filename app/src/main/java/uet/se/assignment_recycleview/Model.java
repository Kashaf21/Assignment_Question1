package uet.se.assignment_recycleview;

public class Model {
    int image;
    String cname;
    String Phone;

    public Model(int image, String phone, String cname) {
        this.image = image;
        this.cname = cname;
        this.Phone = phone;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}

