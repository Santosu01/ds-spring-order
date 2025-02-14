package com.devsuperior.order;

import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order firstOrder = new Order(1034, 150.00, 20.0);
		Order secondOrder = new Order(2282, 800.00, 10.0);
		Order thirdOrder = new Order(1309, 95.90, 0.0);

		System.out.println("Pedido codigo: " + firstOrder.getOrder());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(firstOrder));

		System.out.println("Pedido codigo: " + secondOrder.getOrder());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(secondOrder));

		System.out.println("Pedido codigo: " + thirdOrder.getOrder());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(thirdOrder));
	}
}
