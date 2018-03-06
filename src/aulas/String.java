package aulas;
public class String {

	public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		java.lang.String str = "Isto é uma String do Java";
		String xyz = new String("Isto é uma String do Java");
		
		if( str == xyz ) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if( str.equals( xyz ) ){
			//MANEIRA CORRETA DE SE COMPARAR O CONTEÚDO DAS STRINGS
		}
		
		System.out.println( "Tamanho da String: " + str.length() );
		
		System.out.println( "SubString: " + str.substring(0, 10) );
		
		System.out.println( "Tamanho da String: " + str.charAt(5) );		

	}

}
