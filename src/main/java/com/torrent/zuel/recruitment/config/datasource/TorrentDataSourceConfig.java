package com.torrent.zuel.recruitment.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * torrent
 *
 * @author yan
 * @date 2021/11/27
 **/
@Configuration
@MapperScan(basePackages = {"com.torrent.zuel.recruitment.mapper"},
        sqlSessionFactoryRef = TorrentDataSourceConfig.SESSION_FACTORY_NAME)
public class TorrentDataSourceConfig extends BaseSourceConfig {
    public static final String TRANSACTION_NAME = "torrentTransactionManager";

    public static final String DATA_SOURCE_NAME = "torrentDataSource";
    public static final String DATA_SOURCE_PREFIX = "torrent.datasource";
    public static final String SESSION_FACTORY_NAME = "torrentSqlSessionFactory";
    protected static final String[] ALIAS_PACKAGES = {"com.torrent.zuel.recruitment.model.entity"};

    /**
     * 创建数据源
     *
     * @return 返回数据源
     */
    @Bean(name = DATA_SOURCE_NAME, initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = DATA_SOURCE_PREFIX)
    public DruidDataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 配置事务
     *
     * @return 事务
     */
    @Bean(name = TRANSACTION_NAME)
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    /**
     * 创建SqlSessionFactory对象
     *
     * @param dataSource 数据源
     * @return SqlSessionFactory对象
     * @throws Exception 异常
     */
    @Bean(name = SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE_NAME) DataSource dataSource) throws Exception {
        return super.getSessionFactory(dataSource, ALIAS_PACKAGES);
    }
}
