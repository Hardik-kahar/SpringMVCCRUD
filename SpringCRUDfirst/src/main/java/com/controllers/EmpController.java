package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DAO.EmpDAO;
import com.bean.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO dao;
	@RequestMapping("/AddEmp")
	public String regpage() {
		return "AddEmp";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRecord(@ModelAttribute("emp") Emp emp) {
		int a = dao.insertData(emp);
		if (a > 0) {
			System.out.println("done");
		} else {
			System.out.println("not done");
		}
		return "redirect:/view";
	}
	
	@RequestMapping("/view")
	public String viewAll(Model m) {
		List<Emp> list = dao.getAllData();
		m.addAttribute("list", list);
		return "view";

	}
	@RequestMapping(value = "/edit/{id}")
	public String updateData(@PathVariable int id,Model m)
	{
		Emp e=dao.getDataById(id);
		m.addAttribute("e", e);
		return "update";
		
	}
	@RequestMapping(value = "/updateData", method = RequestMethod.POST)
	public String updateFinal(@ModelAttribute("emp") Emp emp) {
		int a = dao.updatebyId(emp);
		if (a > 0) {
			System.out.println("done");
		} else {
			System.out.println("not done");
		}
		return "redirect:/view";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteData(@PathVariable int id, Model m) {
		int x = dao.deletebyId(id);
		if (x > 0) {
			return "redirect:/view";
		} else {
			return "error";
		}
	}

}
