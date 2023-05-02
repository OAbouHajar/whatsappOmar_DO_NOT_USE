package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2Xk  reason: invalid class name and case insensitive filesystem */
public class C50042Xk extends AnonymousClass26d {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;

    public C50042Xk(AnonymousClass2ZZ r2, AnonymousClass2ZY r3, AnonymousClass2ZX r4, AnonymousClass2ZW r5, AnonymousClass2ZV r6, C14710pd r7) {
        super(r2, r3, r4, r5, r6, r7);
        this.A00 = R.style.style038d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r3 == 9) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0E(int r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000a
            r0 = 3
            if (r3 == r0) goto L_0x000a
            r0 = 9
            r1 = 0
            if (r3 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.AnonymousClass00B.A0B(r0, r1)
            android.view.View r0 = super.A0E(r3, r4)
            r2.A0M(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50042Xk.A0E(int, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 == 9) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass26E A0F(android.view.View r4, int r5) {
        /*
            r3 = this;
            r2 = 1
            if (r5 == 0) goto L_0x000b
            r0 = 3
            if (r5 == r0) goto L_0x000b
            r0 = 9
            r1 = 0
            if (r5 != r0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.AnonymousClass00B.A0B(r0, r1)
            X.26E r0 = super.A0G(r4, r5, r2)
            r0.A08 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50042Xk.A0F(android.view.View, int):X.26E");
    }

    public void A0I(AnonymousClass26E r2, int i2) {
        super.ANf(r2, i2);
        A0M(r2.A0H);
        r2.A09(3);
    }

    public void A0J(AnonymousClass26E r2, List list, int i2) {
        super.A08(r2, list, i2);
        A0M(r2.A0H);
        r2.A09(3);
    }

    public void A0L(List list) {
        RecyclerView recyclerView;
        if (!list.isEmpty() && (recyclerView = this.A01) != null) {
            int i2 = this.A02;
            int width = recyclerView.getWidth();
            if (width != 0) {
                this.A01 = width;
            }
            int size = list.size();
            int i3 = this.A01;
            int i4 = size == 3 ? (i3 + this.A00) / 3 : (int) (((double) i3) / 3.25d);
            this.A02 = i4;
            if (!(i2 == 0 || i4 == 0 || i2 == i4)) {
                A01();
            }
        }
        super.A0L(list);
    }

    public final void A0M(View view) {
        if (this.A02 == 0 && this.A01 != null) {
            int size = this.A0E.size();
            int i2 = this.A01;
            this.A02 = size == 3 ? (i2 + this.A00) / 3 : (int) (((double) i2) / 3.25d);
        }
        if (this.A01 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = this.A02;
            if (i3 != layoutParams.height) {
                layoutParams.height = i3;
                layoutParams.width = i3 - this.A00;
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
