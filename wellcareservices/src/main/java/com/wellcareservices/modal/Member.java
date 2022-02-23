package com.wellcareservices.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "member")
	public class Member {
	    
		@Id
		@Column
		 private int id;
		@Column
		 private String firstname;
		@Column
		 private String lastname;
		@Column
		 private String address;
		@Column
		 private String pincode;
		@Column
		 private String phonenumber;
		@Column
		 private int memberid;
		public Member() {
		}
		public Member(int id, String firstname, String lastname, String address, String pincode, String phonenumber,
				int memberid) {
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.pincode = pincode;
			this.phonenumber = phonenumber;
			this.memberid = memberid;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public int getMemberid() {
			return memberid;
		}
		public void setMemberid(int memberid) {
			this.memberid = memberid;
		}

		 
	}




