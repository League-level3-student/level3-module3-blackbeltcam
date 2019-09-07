package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		boolean cap=false;
		
		for(int i=0; i<=s.length(); i++) {
			if(cap) {
				s.charAt(i);
				
				cap=false;
			}
			else if(!cap) {
				cap=true;
			}
		}
		return "";
	}

}
