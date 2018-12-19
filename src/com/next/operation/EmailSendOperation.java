package com.next.operation;

import org.springframework.stereotype.Component;

import com.next.model.Message;

@Component
public class EmailSendOperation implements SendOperation<Message> {

	@Override
	public void perform(Message message) {
		System.out.println("Message \"" + message.contents + "\" sent to email: " + message.to.email);
	}

	@Override
	public int getType() {
		return 1;
	}

}
