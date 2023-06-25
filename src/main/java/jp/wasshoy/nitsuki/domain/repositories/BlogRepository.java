package jp.wasshoy.nitsuki.domain.repositories;

import jp.wasshoy.nitsuki.infrastructure.models.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<PostEntity, Integer> {}
