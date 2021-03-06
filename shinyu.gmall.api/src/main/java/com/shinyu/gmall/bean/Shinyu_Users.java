package com.shinyu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table(name = "Shinyu_Users")
public class Shinyu_Users {
 // 主鍵
 @Id
// // 主鍵返回策略
// @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int Id;
 @Column(name = "LoginName")
 private String LoginName;
 @Column(name = "LoginPwd")
 private String LoginPwd;
 @Column(name = "LoginSecret")
 private String LoginSecret;
 @Column(name = "UserType")
 private int UserType;
 private int Gender;
 @Column(name = "NickName")
 private String NickName;
 @Column(name = "UserPhoto")
 private String UserPhoto;
 @Column(name = "UserQQ")
 private String UserQQ;
 private String Phone;
 private String Email;
 @Column(name = "LastIP")
 private String LastIP;
 @Column(name = "LastTime")
 private Timestamp LastTime;
 @Column(name = "UserFrom")
 private int UserFrom;
 private int Status;
 @Column(name = "DataFlag")
 private int DataFlag;
 @Column(name = "CreateTime")
 private Timestamp CreateTime;

 @Override
 public String toString() {
  return "Shinyu_Users{" +
          "Id=" + Id +
          ", LoginName='" + LoginName + '\'' +
          ", LoginPwd='" + LoginPwd + '\'' +
          ", LoginSecret='" + LoginSecret + '\'' +
          ", UserType=" + UserType +
          ", Gender=" + Gender +
          ", NickName='" + NickName + '\'' +
          ", UserPhoto='" + UserPhoto + '\'' +
          ", UserQQ='" + UserQQ + '\'' +
          ", Phone='" + Phone + '\'' +
          ", Email='" + Email + '\'' +
          ", LastIP='" + LastIP + '\'' +
          ", LastTime=" + LastTime +
          ", UserFrom=" + UserFrom +
          ", Status=" + Status +
          ", DataFlag=" + DataFlag +
          ", CreateTime=" + CreateTime +
          '}';
 }

 public int getId() {
  return Id;
 }

 public void setId(int id) {
  Id = id;
 }

 public String getLoginName() {
  return LoginName;
 }

 public void setLoginName(String loginName) {
  LoginName = loginName;
 }

 public String getLoginPwd() {
  return LoginPwd;
 }

 public void setLoginPwd(String loginPwd) {
  LoginPwd = loginPwd;
 }

 public String getLoginSecret() {
  return LoginSecret;
 }

 public void setLoginSecret(String loginSecret) {
  LoginSecret = loginSecret;
 }

 public int getUserType() {
  return UserType;
 }

 public void setUserType(int userType) {
  UserType = userType;
 }

 public int getGender() {
  return Gender;
 }

 public void setGender(int gender) {
  Gender = gender;
 }

 public String getNickName() {
  return NickName;
 }

 public void setNickName(String nickName) {
  NickName = nickName;
 }

 public String getUserPhoto() {
  return UserPhoto;
 }

 public void setUserPhoto(String userPhoto) {
  UserPhoto = userPhoto;
 }

 public String getUserQQ() {
  return UserQQ;
 }

 public void setUserQQ(String userQQ) {
  UserQQ = userQQ;
 }

 public String getPhone() {
  return Phone;
 }

 public void setPhone(String phone) {
  Phone = phone;
 }

 public String getEmail() {
  return Email;
 }

 public void setEmail(String email) {
  Email = email;
 }

 public String getLastIP() {
  return LastIP;
 }

 public void setLastIP(String lastIP) {
  LastIP = lastIP;
 }

 public Timestamp getLastTime() {
  return LastTime;
 }

 public void setLastTime(Timestamp lastTime) {
  LastTime = lastTime;
 }

 public int getUserFrom() {
  return UserFrom;
 }

 public void setUserFrom(int userFrom) {
  UserFrom = userFrom;
 }

 public int getStatus() {
  return Status;
 }

 public void setStatus(int status) {
  Status = status;
 }

 public int getDataFlag() {
  return DataFlag;
 }

 public void setDataFlag(int dataFlag) {
  DataFlag = dataFlag;
 }

 public Timestamp getCreateTime() {
  return CreateTime;
 }

 public void setCreateTime(Timestamp createTime) {
  CreateTime = createTime;
 }
}
