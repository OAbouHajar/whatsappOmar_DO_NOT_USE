package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2J3  reason: invalid class name */
public class AnonymousClass2J3 extends C009404l {
    public final /* synthetic */ AnonymousClass2J1 A00;
    public final /* synthetic */ WeakReference A01;

    public AnonymousClass2J3(AnonymousClass2J1 r1, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = weakReference;
    }

    public void A00() {
        Log.i("AppAuthManager/authenticate: authentication failed");
        AnonymousClass2J2 r0 = (AnonymousClass2J2) this.A01.get();
        if (r0 != null) {
            r0.AMv();
        }
    }

    public void A01(int i2, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder("AppAuthManager/authenticate: authentication error=");
        sb.append(i2);
        sb.append(" errString=");
        sb.append(charSequence);
        Log.e(sb.toString());
        AnonymousClass2J2 r0 = (AnonymousClass2J2) this.A01.get();
        if (r0 != null) {
            r0.AMu(i2, charSequence);
        }
    }

    public void A02(int i2, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder("AppAuthManager/authenticate: authentication help=");
        sb.append(i2);
        sb.append(" errString=");
        sb.append(charSequence);
        Log.i(sb.toString());
        AnonymousClass2J2 r0 = (AnonymousClass2J2) this.A01.get();
        if (r0 != null) {
            r0.AMx(i2, charSequence);
        }
    }

    public void A03(AnonymousClass0NQ r3) {
        Log.i("AppAuthManager/authenticate: authentication succeeded");
        AnonymousClass2J2 r1 = (AnonymousClass2J2) this.A01.get();
        if (r1 != null) {
            r1.AMy((byte[]) null);
        }
    }
}
