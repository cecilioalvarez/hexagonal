package es.logixs.webbasica.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Type(type="uuid-char")
    @Column(name = "objectId")
    private UUID objectId;
    private String name;
    @Column(name = "lastName")
    private String lastName;
    private String email;
    private String state;
    private String avatar;
    private String password;
    @Column(name = "prevPasswords")
    private String prevPasswords; // TODO Solucionar si es array o string
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="companyId")
    @JsonIgnore
    private Company company;


    @Column(name = "invitedBy")
    private String invitedBy;
    private String role;

    @Column(name = "limitAmount")
    private Double limitAmount;
    private String address;
    private String phone;
    private String city;

    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "countryIso")
    private String countryIso;
    @Column(name = "createdAt")
    private Date createdAt; // TODO Solucionar para insertar fecha
    @Column(name = "updatedAt")
    private Date updatedAt; // TODO Solucionar para insertar fecha


    public User(UUID objectId) {
        this.objectId = objectId;
    }

    public User() {
    }

    public User(
            UUID objectId,
            String name,
            String lastName,
            String email,
            String state,
            String avatar,
            String password,
            String prevPasswords,
            Company company,
            String invitedBy,
            String role,
            Double limitAmount,
            String address,
            String phone,
            String city,
            String zipCode,
            String countryIso,
            Date createdAt,
            Date updatedAt
    ) {
        this.objectId = objectId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.state = state;
        this.avatar = avatar;
        this.password = password;
        this.prevPasswords = prevPasswords;
        this.company = company;
        this.invitedBy = invitedBy;
        this.role = role;
        this.limitAmount = limitAmount;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.zipCode = zipCode;
        this.countryIso = countryIso;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrevPasswords() {
        return prevPasswords;
    }

    public void setPrevPasswords(String prevPasswords) {
        this.prevPasswords = prevPasswords;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(objectId, user.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId);
    }

    @Override
    public String toString() {
        return "User{" +
                "objectId=" + objectId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +

                '}';
    }
}

