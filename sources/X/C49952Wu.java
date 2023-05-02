package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2Wu  reason: invalid class name and case insensitive filesystem */
public class C49952Wu extends AnonymousClass01X {
    public final C001300o A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C17160ud A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass152 A06;
    public final AnonymousClass013 A07;
    public final AnonymousClass2Wv A08;
    public final C55782kM A09;
    public final AnonymousClass1WA A0A;

    public C49952Wu(C001300o r4, C14870pt r5, C16040sK r6, C17160ud r7, C16000sG r8, C16080sP r9, AnonymousClass152 r10, AnonymousClass013 r11, AnonymousClass2Wv r12, C55782kM r13, AnonymousClass1WA r14) {
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A0A = r14;
        this.A05 = r9;
        this.A07 = r11;
        this.A06 = r10;
        this.A00 = r4;
        this.A08 = r12;
        this.A09 = r13;
        r12.A02.A0A(r4, new IDxObserverShape115S0100000_2_I0((Object) this, 220));
    }

    public int A0C() {
        return ((List) this.A08.A02.A01()).size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r17, int i2) {
        String A0G;
        int i3;
        Object[] objArr;
        AnonymousClass3SR r10 = (AnonymousClass3SR) r17;
        Context context = r10.A0H.getContext();
        C55792kN r9 = (C55792kN) ((List) this.A08.A02.A01()).get(i2);
        C15830rv r8 = r9.A04;
        C16010sH A082 = this.A04.A08(r8);
        AnonymousClass00B.A06(A082);
        Bitmap A012 = this.A06.A01(context, A082, 0.0f, context.getResources().getDimensionPixelSize(R.dimen.dimen0680));
        if (A012 == null) {
            C17160ud r3 = this.A03;
            A012 = r3.A03(r3.A01.A00, r3.A01(A082));
        }
        boolean A0I = this.A02.A0I(r8);
        if (A0I) {
            A0G = context.getString(R.string.str1347);
        } else {
            boolean z2 = this.A09.A0A;
            int i4 = 4;
            if (z2) {
                i4 = 3;
            }
            C16080sP r1 = this.A05;
            A0G = (!r1.A0S(A082, i4) || !z2) ? r1.A0G(A082, i4, false) : this.A07.A0H(C24561Gk.A01(A082));
        }
        String str = r9.A05;
        AnonymousClass00B.A06(str);
        if (A0I) {
            i3 = R.string.str1342;
            objArr = new Object[]{str};
        } else {
            i3 = R.string.str1343;
            objArr = new Object[]{A0G, str};
        }
        this.A0A.execute(new AnonymousClass3IE(context, A012, A082, r8, r9, r10, this, A0G, str, context.getString(i3, objArr), A0I));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        boolean z2 = this.A09.A09;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return z2 ? new C78123xD(from.inflate(R.layout.layout04ee, viewGroup, false)) : new AnonymousClass3SR(from.inflate(R.layout.layout04ed, viewGroup, false));
    }
}
