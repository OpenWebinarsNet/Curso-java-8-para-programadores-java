/**
 * 
 */
package ejemplobasico;

/**
 * @author Openwebinars
 *
 */
public class Par<T, S> {
	
	private T obj1;
	private S obj2;
	
	public Par(T obj1, S obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public S getObj2() {
		return obj2;
	}

	public void setObj2(S obj2) {
		this.obj2 = obj2;
	}

	@Override
	public String toString() {
		return "Par [" + (obj1 != null ? "obj1=" + obj1 + ", " : "") + (obj2 != null ? "obj2=" + obj2 : "") + "]";
	}
	
	
}
