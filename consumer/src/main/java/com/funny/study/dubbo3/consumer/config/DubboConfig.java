package com.funny.study.dubbo3.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fangli
 */
@Configuration
@ImportResource("classpath:dubbo/*.xml")
public class DubboConfig {
}
