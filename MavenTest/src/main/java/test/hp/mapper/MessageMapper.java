package test.hp.mapper;

import java.util.List;

import test.hp.bean.Message;

public interface MessageMapper {
    List<Message> FindByid(Integer uid);
    Integer AddMessage(Message message);
    Integer DeleteMessage(Integer mesid);
}
