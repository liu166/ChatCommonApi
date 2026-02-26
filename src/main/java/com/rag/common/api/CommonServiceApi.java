package com.rag.common.api;

import com.rag.common.dto.CommonDTO;
import com.rag.common.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;

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
