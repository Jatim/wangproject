package test.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hp.bean.Visitory;
import test.hp.mapper.VisitoryMapper;
import test.hp.service.VisitoryService;
@Service
public class VisitoryImpl implements VisitoryService {
   @Autowired
   private VisitoryMapper visitm;
	public void setVisitm(VisitoryMapper visitm) {
	this.visitm = visitm;
}

	@Override
	public List<Visitory> FindVisitById(Integer uid) {
		return visitm.findvisitById(uid);
	}

}
