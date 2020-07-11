import org.xml.sax.HandlerBase;

public class Test {
	
	public static void main(String[] args) {
		
		hashtable h = new hashtable(3);
		
		h.put("sung", "she is prrtty");
		h.put("jin", "she is a model");
		h.put("hee", "she is an angel");
		h.put("min", "she is cute");
		h.put("sung", "she is handsome");
		
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("ming"));
		
	}

}
