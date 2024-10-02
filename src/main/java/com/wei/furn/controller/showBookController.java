package com.wei.furn.controller;

import com.wei.furn.Service.showBookService;
import com.wei.furn.bean.book;
import com.wei.furn.util.Result;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class showBookController {

    @Resource
    private showBookService bookService;


    @GetMapping("/showBook")
    public Result showBook() {
        List<book> books = bookService.showBook();
        return Result.success(books);
    }

    @PutMapping("/addBook")
    public Result addBook(@RequestBody book book) {
        bookService.addBook(book);
        return Result.success("添加成功");
    }

    @PutMapping("/changeBookInfo")
    public Result changeBookInfo(@RequestBody book book) {
        bookService.changeBookInfo(book);
        return Result.success("修改书籍信息成功");
    }

    @PutMapping("/lastNumsSub")
    public Result lastNumsSub(@RequestParam long isbn) {
        bookService.lastNumsSub(isbn);
        return Result.success("图书数量减少");
    }

    @PutMapping("/lastNumsAdd")
    public Result lastNumsAdd(@RequestParam long isbn) {
        bookService.lastNumsAdd(isbn);
        return Result.success("图书数量增加");
    }

    @GetMapping("/getBorrow")
    public Result getBorrow(@RequestParam long isbn) {
        return Result.success(bookService.getBorrow(isbn));
    }

    @DeleteMapping("/deleteBook")
    public Result deleteBook(@RequestParam long isbn) {
        bookService.deleteBook(isbn);
        return Result.success("删除成功");
    }

    @GetMapping("/booksNums")
    public Result booksNums() {
        long nums = bookService.booksNums();
        return Result.success(nums);
    }

    @PostMapping("/selectBooksByName")
    public Result selectBooksByName(@RequestParam String bookname) {
        return Result.success(bookService.selectBooksByName(bookname));
    }

    @PutMapping("/changeImg")
    public Result changeImg(@RequestParam String img,@RequestParam long isbn){
        bookService.changeImg(img,isbn);
        return Result.success("上传图书图片成功");
    }

    @GetMapping("/getBookName")
    public Result getBookName(@RequestParam long isbn){
        return Result.success(bookService.getBookName(isbn));
    }
}
