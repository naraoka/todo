package todo;

import java.io.Serializable;
import java.util.ArrayList;

public class InfoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<RecordBean> recordBeanArray =
			new ArrayList<RecordBean>();


	//Constructor
	public InfoBean() {
	}

	public ArrayList<RecordBean> getRecordBeanArray(){
		return recordBeanArray;
	}

	public void addRecordBean(RecordBean obj) {
		recordBeanArray.add(obj);
	}

	public int getArraySize() {
		return recordBeanArray.size();
	}
}