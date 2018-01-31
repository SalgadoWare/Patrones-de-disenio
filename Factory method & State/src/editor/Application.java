package editor;

import java.io.IOException;

import editor.ui.Console;


//PATRON STATE
//El cliente Consola pide editor.move(x,y)
//En función del State del editor (en este caso la herramienta seleccionada)
//el editor responde de diferente forma a la misma llamada

//la idea de state es encapsular el estado en una interfaz tool y delegar en ella 
//la operacion



//En abstract Creation Tool tenemos un patrón factoryMethod, es el método crear figura: Figure
//se delega la creación de las figuras en sus subclases
public class Application 
{
	public static void main(String[] args) throws IOException
	{
		Editor editor = new Editor();
		Console console = new Console(editor);
		console.run();
	}
}
