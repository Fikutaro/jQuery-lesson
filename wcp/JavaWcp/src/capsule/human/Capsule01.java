package capsule.human;

public class Capsule01 {
	public static void main(String[] args) {
		
		HumanCapsule human2 = new HumanCapsule("小林", 32);
		System.out.println("名前は" + human2.getName() +"です。");
		System.out.println( "年齢は" + human2.getAge() + "です");
		
		human2.setAge(33);
		System.out.println("誕生日を迎えたので、年齢が" + human2.getAge() + "になりました。");
	}
}
