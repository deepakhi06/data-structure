package com.utsav;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EqualsHashCode {

	public static void main(String[] args) {
		Country country1 = new Country();
		country1.setName("India");
		Country country2 = new Country();
		country2.setName("India");
		System.out.println("Is country1 is equal to country2 : " + country1.equals(country2));
	
		Map<Country, String> map = new HashMap<Country, String>();
		map.put(country1, "Delhi");
		map.put(country2, "Delhi");
		Set<Entry<Country, String>> it = map.entrySet();
		for (Entry<Country, String> entry : it) {
			System.out.println("Capital of " + entry.getKey().getName() + " is " + entry.getValue());
		}
	}

}

class Country{
	String name;
	long population;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Country other = (Country)obj;
		if(name == null){
			if(other.getName() != null)
				return false;
		}else if(!name.equals(other.getName()))
			return false;
		return true;
	}
	
	@Override
	public int hashCode(){
		int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}
