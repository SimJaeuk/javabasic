package object.hashCode;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 "심자바"를 저장함
		hashMap.put(new Key(1), "심자바");
		
		//식별키로 "심자바"를 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
	}

}
