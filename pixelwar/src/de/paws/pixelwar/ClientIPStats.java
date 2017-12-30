package de.paws.pixelwar;

public class ClientIPStats {

	private String ip;
	private long numberOfConnections = 0;
	private long numberOfPixels = 0;

	public ClientIPStats(final String ip) {
		super();
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(final String ip) {
		this.ip = ip;
	}

	public long getNumberOfConnections() {
		return numberOfConnections;
	}

	public long getNumberOfPixels() {
		return numberOfPixels;
	}

	public void setNumberOfPixels(final long numberOfPixels) {
		this.numberOfPixels = numberOfPixels;
	}

	public void incrementNumberOfPixels() {
		numberOfPixels++;
	}

	public long incrementNumberOfConnections() {
		numberOfConnections++;
		return numberOfConnections;
	}

	public long decrementNumberOfConnections() {
		if (numberOfConnections > 0) {
			numberOfConnections--;
		}
		return numberOfConnections;
	}
}
