package com.utsav.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		Animal animal = af.getAnimal("dog");
		String sound1 = animal.makeSound();
		System.out.println(sound1);
		Animal anima2 = af.getAnimal("cat");
		String sound2 = anima2.makeSound();
		System.out.println(sound2);
	}

}
