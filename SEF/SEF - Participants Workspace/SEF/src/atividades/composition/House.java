package atividades.composition;

public class House {
	Room room;
	LivingRoom livingRoom;
	Kitchen kitchen;

	public House() {
		this.room = new Room("Quarto");
		this.livingRoom = new LivingRoom("Sala de TV");
		this.kitchen = new Kitchen("Cozinha");
	}

	public String toString() {
		return "House class: composed by one room, one living room and one kitchen";
	}

	public Room getRoom() {
		return room;
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public static void main(String[] args) {
		House myHouse = new House();
		System.out.println();	
	}
}
