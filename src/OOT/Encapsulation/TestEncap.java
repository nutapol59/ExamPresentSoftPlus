public class TestEncap {

	public static void main(String[] args){

		StudentA st = new StudentA();
		// st.name = "nut"; //can't
		st.setName("NUTAPOL");
		st.setLastname("Khemayothin");

		System.out.println(st.getName());
		System.out.println(st.getLastname());
		
	}
}