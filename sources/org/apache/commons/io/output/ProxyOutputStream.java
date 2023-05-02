package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ProxyOutputStream extends FilterOutputStream {
    public ProxyOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    /* access modifiers changed from: protected */
    public void afterWrite(int i2) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void beforeWrite(int i2) throws IOException {
    }

    public void close() throws IOException {
        try {
            this.out.close();
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    public void flush() throws IOException {
        try {
            this.out.flush();
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    public void write(int i2) throws IOException {
        try {
            beforeWrite(1);
            this.out.write(i2);
            afterWrite(1);
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    public void write(byte[] bArr) throws IOException {
        int i2;
        if (bArr != null) {
            try {
                i2 = bArr.length;
            } catch (IOException e2) {
                handleIOException(e2);
                return;
            }
        } else {
            i2 = 0;
        }
        beforeWrite(i2);
        this.out.write(bArr);
        afterWrite(i2);
    }

    public void write(byte[] bArr, int i2, int i3) throws IOException {
        try {
            beforeWrite(i3);
            this.out.write(bArr, i2, i3);
            afterWrite(i3);
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }
}
