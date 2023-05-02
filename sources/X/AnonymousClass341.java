package X;

import android.os.SystemClock;
import com.obwhatsapp.R;

/* renamed from: X.341  reason: invalid class name */
public abstract class AnonymousClass341 extends C78113xB implements C14650pX, C107935Ma {
    public long A00;
    public boolean A01;

    public void A37(boolean z2) {
        Afq(R.string.str058f);
        this.A0Z = true;
        this.A01 = z2;
        C16440t3 r4 = this.A05;
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass51F r11 = new AnonymousClass51F(this.A05, this.A0M, new AnonymousClass4L2(r4, this.A09, this));
        C17190ug r10 = r11.A01;
        String A02 = r10.A02();
        C35081lL[] r8 = new C35081lL[2];
        boolean A03 = C35081lL.A03("type", "contact", r8);
        r8[1] = new C35081lL("action", z2 ? "revoke" : "get");
        C28371Vv r3 = new C28371Vv("qr", r8);
        C35081lL[] r2 = new C35081lL[3];
        C35081lL.A02("id", A02, r2, A03 ? 1 : 0);
        C35081lL.A02("xmlns", "w:qr", r2, 1);
        C35081lL.A02("type", "set", r2, 2);
        r10.A0B(r11, C28371Vv.A04(r3, r2), A02, 215, 32000);
    }
}
