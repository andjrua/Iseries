package com.bancolombia.myextra.libraries;

public class ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			_System system=ClassFactory.createExtraSystem();
			_Session sesion=system.activeSession().queryInterface(_Session.class);
			Screen pantalla=sesion.screen().queryInterface(Screen.class);
			/*
			pantalla.putString("CJUACAHE", 6, 53, null);
			pantalla.putString("interfaz17", 7, 53, null);
			pantalla.sendKeys("<enter>");
			Thread.sleep(500);
			pantalla.sendKeys("<enter>");
			Thread.sleep(500);
			pantalla.sendKeys("<enter>");
			Thread.sleep(500);
			pantalla.sendKeys("<enter>");
			Thread.sleep(500);
			pantalla.sendKeys("<enter>");
			Thread.sleep(500);
			pantalla.sendKeys("<enter>");
			Thread.sleep(2000);
			pantalla.putString("1", 8, 10, null);
			pantalla.sendKeys("<enter>");
			Thread.sleep(1000);
			pantalla.putString("1", 18, 8, null);
			pantalla.sendKeys("<enter>");
			Thread.sleep(1000);
			pantalla.putString("1", 13, 9, null);
			pantalla.sendKeys("<enter>");
			Thread.sleep(1000);
			pantalla.sendKeys("<enter>");
			Thread.sleep(1000);
			pantalla.sendKeys("<RollUp>");
			Thread.sleep(1000);
			pantalla.sendKeys("<RollUp>");
			Thread.sleep(1000);
			pantalla.sendKeys("<RollUp>");
			Thread.sleep(1000);
			pantalla.sendKeys("<RollUp>");
			Thread.sleep(1000);
			pantalla.sendKeys("<RollUp>");
			Thread.sleep(1000);
			pantalla.putString("leider es marico", 4, 7, null);
			pantalla.sendKeys("<enter>");
			Thread.sleep(1000);
			*/
			String evidencia="";		
			for (int i=1;i<=20;i++) {
				evidencia=evidencia+pantalla.getString(i, 1, 80, null) + "\n";	
			}
			System.out.println(evidencia);

			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
