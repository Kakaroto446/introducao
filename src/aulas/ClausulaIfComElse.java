package aulas;

public class ClausulaIfComElse {

	public static void main(String[] args) {
		int idade = 20;
		if( idade <= 12 ) {
			System.out.println( "criança" );
		}
		else if( idade <= 19 ) {
			System.out.println( "adolescente" );
		}
		else if( idade <= 60 ) {
			System.out.println( "adulto" );
		}
		else {
			System.out.println( "idoso" );
		}
	}

}
