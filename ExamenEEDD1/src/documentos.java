/**
 * 
 * @author sara jordana
 *@version 1.0
 *@see http://google.com
 */
public class documentos {
	
	/**
	 * @since http://Oracle.com
	 * @param args donde se va a ejecutar el m�todo main
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
    * @param num que contendr� un valor int num�rico 
    */
	public static void setNum(int num) {
		documentos.numero = num;
	}
   
	public static void parOimpar() { //aqu� se realiza la funci�n que determina si el num es par o impar
		

		if(numero%2==0){
			
			System.out.println("el numero es par");
			
			
		}else {
			

			System.out.println("el numero es impar");
			
		}
			
	}
	/**
	 * 
	 * @param args donde se va ejecutar la funci�n main y la funci�n parOimpar
	 */
	public static void main(String[]args) {
		
		parOimpar();
	}
	
	
	
}
