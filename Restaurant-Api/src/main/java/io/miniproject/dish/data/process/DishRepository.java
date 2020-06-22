package io.miniproject.dish.data.process;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {

	public List<Dish> findById();
}