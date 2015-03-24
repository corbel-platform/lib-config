/*
 * Copyright (C) 2013 StarTIC
 */
package com.bq.oss.lib.config;

/**
 * @author Alexander De Leon
 * 
 */
public class ConfigurationHelper {

	public static void setConfigurationNamespace(String namespace) {
		System.setProperty("conf.namespace", namespace);
	}

}
