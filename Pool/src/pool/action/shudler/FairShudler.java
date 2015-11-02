package pool.action.shudler;

import java.util.Iterator;

import pool.action.Action;
import pool.action.ActionFinishedException;

public class FairShudler extends Shudler {

	protected Iterator <Action> iterator;
	public FairShudler() {
		super();
	}

	public void addAction(Action action){
		super.addAction(action);
		
		// l'iterateur doit être réinitialiser à chaque ajout d'action.
		iterator = actions.iterator();
	}
	
	public void doStep() throws ActionFinishedException{
		if(iterator.hasNext()){
			Action currentAction = iterator.next();
			
			// si l'action courante est terminé on l'enlève du shudler. On fait ce test ici au cas ou l'utilisateur ajoute des actions déjà terminées dans le shudler
			if(!currentAction.isFinished()){
				iterator.remove();
				doStep();
			}
			else
				currentAction.doStep();
		}
			
	}
}
