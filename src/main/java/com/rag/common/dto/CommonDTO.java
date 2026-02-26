package com.rag.common.dto;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CommonDTO {
    private String city;

    private String adcode;

    private Boolean extended = true;

    private Boolean indices = true;

    private Boolean forecast = true;


    public String getParam(){
        StringBuffer sb = new StringBuffer();
        sb.append("city=").append(city);
        if (StringUtils.isNotBlank(adcode)) {
            sb.append("&adcode=").append(adcode);
        }
        sb.append("&extended=").append(extended);
        sb.append("&indices=").append(indices);
        sb.append("&forecast=").append(forecast);
        return sb.toString();
    }
}
