package pool.ressource.ressourcePool;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import pool.ressource.Ressource;

public abstract class RessourcePool <T extends Ressource> {

	protected ArrayList<T> ressources;
	protected ArrayList<T> usedRessources; 
	
	public RessourcePool(int nbRessource) {
         ressources = new ArrayList<T>(nbRessource);
         usedRessources= new ArrayList<T>();
         for(int i=0 ;i<nbRessource;i++) {
        	 ressources.add(createRessource());
        	 
         }
	}
	
	public abstract T createRessource();

	public T provideRessource() throws NoSuchElementException{
		if (ressources.isEmpty()){
			throw new NoSuchElementException();
		}
		T ressource = ressources.get(0);
		usedRessources.add(ressource);
		ressources.remove(ressource);
		return ressource;
	}
	
	public void freeRessource (T ressource) throws IllegalArgumentException{
		if(!(usedRessources.contains(ressource))){
			throw new IllegalArgumentException();
		}
		ressources.add(ressource);
		usedRessources.remove(ressource);
	}
	
}
