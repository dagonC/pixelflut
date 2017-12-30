package de.paws.pixelwar;

public class Config {

	private int serverPort;
	private int bufferWidth;
	private int bufferHeight;
	private int canvasWidth;
	private int canvasHeight;
	private String canvasFile;
	private Boolean showLabels;

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(final int serverPort) {
		this.serverPort = serverPort;
	}

	public int getBufferWidth() {
		return bufferWidth;
	}

	public void setBufferWidth(final int bufferWidth) {
		this.bufferWidth = bufferWidth;
	}

	public int getBufferHeight() {
		return bufferHeight;
	}

	public void setBufferHeight(final int bufferHeight) {
		this.bufferHeight = bufferHeight;
	}

	public int getCanvasWidth() {
		return canvasWidth;
	}

	public void setCanvasWidth(final int canvasWidth) {
		this.canvasWidth = canvasWidth;
	}

	public int getCanvasHeight() {
		return canvasHeight;
	}

	public void setCanvasHeight(final int canvasHeight) {
		this.canvasHeight = canvasHeight;
	}

	public String getCanvasFile() {
		return canvasFile;
	}

	public void setCanvasFile(final String canvasFile) {
		this.canvasFile = canvasFile;
	}

	public Boolean getShowLabels() {
		return showLabels;
	}

	public void setShowLabels(final Boolean showLabels) {
		this.showLabels = showLabels;
	}
}
