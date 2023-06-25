package jp.wasshoy.nitsuki.domain.models;

import jakarta.persistence.Id;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Entry {
  @Id private Integer id;
  private String title;
  private String content;
  private Date createdAt;
  private Date updatedAt;
  private Boolean published;
}
