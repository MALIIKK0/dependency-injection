package test;


import Client.Client;
import Client.ClientA;
import services.Service;
import services.ServiceC;

public class main {
	
	public static void main(String[] args) {
		Service service = new ServiceC();
		Client client = new ClientA(service);
		client.doSomething();
	}

}
