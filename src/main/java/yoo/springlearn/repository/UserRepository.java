package yoo.springlearn.repository;

import java.util.List;
import java.util.Optional;

import yoo.springlearn.domain.UserVO;

public interface UserRepository {
    UserVO insertUser(UserVO vo);
    Optional<UserVO> findById(String id);
    Optional<UserVO> findByName(String id);
    List<UserVO> findAll();
}
