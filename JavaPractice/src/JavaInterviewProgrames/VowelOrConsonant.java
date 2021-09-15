package JavaInterviewProgrames;

public class VowelOrConsonant {

	public static void main(String[] args) {

		checkCharacter('e');
		checkCharacter('b');
		checkCharacter('x');

	}

	public static void checkCharacter(char c) {

//		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//			System.out.println(c + " is Vowel");
//		}else {
//			System.out.println(c + " is Consonant");
//		}

		switch (c) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is Vowel");
			break;

		default:
			System.out.println(c + " is Consonant");
			break;

		}

	}

}
