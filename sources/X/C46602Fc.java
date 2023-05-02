package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Fc  reason: invalid class name and case insensitive filesystem */
public class C46602Fc {
    public final C16440t3 A00;
    public final C16980tz A01;
    public final C15860rz A02;
    public final AnonymousClass10J A03;
    public final C14710pd A04;
    public final C17190ug A05;
    public final C16320sq A06;

    public C46602Fc(C16440t3 r1, C16980tz r2, C15860rz r3, AnonymousClass10J r4, C14710pd r5, C17190ug r6, C16320sq r7) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A00() {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest");
        String A0Q = this.A02.A0Q();
        if (!AnonymousClass1ZW.A0E(A0Q)) {
            byte[] A0D = C004101u.A0D();
            C17190ug r7 = this.A05;
            String A022 = r7.A02();
            r7.A0B(new AnonymousClass51G(this, A0Q, A0D), new C28371Vv(new C28371Vv("token", A0D, (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("to", "s.whatsapp.net"), new C35081lL("xmlns", "w:auth:backup:token"), new C35081lL("type", "set"), new C35081lL("id", A022)}), A022, 226, 32000);
        }
    }
}
