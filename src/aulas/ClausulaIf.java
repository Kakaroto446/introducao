package aulas;

public class ClausulaIf {

	public static void main(String[] args) {
		int idade = 20;
		if( idade <= 12 ) {
			System.out.println( "crian�a" );
		}
		if( idade > 12 && idade <= 19 ) {
			System.out.println( "adolescente" );
		}
		if( idade > 19 && idade <= 60 ) {
			System.out.println( "adulto" );
		}
		if( idade > 60 ) {
			System.out.println( "idoso" );
		}

	}

}
