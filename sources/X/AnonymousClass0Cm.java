package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.0Cm  reason: invalid class name */
public class AnonymousClass0Cm extends AnonymousClass0AX {
    public int[][] A00;

    public AnonymousClass0Cm(Resources resources, AnonymousClass0Cm r3, AnonymousClass0Cq r4) {
        super(resources, r3, r4);
        this.A00 = r3 != null ? r3.A00 : new int[this.A0X.length][];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: int[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            int[][] r0 = r4.A00
            int r0 = r0.length
            int[][] r3 = new int[r0][]
            int r2 = r0 + -1
        L_0x0007:
            if (r2 < 0) goto L_0x001c
            int[][] r1 = r4.A00
            r0 = r1[r2]
            if (r0 == 0) goto L_0x001a
            r0 = r1[r2]
            java.lang.Object r0 = r0.clone()
        L_0x0015:
            r3[r2] = r0
            int r2 = r2 + -1
            goto L_0x0007
        L_0x001a:
            r0 = 0
            goto L_0x0015
        L_0x001c:
            r4.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Cm.A04():void");
    }

    public void A05(int i2, int i3) {
        super.A05(i2, i3);
        int[][] iArr = new int[i3][];
        System.arraycopy(this.A00, 0, iArr, 0, i2);
        this.A00 = iArr;
    }

    public int A08(int[] iArr) {
        int[][] iArr2 = this.A00;
        int i2 = this.A0A;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new AnonymousClass0Cq((Resources) null, this);
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass0Cq(resources, this);
    }
}
