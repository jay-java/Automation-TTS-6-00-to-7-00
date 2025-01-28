package core;
abstract class RBI{
	abstract public void interest();//abstract function
	abstract public void HL();
	public static void repoRate() {
		System.out.println("repoRate +-4%");
	}
	public void call() {
		System.out.println("call in abstract class");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI interest : 4%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL : 7%");
	}
	
}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("PNB interest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("PNB HL : 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL : 9%");
	}
	
}
public class P019_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		PNB p = new PNB();
		p.interest();
		p.HL();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		SBI.repoRate();
		PNB.repoRate();
		JAVA.repoRate();
		
	}
}
