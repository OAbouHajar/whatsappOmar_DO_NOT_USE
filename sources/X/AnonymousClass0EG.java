package X;

import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0EG  reason: invalid class name */
public class AnonymousClass0EG extends C009404l {
    public final /* synthetic */ AnonymousClass0PY A00;

    public AnonymousClass0EG(AnonymousClass0PY r1) {
        this.A00 = r1;
    }

    public void A00() {
        this.A00.A02.A00();
    }

    public void A01(int i2, CharSequence charSequence) {
        this.A00.A02.A01(i2, charSequence);
    }

    public void A02(int i2, CharSequence charSequence) {
        WeakReference weakReference = ((AnonymousClass0DH) this.A00.A02).A00;
        if (weakReference.get() != null) {
            AnonymousClass0F6 r1 = (AnonymousClass0F6) weakReference.get();
            AnonymousClass027 r0 = r1.A09;
            if (r0 == null) {
                r0 = new AnonymousClass027();
                r1.A09 = r0;
            }
            AnonymousClass0F6.A01(r0, charSequence);
        }
    }

    public void A03(AnonymousClass0NQ r4) {
        AnonymousClass04m r1 = r4.A00;
        AnonymousClass0Wh r2 = null;
        if (r1 != null) {
            Cipher cipher = r1.A01;
            if (cipher != null) {
                r2 = new AnonymousClass0Wh(cipher);
            } else {
                Signature signature = r1.A00;
                if (signature != null) {
                    r2 = new AnonymousClass0Wh(signature);
                } else {
                    Mac mac = r1.A02;
                    if (mac != null) {
                        r2 = new AnonymousClass0Wh(mac);
                    }
                }
            }
        }
        this.A00.A02.A02(new C04730Nr(r2, 2));
    }
}
