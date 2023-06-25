package jp.wasshoy.nitsuki.domain.services;

import java.util.List;
import jp.wasshoy.nitsuki.domain.models.Entry;
import jp.wasshoy.nitsuki.domain.repositories.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
  private final BlogRepository blogRepository;

  public BlogServiceImpl(BlogRepository blogRepository) {
    this.blogRepository = blogRepository;
  }

  @Override
  public List<Entry> findAllEntries(int page, int size) {
    // TODO: 全件取得（パラメーター無視）
    // TODO: ページネーション
    // TODO: 取得サイズ指定
    return null;
  }

  @Override
  public Entry createEntry(Entry entry) {
    // TODO: エントリー作成
    return null;
  }

  @Override
  public Entry getEntry(int id) {
    // TODO: 指定したIDでエントリーが存在しない場合例外を投げる
    final var entryEntity = blogRepository.findById(id).orElseThrow();
    return Entry.builder()
        .id(entryEntity.getId())
        .title(entryEntity.getTitle())
        .content(entryEntity.getContent())
        .createdAt(entryEntity.getCreatedAt())
        .updatedAt(entryEntity.getUpdatedAt())
        .published(entryEntity.getPublished())
        .build();
  }

  @Override
  public Entry updateEntry(Entry entry) {
    // TODO: エントリー更新
    return null;
  }

  @Override
  public void deleteEntry(int id) {
    // TODO: エントリー削除
  }
}
