package ua.lviv.iot.model;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "meteostation_manufacturer")
public class MeteostationManufacturer {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "email", length = 45)
    private String email;
    @Column(name = "address_id")
    private Integer addressId;

    public MeteostationManufacturer() {
    }

    public MeteostationManufacturer(String name, String phone, String email, Integer addressId) {
        this(-1, name, phone, email, addressId);
    }

    public MeteostationManufacturer(Integer id, String name, String phone, String email, Integer address_id) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.addressId = address_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "MeteostationManufacturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address_id=" + addressId +
                '}';
    }
}
