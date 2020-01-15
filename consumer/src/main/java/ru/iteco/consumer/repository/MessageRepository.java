package ru.iteco.consumer.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.iteco.consumer.domain.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
