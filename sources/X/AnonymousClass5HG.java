package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.FileEntity;

/* renamed from: X.5HG  reason: invalid class name */
public class AnonymousClass5HG extends FileEntity {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3AX A02;
    public final /* synthetic */ FileInputStream A03;
    public final /* synthetic */ AtomicLong A04;
    public final /* synthetic */ HttpPut A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5HG(AnonymousClass3AX r2, File file, FileInputStream fileInputStream, AtomicLong atomicLong, HttpPut httpPut, long j2, long j3) {
        super(file, "application/binary");
        this.A02 = r2;
        this.A00 = j2;
        this.A01 = j3;
        this.A03 = fileInputStream;
        this.A05 = httpPut;
        this.A04 = atomicLong;
    }

    public InputStream getContent() {
        return this.A03;
    }

    public long getContentLength() {
        return (this.A00 - this.A01) + 1;
    }

    public void writeTo(OutputStream outputStream) {
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                AnonymousClass3AX r5 = this.A02;
                if (r5.A05.A05()) {
                    int read = content.read(bArr, 0, 16384);
                    if (read <= 0) {
                        outputStream.flush();
                        break;
                    }
                    long j2 = (long) read;
                    this.A04.addAndGet(j2);
                    r5.A03.APP(j2);
                    outputStream.write(bArr, 0, read);
                } else {
                    this.A05.abort();
                    break;
                }
            }
            content.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
