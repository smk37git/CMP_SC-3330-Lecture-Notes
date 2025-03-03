package factory.abstractdp.lotrweapons.weapons;

public class ElfSpear implements Spear {

	@Override
	public void poke() {
		System.out.println("Poking with an Elf Spear");
		
	}

	@Override
	public void attack() {
		poke();
	}

}
