package test.hp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.hp.bean.Friendmap;
import test.hp.service.FriendMap;
@Controller
@RequestMapping("/")
public class FriendMapController {
	@Autowired
	private FriendMap friendMap;
	public void setFriendMap(FriendMap friendMap) {
		this.friendMap = friendMap;
	}
	
	@RequestMapping("/findmyfriend")
	public String findmyfriend(ModelMap map,HttpSession session){
		Integer state;
		List<Friendmap> pt=friendMap.findmyfriend((Integer) session.getAttribute("userid"),state=1);
		List<Friendmap> lahei=friendMap.findmyfriend((Integer) session.getAttribute("userid"),state=-1);
		List<Friendmap> qingqiu=friendMap.findmyfriend((Integer) session.getAttribute("userid"),state=0);
		map.addAttribute("friend", pt);
		map.addAttribute("lahei", lahei);
		map.addAttribute("qingqiu", qingqiu);
		return "showfriends";
	}
	@RequestMapping("/showinfor")
	public String findfriend(@RequestParam("friendid") Integer fid,ModelMap map,HttpSession session){
	    Friendmap fm=friendMap.findfriend(fid,(Integer) session.getAttribute("userid"));
	    if(fm!=null){
	    	map.addAttribute("friend", fm);
	    	return "friendinfo";
	    }
		return "findmyfriend";
		
	}
	/**
	 * @拒绝好友
	 * */
	@RequestMapping("/outfriend")
	public String JuFriend(@RequestParam("friendmapid")Integer friendmapid){
		if(friendMap.juFriend(friendmapid)){
			return "redire:/findmyfriend";
		}
		return "redire:/showinfor";
	}
	/**
	 * @同意好友
	 * */
	@RequestMapping("/agreeFriend")
	public String TongFriend(@RequestParam("friendmapid")Integer friendmapid){
		Integer state=1;
		if(friendMap.stateFriend(friendmapid,state)){
			return "redire:/findmyfriend";
		}
		return "redire:/showinfor";
	}
	/**
	 * @拉黑好友
	 * */
	@RequestMapping("/blackFriend")
	public String blackfriend(@RequestParam("friendmapid")Integer friendmapid){
		Integer state=-1;
		if(friendMap.stateFriend(friendmapid,state)){
			return "redire:/findmyfriend";
		}
		return "redire:/showinfor";
	}
	/**
	 * @恢复好友
	 * */
	@RequestMapping("/hfFriend")
	public String hffriend(@RequestParam("friendmapid")Integer friendmapid){
		Integer state=1;
		if(friendMap.stateFriend(friendmapid,state)){
			return "redire:/findmyfriend";
		}
		return "redire:/showinfor";
	}
}
