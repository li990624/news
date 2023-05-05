package com.news.entity;

import java.util.List;
import lombok.Data;

/*分页*/
@Data
public class Page {
    private int pageNum;//当前页(前台传入)
    private int totalNum;//总的数据(从数据库中查询出来)
    private int pageSize = 11;//每页记录条数
    private int totalPageNum;//计算出来(总页数/pagesize)
    private int startIndex;//每页的开始记录数(计算出)
    private int startPage;//算出来
    private int endPage;
    private String url;//前台传入
    private List<?> list = null;//数据库中查询
    public Page(int pageNum, int totalNum, String url) {
        super();
        this.pageNum = pageNum;
        this.totalNum = totalNum;
        this.url = url;
        if (totalNum%pageSize==0) {
            //这里计算出页面总数,显示在jsp上面
            totalPageNum = totalNum/pageSize;
        }else{

            totalPageNum = totalNum/pageSize+1;
        }
        startIndex = (pageNum-1)*pageSize;
        if (totalPageNum<5) {
            startPage = 1;
            endPage = totalPageNum;
        }else{
            if (pageNum<3) {
                startPage = 1;
                endPage = 5;
            }else{
                if (pageNum>(totalPageNum-3)) {
                    startPage = totalPageNum-4;
                    endPage = totalPageNum;
                }else{
                    startPage = pageNum-2;
                    endPage = pageNum+2;
                }
            }
        }
    }
}
