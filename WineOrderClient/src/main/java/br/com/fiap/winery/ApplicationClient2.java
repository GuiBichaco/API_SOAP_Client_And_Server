package br.com.fiap.winery;

import br.com.fiap.winery.WineStockService;
import br.com.fiap.winery.WineStockServiceImplementationService;
import br.com.fiap.winery.warn.WineWarningService;
import br.com.fiap.winery.warn.WineWarningServiceImplementationService;

public class ApplicationClient2 {
    public static void main(String[] args) {

        // Força o uso do provider da Sun
        System.setProperty("javax.xml.ws.spi.Provider", "com.sun.xml.ws.spi.ProviderImpl");

        // Conectar ao serviço de pedidos
        WineStockServiceImplementationService stockService = new WineStockServiceImplementationService();
        WineStockService stock = stockService.getWineStockServiceImplementationPort();

        // Conectar ao serviço de avisos
        WineWarningServiceImplementationService warnService = new WineWarningServiceImplementationService();
        WineWarningService warning = warnService.getWineWarningServiceImplementationPort();

        System.out.println("=== CLIENTE: REALIZANDO PEDIDO ===");
        String resposta = stock.placeOrder("Merlot", 8);
        System.out.println(resposta);

        System.out.println("=== CLIENTE: VERIFICANDO AVISOS ===");
        String alerta = warning.sendWarn();
        System.out.println(alerta);
    }
}

