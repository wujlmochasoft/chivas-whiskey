package me.wujl.whiskey.chivas.dao;

import me.wujl.whiskey.commons.log.BaseLogger;

/**
 * @author wujl
 * @version V1.0
 * @Title: chivas-whiskey
 * @Package me.wujl.whiskey.chivas.dao
 * @Description:
 * @date 2017-02-21 17:49
 */

public class Drink extends BaseLogger{

    public void drinkWhiskey(){
        System.out.println("===============================from "+getClass().getSimpleName());
        logger.info("info-msg");
        logger.error("error-msg");
        logger.debug("debug-msg");
        logger.warn("warn-msg");
    }
}
