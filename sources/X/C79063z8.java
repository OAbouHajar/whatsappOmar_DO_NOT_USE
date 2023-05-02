package X;

import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupChatInfoActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3z8  reason: invalid class name and case insensitive filesystem */
public class C79063z8 extends C16690tT {
    public final C16300so A00;
    public final C14870pt A01;
    public final AnonymousClass127 A02;
    public final C17230uk A03;
    public final C16080sP A04;
    public final C16010sH A05;
    public final C17190ug A06;
    public final C16320sq A07;
    public final String A08;
    public final WeakReference A09;

    public C79063z8(C16300so r2, C14870pt r3, AnonymousClass127 r4, C17230uk r5, C16080sP r6, C16010sH r7, GroupChatInfoActivity groupChatInfoActivity, C17190ug r9, C16320sq r10, String str) {
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = r10;
        this.A06 = r9;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A08 = str;
        this.A09 = C13690nt.A0h(groupChatInfoActivity);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Integer.valueOf(this.A03.A00(((C16050sL[]) objArr)[0]));
    }

    public void A09() {
        C14550pN r1 = (C14550pN) this.A09.get();
        if (r1 != null) {
            r1.Afq(R.string.str0c8c);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        Object[] objArr;
        Number number = (Number) obj;
        C14550pN r4 = (C14550pN) this.A09.get();
        if (r4 != null) {
            r4.Ac1();
            if (r4.AIm()) {
                return;
            }
            if (number.intValue() <= 2) {
                AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[]{this.A04.A08(this.A05)}, R.string.str04e8);
                A012.A05 = R.string.str04e7;
                A012.A0B = new Object[0];
                A012.A00 = R.string.str04e8;
                A012.A01(new IDxCListenerShape23S0000000_2_I1(14), R.string.str0e87);
                IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 60);
                A012.A04 = R.string.str00b0;
                A012.A07 = iDxCListenerShape128S0100000_2_I1;
                A012.A00().A1G(r4.AGM(), (String) null);
                return;
            }
            String str = this.A08;
            if (str == null) {
                i2 = R.string.str0505;
                objArr = new Object[]{this.A04.A08(this.A05)};
            } else {
                i2 = R.string.str0506;
                objArr = new Object[]{this.A04.A08(this.A05), str};
            }
            AnonymousClass2T3 A013 = LegacyMessageDialogFragment.A01(objArr, i2);
            A013.A05 = R.string.str0507;
            A013.A0B = new Object[0];
            A013.A00 = R.string.str0507;
            A013.A01(new IDxCListenerShape29S0200000_2_I1(r4, 21, this), R.string.str13e4);
            IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(15);
            A013.A04 = R.string.str0394;
            A013.A07 = iDxCListenerShape23S0000000_2_I1;
            A013.A00().A1G(r4.AGM(), (String) null);
        }
    }
}
