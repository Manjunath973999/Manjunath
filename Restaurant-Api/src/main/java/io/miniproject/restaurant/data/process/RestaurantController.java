package io.miniproject.restaurant.data.process;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;

	@RequestMapping("/restaurants")
	public List<Restaurant> getAllRestaurant() {
		return restaurantService.getAllRestaurants();
	}

	@RequestMapping("/restaurants.{rId}")
	public Optional<Restaurant> getRestaurant(@PathVariable int rId) {
		return restaurantService.getRestaurant(rId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/restaurants")
	public void addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/restaurants/{rId}")
	public void updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable int rId) {
		restaurantService.updateRestaurant(rId, restaurant);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/restaurants/{rId}")
	public void deleteRestaurant(@PathVariable int rId) {
		restaurantService.deleteRestaurant(rId);
	}
}
