package com.next.model;

public class Message {
	public String contents;
	public Address to;
	public int type;

	public Message(String contents, Address to, int type) {
		this.contents = contents;
		this.to = to;
		this.type = type;
	}

	public static class Address {
		public String email;
		public String phone;
		public String other;

		public Address(String email, String phone, String other) {
			this.email = email;
			this.phone = phone;
			this.other = other;
		}

	}
}
