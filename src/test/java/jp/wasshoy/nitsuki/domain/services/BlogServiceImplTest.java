package jp.wasshoy.nitsuki.domain.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.Optional;
import jp.wasshoy.nitsuki.domain.models.Entry;
import jp.wasshoy.nitsuki.domain.repositories.BlogRepository;
import jp.wasshoy.nitsuki.infrastructure.models.EntryEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class BlogServiceImplTest {

  @InjectMocks private BlogServiceImpl blogservceImpl;
  @Mock private BlogRepository blogRepository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getEntry() {
    doReturn(Optional.of(new EntryEntity(1, "title", "content", null, null, false)))
        .when(blogRepository)
        .findById(1);

    final var actual = blogservceImpl.getEntry(1);

    assertThat(actual)
        .usingRecursiveComparison()
        .isEqualTo(
            Entry.builder()
                .id(1)
                .title("title")
                .content("content")
                .createdAt(null)
                .updatedAt(null)
                .published(false)
                .build());
  }
}
