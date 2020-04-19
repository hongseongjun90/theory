package lms.service;

import java.util.List;
import lms.domain.User;

public interface UserService {
  
  void add(User user) throws Exception;

  List<User> list() throws Exception;

  int delete(int no) throws Exception;

  User get(int no) throws Exception;

  int update(User user) throws Exception;
}