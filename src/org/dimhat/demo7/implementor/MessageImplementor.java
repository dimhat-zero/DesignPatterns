package org.dimhat.demo7.implementor;

/**
 * 发送消息统一接口，Implementor
 */
public interface MessageImplementor {

	void send(String message, String toUser);
}
