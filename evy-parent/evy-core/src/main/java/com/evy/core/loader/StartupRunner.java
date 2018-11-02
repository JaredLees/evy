package com.evy.core.loader;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @author Jonny
 * @date 2018/4/10
 */
@Component
public class StartupRunner implements CommandLineRunner{

    private static final Logger LOGGER = Logger.getLogger(StartupRunner.class);

    @Autowired
    private List<AfterStartupLoader> startupLoaderList;

    @Override
    public void run(String... args) throws Exception {
        if(startupLoaderList!=null&&!startupLoaderList.isEmpty()){
            startupLoaderList.forEach(afterStartupLoader->{
                afterStartupLoader.load();
                LOGGER.debug("StartupRunner run ...");
            });
        }
    }
}
