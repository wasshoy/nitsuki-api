package jp.wasshoy.nitsuki.domain.services;

import java.util.List;

import jp.wasshoy.nitsuki.domain.models.Entry;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public interface BlogService {
  @NonNull
  List<Entry> findAllEntries(int page, int size);

  Entry createEntry(@NonNull Entry entry);

  @Nullable
  Entry getEntry(int id);

  Entry updateEntry(@NonNull Entry entry);

  void deleteEntry(int id);
}
