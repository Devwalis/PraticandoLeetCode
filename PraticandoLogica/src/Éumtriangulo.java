public clss Eumtriangulo{


	public static boolean eumTriangulo(int a, int b, int c){
	
		return a > 0 && b > 0 && c > 0
			&& (a + b > c)
			&& (a + c > b)
			&& (b + c > a);
}
	}
