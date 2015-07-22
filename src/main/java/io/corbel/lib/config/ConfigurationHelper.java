package io.corbel.lib.config;

/**
 * @author Alexander De Leon
 * 
 */
public class ConfigurationHelper {

	public static void setConfigurationNamespace(String namespace) {
		System.setProperty("conf.namespace", namespace);
	}

}
