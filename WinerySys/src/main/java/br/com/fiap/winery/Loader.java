package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Serviço WineStockService publicado em http://localhost:8085/WineStockService");

        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        System.out.println("Serviço WineWarningService publicado em http://localhost:8086/WineWarningService");
    }
}
