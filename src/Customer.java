/**
 *
 * @author SanCin
 */
public class Customer {
    
    //variable
    private String name;
    private String phoneNo;
    private String gender;
    private String age;
    private String custId;

    //default constructor
    public Customer() {
        name = "";
        phoneNo = "";
        custId = "";
        age = "";
        gender = "";
    }

    //normal constructor
    public Customer(String name, String phoneno, String custId, String age, String gender) {
        this.name = name;
        this.phoneNo = phoneno;
        this.custId = custId;
        this.age = age;
        this.gender = gender;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

}
