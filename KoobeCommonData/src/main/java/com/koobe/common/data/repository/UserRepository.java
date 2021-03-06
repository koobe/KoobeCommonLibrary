package com.koobe.common.data.repository;

import com.koobe.common.data.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * KGL User Repository
 *
 * @author lyhcode
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUserId(String userId);
    User getByUserId(String userId);
    User getByUserIdAndPassword(String userId, String password);
    User getByUserIdAndPasswordAndOrgId(String userId, String password, Integer orgId);
}
