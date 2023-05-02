package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.0wI  reason: invalid class name and case insensitive filesystem */
public final class C18190wI {
    public final C16070sO A00;
    public final C14710pd A01;

    public C18190wI(C16070sO r1, C14710pd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean A00(C15830rv r4) {
        if (C16030sJ.A0L(r4) && (r4 instanceof GroupJid)) {
            return this.A00.A07.A04((C16060sN) r4).A04.size() >= 3;
        }
    }
}
