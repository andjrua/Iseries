package com.bancolombia.myextra.controller;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import com.bancolombia.myextra.libraries.ClassFactory;
import com.bancolombia.myextra.libraries.Screen;
import com.bancolombia.myextra.libraries.Sessions;
import com.bancolombia.myextra.libraries._Session;
import com.bancolombia.myextra.libraries._System;


public class MyExtra {

	private Screen extraScreen;
	private _System extraSystem;
	private  _Session extraSesion;
	private Sessions extraSessions;
	
	private static MyExtra myExtra;
	
	private void esperar(Long millis) {
		try {
			Thread.sleep(millis);
		}
		catch (Exception e) {
			
		}
	}
	
	public static MyExtra sesion() {
		return myExtra;
	}
	
	class CerrarExtraSession extends Thread {
		public void run() {
			// Presenta en pantalla informaci�n sobre este hilo en particular
			myExtra.extraSessions = myExtra.extraSystem.sessions().queryInterface(Sessions.class);
			myExtra.extraSessions.closeAll();
		}
	}

	@SuppressWarnings("deprecation")
	public void cerrarMyExtra() {
		Thread hiloA = new Thread(new CerrarExtraSession(), "CerrarExtraSession");

			Robot robot;
			try {
				robot = new Robot();

			if (myExtra.extraSystem != null) {
				hiloA.start();
				esperar((long) 1000);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				esperar((long) 1000);
				hiloA.stop();
			}
			} catch (Exception e) {
				
			}

		
	}

	public static void iniciarMyExtra(String rutaEDP, long esperarAbrirMillis) {
		myExtra=new MyExtra();
		Desktop desk = Desktop.getDesktop();
		File file = new File(rutaEDP);
		try {
			desk.open(file);

			myExtra.esperar(esperarAbrirMillis);
			myExtra.extraSystem = ClassFactory.createExtraSystem();
			myExtra.extraSesion = myExtra.extraSystem.activeSession().queryInterface(_Session.class);
			myExtra.extraScreen = myExtra.extraSesion.screen().queryInterface(Screen.class);

		} catch (Exception e) {

		}
	}

	public void IngresarTexto(String dato, int fila, int columna) {
		myExtra.extraScreen.putString(dato, fila, columna, null);
	}

	public String LeerTexto(int fila, int columna, int longitud) {
		return myExtra.extraScreen.getString(fila, columna, longitud, null);
	}

	public void EnviarTeclas(String strTecla, long EsperarMillis) {
		myExtra.extraScreen.sendKeys(strTecla);
		esperar((long) 600);
		esperar(EsperarMillis);
	}

}
