package org.dimhat.demo7.message.implementor;

/**
 * 发送消息统一接口，Implementor（实现者）
 */
public interface MessageImplementor {

	void send(String message, String toUser);
}
