package pool.action;

public class Forseable extends Action {

	/**
	 * Durée de l'action
	 */
	int timeToEnd;
	
	
	public Forseable(int timeToEnd) {
		super();
		this.timeToEnd = timeToEnd;
	}
	
	public boolean isReady(){
		return timeToEnd == 0;
	}
	
	public boolean isFinished(){
		return timeToEnd == totalTime; 
	}

	public void doStep() throws ActionFinishedException{
		super.doStep();
		timeToEnd ++;
	}
}
