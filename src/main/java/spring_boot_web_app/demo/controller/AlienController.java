package spring_boot_web_app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_boot_web_app.demo.dao.AlienRepo;
import spring_boot_web_app.demo.model.Alien;

@Controller
public class AlienController {
  @Autowired
  AlienRepo repo;

  @RequestMapping("/")
  public String home() {
    return "home.jsp";
  }

  @RequestMapping("/addAlien")
  public String addAlien(Alien alien) {
    repo.save(alien);
    return "home.jsp";
  }
}
