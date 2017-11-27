/**
 * 
 */
package supplier;

/**
 * @author Openwebinars
 *
 */
public class Item {
	private String name;

	public Item() {
	}

	public Item(String name) {
		this.name = name;
	}

	public static String getStaticVal() {
		return "Valor estático";
	}

	public String getMsg() {
		return "Mensaje!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}