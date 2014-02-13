package sef.module04.sample;

import java.util.Date;

public class DateActivity {
	private int dia;
	private int mes;
	private int ano;

	public DateActivity() {
		dia = 01;
		mes = 01;
		ano = 2000;
	}

	public static void main(String[] args) {
		DateActivity dateActivity = new DateActivity();
		System.out.println(dateActivity.dia + "/" + dateActivity.mes + "/"
				+ dateActivity.ano);
		System.out.println("Hoje: " + dateActivity.hoje());
	}

	public Date hoje() {
		return new Date();
	}

}