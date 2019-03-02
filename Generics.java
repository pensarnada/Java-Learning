package javalearning;

	class Generics<T extends Number> {
		//The "<T>" belongs to Number class and it means,
		//it has types like Integer, Float, Double etc.
		
		T value; //Gave the value T type, it depends what T is going to be.

		public T getValue() { //Getter
			return value;
		}

		public void setValue(T value) { //Setter
			this.value = value;
		}
		
		public void Show() { //Prints
			
			System.out.println(value.getClass().getName());
			//This shows our value's type as output.
			
		}
	public class GenericMain{ //Testing our methods in this class.
			
		public void main(String[] args) {
			
			Generics<Integer> obj = new Generics<>();
			//Defined an obj as Integer type by calling "Generics" class and it's Constructor.
			
			obj.Show();//Prints "obj" as value like we defined at "Show" method.
		}
	}
}
		
		
