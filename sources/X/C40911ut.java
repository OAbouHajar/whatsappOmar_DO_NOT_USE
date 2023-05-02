package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ut  reason: invalid class name and case insensitive filesystem */
public class C40911ut implements C19550yc {
    public final /* synthetic */ C17780vd A00;
    public final /* synthetic */ C40841um A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public C40911ut(C17780vd r1, C40841um r2, Runnable runnable, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = runnable;
        this.A01 = r2;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r3, String str) {
        Log.i("GroupXmppMethods/sendSetGroupAdminSetting error");
        this.A01.Ach(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r2, String str) {
        if (r2.A0J(this.A03) != null) {
            this.A02.run();
        }
    }
}
