package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1fG  reason: invalid class name and case insensitive filesystem */
public class C31931fG {
    public final NativeHolder A00;

    public C31931fG(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C31931fG(byte[] bArr, long j2) {
        JniBridge.getInstance();
        this.A00 = new C31931fG((NativeHolder) JniBridge.jvidispatchOIO(19, j2, bArr)).A00;
    }
}
