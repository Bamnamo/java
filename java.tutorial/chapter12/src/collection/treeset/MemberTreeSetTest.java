package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member MemberPark = new Member(1003, "박서훤");
		Member MemberLee = new Member(1001, "이지원");
		Member MemberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(MemberLee);
		memberTreeSet.addMember(MemberSon);
		memberTreeSet.addMember(MemberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong =  new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
		
		
		
	}
	}


