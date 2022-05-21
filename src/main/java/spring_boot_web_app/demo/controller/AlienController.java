package spring_boot_web_app.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

import spring_boot_web_app.demo.dao.AlienRepo;
import spring_boot_web_app.demo.model.Alien;

@RestController
public class AlienController {
  @Autowired
  AlienRepo repo;

  @RequestMapping("/")
  public String home() {
    return "home.jsp";
  }

  @PostMapping("/alien")
  public Alien addAlien(@RequestBody Alien alien) {
    repo.save(alien);
    return alien;
  }

  @GetMapping("/aliens")
  public List<Alien> getAliens() {
    return repo.findAll();
  }

  @GetMapping("/alien/{aid}")
  public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
    return repo.findById(aid);
  }

  @PutMapping("/alien")
  public Alien addOrUpdateAlien(@RequestBody Alien alien) {
    repo.save(alien);
    return alien;
  }

  @DeleteMapping("/alien/{aid}")
  public String deleteAlien(@PathVariable("aid") int aid) {
    repo.deleteById(aid);
    return "Alien deletd";
  }
}
