
public class ProjectTest {
	public static void main(String[] args) {
		Project superMarket = new Project("Wally World", 35000 , "New wally world super market");
		Project concreteTunnel = new Project("Main Tunnel");
		concreteTunnel.setDescription("The main tunnel near south street needs repaired.");
		concreteTunnel.setCost(25000);
		System.out.println(concreteTunnel.getName());
		System.out.println(concreteTunnel.getCost());
		System.out.println(concreteTunnel.getDescription());
		System.out.println(superMarket.elevatorPitch());
		
	}
}
