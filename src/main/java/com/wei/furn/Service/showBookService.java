package com.wei.furn.Service;

import com.wei.furn.bean.book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface showBookService {
        List<book> showBook();

        void addBook(book book);

        void changeBookInfo(book book);

        void lastNumsSub(long isbn);

        void lastNumsAdd(long isbn);

        long getBorrow(long isbn);

        void deleteBook(long isbn);

        long booksNums();

        List<book> selectBooksByName(String bookName);

        void changeImg(String img,long isbn);

        String getBookName(long isbn);
}
