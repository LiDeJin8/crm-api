package com.crm.query;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: lenovo
 * @Date: 2025/10/19
 * @Version: 1.0
 */
@Data
public class CustomerQuery {

    @NotNull(message = "页码不能为空")
    @Schema(description = "页码", example = "1")
    private Long page;

    @NotNull(message = "每页条数不能为空")
    @Schema(description = "每页条数", example = "10")
    private Long limit;
    @Schema(description = "客户名称")
    private String name;
    @Schema(description = "手机号")
    private String phone;
    @Schema(description = "客户等级")
    private Integer level;
    @Schema(description = "客户来源")
    private Integer source;
    @Schema(description = "跟进状态")
    private Integer followStatus;
    @Schema(description = "0-客户列表，1-公海列表")
    private Integer isPublic;
}
