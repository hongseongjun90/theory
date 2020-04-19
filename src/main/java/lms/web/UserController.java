package lms.web;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lms.domain.Board;
import lms.domain.User;
import lms.service.UserService;

@Controller
public class UserController {

  static Logger logger = LogManager.getLogger(UserController.class);

  @Autowired
  UserService userService;

  public UserController() {
    logger.debug("UserController 생성됨!");
  }

  @RequestMapping("/user/form")
  public String form() throws Exception {
    return "/user/form.jsp";
  }

  @RequestMapping("/user/add")
  public String add(User user) throws Exception {

    userService.add(user);
    return "redirect:list";
  }

  @RequestMapping("/user/delete")
  public String delete(int no) throws Exception {
    if (userService.delete(no) > 0) {
      return "redirect:list";
    } else {
      throw new Exception("삭제할 유저 번호가 유효하지 않습니다.");
    }
  }

  @RequestMapping("/user/detail")
  public String detail(int no, Map<String, Object> model) throws Exception {
    User user = userService.get(no);
    model.put("user", user);
    return "/user/detail.jsp";
  }

  @RequestMapping("/user/list")
  public String list(Map<String, Object> model) throws Exception {
    List<User> users = userService.list();
    model.put("list", users);
    return "/user/list.jsp";
  }

  @RequestMapping("/user/updateForm") // request handler (요청을 처리할 메서드)
  public String from(int no, Map<String, Object> model) throws Exception {
    model.put("user", userService.get(no));
    return "/user/updateform.jsp";
  }

  @RequestMapping("/user/update")
  public String update(User user) throws Exception {
    if (userService.update(user) > 0) {
      return "redirect:list";
    } else {
      throw new Exception("변경할 게시물 번호가 유효하지 않습니다.");
    }
  }
}