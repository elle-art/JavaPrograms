package edu.ilstu;

public class Customer {
    private String first,last,address,city,state,zip, email, phone;

    public Customer(String first, String last, String address, String city, String state, String zip, String email, String phone) {
    super();
    this.first = first;
    this.last = last;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.email = email;
    this.phone = phone;
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
    
    public String getCity() {
    return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZip() {
        return zip;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
    return "\nName: " + first + " " + last + "\nAddress: " + address + "\nCity/State/Zip: " + city + ", " + state + " " + zip + "\nEmail: " + email + "\tPhone: " + phone;
    }
          
}
