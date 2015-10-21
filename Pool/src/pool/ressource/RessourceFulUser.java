package pool.ressource;

public class RessourceFulUser<R extends Ressource> {

	protected R ressource;
	
	public RessourceFulUser() {
		this.ressource = null;
	}
	
	public R getRessource() {
		return ressource;
	}
	public void setResource(R resource){
		this.ressource =resource;
		return ;
	}
	public void resetResource() {
		this.ressource=null;
	}

}
