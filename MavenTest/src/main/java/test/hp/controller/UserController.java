package test.hp.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.hp.bean.User;
import test.hp.bean.Visitory;
import test.hp.service.UserService;
import test.hp.service.VisitoryService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userservice;
    public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	@Autowired
	private VisitoryService visits;
	public void setVisits(VisitoryService visits) {
		this.visits = visits;
	}
	
    @RequestMapping("/dl")
    public String dl(){
    	return "/login";
    }
	/**
	 * @µÇÂ½
	 * */
    @RequestMapping(value={"/login"},method=RequestMethod.POST)
    public String login(@Valid User user,BindingResult result ,Model model,HttpSession session){
	  /*if(result.getErrorCount()>0){
		  
		  return "login";
	  }*/
		  User u=userservice.FindByUnameAndPwd(user.getQq(),user.getPassword());
			 if(u!=null){
				List<Visitory> visit=visits.FindVisitById(u.getUserid());
				model.addAttribute("visit",visit);
				session.setAttribute("user", u);
				session.setAttribute("userid",u.getUserid());
				//ï¿½ï¿½È¡ï¿½ï¿½Ç°ÏµÍ³Ê±ï¿½ï¿½
				Date date=new Date();
				//ï¿½ï¿½È¡Ê±ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Î»ï¿½ï¿½ï¿½ë£?
				Timestamp time=new Timestamp(date.getTime());
				//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ý¿ï¿½
				u.setLastvisit(time);
				model.addAttribute("other","feelindex");
				if(userservice.UpdateUser(u)){
					return "index";
				}else {
					return "error";
				}
			 }
    
	 return "login";
	}
    /**
     * @×¢²á
     * */
    @RequestMapping(value={"/regist"},method=RequestMethod.POST)
    public String regist(User user,ModelMap model){
    	Random random=new Random();
    	String qq=String.valueOf(random.nextInt(1000000000));
        while(userservice.FindByQq(qq)){
        	qq=String.valueOf(random.nextInt(1000000000));
        }
    	user.setQq(qq);
    	if(userservice.AddUser(user)){
    		model.addAttribute("user", user);
        	return "register_suc";
    	}
    	return "regist";
    }
    /**
     *@ÐÞ¸Ä¸öÈËÐÅÏ¢ 
     **/
    @RequestMapping("/updateuser")
    public String updateuser(Model model,HttpSession session){
    	User user=(User) session.getAttribute("user");
    	model.addAttribute("user",user);
    	return "modifyInfor";
    }
}
