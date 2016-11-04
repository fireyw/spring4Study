package net.madvirus.spring4.chap06.member;

public interface MemberService {

	void regist(MemberRegRequest memberRegReq);

	boolean update(String id, UpdateInfo updateInfo);
	boolean update2(String id, UpdateInfo updateInfo, String msg);
}
