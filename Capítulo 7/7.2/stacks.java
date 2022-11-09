import java.util.ArrayList;
import java.util.List;
public class stacks {
	@Override
	public String toString() {
		return "Stack [elementos=" + elements + "]";
	}
	private List<String> elements = new ArrayList<>();
	public String peek() {
		if (elements.isEmpty()) {
			return null;
		}
		return elements.get(elements.size() - 1);
	}
	
	public String pop() {
		if (elements.isEmpty()) {
			return null;
		}
		String top = elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return top;
	}
	public void push(String element) {
		elements.add(element);
	}
	public int size() {
		return elements.size();
	}
	public boolean isEmpty() {
		return elements.isEmpty();
	}
	
	public static void main(String[] args) {
		
		stacks stack = new stacks();
		System.out.println("El stack está vacío?:"+stack.isEmpty());
		stack.push("Jack");
		stack.push("Mundo");
		stack.push("Hola");
		stack.push("A");
		System.out.println("El stack está vacío?:"+stack.isEmpty());
		System.out.println(stack);
		System.out.println("Tamaño del Stack:"+stack.size());
		System.out.println("Elemento superior:"+stack.peek());
		System.out.println("Soltar elemento superior:"+stack.pop());
		System.out.println("Tras soltarlo:"+stack);
		System.out.println("Nuevo tamaño del stack:"+stack.size());
		
	}
}