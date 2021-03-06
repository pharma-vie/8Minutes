package com.eightmins.eightminutes.advocate.refer;

import com.eightmins.eightminutes.login.User;
import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by nabhilax on 14/01/16.
 */
@ParseClassName("Referral")
public class Referral extends ParseObject {

  public int getImage() {
    return getInt("image");
  }

  public void setImage(int image) {
    put("image", image);
  }

  public String getName() {
    return getString("name");
  }

  public void setName(String name) {
    put("name", name);
  }

  public String getEmail() {
    return getString("email");
  }

  public void setEmail(String email) {
    put("email", email);
  }

  public String getPhone() {
    return getString("phone");
  }

  public void setPhone(String phone) {
    put("phone", phone);
  }

  public String getAddress1() {
    return getString("address1");
  }

  public void setAddress1(String address1) {
    put("address1", address1);
  }

  public String getAddress2() {
    return getString("address2");
  }

  public void setAddress2(String address2) {
    put("address2", address2);
  }

  public String getLocality() {
    return getString("locality");
  }

  public void setLocality(String locality) {
    put("locality", locality);
  }

  public String getCity() {
    return getString("city");
  }

  public void setCity(String city) {
    put("city", city);
  }

  public String getPincode() {
    return getString("pincode");
  }

  public void setPincode(String pincode) {
    put("pincode", pincode);
  }

  public String getAverageBill() {
    return getString("averageBill");
  }

  public void setAverageBill(String averageBill) {
    put("averageBill", averageBill);
  }

  public String getNotes() {
    return getString("notes");
  }

  public void setNotes(String notes) {
    put("notes", notes);
  }

  public User getLead() {
    return (User)get("lead");
  }

  public void setLead(User name) {
    put("name", name);
  }

  public String getStatus() {
    return getString("status");
  }

  public void setStatus(String status) {
    put("status", status);
  }


  public void setOrganization(String organization) {
    put("organization", organization);
  }

  public String getOrganization() {
    return getString("organization");
  }
}
