package com.gas.clickhouse.user.entity;

import com.gas.clickhouse.base.annotation.ClickHouseColumn;
import com.gas.clickhouse.base.annotation.ClickHouseID;
import com.gas.clickhouse.base.annotation.ClickHouseTable;
import com.gas.clickhouse.base.entity.ClickHouseBaseEntity;
import lombok.Data;

/**
 * @author lure
 * @title: AiMblUserInfo
 * @projectName i4-data-platform
 * @description: TODO
 * @date 2023/1/2219:03
 */

@ClickHouseTable(name = "wlw_dayvalue")
@Data
public class AiMblUserInfo extends ClickHouseBaseEntity {

    @ClickHouseColumn(name = "ID")
    @ClickHouseID
    private Integer ID;

    @ClickHouseColumn(name = "mid")
    private String mid;

    @ClickHouseColumn(name = "fid")
    private Integer fid;

    @ClickHouseColumn(name = "CreateDate")
    private String CreateDate;

    @ClickHouseColumn(name = "UserValue")
    private Double UserValue;

    @ClickHouseColumn(name = "Cardno")
    private String Cardno;


}
