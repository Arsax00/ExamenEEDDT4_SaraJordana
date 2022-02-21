/**
 * 
 * @author sara jordana
 *@version 1.0
 *@see http://google.com
 */
public class documentos {
	
	/**
	 * @since http://Oracle.com
	 * @param args donde se va a ejecutar el método main
	 *
	 */
	static int numero;	
	
	public documentos() {//constructor
		super();
		numero=10;
	}
   /**
    * 
    * @return la variable num  
    */
	public static int getNum() {
		return numero;
	}
   /**
    * 
    * @param num que contendrá un valor int numérico 
    */
	public static void setNum(int num) {
		documentos.numero = num;
	}
   
	public static void parOimpar() { //aquí se realiza la función que determina si el num es par o impar
		

		if(numero%2==0){
			
			System.out.println("el numero es par");
			
			
		}else {
			

			System.out.println("el numero es impar");
			
		}
			
	}
	/**
	 * 
	 * @param args donde se va ejecutar la función main y la función parOimpar
	 */
	public static void main(String[]args) {
		
		parOimpar();
	}
	
	
	
}
