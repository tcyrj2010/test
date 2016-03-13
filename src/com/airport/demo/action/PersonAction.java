package com.airport.demo.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airport.demo.bo.Person;
import com.airport.demo.service.PersonService;
import com.util.BaseAction;

@Controller
@RequestMapping("/demo/person")
public class PersonAction extends BaseAction{

	@Resource
	private PersonService personService;
	
	@RequestMapping("/list")
	public String getList(Model model, HttpServletRequest request) {
		List<Person> personList = personService.getAll();
		request.setAttribute("personlist", personList);
		//���Ի�ȡ��ǰ�û�
		System.out.println("ϵͳ��̨��ȡ�û�:" + this.getLoginUser().getUsername());
		return "/demoPage/personList.jsp";
	}
	
	@RequestMapping("/insert")
	public String insert(Person person) {
		personService.insert(person);
		return "/demo/person/list";
	}
	

}
