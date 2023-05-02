package X;

import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3GO  reason: invalid class name */
public final class AnonymousClass3GO implements AnonymousClass2HV {
    public final /* synthetic */ AnonymousClass1ML A00;
    public final /* synthetic */ C211613a A01;
    public final /* synthetic */ C214013y A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass3GO(AnonymousClass1ML r1, C211613a r2, C214013y r3, String str, WeakReference weakReference, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = weakReference;
        this.A01 = r2;
        this.A03 = str;
        this.A05 = z2;
    }

    public void AQu(Exception exc) {
        C18450wi.A0H(exc, 0);
        Log.e("Failed to create an avatar user:", exc);
        C214013y r1 = this.A02;
        r1.A01("user_creation_failed");
        r1.A00(AnonymousClass42P.FAIL);
        this.A00.A04.set(false);
        this.A01.A03(C13680ns.A0Y(), exc.getMessage(), 7, this.A05);
        C14550pN A002 = AnonymousClass1ML.A00(this.A04);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            return;
        }
        A002.Ac1();
        A002.Afg(R.string.str1bee);
    }

    public void onSuccess() {
        C214013y r2 = this.A02;
        r2.A01("user_created");
        this.A00.A02(this.A01, r2, this.A03, this.A04, this.A05);
    }
}
