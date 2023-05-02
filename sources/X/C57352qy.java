package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.2qy  reason: invalid class name and case insensitive filesystem */
public class C57352qy extends AnonymousClass01W {
    public int A00 = -1;
    public int A01 = -1;
    public boolean A02;
    public boolean A03;
    public final C51012ap A04;
    public final C51022aq A05;
    public final PollCreatorViewModel A06;
    public final List A07 = AnonymousClass000.A0u();
    public final boolean A08;

    public C57352qy(AnonymousClass0Q5 r2, C51012ap r3, C51022aq r4, PollCreatorViewModel pollCreatorViewModel, boolean z2) {
        super(r2);
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = pollCreatorViewModel;
        this.A08 = z2;
    }

    public void A0G(int i2, boolean z2) {
        if (this.A03) {
            this.A03 = false;
            this.A00 = i2;
            this.A02 = z2;
            A01();
            return;
        }
        int i3 = this.A00;
        if (i3 != i2 || this.A02 != z2) {
            this.A00 = i2;
            this.A02 = z2;
            if (i3 >= 0) {
                A02(i3);
            }
            if (i2 >= 0) {
                A02(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r0 != r8) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r6.A02 == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r7, int r8) {
        /*
            r6 = this;
            X.3Rb r7 = (X.C64633Rb) r7
            boolean r0 = r7 instanceof X.AnonymousClass33r
            if (r0 == 0) goto L_0x0054
            boolean r0 = r6.A08
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0077
            java.util.List r2 = r6.A07
            java.util.Iterator r1 = r2.iterator()
        L_0x0012:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()
            int r0 = X.AnonymousClass000.A0D(r0)
            int r0 = r0 + 2
            if (r0 != r8) goto L_0x0012
            r3 = 1
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0040
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0040
            int r0 = X.C13700nu.A00(r2, r5)
            java.lang.Object r0 = r2.get(r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r0 = r0 + 2
            r2 = 1
            if (r0 == r8) goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            X.33r r7 = (X.AnonymousClass33r) r7
            java.lang.Object r1 = r6.A0E(r8)
            X.3wU r1 = (X.C77753wU) r1
            int r0 = r6.A01
            if (r0 != r8) goto L_0x004e
            r4 = 1
        L_0x004e:
            r7.A07(r1, r3, r2, r4)
        L_0x0051:
            return
        L_0x0052:
            r3 = 0
            goto L_0x0040
        L_0x0054:
            boolean r0 = r7 instanceof X.AnonymousClass33q
            if (r0 == 0) goto L_0x0051
            X.33q r7 = (X.AnonymousClass33q) r7
            java.lang.Object r2 = r6.A0E(r8)
            X.3wV r2 = (X.C77763wV) r2
            com.obwhatsapp.WaEditText r1 = r7.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r2.A00
            int r0 = r0.length()
            r1.setSelection(r0)
            return
        L_0x0077:
            int r0 = r6.A00
            boolean r3 = X.AnonymousClass000.A1R(r0, r8)
            X.33r r7 = (X.AnonymousClass33r) r7
            java.lang.Object r2 = r6.A0E(r8)
            X.3wU r2 = (X.C77753wU) r2
            if (r3 == 0) goto L_0x008c
            boolean r0 = r6.A02
            r1 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            int r0 = r6.A01
            if (r0 != r8) goto L_0x0092
            r4 = 1
        L_0x0092:
            r7.A07(r2, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57352qy.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            View inflate = C13680ns.A0G(viewGroup).inflate(R.layout.layout049c, viewGroup, false);
            C51012ap r0 = this.A04;
            PollCreatorViewModel pollCreatorViewModel = this.A06;
            C16150sX r02 = r0.A00.A03;
            C14710pd A0k = C16150sX.A0k(r02);
            return new AnonymousClass33q(inflate, C16150sX.A0T(r02), C16150sX.A0i(r02), A0k, pollCreatorViewModel, C16150sX.A14(r02));
        } else if (i2 == 1) {
            return new C77733wS(C13680ns.A0G(viewGroup).inflate(R.layout.layout049b, viewGroup, false));
        } else {
            if (i2 == 2) {
                View inflate2 = C13680ns.A0G(viewGroup).inflate(R.layout.layout049a, viewGroup, false);
                C51022aq r03 = this.A05;
                PollCreatorViewModel pollCreatorViewModel2 = this.A06;
                C16150sX r04 = r03.A00.A03;
                C14710pd A0k2 = C16150sX.A0k(r04);
                return new AnonymousClass33r(inflate2, C16150sX.A0T(r04), C16150sX.A0Z(r04), C16150sX.A0i(r04), A0k2, pollCreatorViewModel2, C16150sX.A14(r04));
            }
            throw AnonymousClass000.A0V(C13680ns.A0c(i2, "Unrecognized view type = "));
        }
    }

    public int getItemViewType(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i2 != 1 ? 2 : 1;
    }
}
