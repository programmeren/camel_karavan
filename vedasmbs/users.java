
package com.vedas.mbs;
import java.util.List;

public class Users {
    private String lastName;
    private String image;
    private String role;
    private String gender;
    private String maidenName;
    private Double weight;
    private String birthDate;
    private String firstName;
    private String bloodGroup;
    private String password;
    private Hair hair;
    private String eyeColor;
    private String phone;
    private Long id;
    private Long age;
    private String email;
    private String username;
    private Double height;

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getImage() { return image; }
    public void setImage(String value) { this.image = value; }

    public String getRole() { return role; }
    public void setRole(String value) { this.role = value; }

    public String getGender() { return gender; }
    public void setGender(String value) { this.gender = value; }

    public String getMaidenName() { return maidenName; }
    public void setMaidenName(String value) { this.maidenName = value; }

    public Double getWeight() { return weight; }
    public void setWeight(double value) { this.weight = value; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String value) { this.birthDate = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String value) { this.bloodGroup = value; }

    public String getPassword() { return password; }
    public void setPassword(String value) { this.password = value; }

    public Hair getHair() { return hair; }
    public void setHair(Hair value) { this.hair = value; }

    public String getEyeColor() { return eyeColor; }
    public void setEyeColor(String value) { this.eyeColor = value; }

    public String getPhone() { return phone; }
    public void setPhone(String value) { this.phone = value; }

    public Long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public Long getAge() { return age; }
    public void setAge(long value) { this.age = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getUsername() { return username; }
    public void setUsername(String value) { this.username = value; }

    public Double getHeight() { return height; }
    public void setHeight(double value) { this.height = value; }
}


class Hair {
    private String color;
    private String type;

    public String getColor() { return color; }
    public void setColor(String value) { this.color = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
