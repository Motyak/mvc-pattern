package project;

class Grille extends mvc.Attribute {
	
	public Grille(Ent ent, Ihm ihm)
	{
		super(ent, ihm);
	}
	
	static class Ent implements mvc.Ent {

		private Integer a;
		private Integer b;
		
		public Ent(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
		
		public void test()
		{
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println("fin");
		}
		
		@Override
		public Ihm toIhm() {
			return new Ihm(this.a.doubleValue(), this.b.doubleValue());
		}
		
	}
	
	static class Ihm implements mvc.Ihm {
		
		private Double a;
		private Double b;

		public void test()
		{
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println("fin");
		}
		
		public Ihm(double a, double b)
		{
			this.a = a;
			this.b = b;
		}
		
		@Override
		public Ent toEnt() {
			return new Ent(this.a.intValue(), this.b.intValue());
		}
		
	}
}
