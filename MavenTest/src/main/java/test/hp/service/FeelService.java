package test.hp.service;

import java.util.List;

import test.hp.bean.Feel;


public interface FeelService {
   public List<Feel> FindAll(Integer userid,Integer fy);
   public Boolean AddFeel(Feel feel);
   public Boolean deletefeel(Integer feelid);
}
