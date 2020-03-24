package com.anonym.mavenapp.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Author:Anonym
 * 2020/3/24
 * This is slaveof Datasource
 */
@Configuration
@MapperScan(basePackages = "com.lian.springbootapp.slaveofmapper", sqlSessionTemplateRef  = "slaveofSqlSessionTemplate")
public class SlaveofConfig {
    @Bean(name = "slaveofDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.slaveof")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "slaveofSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("slaveofDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/lian/springbootapp/slaveofmapper/*.xml"));
        return bean.getObject();
    }
    @Bean(name = "slaveofTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("slaveofDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name = "slaveofSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("slaveofSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
