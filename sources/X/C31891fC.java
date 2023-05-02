package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1fC  reason: invalid class name and case insensitive filesystem */
public class C31891fC {
    public final NativeHolder A00;

    public C31891fC(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C31891fC(byte[] bArr, long j2) {
        JniBridge.getInstance();
        this.A00 = new C31891fC((NativeHolder) JniBridge.jvidispatchOIO(20, j2, bArr)).A00;
    }
}
