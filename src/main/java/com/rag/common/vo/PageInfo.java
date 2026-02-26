package com.rag.common.vo;

import lombok.Data;

@Data
public class PageInfo {

    private long current;
    private long size;
    private long total;

    public static PageInfo of(long current, long size, long total) {
        PageInfo p = new PageInfo();
        p.current = current;
        p.size = size;
        p.total = total;
        return p;
    }
}
