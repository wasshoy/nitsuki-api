package jp.wasshoy.nitsuki.infrastructure.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;

@Entity
@Table(name = "post")
@Getter
public class PostEntity {
  @Id private Integer id;
  private String title;
  private String content;
  private Date createdAt;
  private Date updatedAt;
  private Boolean published;
}
