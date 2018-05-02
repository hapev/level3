package level3;

public class Snake {
	private int viciousness;
	private boolean venomous;

	public Snake(int viciousness, boolean venomous) {
		this.viciousness = viciousness;
		this.venomous = venomous;
	}

	public int getViciousness() {
		return viciousness;
	}

	public void setViciousness(int viciousness) {
		this.viciousness = viciousness;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

}
