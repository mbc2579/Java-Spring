package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
    private String account;
    private String email;
    private String address;
    private String password;

    // 변수 선언을 카멜케이스로 선언을 하고 데이터를 Json형태로 전송할 때 스네이크 케이스로 작성을 해서 보내면
    // 데이터는 불러와지지만 null 값으로 출력이 된다. 이럴때는 카멜 케이스를 스네이크 케이스로 변경해주면 된다.
    @JsonProperty("phone_number") // 카멜 케이스의 phoneNumber를 스네이크 케이스인 phone_number의 이름을 가진다는 뜻으로 변경이 된다.
    private String phoneNumber; // phone_number

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
