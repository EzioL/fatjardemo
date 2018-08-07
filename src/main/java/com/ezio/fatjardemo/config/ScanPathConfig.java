package com.ezio.fatjardemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
/**
 * Here be dragons
 * Created by haotian on 2018/8/7 下午2:58
 */

@Configuration
@EnableSpringConfigured
@ComponentScan(basePackages = {
    "com.ezio.fatjardemo"})
public class ScanPathConfig {


}
