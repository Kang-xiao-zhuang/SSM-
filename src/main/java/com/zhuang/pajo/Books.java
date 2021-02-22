package com.zhuang.pajo;


import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Books
 * @Description 用一句话描述类的作用
 * @Date 2021/1/21 11:01
 * @Created by dell
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

//    public int getBookID() {
//        return bookID;
//    }
//
//    public void setBookID(int bookID) {
//        this.bookID = bookID;
//    }
//
//    public String getBookname() {
//        return bookname;
//    }
//
//    public void setBookname(String bookname) {
//        this.bookname = bookname;
//    }
//
//    public int getBookCounts() {
//        return bookCounts;
//    }
//
//    public void setBookCounts(int bookCounts) {
//        this.bookCounts = bookCounts;
//    }
//
//    public String getDetail() {
//        return detail;
//    }
//
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }
//
//    public Books() {
//    }
//
//    public Books(int bookID, String bookname, int bookCounts, String detail) {
//        this.bookID = bookID;
//        this.bookname = bookname;
//        this.bookCounts = bookCounts;
//        this.detail = detail;
//    }
//
//    @Override
//    public String toString() {
//        return "Books{" +
//                "bookID=" + bookID +
//                ", bookname='" + bookname + '\'' +
//                ", bookCounts=" + bookCounts +
//                ", detail='" + detail + '\'' +
//                '}';
//    }
}
