package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.3CB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CB implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass5RM A03;
    public final /* synthetic */ AnonymousClass29B A04;
    public final /* synthetic */ C16760tb A05;
    public final /* synthetic */ C15860rz A06;
    public final /* synthetic */ C18030w2 A07;
    public final /* synthetic */ C16490t9 A08;
    public final /* synthetic */ C18040w3 A09;
    public final /* synthetic */ AnonymousClass1L9 A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ Set A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public /* synthetic */ AnonymousClass3CB(Context context, AnonymousClass5RM r3, AnonymousClass29B r4, C16760tb r5, C15860rz r6, C18030w2 r7, C16490t9 r8, C18040w3 r9, AnonymousClass1L9 r10, Integer num, String str, Set set, int i2, int i3, boolean z2, boolean z3) {
        this.A03 = r3;
        this.A0E = z2;
        this.A0F = z3;
        this.A06 = r6;
        this.A01 = i2;
        this.A02 = context;
        this.A0C = str;
        this.A0A = r10;
        this.A08 = r8;
        this.A07 = r7;
        this.A09 = r9;
        this.A0D = set;
        this.A05 = r5;
        this.A04 = r4;
        this.A0B = num;
        this.A00 = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass5RM r7 = this.A03;
        boolean z2 = this.A0E;
        boolean z3 = this.A0F;
        C15860rz r0 = this.A06;
        int i3 = this.A01;
        Context context = this.A02;
        String str = this.A0C;
        AnonymousClass1L9 r13 = this.A0A;
        C16490t9 r11 = this.A08;
        C18030w2 r10 = this.A07;
        C18040w3 r12 = this.A09;
        Set set = this.A0D;
        C16760tb r9 = this.A05;
        AnonymousClass29B r8 = this.A04;
        Integer num = this.A0B;
        int i4 = this.A00;
        r7.AVz();
        if (z2 != z3) {
            C13680ns.A0z(r0.A0K(), "pref_delete_media", z2);
        }
        if (i3 >= 1) {
            AnonymousClass00B.A06(str);
            String A0d = C13680ns.A0d(context, str, new Object[1], 0, R.string.str00cf);
            if (r13.A03 && r13.A00 == 3) {
                r13.A00 = 4;
                r13.A00(5);
            }
            C85514Ot r6 = new C85514Ot(r7, r8, r9, r10, r11, r12, r13, num, set, i4, z2);
            C32241fu A002 = C32241fu.A00(context);
            IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(r6, 13);
            IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(3);
            A002.A06(A0d);
            A002.setPositiveButton(R.string.str00ce, iDxCListenerShape128S0100000_2_I1);
            A002.setNegativeButton(R.string.str0394, iDxCListenerShape23S0000000_2_I1);
            A002.A07(true);
            C13690nt.A1G(A002);
            return;
        }
        AnonymousClass3BP.A02(r10, r11, r12, set, 1);
        r9.A0W(set, z2);
        if (r13.A03 && r13.A00 == 3) {
            r13.A00 = 5;
            r13.A00(3);
        }
        r8.APW();
        if (num != null) {
            r7.AXE(num.intValue());
        }
    }
}
