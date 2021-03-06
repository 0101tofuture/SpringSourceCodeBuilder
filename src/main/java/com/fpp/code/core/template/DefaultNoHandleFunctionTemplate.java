package com.fpp.code.core.template;

import com.alibaba.fastjson.annotation.JSONType;
import com.fpp.code.core.config.CodeConfigException;
import com.fpp.code.core.config.Environment;

import java.io.IOException;

/**
 * @author fpp
 * @version 1.0
 * @date 2020/5/19 11:14
 */
@JSONType(serializer = AbstractTemplate.TemplateSerializer.class)
public class DefaultNoHandleFunctionTemplate extends AbstractNoHandleFunctionTemplate {

    public DefaultNoHandleFunctionTemplate() throws CodeConfigException, IOException {
        super(null);
    }

    public DefaultNoHandleFunctionTemplate(String templateName, String templeFileName, Environment environment) throws CodeConfigException, IOException {
        super(templeFileName,environment);
        this.setTemplateName(templateName);
    }


    public DefaultNoHandleFunctionTemplate(String templateName, String templeFileName) throws CodeConfigException, IOException {
        super(templeFileName);
        this.setTemplateName(templateName);
    }

}
