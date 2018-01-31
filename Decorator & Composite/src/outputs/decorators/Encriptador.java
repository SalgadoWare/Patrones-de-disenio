package outputs.decorators;

import java.io.IOException;

import outputs.Output;

public class Encriptador extends OutputDecorator {

	public Encriptador(Output output) {
		super(output);
	}

	@Override
	public void send(char c) throws IOException {
		super.send((char) (Character.isLetterOrDigit(c) ? c + 1 : c));
	}
}
