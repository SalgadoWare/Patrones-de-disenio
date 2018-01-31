package main;

import java.io.*;

import outputs.*;
import outputs.decorators.Encriptador;

public class Main {
	public static void main(String[] args) throws IOException {
		FileSystem system = new FileSystem();

		system.copyFile("privado.txt", new FileOutput("copia.txt"));
		system.copyFile("privado.txt", new Internet("156.17.11.196"));
		system.copyFile("privado.txt", new Bluetooth("Galaxy de Raúl"));

		system.copyFile("privado.txt",
				new Encriptador(new Outputs(new Encriptador(new Internet("1")), new Bluetooth("Galaxy"))));
	}

}
