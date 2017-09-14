package test.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hp.bean.Friendmap;
import test.hp.mapper.FriendMapper;
import test.hp.service.FriendMap;

@Service
public class FriendMapImpl implements FriendMap {
	@Autowired
	private FriendMapper fm;
	public void setFm(FriendMapper fm) {
		this.fm = fm;
	}

	@Override
	public List<Friendmap> findmyfriend(Integer userid,Integer state) {
		return fm.findmyfriend(userid,state);
	}

	@Override
	public Friendmap findfriend(Integer sid,Integer userid) {
		return fm.findFreind(sid,userid);
	}

	@Override
	public Boolean stateFriend(Integer fid,Integer state) {
		return fm.stateFriend(fid,state)>0?true:false;
	}

	@Override
	public Boolean juFriend(Integer fid) {
		return fm.JuFriend(fid)>0?true:false;
	}


}
