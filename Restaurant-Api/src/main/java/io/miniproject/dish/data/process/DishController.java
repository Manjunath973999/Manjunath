package io.miniproject.dish.data.process;

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
public class DishController {
	@Autowired
	private DishService dishService;

	@RequestMapping("/restaurants/{rId}/dishes")
	public List<Dish> getAllDish(@PathVariable int dishId) {
		return dishService.getAllDish(dishId);
	}

	@RequestMapping("/restaurants/{rId}/dishes/{dishId}")
	public Optional<Dish> getDish(@PathVariable int dishId) {
		return dishService.getDish(dishId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/restaurants/{rId}/dishes")
	public void addRestaurant(@RequestBody Dish dish) {
		dishService.addDish(dish);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/restaurants/{rId}/dishes/{dishId}")
	public void updateRestaurant(@RequestBody Dish dish, @PathVariable int dishId) {
		dishService.updateDish(dishId, dish);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/restaurants/{rId}/dishes/{dishId}")
	public void deleteRestaurant(@PathVariable int dishId) {
		dishService.deleteDish(dishId);
	}
}
