package esempioJSONparse;

public class Foto {
	String created_time;
	String  id;

	public Foto(String created_time, String id) {
		super();
		this.created_time = created_time;
		this.id = id;
	}

    public Foto() {
	this.created_time = null;
	this.id = null;
	
}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
