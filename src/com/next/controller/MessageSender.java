package com.next.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import com.next.model.Message;
import com.next.operation.SendOperation;

public class MessageSender {
	//Operations by type
	private Map<Integer, SendOperation<Message>> operations;

	public MessageSender(SendOperation<Message>[] operations) {
		this.operations = Arrays.stream(operations)
				.collect(Collectors.toMap(SendOperation::getType, op -> op));
	}

	public void sendMessage(Message msg) {
		operations.get(msg.type).perform(msg);
	}
}
