package test.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.hp.bean.Friendmap;

public interface FriendMapper {
	/**
	 * @�鿴�Լ�����
	 */
	public List<Friendmap> findmyfriend(@Param("userid")Integer userid,@Param("state")Integer state);

	/**
	 * @�鿴������Ϣ
	 */
	public Friendmap findFreind(@Param("fid") Integer fid, @Param("userid") Integer userid);

	/**
	 * @ͬ�����@���ں��� @�֏ͺ���
	 */
	public Integer stateFriend(@Param("fid")Integer fid,@Param("state")Integer state);

	/**
	 * @�ܾ�����
	 */
	public Integer JuFriend(Integer fid);
}
