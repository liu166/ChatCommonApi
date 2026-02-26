package com.rag.common.dto.vo;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
public class Result<T> {

    private int status;
    private String message;
    private T data;
    private PageInfo page;
    private Long id;

    /* ===== 成功 ===== */
    public static <T> Result<T> ok() {
        Result<T> r = new Result<>();
        r.status = 200;
        r.message = "success";
        return r;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> r = new Result<>();
        r.status = 200;
        r.message = "success";
        r.data = data;
        return r;
    }

    public static <T> Result<T> ok(Long id) {
        Result<T> r = new Result<>();
        r.status = 200;
        r.message = "success";
        r.id = id;
        return r;
    }

    public static <T> Result<T> ok(T data, PageInfo page) {
        Result<T> r = ok(data);
        r.page = page;
        return r;
    }

    /* ===== 失败 ===== */
    public static <T> Result<T> error(String message) {
        Result<T> r = new Result<>();
        r.status = 500;
        r.message = message;
        return r;
    }

    public static <T> Result<T> error() {
        Result<T> r = new Result<>();
        r.status = 500;
        r.message = "error";
        return r;
    }

    public static <T> Result<T> error(int status, String message) {
        Result<T> r = new Result<>();
        r.status = status;
        r.message = message;
        return r;
    }

    public static <T> Result<T> ok(Page<T> page) {
        if (page == null) {
            return ok();
        }
        PageInfo pageInfo = PageInfo.of(
                page.getCurrent(),
                page.getSize(),
                page.getTotal()
        );
        Result<T> tResult = new Result<>();
        tResult.setPage(pageInfo);
        tResult.setStatus(200);
        tResult.setMessage("success");
        tResult.setData((T) page.getRecords());
        return  tResult;
    }
}
