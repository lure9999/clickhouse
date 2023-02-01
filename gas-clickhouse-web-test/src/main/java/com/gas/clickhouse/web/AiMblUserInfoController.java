package com.gas.clickhouse.web;

import com.gas.clickhouse.user.service.AiMblUserInfoService;
import com.gas.clickhouse.user.entity.AiMblUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author lure
 * @title: AiMblUserInfoController
 * @projectName lure-clickhouse
 * @description: TODO
 * @date 2023/1/2311:22
 */
@Controller
public class AiMblUserInfoController {

    @Autowired
    private AiMblUserInfoService aiMblUserInfoService;

    @RequestMapping(value = "/test01")
    @ResponseBody
    public Object test01(){
        Map<String, Object> map = aiMblUserInfoService.selectPage(0, 10, null, null);
        return map;
    }

    /**
     * 按列排序，
     * @return
     */
    @RequestMapping(value = "/test02")
    @ResponseBody
    public Object test02(){
        Map<String, Object> map = aiMblUserInfoService.selectPage(0, 10, null, " ID desc");
        return map;
    }

    /**
     * 条件查询
     * @return
     */
    @RequestMapping(value = "/select")
    @ResponseBody
    public Object test03(){
        AiMblUserInfo info = new AiMblUserInfo();
        info.setCardno("092300101019804");
        Map<String, Object> map = aiMblUserInfoService.selectPage(0,10,info,null);
        return map;
    }

    /**
     * 删除和更新一样，统一是：alter table [tableName] delete where
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(){
        int delete = aiMblUserInfoService.getBaseDao().deleteBySql("alter table wlw_dayvalue delete where Cardno = '45670106f6c2334792e7573a39a0863b'");
        return delete;
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/insert")
    @ResponseBody
    public Object insert(){
        AiMblUserInfo info = new AiMblUserInfo();
        info.setCardno("45670106f6c2334792e7573a39a0863b");
        info.setCreateDate("2023-02-01");
        info.setFid(5);
        info.setUserValue(1.0d);
        info.setMid("45670106");
        int insert = aiMblUserInfoService.insert(info);
        return insert;
    }

    /**
     * 删除和更新一样，统一是：alter table [tableName] update……where……
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(){
        int update = aiMblUserInfoService.getBaseDao().updateBySql("alter table  wlw_dayvalue update UserValue = 5 where Cardno = '45670106f6c2334792e7573a39a0863b'");
        return update;
    }

}
