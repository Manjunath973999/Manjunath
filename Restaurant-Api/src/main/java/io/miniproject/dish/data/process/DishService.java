package io.miniproject.dish.data.process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService {
	@Autowired
	private DishRepository dishRepository;

	public List<Dish> getAllDish(int dishId) {
		// List<Restaurant> res = new ArrayList<>();
		List<Dish> d = dishRepository.findByrId();

		return d;
	}

	public Optional<Dish> getDish(int dishId) {
		return dishRepository.findById(dishId);
	}

	public void addDish(Dish dish) {
		dishRepository.save(dish);
	}

	public void updateDish(int dishId, Dish dish) {
		dishRepository.save(dish);
	}

	public void deleteDish(int dishId) {
		dishRepository.deleteById(dishId);

	}

}