package com.simonlee.webservice.server.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * 服务端
 */
@WebService
public class Server {
	/**
	 * 获取姓名
	 * 
	 * @param name
	 *            客户端发送的姓名
	 * @return 姓名
	 */
	public String getName(String name) {
		System.out.println("["
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()) + "] 接收到客户端发送的姓名：" + name);
		return "我叫：" + name;
	}

	/**
	 * 启动服务端
	 */
	private static void startServer() {
		String address = "http://127.0.0.1:1234/WebServiceDemo/Server";
		Endpoint.publish(address, new Server());
		System.out.println("服务端启动成功！");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		startServer();
	}
}