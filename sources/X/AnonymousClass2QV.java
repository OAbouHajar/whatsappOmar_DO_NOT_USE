package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2QV  reason: invalid class name */
public class AnonymousClass2QV {
    public final NativeHolder A00;

    public AnonymousClass2QV(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass2QV(String str) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass2QV((NativeHolder) JniBridge.jvidispatchOO(3, str)).A00;
    }
}
