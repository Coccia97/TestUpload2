package esempioJSONparse;

import java.util.ArrayList;

public class Photos {
	ArrayList<Data> data;
	Paging paging;

	public ArrayList<Data> getData() {
		return data;
	}

	public void setdata(ArrayList<Data> data) {
		this.data = data;
	}

	public Paging getpaging() {
		return paging;
	}

	public void setpaging(Paging paging) {
		this.paging = paging;
	}

}
