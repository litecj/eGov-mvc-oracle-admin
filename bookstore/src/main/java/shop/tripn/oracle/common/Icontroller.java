package shop.tripn.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface Icontroller {
	
	public String save (@RequestBody Object o);
	public Object findById (String id);
	public List<?> findAll();
	public String update(@RequestBody Object o);
	public Object delete(String id);
	

}
