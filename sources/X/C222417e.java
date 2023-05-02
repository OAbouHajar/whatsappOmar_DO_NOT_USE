package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0;

/* renamed from: X.17e  reason: invalid class name and case insensitive filesystem */
public class C222417e {
    public final C16040sK A00;
    public final C15800rs A01;
    public final C222317d A02;
    public final C15860rz A03;
    public final C15810rt A04;
    public final C16490t9 A05;
    public final C16320sq A06;

    public C222417e(C16040sK r1, C15800rs r2, C222317d r3, C15860rz r4, C15810rt r5, C16490t9 r6, C16320sq r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(Context context, View view, C16760tb r7, C15830rv r8, Integer num) {
        C32291fz A012 = C32291fz.A01(view, context.getString(R.string.str0107), 0);
        A012.A09(context.getString(R.string.str186b), new ViewOnClickCListenerShape0S0300000_I0(r8, num, r7, 2));
        A012.A07(AnonymousClass00T.A00(context, R.color.color0735));
        ((TextView) A012.A05.findViewById(R.id.snackbar_text)).setSingleLine(false);
        A012.A03();
    }

    public static boolean A01(C15860rz r1, C15810rt r2, C15830rv r3) {
        return r1.A1b() && !r1.A1c() && r2.A0G(r3);
    }

    public void A02() {
        if (!this.A00.A0G()) {
            C15860rz r3 = this.A03;
            r3.A0K().putBoolean("archive_v2_enabled", true).apply();
            r3.A0K().putBoolean("notify_new_message_for_archived_chats", false).apply();
            this.A06.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A02, 6));
        }
    }

    public void A03(boolean z2) {
        AnonymousClass00B.A0D("archiveutil/setArchiveModeAndUpdateCompanion only primary can set this setting", !this.A00.A0G());
        this.A03.A0K().putBoolean("notify_new_message_for_archived_chats", z2).apply();
        this.A06.Acl(new RunnableRunnableShape8S0100000_I0_7(this.A02, 6));
        C16490t9 r2 = this.A05;
        C34351k7 r1 = new C34351k7();
        r1.A00 = Boolean.valueOf(!z2);
        r2.A06(r1);
    }
}
