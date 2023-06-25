package jp.wasshoy.nitsuki.domain.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import jp.wasshoy.nitsuki.domain.models.Entry;
import jp.wasshoy.nitsuki.domain.repositories.BlogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class BlogServiceImplTest {

    @InjectMocks
    private BlogServiceImpl blogservceImpl;
    @Mock
    private BlogRepository blogRepository;

    private
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getEntry() {
        doReturn(Entry.builder()
                .id(1)
                .title("title")
                .content("content")
                .createdAt(null)
                .updatedAt(null)
                .published(false)
                .build())
                .when(blogRepository)
                .getReferenceById(1);

        final var actual = blogservceImpl.getEntry(1);

        assertThat(actual).usingRecursiveComparison().isEqualTo(Entry.builder()
                .id(1)
                .title("title")
                .content("content")
                .createdAt(null)
                .updatedAt(null)
                .published(false)
                .build());
    }
}