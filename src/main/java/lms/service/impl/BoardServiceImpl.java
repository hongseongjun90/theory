package lms.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import lms.dao.BoardDao;
import lms.domain.Board;
import lms.service.BoardService;

@Component
public class BoardServiceImpl implements BoardService {

  BoardDao boardDao;

  public BoardServiceImpl(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void add(Board board) throws Exception {
    boardDao.insert(board);
  }

  @Override
  public List<Board> list() throws Exception {
    return boardDao.findAll();
  }

  @Override
  public int delete(int no) throws Exception {
    return boardDao.delete(no);
  }

  @Override
  public Board get(int no) throws Exception {
    return boardDao.findByNo(no);
  }

  @Override
  public int update(Board board) throws Exception {
    return boardDao.update(board);
  }
}