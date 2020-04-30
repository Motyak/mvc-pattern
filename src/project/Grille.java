package project;

//	created by json file
class Grille extends mvc.Attribute {
	
	public Grille(Ent ent, Ihm ihm)
	{
		super(ent, ihm);
	}
	
	static class Ent implements mvc.Ent {
		
		public Ent(int a, int b)
		{

		}

		@Override
		public Ihm toIhm() 
		{
//			stub
			return null;
		}
		
	}
	
	static class Ihm implements mvc.Ihm {
	
		public Ihm(double a, double b)
		{
			
		}
		
		@Override
		public Ent toEnt() 
		{
//			stub
			return null;
		}
		
	}
}
