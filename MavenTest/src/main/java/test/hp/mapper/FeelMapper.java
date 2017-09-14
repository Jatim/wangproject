package test.hp.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.hp.bean.Feel;

public interface FeelMapper {
   List<Feel> FindFeel(@Param("userid")Integer userid,@Param("fy")Integer fy);
   Integer AddFeel(Feel feel);
   Integer deleteFeel(Integer feelid);
}
