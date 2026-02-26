package com.rag.common.dto.api;

import com.rag.common.dto.CommonDTO;
import com.rag.common.dto.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "common-api", path = "/common")
public interface CommonServiceApi {

    /**
     * 获取对应城市天气信息
     * @param dto
     * @return
     */
    public Result<String> weatherInfo(CommonDTO dto);

    /**
     * 获取用户ip信息
     * @return
     */
    public Result<String> ipInfo();
}
