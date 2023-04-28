package com.example.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

// 데이터를 내려줄 때 null 값을 제외하고 데이터가 들어있는 데이터만 출력해주는 코드 출력하면 null값은 출력되지 않는다.
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String name;
    private Integer age;
    @JsonProperty("phon_number")
    private String phonNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phonNumber='" + phonNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
