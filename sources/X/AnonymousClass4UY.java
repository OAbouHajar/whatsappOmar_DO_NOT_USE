package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4UY  reason: invalid class name */
public final class AnonymousClass4UY {
    public final UserJid A00;
    public final C28371Vv A01;
    public final C109095Qr A02;

    public AnonymousClass4UY(C16300so r12, C28371Vv r13) {
        Object obj;
        C28371Vv.A06(r13, "participant");
        C16300so r3 = r12;
        this.A00 = (UserJid) C32271fx.A01(r3, r13, UserJid.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"jid"}, false);
        C32261fw[] r2 = new C32261fw[4];
        r2[0] = AnonymousClass3K3.A0X(r12, 140);
        r2[1] = AnonymousClass3K3.A0X(r12, 139);
        r2[2] = AnonymousClass3K3.A0X(r12, 138);
        try {
            obj = C32271fx.A04(r13, "ParticipantNotInGroup|ParticipantNotAllowed|ParticipantNotAcceptable|RemoveParticipantsLinkedGroupsServerError", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r12, 141), r2, 3), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A02 = (C109095Qr) obj;
        this.A01 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UY.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UY r5 = (AnonymousClass4UY) obj;
            if (!this.A00.equals(r5.A00) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
