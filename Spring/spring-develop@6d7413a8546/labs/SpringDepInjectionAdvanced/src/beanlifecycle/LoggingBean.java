package beanlifecycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanNameAware;

public class LoggingBean implements BeanNameAware {
	
	private static final Log logger = LogFactory.getLog(LoggingBean.class);
	private String name;

	public void setBeanName(String name) {
		this.name = name;
	}

	public void run() {
		if (logger.isInfoEnabled()) {
			logger.info("Bean name " + this.name);
		}
	}
}