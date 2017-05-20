
public class palindromeCheck {
	public boolean method(String s){
		if (s.length() == 1) {
			return true;
		} else {
			if (s.substring(0,1).equals(s.substring(s.length()-1))){
				s = s.substring(1,s.length()-1);
				method(s);
			} else {
				return false;
			}
		}
		return true;
	}
	public  void main(String[] args) {
		System.out.print(method("tacocat"));
		System.out.print(method("nn"));
	}
}
