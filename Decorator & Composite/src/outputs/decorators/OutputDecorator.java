package outputs.decorators;

import java.io.IOException;

import outputs.Output;

public abstract class OutputDecorator implements Output{
	
	protected Output output;
	
	public OutputDecorator(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		output.send(c);	
	}
	
	@Override
	public void close() throws IOException {
		output.close();
	}
}
