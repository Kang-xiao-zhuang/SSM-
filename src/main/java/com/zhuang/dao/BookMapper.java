package com.zhuang.dao;

import com.zhuang.pajo.Books;

import java.util.List;

/**
 * @Classname BookMapper
 * @Description 用一句话描述类的作用
 * @Date 2021/1/21 11:04
 * @Created by dell
 */

public interface BookMapper {
    //增加一个book
    int addBook(Books book);

    //根据id删除一个book
    int deleteBookById(int id);

    //更新book
    int updateBook(Books books);

    //根据id查询，返回一个book
    Books queryBookById(int id);

    //查询所有book 返回list集合
    List<Books> queryAllBook();
}
