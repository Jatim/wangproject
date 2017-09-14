package test.hp.service;

import java.util.List;

import test.hp.bean.Message;


public interface MessageService {
   public List<Message> findMyAll(Integer uid);
   public Boolean AddMes(Message message);
   public Boolean deletemessage(Integer mesid);
}
