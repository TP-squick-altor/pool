package pool.action.actionRessource;

import pool.action.Action;
import pool.ressource.Ressource;
import pool.ressource.ressourcePool.RessourcePool;

public class ActionRessource <T extends Ressource > extends Action {

	protected RessourcePool <T>ressourcePool;
	protected RessourceFullUser<T> user;
	
	public ActionRessource() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
 
}
