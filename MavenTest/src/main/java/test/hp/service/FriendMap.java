package test.hp.service;

import java.util.List;

import test.hp.bean.Friendmap;

public interface FriendMap {
    public List<Friendmap> findmyfriend(Integer userid,Integer state);
    public Friendmap findfriend(Integer sid,Integer userid);
    public Boolean stateFriend(Integer fid,Integer state);
    public Boolean juFriend(Integer fid);
}
