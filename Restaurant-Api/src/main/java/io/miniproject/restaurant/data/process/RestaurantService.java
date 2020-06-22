package io.miniproject.restaurant.data.process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	public List<Restaurant> getAllRestaurants(){
		// List<Restaurant> res = new ArrayList<>();
		List<Restaurant> res = restaurantRepository.findAll();

		return res;
	}

	public Optional<Restaurant> getRestaurant(int rId) {
		return restaurantRepository.findById(rId);
	}

	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	public void updateRestaurant(int rId, Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	public void deleteRestaurant(int rId) {
		restaurantRepository.deleteById(rId);

	}

}