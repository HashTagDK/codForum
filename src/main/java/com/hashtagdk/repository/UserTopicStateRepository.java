package com.hashtagdk.repository;

import com.hashtagdk.model.Topic;
import com.hashtagdk.model.User;
import com.hashtagdk.model.UserTopicApprobationState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dawid on 7/27/17.
 */
@Repository
public interface UserTopicStateRepository extends JpaRepository<UserTopicApprobationState, Long>{
    UserTopicApprobationState findByUserAndTopic(User user, Topic topic);
}
