package com.facebook.redex;

import X.AnonymousClass59I;
import X.AnonymousClass59J;
import X.C13680ns;
import X.C17130ua;
import X.C37811pm;
import X.C38271qW;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class IDxHEntityShape100S0200000_2_I1 implements HttpEntity {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxHEntityShape100S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void consumeContent() {
        ((HttpEntity) this.A01).consumeContent();
    }

    public InputStream getContent() {
        int i2 = this.A02;
        InputStream content = ((HttpEntity) this.A01).getContent();
        Object obj = this.A00;
        C17130ua r2 = i2 != 0 ? ((AnonymousClass59J) obj).A00 : ((AnonymousClass59I) obj).A01;
        Integer A0a = C13680ns.A0a();
        return new C38271qW(r2, content, A0a, A0a);
    }

    public Header getContentEncoding() {
        return ((HttpEntity) this.A01).getContentEncoding();
    }

    public long getContentLength() {
        return ((HttpEntity) this.A01).getContentLength();
    }

    public Header getContentType() {
        return ((HttpEntity) this.A01).getContentType();
    }

    public boolean isChunked() {
        return ((HttpEntity) this.A01).isChunked();
    }

    public boolean isRepeatable() {
        return ((HttpEntity) this.A01).isRepeatable();
    }

    public boolean isStreaming() {
        return ((HttpEntity) this.A01).isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        if (this.A02 != 0) {
            InputStream content = getContent();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = content.read(bArr);
                    if (read < 0) {
                        content.close();
                        return;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (Throwable unused) {
            }
        } else {
            C17130ua r2 = ((AnonymousClass59I) this.A00).A01;
            Integer A0a = C13680ns.A0a();
            ((HttpEntity) this.A01).writeTo(new C37811pm(r2, outputStream, A0a, A0a));
            return;
        }
        throw th;
    }
}
