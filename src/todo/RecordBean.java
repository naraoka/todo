package todo;

import java.io.Serializable;

public class RecordBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String degree;
	private String content;

	public RecordBean() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}

}