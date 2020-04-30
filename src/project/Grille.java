package project;

//	created by json file
class Grille extends mvc.Attribute {
	
	public Grille(Ent ent, Ihm ihm)
	{
		super(ent, ihm);
	}
	
	static class Ent implements mvc.Ent {

		@Override
		public Ihm toIhm() 
		{
//			stub
			return null;
		}
		
	}
	
	static class Ihm implements mvc.Ihm {
		
		@Override
		public Ent toEnt() 
		{
//			stub
			return null;
		}
		
	}
}
