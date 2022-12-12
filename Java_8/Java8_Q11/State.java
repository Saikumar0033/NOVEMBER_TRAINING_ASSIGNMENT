package Java8_Q11;

public class State {
	private int stateId;
	private String statename;

	public State(int stateId, String statename) {
		super();
		this.stateId = stateId;
		this.statename = statename;
	}

	public int getStated() {
		return stateId;
	}

	public void setStated(int stated) {
		this.stateId = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "State [stated=" + stateId + ", statename=" + statename + "]";
	}
}
