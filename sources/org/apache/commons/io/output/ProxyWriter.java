package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class ProxyWriter extends FilterWriter {
    public ProxyWriter(Writer writer) {
        super(writer);
    }

    /* access modifiers changed from: protected */
    public void afterWrite(int i2) throws IOException {
    }

    public Writer append(char c2) throws IOException {
        try {
            beforeWrite(1);
            this.out.append(c2);
            afterWrite(1);
        } catch (IOException e2) {
            handleIOException(e2);
        }
        return this;
    }

    public Writer append(CharSequence charSequence) throws IOException {
        int i2 = 0;
        if (charSequence != null) {
            try {
                i2 = charSequence.length();
            } catch (IOException e2) {
                handleIOException(e2);
            }
        }
        beforeWrite(i2);
        this.out.append(charSequence);
        afterWrite(i2);
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) throws IOException {
        try {
            beforeWrite(i3 - i2);
            this.out.append(charSequence, i2, i3);
            afterWrite(i3 - i2);
        } catch (IOException e2) {
            handleIOException(e2);
        }
        return this;
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

    public void write(String str) throws IOException {
        int i2 = 0;
        if (str != null) {
            try {
                i2 = str.length();
            } catch (IOException e2) {
                handleIOException(e2);
                return;
            }
        }
        beforeWrite(i2);
        this.out.write(str);
        afterWrite(i2);
    }

    public void write(String str, int i2, int i3) throws IOException {
        try {
            beforeWrite(i3);
            this.out.write(str, i2, i3);
            afterWrite(i3);
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    public void write(char[] cArr) throws IOException {
        int i2 = 0;
        if (cArr != null) {
            try {
                i2 = cArr.length;
            } catch (IOException e2) {
                handleIOException(e2);
                return;
            }
        }
        beforeWrite(i2);
        this.out.write(cArr);
        afterWrite(i2);
    }

    public void write(char[] cArr, int i2, int i3) throws IOException {
        try {
            beforeWrite(i3);
            this.out.write(cArr, i2, i3);
            afterWrite(i3);
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }
}
