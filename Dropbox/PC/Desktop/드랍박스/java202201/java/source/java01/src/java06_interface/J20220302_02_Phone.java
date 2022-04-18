package java06_interface;

interface Call{
	void call();
}
interface Photo{
	void photo();
}
class OldPhone implements Call, Photo{
	//전화걸기
	@Override
	public void call() {
		System.out.print("구형폰 전화 걸기 ");
	}

	@Override
	public void photo() {
		System.out.print("구형폰 사진 찍기");
	}

}
class NewPhone implements Call, Photo{
	@Override
	public void call() {
		System.out.print("신형폰 전화 걸기 ");
	}

	@Override
	public void photo() {
		System.out.print("신형폰 사진 찍기");
	}
}
//폰관리
class PhoneManage{
	void calling(Call call) {
		call.call();
		System.out.println("통화중....");
	}
	void takePhoto(Photo photo) {
		photo.photo();
		System.out.println(" 찰칵");
	}
}

public class J20220302_02_Phone {
	public static void main(String[] args) {
		PhoneManage pm = new PhoneManage();
		OldPhone oldp = new OldPhone();
		NewPhone newp = new NewPhone();
		pm.calling(oldp);
		pm.calling(newp);
		pm.takePhoto(newp);
		pm.takePhoto(oldp);
		

		
	}

}
