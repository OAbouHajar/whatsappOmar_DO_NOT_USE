package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1fI  reason: invalid class name and case insensitive filesystem */
public class C31951fI {
    public final NativeHolder A00;

    public C31951fI(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C31951fI(byte[] bArr, byte[] bArr2) {
        JniBridge.getInstance();
        this.A00 = new C31951fI((NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2)).A00;
    }
}
