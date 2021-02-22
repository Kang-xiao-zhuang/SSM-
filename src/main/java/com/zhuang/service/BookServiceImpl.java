package com.zhuang.service;

import com.zhuang.dao.BookMapper;
import com.zhuang.pajo.Books;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Description 用一句话描述类的作用
 * @Date 2021/1/21 11:24
 * @Created by dell
 */

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
