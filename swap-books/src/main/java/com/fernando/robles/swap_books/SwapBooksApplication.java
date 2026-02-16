package com.fernando.robles.swap_books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

import java.io.IOException;
import java.net.ServerSocket;

@SpringBootApplication
public class SwapBooksApplication implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

	public static void main(String[] args) {
		SpringApplication.run(SwapBooksApplication.class, args);
	}

	@Override
	public void customize(ConfigurableWebServerFactory factory) {
		int serverPorts = 8080;
		int range = 8095;
		int availablePort = 0;
		while (serverPorts < range) {
			try (ServerSocket socket = new ServerSocket(serverPorts)) { // checks if port is available
				availablePort = serverPorts;  // available port break the loop
				break;
			} catch (IOException e) {
				serverPorts++;  //  this is executed if port is already bind.
			}
		}
		factory.setPort(availablePort);
	}
}
