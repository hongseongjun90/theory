package lms.dao;

import java.util.List;
import lms.domain.User;

public interface UserDao {
  public int insert(User user) throws Exception;

  public List<User> findAll() throws Exception;

  public User findByNo(int no) throws Exception;

  public int update(User user) throws Exception;

  public int delete(int no) throws Exception;

}