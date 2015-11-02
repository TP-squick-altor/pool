package pool.action.shudler;

import pool.action.Action;
import pool.action.ActionFinishedException;

public class SequantialShudler extends Shudler {

	protected Action currentAction;
	
	public SequantialShudler() {
		super();
		currentAction = null;
	}

	public void addAction(Action action){
		actions.add(action);
	}
	
	public void doStep() throws ActionFinishedException{
		if(currentAction == null){
			try{
				currentAction = actions.remove(0);
			}
			catch(IndexOutOfBoundsException e){
				throw new ActionFinishedException();
			}
		}
		if(currentAction.isInProgress())
			currentAction.doStep();
		else{
			try{
				currentAction = actions.remove(0);
			}
			catch(IndexOutOfBoundsException e){
				currentAction = null;
			}
		}
	}
	
	
	
}
