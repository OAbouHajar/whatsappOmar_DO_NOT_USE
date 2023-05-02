package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.facebook.redex.IDxFListenerShape312S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.1Tb  reason: invalid class name and case insensitive filesystem */
public class C27771Tb implements C19420yP {
    public final C27761Ta A00;

    public C27771Tb(C27761Ta r1) {
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{179, 223};
    }

    public boolean AHS(Message message, int i2) {
        String str;
        if (i2 == 179) {
            Bundle data = message.getData();
            String string = data.getString("nonce");
            AnonymousClass00B.A06(string);
            String string2 = data.getString("apiKey");
            AnonymousClass00B.A06(string2);
            C27761Ta r6 = this.A00;
            Context context = r6.A00.A00;
            int A002 = C437421i.A00(context);
            if (A002 == 0) {
                C53112f1 r0 = new C53112f1(context);
                byte[] bytes = string.getBytes();
                C437121f r02 = r0.A05;
                C53142f5 r4 = new C53142f5(r02, string2, bytes);
                r02.A02(r4);
                C53162f9 r3 = new C53162f9(new AnonymousClass2f7());
                C53192fC r2 = C53182fB.A00;
                C14370p3 r1 = new C14370p3();
                r4.addStatusListener(new C53202fD(r4, r3, r2, r1));
                C14210on r22 = r1.A00;
                C53222fG r03 = new C53222fG(r6);
                Executor executor = C14500pH.A00;
                r22.A06(r03, executor);
                r22.A05(new IDxFListenerShape312S0100000_2_I0(r6, 1), executor);
                return true;
            }
            C27781Tc r42 = r6.A01;
            StringBuilder sb = new StringBuilder("Google Play Services Unavailable. Connection result code: ");
            sb.append(A002);
            r42.A01((String) null, sb.toString(), 1001);
            str = "requestAttestation/cannot request attestation Google APIs unavailable";
        } else if (i2 != 223) {
            return false;
        } else {
            int i3 = message.getData().getInt("maxAppsCount");
            C27761Ta r62 = this.A00;
            Context context2 = r62.A00.A00;
            int A003 = C437421i.A00(context2);
            if (A003 == 0) {
                C437121f r04 = new C53112f1(context2).A05;
                C53232fI r43 = new C53232fI(r04);
                r04.A02(r43);
                C53162f9 r32 = new C53162f9(new C53242fJ());
                C53192fC r23 = C53182fB.A00;
                C14370p3 r12 = new C14370p3();
                r43.addStatusListener(new C53202fD(r43, r32, r23, r12));
                C14210on r33 = r12.A00;
                C53252fK r05 = new C53252fK(r62, i3);
                Executor executor2 = C14500pH.A00;
                r33.A06(r05, executor2);
                r33.A05(new IDxFListenerShape312S0100000_2_I0(r62, 2), executor2);
                return true;
            }
            C27781Tc r34 = r62.A01;
            StringBuilder sb2 = new StringBuilder("Google Play Services Unavailable. Connection result code: ");
            sb2.append(A003);
            r34.A00(sb2.toString(), 1001);
            str = "requestHarmfulApps/Google APIs unavailable";
        }
        Log.i(str);
        return true;
    }
}
