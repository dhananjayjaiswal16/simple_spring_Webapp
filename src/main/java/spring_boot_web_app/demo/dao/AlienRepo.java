package spring_boot_web_app.demo.dao;

import org.springframework.data.repository.CrudRepository;

import spring_boot_web_app.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
