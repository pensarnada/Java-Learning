package javalearning;

import java.util.ArrayList;

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
		
		public void GenericT(ArrayList<? extends T> obj) {
			//"? extends T" means ? must be the subclass of T
			//Like "Integer" is subclass of "Number"
			//as we defined "T extends Number" at the Generics class.
			
		}
		
	public class GenericMain{ //Testing our methods in this class.
			
		public void main(String[] args) {
			
			Generics<Number> obj = new Generics<>();
			//Defined an obj as Number(includes all types of numbers) type,
			//by calling "Generics" class and it's Constructor.
			obj.value=5;
			obj.Show();//Prints "obj" as value like we defined at "Show" method.
			obj.GenericT(new ArrayList<Integer>());
			//What ever you want to give a type this new ArrayList's type,
			//must be a subclass of T according to GenericT class.
		}
	}
}
		
		
