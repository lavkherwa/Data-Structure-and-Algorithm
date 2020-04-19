package com.lav.design.pattern.structural.adaptor;

public class SocketAdapter implements Socket {

	private Socket socket;

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void charge() {
		socket.charge();
	}

	@Override
	public int getNumberOfpins() {
		return socket.getNumberOfpins();
	}

	@Override
	public void increasePower(int power) {
		socket.increasePower(power);
	}

}
