package org.generation.italy;

public class FizzBuzz {

	/*
	 * Scrivi un programma che stampi i numeri da 1 a 100, 
	 * ma per i multipli di 3 stampi “Fizz” al posto del numero e per i multipli di 5 stampi Buzz. 
	 * Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.
	 */
	
	public static void main(String[] args) {
		for (int x = 1; x <= 100; x++){
            if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(x % 3 == 0){
                System.out.println("Fizz");
            } else if(x % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
	}

}
