package jp.wasshoy.nitsuki.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Entity
@Table(name = "post")
@Getter
public class Entry {
  @Id private Integer id;
  private String title;
  private String content;
  private Date createdAt;
  private Date updatedAt;
  private Boolean published;
}
