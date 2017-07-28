package screensaver;

public class Pair<T1, T2> {
	Object key;
	Object value;
	Pair(Object key, Object value){
		this.key= key;
		this.value = value;
	}
	public Object getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}

}
