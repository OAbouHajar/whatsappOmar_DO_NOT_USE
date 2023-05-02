package X;

import com.obwhatsapp.conversation.conversationrow.ConversationRowAudioPreview;

/* renamed from: X.51g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1034051g implements AnonymousClass5QG {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ C1034051g(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void AUp(int i2, String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A00.A00;
        conversationRowAudioPreview.setDuration(str);
        if (i2 != 0) {
            conversationRowAudioPreview.A00();
            return;
        }
        conversationRowAudioPreview.A03.setVisibility(0);
        conversationRowAudioPreview.A00.setVisibility(8);
    }
}
