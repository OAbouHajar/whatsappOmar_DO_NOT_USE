package X;

import com.obwhatsapp.Conversation;

/* renamed from: X.3FM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FM implements AnonymousClass5PK {
    public final /* synthetic */ AnonymousClass2Q3 A00;
    public final /* synthetic */ AnonymousClass2DT A01;
    public final /* synthetic */ C38701rH A02;

    public /* synthetic */ AnonymousClass3FM(AnonymousClass2Q3 r1, AnonymousClass2DT r2, C38701rH r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void AUn(int i2) {
        AnonymousClass2Q3 r5 = this.A00;
        C38701rH r4 = this.A02;
        AnonymousClass2DT r3 = this.A01;
        ((AnonymousClass1B7) r5.A01.get()).Ac2(r4.A13);
        boolean z2 = r3.A0T;
        Conversation conversation = (Conversation) ((C42811yi) r5.A0b);
        C42821yj r2 = conversation.A00;
        if (AnonymousClass476.A00(((C14550pN) r2.A22).A0C, AnonymousClass46Z.A00(r2.A1n.getConversationCursorAdapter(), r4), r4, z2)) {
            if (conversation.A00.A0v(r4, i2, r3.A0T, r3.A0Y)) {
                r3.A0S = true;
                return;
            }
        }
        if (r5.A0C) {
            r5.A1T(r4);
        }
    }
}
