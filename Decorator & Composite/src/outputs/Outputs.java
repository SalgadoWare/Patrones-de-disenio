package outputs;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Outputs implements Output {

	List<Output> outputs;

	public Outputs(Output... _outputs) {
		outputs = Arrays.asList(_outputs);
	}

	@Override
	public void send(char c) throws IOException {
		for (Output output : outputs) {
			output.send(c);
		}
	}

	@Override
	public void close() throws IOException {
		for (Output output : outputs) {
			output.close();
		}
	}
}
