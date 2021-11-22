package com.finastra.commons;

import lombok.Getter;

import java.util.Map;

public class XsdPathTypeGeneratorUsingApacheXmlBeanApplication {

    private final String[] paths = {
//            "/HMRC-Trusts-2020-v1-0-20190925/SAtrust-v1-0.xsd",
//            "/HMRC-Trusts-2020-v1-0-20190925/SAelements-v1-1.xsd",
            "/pain.001.001.11.xsd"
    };

    @Getter
//    Map<String, String> pathTypes = new XsdPathTypeGenerator().generateMap("IRenvelope", paths);
    Map<String, String> pathTypes = new XsdPathTypeGenerator().generateMap("Document", paths);

    public static void main(String[] args) {
        XsdPathTypeGeneratorUsingApacheXmlBeanApplication application = new XsdPathTypeGeneratorUsingApacheXmlBeanApplication();
        application.printPathTypes();
    }

    public void printPathTypes() {
        getPathTypes().keySet().stream().forEach(System.out::println);
    }
}
