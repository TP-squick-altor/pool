package pool.ressource.ressourcePool;

import pool.ressource.Cubicle;

public class CubiclePool extends RessourcePool<Cubicle> {

	public CubiclePool(int n) {
		super(n);
		}
	
	public Cubicle createRessource(){
		return new Cubicle();
		}
}
