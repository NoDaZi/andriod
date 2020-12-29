package minigame;

public class game {

	
	//class extends
	static class Player{
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name=name;
			this.hp=hp;
			this.atk=atk;
		}
		public void attack(Enemy enemy) {
			System.out.println("Player Attack!");
			enemy.hp-=this.atk;
			System.out.println("Enemy hp : "+ enemy.hp);
		}
		public boolean isLive() {
			if(hp <=0) {
				return false;
			}else
			{
			return true;
			}
		}
	
	static class Enemy{
		String name;
		int hp;
		int atk;
		public Enemy(String name, int hp, int atk) {
			this.name=name;
			this.hp=hp;
			this.atk=atk;
		}
		public void attack(Player player) {
			System.out.println("Enemy Attack!");
			player.hp-=this.atk;
			System.out.println("Player hp : "+ player.hp);
		}
		public boolean isLive() {
			if(hp <=0) {
				return false;
			}else
			{
			return true;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player("Dazi",100,12);
		Enemy enemy = new Enemy("orc",80,5);
		
		while(player.isLive()&&enemy.isLive()) {
			player.attack(enemy);
			if(!enemy.isLive()) break;
			enemy.attack(player);
		}
		if(player.isLive()) {
			System.out.println("player win!");
		}else {
			System.out.println("Enemy win!");
		}
	}
}
}
