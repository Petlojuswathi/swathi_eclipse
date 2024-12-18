
class Phone1 {
	public void voiceCall() {
		System.out.println("Voice calling with Phone");
	}
}
class SmartPhone1 extends Phone1 {
	public void videoCall() {
		System.out.println("Video calling with SmartPhone");
	}
}
class Communication{
	public void call(Phone1 p) {
		p.voiceCall();
	}
	public void call(SmartPhone1 sm) {
		sm.videoCall();
	}
}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Phone1 p1 = new Phone1();
		SmartPhone1 sp = new SmartPhone1();
		Phone1 p2 = new SmartPhone1();
		
		Communication comm = new Communication();
		comm.call(p1);
		comm.call(sp);
		comm.call(p2);
	}
}
