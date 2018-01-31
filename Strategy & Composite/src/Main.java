import form.Field;
import form.Form;

import form.validation.*;

//patron estrategia
//la interfaz validator permite configuar a la clase campo
//con un determinado comportamiento

//se necesitan distintas varientes de un algorito y las estructuras
//de datos se ocultan al cliente

//alternativa a la herencia
//al fin y al cabo se está delegando una responsabilidad d¡a una interfaz como en
//DS1




//tambien se utiliza un composite en and y or validator
public class Main 
{
	public static void main(String[] args)
	{
		Form form = new Form();

		form.addField(new Field("Nombre", Field.TEXT));
		form.addField(new Field("Apellidos", Field.TEXT));
		form.addField(new Field("Teléfono", Field.NUMBER));
		
		Validator cities = new PredefinedValidator("Santander", "Oviedo", "Cádiz");
		form.addField(new Field("Ciudad", cities));
		
		// Ampliación
		
		form.addField(new Field("Código de producto", new LengthValidator(4)));
		Validator postalCode = new AndValidator(Field.NUMBER, new LengthValidator(5));
		form.addField(new Field("Código postal", postalCode));
		form.addField(new Field("Edad", new GreaterThanValidator(18)));
		form.addField(new Field("Sueldo", new AndValidator(new GreaterThanValidator(800), new LessThanValidator(1200))));
		form.addField(new Field("Ubicación", new OrValidator(cities, postalCode)));
		form.addField(new Field("Código de promoción", new OrValidator(Field.TEXT, new AndValidator(Field.NUMBER, new LengthValidator(3)))));
		
		form.askUser();
	}
}
