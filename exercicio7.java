class Exercicio7{
	public static void main(String[] args){
		int i, n1 = 1, n2 = 1; n3 = 2;
			System.out.println(""+n1+"\n"+n2);
			for(i = 3; i < 150; i++){
				System.out.println("" +n3);
					n1 = n2;
					n2 = n3;
					n3 = n1 + n2;
				}
		}
}