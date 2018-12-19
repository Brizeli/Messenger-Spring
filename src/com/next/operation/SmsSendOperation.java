package com.next.operation;

import org.springframework.stereotype.Component;

import com.next.model.Message;

@Component
public class SmsSendOperation implements SendOperation<Message> {

	@Override
	public void perform(Message message) {
		System.out.println("Message \"" + message.contents + "\" sent by SMS to number: " + message.to.phone);
	}

	@Override
	public int getType() {
		return 2;
	}

}
