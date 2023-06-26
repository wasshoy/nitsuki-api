package jp.wasshoy.nitsuki.domain.repositories;

import jp.wasshoy.nitsuki.infrastructure.models.EntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<EntryEntity, Integer> {}
