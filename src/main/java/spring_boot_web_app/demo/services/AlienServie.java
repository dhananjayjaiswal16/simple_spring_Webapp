package spring_boot_web_app.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_boot_web_app.demo.dao.AlienRepo;

@Service
public class AlienServie {
  // Field injetion
  // @Autowired
  // AlienRepo repo;

  // Constructor injection
  // public AlienServie(AlienRepo repo) {
  // super();
  // this.repo = repo;
  // }

  // Setter Injection
  // @Autowired
  // public void setRepo(AlienRepo repo) {
  // this.repo = repo;
  // }

}
