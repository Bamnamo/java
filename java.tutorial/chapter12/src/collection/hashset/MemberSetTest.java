package collection.hashset;

import collection.Member;

public class MemberSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet =  new MemberHashSet();
		
		Member MemberLee = new Member(1001, "이지언");
		Member MemberSon = new Member(1002, "손민국");
		Member MemberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(MemberLee);
		memberHashSet.addMember(MemberSon);
		memberHashSet.addMember(MemberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
