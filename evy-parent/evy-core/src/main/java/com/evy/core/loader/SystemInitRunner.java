package com.evy.core.loader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jonny
 * @date 2018/4/10
 */
@Slf4j
@Component
public class SystemInitRunner implements AfterStartupLoader{
    @Override
    public void load() {
        log.debug(AfterStartupLoader.class.getCanonicalName()+" loading...");
    }
}
