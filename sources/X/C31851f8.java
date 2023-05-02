package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1f8  reason: invalid class name and case insensitive filesystem */
public class C31851f8 {
    public final NativeHolder A00;

    public C31851f8(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C31851f8(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, long j2) {
        JniBridge.getInstance();
        this.A00 = new C31851f8((NativeHolder) JniBridge.jvidispatchOIIIOOOOOO((long) i2, j2, 0, str, str2, (Object) null, bArr, bArr2, bArr3)).A00;
    }
}
