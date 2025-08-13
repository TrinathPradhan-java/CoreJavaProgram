package pratice.predefinedFunctionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 
{
	public static void main(String[] args) 
	{
		//Consume different values
		Consumer<Integer> conInt = num -> System.out.println(num);
		conInt.accept(12);
		
		Consumer<Float> conFloat = num -> System.out.println(num);
		conFloat.accept(19F);
		
		Consumer<Character> conChar = num -> System.out.println(num);
		conChar.accept('A');
	}

}
