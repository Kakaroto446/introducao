package aulas;

public class String2 {

	public static void main(String[] args) {
		java.lang.String str = "Isto � uma String do Java";
		
		//o m�todo split quebra a String e v�rias outras
		//pelo separador desejado
		java.lang.String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o �ndice da palavra na String
		
		if( str.startsWith("Ol�") || str.endsWith("Mundo!")){
			//testa o come�o e o fim da String - retorna boolean
		}
		
		str = str.trim(); //elimina os espoa�os em branco no in�cio e fim
		
		str = str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (usa express�es regulares)
		str = str.replaceAll("String",  "Cadeia de caracteres");
	}

}
