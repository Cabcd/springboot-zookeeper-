package com.spring.server.util;

public class Page {
    private int pageNo;
    private int pageSize;

    public int getPageNo() {
        if(pageNo==0)
            pageNo=1;
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        if(pageSize==0)
            pageSize=10;
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
