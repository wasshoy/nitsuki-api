package jp.wasshoy.nitsuki.domain.repositories;

import jp.wasshoy.nitsuki.domain.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Entry, Integer> {}
