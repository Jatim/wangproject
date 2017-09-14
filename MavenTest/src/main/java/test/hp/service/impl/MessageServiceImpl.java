package test.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hp.bean.Message;
import test.hp.mapper.MessageMapper;
import test.hp.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
   @Autowired
   private MessageMapper ms;
	public void setMs(MessageMapper ms) {
	this.ms = ms;
   }

	@Override
	public List<Message> findMyAll(Integer uid) {
		return ms.FindByid(uid);
	}

	@Override
	public Boolean AddMes(Message message) {
		return ms.AddMessage(message)>0?true:false;
	}

	@Override
	public Boolean deletemessage(Integer mesid) {
		return ms.DeleteMessage(mesid)>0?true:false;
	}

}
