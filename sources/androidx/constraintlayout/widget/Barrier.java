package androidx.constraintlayout.widget;

import X.AnonymousClass0Dn;
import X.AnonymousClass0NK;
import X.C012306a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends C012306a {
    public int A00;
    public AnonymousClass0Dn A01;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        super.setVisibility(8);
    }

    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
        this.A01 = new AnonymousClass0Dn();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0NK.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.A00 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.A01.A02 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.A01.A01 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.A02 = this.A01;
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r4 == 6) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r4 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0SN r6, boolean r7) {
        /*
            r5 = this;
            int r4 = r5.A00
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            r1 = 5
            r0 = 17
            if (r3 < r0) goto L_0x001a
            if (r7 == 0) goto L_0x001a
            if (r4 == r1) goto L_0x001e
            if (r4 != r2) goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            boolean r0 = r6 instanceof X.AnonymousClass0Dn
            if (r0 == 0) goto L_0x0019
            X.0Dn r6 = (X.AnonymousClass0Dn) r6
            r6.A00 = r4
        L_0x0019:
            return
        L_0x001a:
            if (r4 == r1) goto L_0x0010
            if (r4 != r2) goto L_0x0011
        L_0x001e:
            r4 = 1
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.A05(X.0SN, boolean):void");
    }

    public int getMargin() {
        return this.A01.A01;
    }

    public int getType() {
        return this.A00;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.A01.A02 = z2;
    }

    public void setDpMargin(int i2) {
        this.A01.A01 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.A01.A01 = i2;
    }

    public void setType(int i2) {
        this.A00 = i2;
    }
}
