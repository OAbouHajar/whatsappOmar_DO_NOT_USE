package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class AutoCloseInputStream extends ProxyInputStream {
    public AutoCloseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    public void afterRead(int i2) throws IOException {
        if (i2 == -1) {
            close();
        }
    }

    public void close() throws IOException {
        this.in.close();
        this.in = new ClosedInputStream();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
