package annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("simplestBean")
@Scope("prototype")
public class SimplestBean {

  
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SimplestBean");
        sb.append("{xx}");
        return sb.toString();
    }
}