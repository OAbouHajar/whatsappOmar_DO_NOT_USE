package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Tn  reason: invalid class name and case insensitive filesystem */
public final class C27891Tn implements C27881Tm {
    public final C18260wP A00;

    public C27891Tn(C18260wP r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public void AKL(String str) {
        C18450wi.A0H(str, 0);
        if (C15450qv.A05()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/bg-data-restricted:");
            sb.append(this.A00.A0B());
            Log.i(sb.toString());
        }
    }

    public /* synthetic */ void AKN(AnonymousClass2JM r1) {
    }

    public /* synthetic */ void AKY(String str) {
    }
}
