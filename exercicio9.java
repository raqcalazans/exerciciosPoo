class Exercicio9{
	public static void main(String[] args){

		int i; 
		int[] serieFibonacci = new int[200];
		serieFibonacci[0]=1;
		serieFibonacci[1]=1;
			System.out.println(serieFibonacci[0]);
			for(i = 2; i < 150; i++){
			serieFibonacci[i] = serieFibonacci[i-1] + serieFibonacci[i-2];
				if(serieFibonacci[i] > 150){
					break;
				}
				System.out.println("" +serieFibonacci[i]);
				}
		}
}
