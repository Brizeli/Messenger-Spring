package com.next.operation;

import org.springframework.stereotype.Component;

import com.next.model.Message;

@Component
public class OtherSendOperation implements SendOperation<Message> {

	@Override
	public void perform(Message message) {
		System.out.println("Message \"" + message.contents + "\" sent to other: " + message.to.other);
	}

	@Override
	public int getType() {
		return 3;
	}

}
