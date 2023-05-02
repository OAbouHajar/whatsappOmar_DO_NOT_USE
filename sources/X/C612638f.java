package X;

import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.38f  reason: invalid class name and case insensitive filesystem */
public class C612638f {
    public final AnonymousClass1B5 A00;
    public final C15860rz A01;
    public final VoiceNoteProfileAvatarView A02;

    public C612638f(AnonymousClass1B5 r1, C15860rz r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = voiceNoteProfileAvatarView;
    }

    public void A00(C38701rH r7) {
        AnonymousClass2DT r2;
        C30211bx r0;
        C19610yi r1 = this.A00.A03;
        if (r1.A0D(r7)) {
            r2 = r1.A00();
            if (r2 != null) {
                r2.A09++;
            }
        } else {
            r2 = null;
        }
        int i2 = AnonymousClass2DT.A0x;
        int i3 = 1;
        if (i2 != 0) {
            i3 = 2;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 0;
                } else {
                    throw AnonymousClass000.A0V(C13680ns.A0c(i2, "fastPlaybackOnClick: Did not handle fastPlaybackPlayerState: "));
                }
            }
        }
        if (r2 == null || (r0 = r2.A0P) == null || !r0.A0D() || r2.A0K(i3)) {
            AnonymousClass2DT.A0x = i3;
            C13680ns.A0w(this.A01.A0K(), "ptt_fast_playback_player_state", i3);
            C28381Vw r02 = r7.A11;
            boolean z2 = r02.A02;
            boolean A0L = C16030sJ.A0L(r02.A00);
            int i4 = 1;
            if (i3 != 0) {
                i4 = 2;
                if (i3 != 1) {
                    i4 = 3;
                }
            }
            this.A02.A01(i4, false, z2, A0L);
        }
    }
}
