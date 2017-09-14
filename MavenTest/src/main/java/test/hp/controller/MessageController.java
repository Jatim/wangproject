package test.hp.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test.hp.bean.Message;
import test.hp.service.MessageService;

@Controller
@RequestMapping("/")
public class MessageController {
	@Autowired
	private MessageService ms;

	public void setMs(MessageService ms) {
		this.ms = ms;
	}
     @RequestMapping("/message")
	public String findMyAll(HttpSession session,ModelMap model){
    	 if(session.getAttribute("userid")!=null){
    		 Integer userid=(Integer) session.getAttribute("userid");
        	 List<Message> message=ms.findMyAll(userid);
        	 if(message.size()>0){
                model.addAttribute("message",message);
        		 return "message";
        	 }
    	 }
    	 return "404";
	}
     @RequestMapping(value={"/addmessage"},method=RequestMethod.POST)
     public String add(Message message,HttpSession session){
    	 message.setMessagetime(new Timestamp(new Date().getTime()));
    	 message.setParentmessageid((Integer) session.getAttribute("userid"));
    	 if(ms.AddMes(message)){
    		 return "redirect:/message";
    	 }
    	 return "404";
     }
     
     @RequestMapping("/deletemessage")
     public String delete(@RequestParam("messageid") Integer messageid){
    	 if(ms.deletemessage(messageid)){
        	 return "redirect:message";
    	 }
    	 return "404";
     }
}
