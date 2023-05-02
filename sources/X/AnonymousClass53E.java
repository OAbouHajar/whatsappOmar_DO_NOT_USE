package X;

import com.obwhatsapp.status.playback.MessageReplyActivity;
import java.io.File;

/* renamed from: X.53E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass53E implements C108995Qh {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass53E(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final void AWN(AnonymousClass4J3 r6) {
        C28381Vw r1;
        AnonymousClass1ZK r4;
        MessageReplyActivity messageReplyActivity = this.A00;
        AnonymousClass4LA r2 = r6.A01;
        if (r2 != null && (r1 = r2.A01) != null && r1.equals(messageReplyActivity.A0s.A11) && (r4 = messageReplyActivity.A16) != null) {
            r4.A0M(r2.A02, (File) null, true, false);
        }
    }
}
