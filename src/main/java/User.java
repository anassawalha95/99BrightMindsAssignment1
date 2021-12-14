import java.util.ArrayList;
import java.util.LinkedList;

public
class User {

    private int id;
    private String name;
    private int mobile;
    private String email;
    private int customerReferenceNumber;
    private ArrayList<User> Users = new ArrayList<User>();

    public
    int getId() {
        return id;
    }
    public
    User(){}

    public
    User(int id, String name, int mobile, String email, int customerReferenceNumber) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.customerReferenceNumber = customerReferenceNumber;

    }

    public void
    createUser(int id, String name, int mobile, String email, int customerReferenceNumber) {

        User user = new User(id, name, mobile, email, customerReferenceNumber);
        Users.add(user);

    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    ArrayList<User> getUsers() {
        return Users;
    }

    public
    void appendAllUsers(User user) {
        Users.add(user);
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    int getMobile() {
        return mobile;
    }

    public
    void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public
    String getEmail() {
        return email;
    }

    public
    void setEmail(String email) {
        this.email = email;
    }

    public
    int getCustomerReferenceNumber() {
        return customerReferenceNumber;
    }

    public
    void getCustomerReferenceNumber(short customerReference) {
        this.customerReferenceNumber = customerReference;
    }


}
