package com.fpp.code.core.config;

import com.fpp.code.core.domain.DataSourceConfig;
import com.fpp.code.core.domain.ProjectTemplateInfoConfig;

/**
 * 核心配置文件
 * @author fpp
 * @version 1.0
 * @date 2020/6/30 18:11
 */
public class CoreConfig {
    /**
     * 数据配置
     */
    private DataSourceConfig dataSourceConfig;
    /**
     * 项目配置
     */
    private ProjectTemplateInfoConfig projectTemplateInfoConfig;

    public CoreConfig(DataSourceConfig dataSourceConfig, ProjectTemplateInfoConfig projectTemplateInfoConfig) {
        this.dataSourceConfig = dataSourceConfig;
        this.projectTemplateInfoConfig = projectTemplateInfoConfig;
    }

    public DataSourceConfig getDataSourceConfig() {
        return dataSourceConfig;
    }

    public void setDataSourceConfig(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    public ProjectTemplateInfoConfig getProjectTemplateInfoConfig() {
        return projectTemplateInfoConfig;
    }

    public void setProjectTemplateInfoConfig(ProjectTemplateInfoConfig projectTemplateInfoConfig) {
        this.projectTemplateInfoConfig = projectTemplateInfoConfig;
    }

    @Override
    public String toString() {
        return "CoreConfig{" +
                "dataSourceConfig=" + dataSourceConfig +
                ", projectTemplateInfoConfig=" + projectTemplateInfoConfig +
                '}';
    }
}
