package net.madvirus.spring4.chap06.member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void regist(MemberRegRequest memberRegReq) {
		System.out.println("MemberServiceImpl.regist() 호출됨");
	}

	@Override
	public boolean update(String id, UpdateInfo updateInfo) {
		System.out.println("MemberServiceImpl.update() 호출됨");
		return true;
	}
	
	@Override
	public String update2(String id, UpdateInfo updateInfo, String msg) {
		System.out.println("MemberServiceImpl.update222222222222 () 호출됨");
		return msg;
	}

}
