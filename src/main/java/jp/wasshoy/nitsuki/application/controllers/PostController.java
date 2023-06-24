package jp.wasshoy.nitsuki.application.controllers;

import java.util.List;
import jp.wasshoy.nitsuki.domain.repositories.PostEntityRepository;
import jp.wasshoy.nitsuki.infrastructure.models.PostEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {
  @Autowired private PostEntityRepository postEntityRepository;

  @GetMapping("/hello")
  public String hello() {
    return "hello!";
  }

  @GetMapping("/list")
  public List<PostEntity> get() {
    final var p = postEntityRepository.findAll();
    return p;
  }
}
