//Zombie text game based off of choices from the player.
//Frank Stalteri

import java.util.Scanner;
import java.util.Random;

public class ZombieSurvival {
	
	static String [] zombies = {"Zombie", "Fast Zombie", "Big Zombie", "Crawler"};
	static String [] bag = {"Assault Rifle", "SMG", "Shotgun", "Sniper"};
	static int [] zHealth = {100, 90, 200, 50};
	static int [] damage = {90, 80, 100, 200};
	static int playerHealth = 50;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Survive the Apocalypse!");
		Scanner kb = new Scanner(System.in);
		System.out.println("Type '1' to start!");
		int choice = kb.nextInt();
		
		if (choice == 1) {
			System.out.println("Player health: " + playerHealth);
			Thread.sleep(2000);
			System.out.println("Here is your bag's contents: " + bag[0] + ", " + bag[1] + ", " + bag[2] + ", " + bag[3]);
			Thread.sleep(2000);
			System.out.println("Zombies are coming!");
			Thread.sleep(2000);
			System.out.println("Which weapon do you choose?");
			
			Scanner s = new Scanner(System.in);
			String weapon = s.nextLine();
			
			System.out.println(weapon + " equipped!");
			Thread.sleep(2000);
			
			Random r = new Random();
			int zombie = r.nextInt(zombies.length);
		
			Scanner attack = new Scanner(System.in);
			System.out.println(zombies[zombie] + " is coming after you! Type 'shoot' to attack!");
			String action = attack.nextLine();
			
			int zombieHealth = zHealth[zombie];
			
			if (weapon.contains("SMG") || weapon.contains("Smg") || weapon.contains("smg")) {
				int weaponDamage = 80;
				System.out.println(damageTaken(zombieHealth, weaponDamage) + ": zombie's new health!");
				Thread.sleep(2000);
				int zombieNewHealth = damageTaken(zombieHealth, weaponDamage);
				
				if (zombieNewHealth <= 0) {
					System.out.println("Zombie is dead!");
					Thread.sleep(2000);
					System.out.println("You survived!");
				}
				else {
					System.out.println("Zombie attacked!");
					int zombieAttack = r.nextInt(51);
					
					if (zombieAttack >= playerHealth) {
						System.out.println("You died!");
						Thread.sleep(2000);
						System.out.println("Game Over!");
					}
					else {
						System.out.println("You took " + (zombieAttack - playerHealth) + " damage!");
						Thread.sleep(2000);
						
						int damageByZombie = playerHealth - zombieAttack;
						int newPlayerHealth = playerHealth - damageByZombie;
						
						System.out.println("Health: " + newPlayerHealth);
						Thread.sleep(2000);
						System.out.println("You survived!");
					}
				}
			}
			else if (weapon.contains("Assault Rifle") || weapon.contains("assault rifle") || weapon.contains("Assault rifle")) {
				int weaponDamage = 90;
				System.out.println(damageTaken(zombieHealth, weaponDamage) + ": zombie's new health!");
				Thread.sleep(2000);
				int zombieNewHealth = damageTaken(zombieHealth, weaponDamage);
				
				if (zombieNewHealth <= 0) {
					System.out.println("Zombie is dead!");
					Thread.sleep(2000);
					System.out.println("You survived!");
				}
				else {
					System.out.println("Zombie attacked!");
					int zombieAttack = r.nextInt(51);
					
					if (zombieAttack >= playerHealth) {
						System.out.println("You died!");
						Thread.sleep(2000);
						System.out.println("Game Over!");
					}
					else {
						System.out.println("You took " + (zombieAttack - playerHealth) + " damage!");
						Thread.sleep(2000);
						
						int damageByZombie = playerHealth - zombieAttack;
						int newPlayerHealth = playerHealth - damageByZombie;
						
						System.out.println("Health: " + newPlayerHealth);
						Thread.sleep(2000);
						System.out.println("You survived!");
					}
				}
			}
			else if (weapon.contains("Sniper") || weapon.contains("sniper")) {
				int weaponDamage = 200;
				System.out.println(damageTaken(zombieHealth, weaponDamage) + ": zombie's new health!");
				Thread.sleep(2000);
				int zombieNewHealth = damageTaken(zombieHealth, weaponDamage);
				
				if (zombieNewHealth <= 0) {
					System.out.println("Zombie is dead!");
					Thread.sleep(2000);
					System.out.println("You survived!");
				}
				else {
					System.out.println("Zombie attacked!");
					int zombieAttack = r.nextInt(51);
					
					if (zombieAttack >= playerHealth) {
						System.out.println("You died!");
						Thread.sleep(2000);
						System.out.println("Game Over!");
					}
					else {
						System.out.println("You took " + (zombieAttack - playerHealth) + " damage!");
						Thread.sleep(2000);
						
						int damageByZombie = playerHealth - zombieAttack;
						int newPlayerHealth = playerHealth - damageByZombie;
						
						System.out.println("Health: " + newPlayerHealth);
						Thread.sleep(2000);
						System.out.println("You survived!");
					}
				}
			}
			else { 						//Shotgun option
				int weaponDamage = 100;
				System.out.println(damageTaken(zombieHealth, weaponDamage) + ": zombie's new health!");
				Thread.sleep(2000);
				int zombieNewHealth = damageTaken(zombieHealth, weaponDamage);
				
				if (zombieNewHealth <= 0) {
					System.out.println("Zombie is dead!");
					Thread.sleep(2000);
					System.out.println("You survived!");
				}
				else {
					System.out.println("Zombie attacked!");
					int zombieAttack = r.nextInt(51);
					
					if (zombieAttack >= playerHealth) {
						System.out.println("You died!");
						Thread.sleep(2000);
						System.out.println("Game Over!");
					}
					else {
						System.out.println("You took " + (zombieAttack - playerHealth) + " damage!");
						Thread.sleep(2000);
						
						int damageByZombie = playerHealth - zombieAttack;
						int newPlayerHealth = playerHealth - damageByZombie;
						
						System.out.println("Health: " + newPlayerHealth);
						Thread.sleep(2000);
						System.out.println("You survived!");
					}
					
				}
			}
		}
		else {
			System.out.println("You're no fun!");
		}
	}
	public static int damageTaken(int zombieHealth, int weaponDamage) {
		int newHealth;
		
		newHealth = zombieHealth - weaponDamage;
		return newHealth;
	}
}
