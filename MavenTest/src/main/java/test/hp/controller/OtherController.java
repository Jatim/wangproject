package test.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class OtherController {
	@RequestMapping("/")
    public String index(){
	   return "/login";
    }
    @RequestMapping("/reg")
    public String reg(){
    	return "regist";
    }
	@RequestMapping("/hostinfor")
    public String hostinfor(Model map){
		map.addAttribute("other", "hos");
	   return "index";
    }
	@RequestMapping("/hos")
	 public String hos(Model map){
		map.addAttribute("other", "hostinfor");
	   return "hostinfor";
    }
	@RequestMapping("/asd")
    public String feelindex(ModelMap model){
		model.addAttribute("other", "feelindex");
	   return "index";
    }
	@RequestMapping("/ms")
	 public String ms(Model map){
		map.addAttribute("other", "message");
	   return "index";
   }
	@RequestMapping("/askforfriend")
	 public String myf(){
	   return "askforfriend";
  }
}
