package com.evy.core.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Jonny
 * @Description:
 * @date 2018/8/16下午8:13
 */
@Slf4j
public class SwitchedRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("choose dataSource : {}", DynamicDataSourceHolder.getDataSource());
        return DynamicDataSourceHolder.getDataSource();
    }
}
