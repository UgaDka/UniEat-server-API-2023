package foorun.unieat.api.model.database.email.repository;

import foorun.unieat.api.model.database.email.entity.EmailMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailMessageRepository extends JpaRepository<EmailMessageEntity, Long> {
}
