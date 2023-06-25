package jp.wasshoy.nitsuki.infrastructure.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Getter;

@Entity
@Table(name = "post")
@Getter
public class EntryEntity {
  @Id private Integer id;
  private String title;
  private String content;
  private Date createdAt;
  private Date updatedAt;
  private Boolean published;

  public EntryEntity(
      Integer id, String title, String content, Date createdAt, Date updatedAt, Boolean published) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.published = published;
  }

  /*
  JPA Entity needs default or No-Arg Constructor.
  https://openjpa.apache.org/builds/3.2.2/apache-openjpa/docs/jpa_overview_pc.html
   */
  @SuppressWarnings("unused")
  public EntryEntity() {
  }
}
