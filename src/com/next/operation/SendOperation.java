package com.next.operation;

public interface SendOperation<T> {
	void perform(T object);
	int getType();
}
