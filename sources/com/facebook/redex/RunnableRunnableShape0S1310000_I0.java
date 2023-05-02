package com.facebook.redex;

import X.C101414xH;
import X.C14550pN;
import X.C15810rt;
import X.C15830rv;
import X.C15840rx;
import X.C15860rz;
import X.C16010sH;
import X.C16200sd;
import X.C16920ts;
import X.C18910xS;
import X.C216314v;
import X.C25931Lr;
import X.C29761b9;
import android.content.ContentValues;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;

public class RunnableRunnableShape0S1310000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public RunnableRunnableShape0S1310000_I0(Object obj, Object obj2, Object obj3, String str, int i2, boolean z2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = z2;
        this.A03 = str;
        this.A02 = obj3;
    }

    public final void run() {
        ContentValues contentValues;
        switch (this.A05) {
            case 0:
                C16200sd r4 = (C16200sd) this.A00;
                byte[] bArr = (byte[]) this.A01;
                boolean z2 = this.A04;
                String str = this.A03;
                C29761b9 r5 = (C29761b9) this.A02;
                try {
                    r4.A01.A02(bArr);
                    C15860rz r1 = r4.A03;
                    r1.A1O(true);
                    r1.A1P(z2);
                    if (!z2 && str != null) {
                        r4.A03(str);
                    }
                    r5.onSuccess();
                    return;
                } catch (IOException unused) {
                    r5.AQc("Failed to store root key", 6, 4, -1, -1);
                    return;
                }
            case 1:
                BlockConfirmationDialogFragment blockConfirmationDialogFragment = (BlockConfirmationDialogFragment) this.A00;
                C14550pN r3 = (C14550pN) this.A01;
                C16010sH r52 = (C16010sH) this.A02;
                String str2 = this.A03;
                boolean z3 = this.A04;
                C25931Lr r2 = blockConfirmationDialogFragment.A07;
                C101414xH r42 = new C101414xH(r3, blockConfirmationDialogFragment, z3);
                r2.A01(r52, str2, (List) null);
                r2.A00(r3, r42, r52, (String) null, (String) null, str2, true);
                return;
            default:
                C18910xS r53 = (C18910xS) this.A00;
                C15830rv r43 = (C15830rv) this.A01;
                String str3 = this.A03;
                Runnable runnable = (Runnable) this.A02;
                boolean z4 = this.A04;
                C16920ts r8 = r53.A09;
                C15810rt r12 = r8.A01;
                if (r12.A06(r43) != null) {
                    Log.w("msgstore/createchat/already exists");
                    return;
                }
                C15840rx r7 = new C15840rx(r43);
                if (z4) {
                    r7.A0D = -1;
                }
                r12.A0D(r7, r43);
                r7.A03 = 1;
                r7.A00 = 1;
                r7.A09 = -1;
                r7.A0A = -1;
                r7.A0V = System.currentTimeMillis();
                r7.A0d = str3;
                C216314v r13 = r8.A02;
                synchronized (r7) {
                    contentValues = new ContentValues(8);
                    contentValues.put("jid_row_id", Long.valueOf(r13.A01(r7.A0i)));
                    contentValues.put("subject", r7.A0d);
                    contentValues.put("plaintext_disabled", Integer.valueOf(r7.A00));
                    contentValues.put("vcard_ui_dismissed", Integer.valueOf(r7.A09));
                    contentValues.put("change_number_notified_message_row_id", Long.valueOf(r7.A0A));
                    contentValues.put("sort_timestamp", Long.valueOf(r7.A0V));
                    contentValues.put("spam_detection", 1);
                }
                long A012 = r8.A01(contentValues);
                if (A012 == -1) {
                    StringBuilder sb = new StringBuilder("msgstore/addchat/insert/failed gid=");
                    sb.append(r43);
                    Log.e(sb.toString());
                } else {
                    r7.A0U = A012;
                }
                if (runnable != null) {
                    runnable.run();
                }
                r53.A00.A0K(new RunnableRunnableShape6S0200000_I0_4(r53, 18, r43));
                return;
        }
    }
}
