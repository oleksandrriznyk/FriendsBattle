package ua.friendsbattle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.friendsbattle.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
