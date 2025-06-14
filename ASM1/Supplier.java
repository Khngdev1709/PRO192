
public class Supplier {

    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
        setId(0);
        setName("");
        setAddress("");
        setPhone("");
    }

    public Supplier(int id, String name, String address, String phone) {
        setId(id);
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
            this.status = true;
        } else {
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String regex = "0\\d{8,9}$";            //regex : use to find, search  or replace string into a type. 
                                                //begin with the number 0, then the length of that number is 9 - 10 index.
                                                //^0 : begin with the 0.
                                                //\d{...} : following that is 8 - 9 random numbers.
                                                //$ : end the string.
        if (phone.matches(regex)) {             // matches (regex) : compare the input from the user with the regex.
            this.phone = phone;
        } else {
            this.phone = "000.000.0000";
        }
    }

    public boolean isStatus() {
        return status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "," + getName() + "," + getAddress() + "," + phone + "," + (status ? "Available" : "Unavailable");
    }

    public String toTitleCase(String value) {
        String[] arr = value.split(" ");
        String result = "";
        for (String word : arr) {
            if (word.trim().length() > 0) {
                String newWord = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += newWord + " ";
            }
        }
        return result.trim();                     //trim() : dung de xoa khoang trang o hai dau noi dung
    }

}
