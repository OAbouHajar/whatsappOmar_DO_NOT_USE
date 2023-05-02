package X;

import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2zh  reason: invalid class name and case insensitive filesystem */
public class C59982zh extends AnonymousClass2v4 {
    public final /* synthetic */ StatusPlaybackActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59982zh(AnonymousClass02C r1, StatusPlaybackActivity statusPlaybackActivity) {
        super(r1);
        this.A00 = statusPlaybackActivity;
    }

    public int A01() {
        StatusPlaybackActivity statusPlaybackActivity = this.A00;
        AnonymousClass398 r1 = statusPlaybackActivity.A0D;
        if (r1 == null || !statusPlaybackActivity.A0J) {
            return 0;
        }
        return r1.A00.size();
    }

    public /* bridge */ /* synthetic */ int A0F(Object obj) {
        AnonymousClass01A r5 = (AnonymousClass01A) obj;
        if (r5 instanceof StatusPlaybackFragment) {
            StatusPlaybackActivity statusPlaybackActivity = this.A00;
            AnonymousClass398 r1 = statusPlaybackActivity.A0D;
            UserJid userJid = ((StatusPlaybackContactFragment) ((StatusPlaybackFragment) r5)).A0S;
            AnonymousClass00B.A06(userJid);
            int A002 = r1.A00(userJid.getRawString());
            if (A002 < 0 || A002 >= statusPlaybackActivity.A0D.A00.size()) {
                return -2;
            }
            return A002;
        }
        return -2;
    }
}
