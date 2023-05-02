package X;

import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;

/* renamed from: X.3Gt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63263Gt implements AnonymousClass5QI {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ C63263Gt(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void AXZ(int i2) {
        AnonymousClass348 r4 = this.A00;
        if (i2 == 0) {
            r4.A03.A06.A03(8);
            r4.A02();
        } else if (i2 != 1) {
            r4.A03.A06.A03(8);
            ConversationRowAudioPreview conversationRowAudioPreview = r4.A00;
            conversationRowAudioPreview.A00();
            conversationRowAudioPreview.setDuration(C62053Bl.A00(r4.A02, r4.A09));
        } else {
            ConversationRowAudioPreview conversationRowAudioPreview2 = r4.A00;
            conversationRowAudioPreview2.A00();
            conversationRowAudioPreview2.setDuration(AnonymousClass2GQ.A03(r4.A02, r4.A09.A01));
            AnonymousClass3A3.A00(r4.A06, r4.A09, r4.A03.A06);
        }
    }
}
