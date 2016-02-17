package com.simonlee.webservice.client.main;

import com.simonlee.webservice.client.util.Server;
import com.simonlee.webservice.client.util.ServerService;

/**
 * 客户端
 */
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Server server = new ServerService().getServerPort();
		System.out.println(server.getName("张三"));
	}
}