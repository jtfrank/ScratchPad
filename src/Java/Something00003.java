
public class Something00003 {

	public static void main(String[] args) {
		Something00003 s3 = new Something00003();
		Creature stockCreature = s3.new Creature();
		Bear smokey = s3.new Bear();
		Lumberjack larry = s3.new Lumberjack();
		
		stockCreature.wander();
		smokey.wander();
		larry.wander();
		
		Creature anyCreature;
		anyCreature = smokey;
		anyCreature.wander();
	}
	
	class Creature{
		public void wander(){
			System.out.println("Creature wanders x feet");
		}
	}
	
	class Bear extends Creature{
		public void wander(){
			System.out.println("Bear wanders 500 feet");
		}
	}
	
	class Lumberjack extends Creature{
		public void wander(){
			System.out.println("Lumberjack wanders 300 feet");
		}
	}

}
