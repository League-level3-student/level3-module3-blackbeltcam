package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String mcs="";
		String temp="";
		
		
		
		for(int i=0; i<s.length(); i++) {
			
			if(i%2==1) {
				temp=s.substring(i, i+1);
				temp=temp.toUpperCase();
				mcs+=temp;
				temp="";
				
				
			}
			else if(i%2==0) {
				temp=s.substring(i, i+1);
				temp=temp.toLowerCase();
				mcs+=temp;
				
				temp="";
				
			}
		}
		
		
		
		System.out.println(mcs);
		
		return mcs;
	}

}
