package atividades.agregation;

public class Car {
	private Engine engine;
	private Seat seat;
	private GasTank gasTank;

	public Car() {

	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public GasTank getGasTank() {
		return gasTank;
	}

	public void setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
	}

	public static void main(String[] args) {
		Engine engine = new Engine(1233455);
		Seat seat = new Seat(646589);
		GasTank gasTank = new GasTank(1897464);
		
		Car myCar = new Car();
		Car otherCar = new Car();
		
		myCar.setEngine(engine);
		myCar.setSeat(seat);
		myCar.setGasTank(gasTank);
		
		System.out.println(myCar.getEngine().getSerialNumber());
		System.out.println(myCar.getSeat().getSerialNumber());
		System.out.println(myCar.getGasTank().getSerialNumber());
		
		myCar = null; // objeto otherCar destruído
		otherCar.setEngine(engine); /*otherCar usa o motor do myCar que foi destruído, assim
		percebemos que com a destruição de myCar, seus componentes - os objetos engine, seat 
		e gasTank continuam a existir. Isso exemplifica o conceito de agregação*/
		
	}
}
