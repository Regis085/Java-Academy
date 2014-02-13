// jrn here we have an example of use of a static block

package sef.module04.sample;

public class StaticSample2 {

	// Attributes
	private static float distance;
	private static float time;
	private static float speed;

	// Parameterized Constructor
	public StaticSample2(float speed, float time) {
		this.speed = speed;
		this.time = time;
	}

	// Default Constructor
	public StaticSample2() {
	}

	// main() method
	public static void main(String arg[]) {

		// static code block sample
		StaticSample2 temp3 = new StaticSample2(50, 4);
		System.out.println(temp3.time);
		System.out.println(temp3.speed);
		System.out.println(temp3.distance); // distance is not evaluated as per
											// formula given in the static code
											// block
											// this is because code block was
											// executed even before temp3 was
											// created
	}

	// static code block sample
	static {
		System.out.println("Static code blocks are executed only once during "
				+ "the first time that the class is loaded by the JVM");

		System.out.println(speed);
		System.out.println(time);

		distance = speed * time;
	}

}
