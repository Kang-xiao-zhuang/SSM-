package com.zhuang.service;

import com.zhuang.pajo.Books;

import java.util.List;

/**
 * @Classname BookService
 * @Description 用一句话描述类的作用
 * @Date 2021/1/21 11:22
 * @Created by dell
 */

public interface BookService {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
