package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.1LH  reason: invalid class name */
public abstract class AnonymousClass1LH extends AnonymousClass1LF {
    public final C19980zJ A00;
    public final AnonymousClass1LD A01;

    public AnonymousClass1LH(C19980zJ r1, AnonymousClass1LD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A02(Activity activity, C16740tZ r7) {
        C18450wi.A0H(r7, 0);
        C15830rv A0B = r7.A0B();
        if (A0B == null) {
            return false;
        }
        this.A01.A00.put(A0B, r7);
        Intent A08 = C14750ph.A08(activity, 0);
        C18450wi.A0B(A08);
        A08.putExtra("jid", C16030sJ.A03(r7.A0B()));
        A08.putExtra("args_conversation_screen_entry_point", 2);
        A08.putExtra("extra_quoted_message_row_id", r7.A0F);
        this.A00.A07(activity, A08);
        return true;
    }
}
