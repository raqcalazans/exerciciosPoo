class Exercicio7{
	public static void main(String[] args){
		int i = 100;
		System.out.println("Sequência numérica de x:");

		while(i != 1){
			if(i%2 == 0){
				i = i/2;
			}else if(i%2 == 1){
				i = 3*i + 1;
			}
			System.out.println(i);
		}		
	}
}