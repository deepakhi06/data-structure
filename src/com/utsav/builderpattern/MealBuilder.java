package com.utsav.builderpattern;

public interface MealBuilder {

	public void buildDrink();

	public void buildMainCourse();

	public void buildSide();

	public Meal getMeal();
}
