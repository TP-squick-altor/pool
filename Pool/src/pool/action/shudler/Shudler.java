package pool.action.shudler;

import java.util.ArrayList;

import pool.action.Action;

public class Shudler extends Action {

	/**
	 * @param liste des actions à effectuer
	 */
	protected final ArrayList<Action> actions = new ArrayList<>();
	
	/**
	 * @param booléen mis à vrai quand le shudler à été initialisé
	 */
	protected boolean isInitialised;
	
	protected boolean isReady;
	
	public Shudler() {
		this.isInitialised = false;
	}

	public boolean isReady() {
		
		return isInitialised && isReady; 
	}

	public boolean isFinished() {
		return isInitialised && actions.isEmpty();
	}
	
	public void addAction(Action action){
		isInitialised = true;
		
		actions.add(action);
	}
}
