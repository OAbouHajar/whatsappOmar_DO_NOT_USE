package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class NullOutputStream extends OutputStream {
    public static final NullOutputStream NULL_OUTPUT_STREAM = new NullOutputStream();

    public void write(int i2) {
    }

    public void write(byte[] bArr) throws IOException {
    }

    public void write(byte[] bArr, int i2, int i3) {
    }
}
