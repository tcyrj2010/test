package com.airport.demo.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airport.demo.bo.Person;
import com.airport.demo.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.util.BaseAction;

@Controller
@RequestMapping("/demo/json")
public class JsonAction extends BaseAction{

	@Resource
	private PersonService personService;
	
	@RequestMapping("/testjson")
	@ResponseBody
	public String testjson(HttpServletRequest request) throws Exception{
		
		//Map<String,Object> map = new HashMap<String,Object>();
        String callback = request.getParameter("callback"); 	//回调函数，获取Jsonp对象 
		Person p = new Person();
		p.setPerson_name("zhangsan");
		p.setPerson_age(15);
		p.setPerson_id(13);
        //map.put("status", "success");  
        //map.put("person", p);  
        ObjectMapper mapper = new ObjectMapper();  
        String result = callback+"("+mapper.writeValueAsString(p)+")";  
		return result;
	}
	
	
	@RequestMapping(value = "/getperson/{id:\\d+}", method = RequestMethod.GET)
	@ResponseBody
    public Person getPerson(@PathVariable("id") int id) {
        //logger.info("获取人员信息id=" + id);
        Person person = personService.getPersonById(id);
        return person;
    }
	
	@RequestMapping(value = "/validatePerson", method = RequestMethod.GET)
	@ResponseBody
    public Person validatePerson() {
        //logger.info("获取人员信息id=" + id);
        Person person = personService.getPersonById(1);
        return person;
    }
	
	
}
