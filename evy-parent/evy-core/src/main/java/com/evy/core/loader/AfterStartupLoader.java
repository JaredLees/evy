package com.evy.core.loader;

/**
 * 应用启动加载类，如需应用启动的时候加载某些东西，实现此接口即可，无需别的操作。
 * @author Jonny
 * @date 2018/4/10
 */
public interface AfterStartupLoader {

    /**
     * 初始化启动方法
     */
    void load();
}
