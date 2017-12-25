package com.hxkj.common.config;

import com.hxkj.common.constant.Constant;
import com.hxkj.read.controller.NovelController;
import com.jfinal.config.Routes;

public class ReadRoute extends Routes {
    @Override
    public void config() {
        add("/novel", NovelController.class, Constant.VIEW_PATH);
    }
}
