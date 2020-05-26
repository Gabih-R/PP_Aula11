package sockets.chat.cliente;

import java.io.IOException;
import java.net.UnknownHostException;

public class RodaCliente {
	public static void main(String[] args) 
			throws UnknownHostException,	IOException {
		new Cliente("127.0.0.1", 27135).executa();
	}
}