package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.4mf  reason: invalid class name and case insensitive filesystem */
public class C95454mf implements C015507l {
    public int A00;
    public int A01;
    public final WeakReference A02;

    public C95454mf(TabLayout tabLayout) {
        this.A02 = C13690nt.A0h(tabLayout);
    }

    public void AUN(int i2) {
        this.A00 = this.A01;
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r4.A09(r7, r6, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3 == 2) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r5.A00 != 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUO(int r6, float r7, int r8) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.A02
            java.lang.Object r4 = r0.get()
            com.google.android.material.tabs.TabLayout r4 = (com.google.android.material.tabs.TabLayout) r4
            if (r4 == 0) goto L_0x001e
            int r3 = r5.A01
            r2 = 0
            r0 = 2
            r1 = 1
            if (r3 != r0) goto L_0x001f
            int r0 = r5.A00
            if (r0 == r1) goto L_0x0016
            r1 = 0
        L_0x0016:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            r4.A09(r7, r6, r1, r2)
        L_0x001e:
            return
        L_0x001f:
            if (r3 != r0) goto L_0x001a
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95454mf.AUO(int, float, int):void");
    }

    public void AUP(int i2) {
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.A0c.size()) {
            int i3 = this.A01;
            tabLayout.A0G(tabLayout.A04(i2), i3 == 0 || (i3 == 2 && this.A00 == 0));
        }
    }
}
