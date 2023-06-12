package es.logixs.webbasica.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Type(type = "uuid-char")
    @Column(name = "objectId")
    private UUID objectId;
    private String code;
    private String state;
    @Column(name = "licenseId")
    private String licenseId;
    @Column(name = "limitUsers")
    private int limitUsers;
    private String name;
    private String address;
    private String phone;
    @Column(name = "countryIso")
    private String countryIso;
    @Column(name = "taxId")
    private String taxId;
    private String url;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "updatedAt")
    private Date updatedAt;

    @JsonIgnore
    @OneToMany(mappedBy="company" )
    private List<User> users = new ArrayList<User>();


    public Company(UUID objectId) {
        this.objectId = objectId;
    }

    public Company() {
    }

    public Company(UUID objectId, String code, String state, String licenseId, int limitUsers, String name,
                   String address, String phone, String countryIso, String taxId, String url, Date createdAt, Date updatedAt) {
        this.objectId = objectId;
        this.code = code;
        this.state = state;
        this.licenseId = licenseId;
        this.limitUsers = limitUsers;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.countryIso = countryIso;
        this.taxId = taxId;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public int getLimitUsers() {
        return limitUsers;
    }

    public void setLimitUsers(int limitUsers) {
        this.limitUsers = limitUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(objectId, company.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId);
    }
}
