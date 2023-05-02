package X;

import android.content.SharedPreferences;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1FP  reason: invalid class name */
public final class AnonymousClass1FP implements C19400yN {
    public final C14870pt A00;
    public final AnonymousClass1FO A01;
    public final C14710pd A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;
    public final AnonymousClass01D A05;
    public final AnonymousClass01D A06;
    public final AnonymousClass01D A07;

    public AnonymousClass1FP(C14870pt r2, AnonymousClass1FO r3, C14710pd r4, AnonymousClass01D r5, AnonymousClass01D r6, AnonymousClass01D r7, AnonymousClass01D r8, AnonymousClass01D r9) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r6, 4);
        C18450wi.A0H(r7, 5);
        C18450wi.A0H(r8, 6);
        C18450wi.A0H(r9, 7);
        this.A02 = r4;
        this.A00 = r2;
        this.A07 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A04 = r8;
        this.A06 = r9;
        this.A01 = r3;
    }

    public String AGT() {
        return "AvatarStickerPackAsyncInit";
    }

    public void AMc() {
        C17330uu r6 = (C17330uu) this.A06.get();
        C211913d r5 = (C211913d) this.A04.get();
        C15220qW r4 = ((C212013e) this.A05.get()).A01;
        if (((SharedPreferences) r4.getValue()).getBoolean("pref_avatar_user_local_deletion", false)) {
            this.A00.A0K(new RunnableRunnableShape2S0100000_I0_1(r5, 40));
            r6.A01();
            ((SharedPreferences) r4.getValue()).edit().remove("pref_avatar_user_local_deletion").apply();
        } else if (((SharedPreferences) r4.getValue()).getBoolean("pref_avatar_user_remote_deletion", false)) {
            C18450wi.A09(r6);
            C18450wi.A09(r5);
            r6.A03(new AnonymousClass519(this, r5, r6));
        } else if (!(!this.A02.A0E(C16620tM.A02, 1396)) && ((C26141Mm) this.A03.get()).A01()) {
            AnonymousClass1CX r2 = (AnonymousClass1CX) this.A07.get();
            AnonymousClass14X r3 = r2.A0U;
            C37771pi A012 = r3.A01("meta-avatar");
            if (A012 == null) {
                if ("meta-avatar".contains(" ")) {
                    try {
                        Pair A002 = C27031Qe.A00("meta-avatar");
                        if (A002 != null) {
                            A012 = r2.A0O.A00((String) A002.first, (String) A002.second);
                        }
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder("StickerRepository/getInstalledStickerPackByIdSync/error fetching sticker pack: ");
                        sb.append("meta-avatar");
                        Log.e(sb.toString(), e2);
                    }
                }
                this.A01.A00();
            }
            AnonymousClass00B.A00();
            A012.A00 = r3.A03.A00("meta-avatar");
            List list = A012.A04;
            if (list != null && !list.isEmpty()) {
                return;
            }
            this.A01.A00();
        }
    }
}
