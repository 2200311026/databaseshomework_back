package com.wei.furn.dao;
import com.wei.furn.bean.book;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface showBookDao {

   public List<book> showBook();
   void addBook(book book);
   void changeBookInfo(book book);
   void lastNumsSub(long isbn);
   void lastNumsAdd(long isbn);
   long getBorrow(long isbn);
   void deleteBook(long isbn);
   long booksNums();
   List<book> selectBooksByName(String bookname);
   void changeImg(String img,long isbn);
   String getBookName(long isbn);
}
