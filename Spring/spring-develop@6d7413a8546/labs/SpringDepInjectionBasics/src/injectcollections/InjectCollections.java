package injectcollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class InjectCollections {

    private Map<?, ?> map;
    private Properties props;
    private Set<?> set;
    private List<?> list;
    
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	public Map<?, ?> getMap() {
		return map;
	}
	public void setMap(Map<?, ?> map) {
		this.map = map;
	}
	
	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public Set<?> getSet() {
		return set;
	}
	
	public void setSet(Set<?> set) {
		this.set = set;
	}
    
    
    
}
