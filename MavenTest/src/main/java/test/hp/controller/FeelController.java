package test.hp.controller;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test.hp.bean.Feel;
import test.hp.bean.User;
import test.hp.service.FeelService;


@Controller
@RequestMapping("/")
public class FeelController {
    @Autowired
    private FeelService feelservice;
	public void setFeelservice(FeelService feelservice) {
		this.feelservice = feelservice;
	}
	@RequestMapping("/feelindex")
    public String findAll(ModelMap model,HttpSession session){
		User user=(User) session.getAttribute("user");
		Integer fy=0;
    	List<Feel> feel=feelservice.FindAll(user.getUserid(),fy);
    	if(feel.size()>0){
        	model.addAttribute("feel",feel);
        	List count=new ArrayList();
        	for (int i = 0; i < feel.size(); i++) {
				count.add(i);
			}
        	model.addAttribute("count",count);
        	return "feelindex";
    	}
    	return "as";
    }
	@RequestMapping(value={"/AddFeel"},method=RequestMethod.POST)
	public String addfeel(Feel feel,HttpSession session){
		User u=(User) session.getAttribute("user");
		feel.setUserid(u.getUserid());
		feel.setFeeltime(new Timestamp(new Date().getTime()));
		feel.setUser(u);
		if(feelservice.AddFeel(feel)){
			return "redirect:/feelindex";	
		}
		return "404";
	    }
	@RequestMapping("deleteFeel")
	public String deleteFeel(@RequestParam("feelid")Integer feelid){
		if(feelservice.deletefeel(feelid)){
			return "redirect:/feelindex";
		}
		return "404";
	}
}
