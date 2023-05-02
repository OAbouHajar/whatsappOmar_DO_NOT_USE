package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0500000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape1S0400000_I1;

/* renamed from: X.3BR  reason: invalid class name */
public class AnonymousClass3BR {
    public static View.OnClickListener A00(Context context, C16040sK r10, AnonymousClass1P7 r11, C38841rV r12, boolean z2) {
        C38841rV r3 = r12;
        UserJid A0C = r12.A0C();
        UserJid userJid = A0C;
        if (r12.A11.A02) {
            userJid = null;
        }
        C16040sK r4 = r10;
        Context context2 = context;
        if (r10.A0G()) {
            return new ViewOnClickCListenerShape17S0100000_I1_2(context, 20);
        }
        AnonymousClass1P7 r5 = r11;
        return z2 ? new ViewOnClickCListenerShape1S0400000_I1(context, userJid, r12, r5, 1) : new ViewOnClickCListenerShape0S0500000_I1(context2, r3, r4, r5, A0C, 0);
    }

    public static String A01(Context context, C16040sK r13, C16440t3 r14, AnonymousClass013 r15, C19430yQ r16, C38841rV r17, boolean z2) {
        int i2;
        if (r13.A0G()) {
            i2 = R.string.str0c7a;
        } else if (z2) {
            C38841rV r4 = r17;
            long j2 = r4.A0I + ((long) (r4.A00 * 1000));
            C19430yQ r1 = r16;
            long A05 = r4.A11.A02 ? r1.A05(r4) : r1.A04(r4);
            long A02 = r14.A02(A05);
            Object[] objArr = new Object[1];
            return A05 > r14.A00() ? C47672Jx.A01(r15, C13680ns.A0d(context, C47672Jx.A00(r15, A02), objArr, 0, R.string.str0c76), A02) : C47672Jx.A01(r15, C13680ns.A0d(context, C47672Jx.A00(r15, j2), objArr, 0, R.string.str0c76), j2);
        } else {
            i2 = R.string.str0c82;
        }
        return context.getString(i2);
    }

    public static boolean A02(C16440t3 r6, C38841rV r7, long j2) {
        long A00 = r6.A00();
        return !r7.A11.A02 ? j2 > A00 : (j2 == -1 && r7.A0I + C13690nt.A08(r7.A00) > A00) || j2 > A00;
    }
}
