/**
 * 
 */
package ejemplobounded;

/**
 * @author Openwebinars
 *
 */
public class NumericBox<T extends Number> {
	
	private T object;

	public NumericBox(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "NumericBox [object=" + object + "]";
	}
	
	
	

}
