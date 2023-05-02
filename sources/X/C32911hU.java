package X;

import android.os.Process;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.1hU  reason: invalid class name and case insensitive filesystem */
public class C32911hU extends Thread {
    public final long A00;
    public final C95774nG A01;
    public final NativeTraceWriter A02;
    public final String A03;
    public final String A04;
    public final Buffer[] A05;

    public C32911hU(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String str, String str2, Buffer[] bufferArr, long j2) {
        super("Prflo:Logger");
        this.A00 = j2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = bufferArr;
        C95774nG r3 = new C95774nG(nativeTraceWriterCallbacks, bufferArr.length <= 1 ? false : true);
        this.A01 = r3;
        Buffer buffer = bufferArr[0];
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("-0");
        this.A02 = new NativeTraceWriter(buffer, str, sb.toString(), r3);
    }

    public void run() {
        try {
            Process.setThreadPriority(5);
            this.A02.loop();
            Buffer[] bufferArr = this.A05;
            int length = bufferArr.length;
            if (length > 1) {
                String str = this.A04;
                StringBuilder sb = new StringBuilder(str.length() + 2);
                int i2 = 1;
                while (true) {
                    sb.setLength(0);
                    sb.append(str);
                    sb.append('-');
                    sb.append(i2);
                    new NativeTraceWriter(bufferArr[i2], this.A03, sb.toString(), (NativeTraceWriterCallbacks) null).dump(this.A00);
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                }
            }
        } catch (RuntimeException e2) {
            this.A01.onTraceWriteException(this.A00, e2);
        } catch (Throwable th) {
            this.A01.A00();
            throw th;
        }
        this.A01.A00();
    }
}
