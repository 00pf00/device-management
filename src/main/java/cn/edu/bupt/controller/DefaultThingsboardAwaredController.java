package cn.edu.bupt.controller;

import cn.edu.bupt.utils.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tangjialiang on 2018/1/10.
 *
 * - 包含了一些thingsboard的基本信息
 * - 包含了一些基本的处理方法
 */


public class DefaultThingsboardAwaredController {

    @Value("${bupt.thingsboard.host}")
    String thingsboardHost ;

    @Value("${bupt.thingsboard.port}")
    String thingsboardPort ;

    @Autowired
    HttpServletRequest request;

    @Autowired
    ResponceUtil responceUtil ;

    protected String getServer() {
        return thingsboardHost+":"+thingsboardPort ;
    }

    protected String retSuccess(String msg) {
        return responceUtil.onSuccess(msg) ;
    }

    protected String retFail(String msg) {
        return responceUtil.onFail(msg) ;
    }
}
