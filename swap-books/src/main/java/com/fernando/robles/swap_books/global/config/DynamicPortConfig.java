package com.fernando.robles.swap_books.global.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.ServerSocket;

@Configuration
public class DynamicPortConfig implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        int serverPort = 8080;
        int range = 8095;
        int availablePort = 0;

        while (serverPort < range) {
            try (ServerSocket socket = new ServerSocket(serverPort)) {
                availablePort = serverPort;
                break;
            } catch (IOException e) {
                serverPort++;
            }
        }

        if (availablePort == 0) {
            throw new IllegalStateException("No available port found in range 8080-8095");
        }

        factory.setPort(availablePort);

    }
}