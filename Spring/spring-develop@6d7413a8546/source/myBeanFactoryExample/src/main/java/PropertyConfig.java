import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Property configuration class.
 */
@Configuration
@PropertySource(value={"classpath:application.properties"}, ignoreResourceNotFound = true)
public class PropertyConfig {

    /**
     * Property placeholder configurer needed to process @Value annotations
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Value( "${id}" )
    private String id;

    @Value( "${className}" )
    private String className;

    @Value( "${fieldName}" )
    private String fieldName;

    @Value( "${fieldValue}" )
    private String fieldValue;

    @Value( "${beanType}" )
    private String beanType;

    @Override
    public String toString() {
        return "PropertyConfig{" +
            "id='" + id + '\'' +
            ", className='" + className + '\'' +
            ", fieldName='" + fieldName + '\'' +
            ", fieldValue='" + fieldValue + '\'' +
            ", beanType='" + beanType + '\'' +
            '}';
    }

    // Getters, setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getBeanType() {
        return beanType;
    }

    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

}


