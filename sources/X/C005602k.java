package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.02k  reason: invalid class name and case insensitive filesystem */
public abstract class C005602k {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = 0;
    public long A08 = -1;
    public AnonymousClass0SJ A09 = null;
    public C005602k A0A = null;
    public C005602k A0B = null;
    public RecyclerView A0C;
    public WeakReference A0D;
    public List A0E = null;
    public List A0F = null;
    public boolean A0G = false;
    public final View A0H;

    public C005602k(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final int A00() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A09(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01() {
        /*
            r1 = this;
            int r0 = r1.A00
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0013
            java.util.List r0 = r1.A0E
            if (r0 == 0) goto L_0x0013
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r1.A0F
            return r0
        L_0x0013:
            java.util.List r0 = A0I
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005602k.A01():java.util.List");
    }

    public void A02() {
        this.A00 = 0;
        this.A05 = -1;
        this.A03 = -1;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = 0;
        this.A0A = null;
        this.A0B = null;
        List list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A07 = 0;
        this.A04 = -1;
        RecyclerView.A05(this);
    }

    public void A03(int i2, boolean z2) {
        if (this.A03 == -1) {
            this.A03 = this.A05;
        }
        int i3 = this.A06;
        if (i3 == -1) {
            i3 = this.A05;
            this.A06 = i3;
        }
        if (z2) {
            this.A06 = i3 + i2;
        }
        this.A05 += i2;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            ((AnonymousClass0Bp) view.getLayoutParams()).A01 = true;
        }
    }

    public final void A04(boolean z2) {
        int i2;
        int i3 = this.A01;
        int i4 = z2 ? i3 - 1 : i3 + 1;
        this.A01 = i4;
        if (i4 < 0) {
            this.A01 = 0;
            StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
            return;
        }
        if (!z2) {
            if (i4 == 1) {
                i2 = this.A00 | 16;
            } else {
                return;
            }
        } else if (i4 == 0) {
            i2 = this.A00 & -17;
        } else {
            return;
        }
        this.A00 = i2;
    }

    public boolean A05() {
        return (this.A00 & 128) != 0;
    }

    public boolean A06() {
        return (this.A00 & 1) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder{");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" position=");
        sb.append(this.A05);
        sb.append(" id=");
        sb.append(this.A08);
        sb.append(", oldPos=");
        sb.append(this.A03);
        sb.append(", pLpos:");
        sb.append(this.A06);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (this.A09 != null) {
            sb2.append(" scrap ");
            sb2.append(this.A0G ? "[changeScrap]" : "[attachedScrap]");
        }
        int i2 = this.A00;
        if ((i2 & 4) != 0) {
            sb2.append(" invalid");
        }
        if (!A06()) {
            sb2.append(" unbound");
        }
        if ((i2 & 2) != 0) {
            sb2.append(" update");
        }
        if ((this.A00 & 8) != 0) {
            sb2.append(" removed");
        }
        if (A05()) {
            sb2.append(" ignored");
        }
        if ((i2 & 256) != 0) {
            sb2.append(" tmpDetached");
        }
        if ((i2 & 16) != 0 || this.A0H.hasTransientState()) {
            StringBuilder sb3 = new StringBuilder(" not recyclable(");
            sb3.append(this.A01);
            sb3.append(")");
            sb2.append(sb3.toString());
        }
        int i3 = this.A00;
        if (!((i3 & 512) == 0 && (i3 & 4) == 0)) {
            sb2.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
