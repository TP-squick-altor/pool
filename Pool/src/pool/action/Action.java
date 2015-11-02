/**
 * 
 */
package pool.action;

/**
 * @author dazemar
 *
 */
public abstract class Action {

	/**
	 * @param temps passé sur l'action
	 */
	protected int totalTime;
	
	public Action(){
		this.totalTime = 0;
		
	}
	
	
	/**
	 * indique si l'action est prête à être lancé
	 * @return true si l'action est prête à être lancé, false sinon
	 */
	public abstract boolean isReady();
	
	/**
	 * indique si l'action est terminé
	 * @return true si l'action est terminé, false sinon
	 */
	public abstract boolean isFinished();
	
	
	
	/**
	 * indique si l'action est prête à être lancé
	 * @return true si l'action est prête à être lancé, false sinon
	 */
	public boolean isInProgress(){
		return (!isReady()) && (!isFinished());
	}
	
	/**
	 * Lance l'action
	 * @throws ActionFinishedException si l'action est déjà finis
	 */
	public void doStep() throws ActionFinishedException{
		if(isFinished())
			throw new ActionFinishedException();
	}
	
	
}
