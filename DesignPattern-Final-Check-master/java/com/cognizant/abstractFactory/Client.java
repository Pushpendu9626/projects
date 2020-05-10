package com.cognizant.abstractFactory;

public class Client {

	public static void main(String[] args) {

		Order order1 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		Order order2 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.FURNITURE);
		Order order3 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.TOYS);

		Order order4 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		Order order5 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.FURNITURE);
		Order order6 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.TOYS);

		order1.processOrder();
		order2.processOrder();
		order3.processOrder();

		order4.processOrder();
		order5.processOrder();
		order6.processOrder();
	}

}