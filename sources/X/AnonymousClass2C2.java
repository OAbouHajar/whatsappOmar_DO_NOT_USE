package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2C2  reason: invalid class name */
public class AnonymousClass2C2 {
    public final NativeHolder A00;

    public AnonymousClass2C2(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass2C2(String str, String str2, int i2) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass2C2((NativeHolder) JniBridge.jvidispatchOIOO(0, (long) i2, str, str2)).A00;
    }
}
