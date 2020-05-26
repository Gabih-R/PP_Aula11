package sockets.chat.servidor;

import java.io.IOException;

public class RodaServidor {

	public static void main(String[] args) 
			throws IOException {
		new Servidor(27135).executa();
	}
}