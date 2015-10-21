package pool.ressource.ressourcePool;

import pool.ressource.Basket;

public class BasketPool extends RessourcePool<Basket> {

	public BasketPool(int n) {
		super(n);
		}
	public Basket createRessource(){
		return new Basket();
	}

}