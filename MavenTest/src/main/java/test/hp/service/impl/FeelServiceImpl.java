package test.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hp.bean.Feel;
import test.hp.mapper.FeelMapper;
import test.hp.service.FeelService;

@Service
public class FeelServiceImpl implements FeelService {
   @Autowired
   private FeelMapper feel;
	public void setFeel(FeelMapper feel) {
	this.feel = feel;
}

	@Override
	public List<Feel> FindAll(Integer userid,Integer fy) {
		return feel.FindFeel(userid,fy);
	}

	@Override
	public Boolean AddFeel(Feel fl) {
		return feel.AddFeel(fl)>0?true:false;
	}

	@Override
	public Boolean deletefeel(Integer feelid) {
		return feel.deleteFeel(feelid)>0?true:false;
	}

}
