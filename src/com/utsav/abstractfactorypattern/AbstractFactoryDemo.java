package com.utsav.abstractfactorypattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory af = new AbstractFactory();
		SpeciesFactory sf1 = af.getSpeciesFactory("mammal");
		Animal a1 = sf1.getAnimal("dog");
		String sound1 = a1.makeSound();
		System.out.println(sound1);
		
		Animal a2 = sf1.getAnimal("cat");
		String sound2 = a2.makeSound();
		System.out.println(sound2);
		
		SpeciesFactory sf2 = af.getSpeciesFactory("reptile");
		Animal a3 = sf2.getAnimal("snake");
		String sound3 = a3.makeSound();
		System.out.println(sound3);
		
		Animal a4 = sf2.getAnimal("tyra");
		String sound4 = a4.makeSound();
		System.out.println(sound4);
	}

}
