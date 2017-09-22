package com.plkpiotr.forum.repositories;

import com.plkpiotr.forum.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    Long countTopicsByUser_Id(Long id);

    List<Topic> findTopicsByCategoryOrderByLastModifiedDateDesc(String category);
    List<Topic> findTopicsByUser_IdOrderByLastModifiedDateDesc(Long id);
}