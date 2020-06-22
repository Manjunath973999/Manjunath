package io.miniproject.dish.data.process;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.miniproject.restaurant.data.process.Restaurant;

@Entity
public class Dish {
	@Id
	int dishId;
	String rName;
	String dishName;
	String dishCuisine;
	String dishType;
	int dishPrice;
	
	private Restaurant restaurant;

	public Dish() {
		
	}
	public Dish(int dishId, String rName, String dishName, String dishCuisine, String dishType, int dishPrice,
			Restaurant restaurant) {
		super();
		this.dishId = dishId;
		this.rName = rName;
		this.dishName = dishName;
		this.dishCuisine = dishCuisine;
		this.dishType = dishType;
		this.dishPrice = dishPrice;
		this.restaurant = restaurant;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishCuisine() {
		return dishCuisine;
	}

	public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
	}

	public String getDishType() {
		return dishType;
	}

	public void setDishType(String dishType) {
		this.dishType = dishType;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	

}
