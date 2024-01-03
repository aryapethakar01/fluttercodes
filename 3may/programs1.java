class Demo{
	public static void main(String [] Arya){
		int x =10;
		int y =10;
		int u=11;

		int z=200;
		int p=200;
		int q=250;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(u));
		System.out.println();
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(q));
	}
}
