package test.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.hp.bean.Friendmap;

public interface FriendMapper {
	/**
	 * @查看自己好友
	 */
	public List<Friendmap> findmyfriend(@Param("userid")Integer userid,@Param("state")Integer state);

	/**
	 * @查看好友信息
	 */
	public Friendmap findFreind(@Param("fid") Integer fid, @Param("userid") Integer userid);

	/**
	 * @同意好友@拉黑好友 @恢復好友
	 */
	public Integer stateFriend(@Param("fid")Integer fid,@Param("state")Integer state);

	/**
	 * @拒绝好友
	 */
	public Integer JuFriend(Integer fid);
}
