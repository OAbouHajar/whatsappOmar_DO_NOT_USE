package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class TeeOutputStream extends ProxyOutputStream {
    protected OutputStream branch;

    public TeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.branch = outputStream2;
    }

    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.branch.close();
        }
    }

    public void flush() throws IOException {
        super.flush();
        this.branch.flush();
    }

    public synchronized void write(int i2) throws IOException {
        super.write(i2);
        this.branch.write(i2);
    }

    public synchronized void write(byte[] bArr) throws IOException {
        super.write(bArr);
        this.branch.write(bArr);
    }

    public synchronized void write(byte[] bArr, int i2, int i3) throws IOException {
        super.write(bArr, i2, i3);
        this.branch.write(bArr, i2, i3);
    }
}
