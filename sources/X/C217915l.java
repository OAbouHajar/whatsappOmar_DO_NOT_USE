package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.15l  reason: invalid class name and case insensitive filesystem */
public class C217915l {
    public final C16000sG A00;
    public final C15810rt A01;
    public final C14710pd A02;

    public C217915l(C16000sG r1, C15810rt r2, C14710pd r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean A00(C16010sH r5) {
        if (r5 == null) {
            return false;
        }
        int A022 = this.A01.A02((GroupJid) r5.A08(C16050sL.class));
        if (r5.A0J()) {
            return (A022 == 3 || A022 == 1) && r5.A0c && this.A02.A0E(C16620tM.A02, 1653);
        }
        return false;
    }
}
