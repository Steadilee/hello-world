package study_IO.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Application4OutputStream extends ObjectOutputStream {

	public Application4OutputStream(OutputStream out) throws IOException {
		super(out);
	}
	
	@Override
	protected void writeStreamHeader() throws IOException {
		
	}

}
