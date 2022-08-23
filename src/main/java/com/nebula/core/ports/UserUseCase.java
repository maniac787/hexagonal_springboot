package com.nebula.core.ports;

import com.nebula.core.domain.User;

public interface UserUseCase {
  User getUserById(Integer id);

  Integer createUser(User user);
}
