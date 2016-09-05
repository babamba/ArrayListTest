import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
//		<E> : 제네릭이라 부르며 ArrayListdp 저장할 데이터의 타입을 반드시 클래스로 적는다.
//		만약에 저장시킬 데이터가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼 클랩스 이름을 적는다.
//		랩퍼 클래스는 기본 자료형 이름의 첫 문자만 대문자로 쓰면되고 int와 char는 풀네임을 적으면 된다.
		
		//제네릭
//		ArrayList list = new ArrayList();						//JDK 1.4 이전 코딩방법		
//		ArrayList<String> list = new ArrayList<String>();		//JDK 1.5 이후 코딩방법		
		ArrayList<String> list = new ArrayList<>();				//JDK 1.7 이후 코딩방법		
		
		list.add("홍길동");										// add(value) : ArrayList 의 맨 뒤에 value를 추가한다.
		list.add("임꺽정");										// 중복되는 데이터도 입력된다.
		list.add("이몽룡");										
		list.add("일지매");
		list.add(2, "장길산");									// add(index, value) : ArrayList 의 index 번째 위치에 value를 삽입한다.
		
		System.out.println(list.size() + " : " + list);			// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.  
		
		System.out.println(list.get(1));						// get(index) : ArrayList의 index번째 위치에 value를 얻어온다.
		
		
		list.set(2, "루팡");									// set(index, value) : ArrayList의 index번째 위치의 값을 value로 수정한다.
		System.out.println(list.size() + " : " + list);   		
		
		list.remove(2);											// remove(index) : ArrayList의 index 번째 값을 제거한다.
		System.out.println(list.size() + " : " + list);  		
		
		list.clear();											// clear() : ArrayList의 모든 값을 제거한다.
		System.out.println(list.size() + " : " + list);
	}
}
