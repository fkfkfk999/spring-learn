package yoo.springlearn.service;

import java.util.Optional;

import yoo.springlearn.domain.UserVO;
import yoo.springlearn.repository.UserRepository;

/**
 * UserService
 */
public class UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();

    /*
        회원가입
    */
    public Long join(UserVO vo){
        //중복회원 이름으로 체크
        //ifPresent는 null이 아닌 값이 있으면 동작한다.
        userRepository.findByName(vo.getUserName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존제하는 회원입니다.");
        });

        userRepository.insertUser(vo);
        return vo.getSerialNo();    
    }
}