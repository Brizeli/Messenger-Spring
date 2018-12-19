package com.next;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.next.controller.MessageSender;
import com.next.model.Message;
import com.next.model.Message.Address;
import com.next.operation.SendOperation;

@Configuration
@ComponentScan
public class MessengerSpring {
	//Mock
	static Address address = new Address("email@gmail.com", "123-456-789", "something");
	static List<Message> messages = Arrays.asList(
			new Message("Hello", address, 1),
			new Message("Hello", address, 2),
			new Message("Hello", address, 3));

	@Bean
	public MessageSender messageSender(SendOperation<Message>[] operations) {
		return new MessageSender(operations);
	}

	public static void main(String[] args) {
		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MessengerSpring.class)) {
			MessageSender sender = ctx.getBean(MessageSender.class);
			messages.forEach(sender::sendMessage);
		}
	}

}
