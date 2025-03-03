package factory.abstractdp.lotrweapons.weapons;

public class ElfSword implements Sword {

	@Override
	public void swing() {
		System.out.println("Swinging an Elf Sword");
		
	}

	@Override
	public void attack() {
		swing();
		
	}

}
