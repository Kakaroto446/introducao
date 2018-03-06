package aulas;

public class String2 {

	public static void main(String[] args) {
		java.lang.String str = "Isto é uma String do Java";
		
		//o método split quebra a String e várias outras
		//pelo separador desejado
		java.lang.String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o índice da palavra na String
		
		if( str.startsWith("Olá") || str.endsWith("Mundo!")){
			//testa o começo e o fim da String - retorna boolean
		}
		
		str = str.trim(); //elimina os espoaços em branco no início e fim
		
		str = str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (usa expressões regulares)
		str = str.replaceAll("String",  "Cadeia de caracteres");
	}

}
