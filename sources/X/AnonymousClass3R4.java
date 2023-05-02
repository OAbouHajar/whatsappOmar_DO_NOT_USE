package X;

import android.view.ViewGroup;
import com.facebook.redex.IDxDObserverShape32S0100000_2_I1;
import com.obwhatsapp.StickyHeadersRecyclerView;

/* renamed from: X.3R4  reason: invalid class name */
public class AnonymousClass3R4 extends AnonymousClass01X {
    public AnonymousClass01X A00;

    public AnonymousClass3R4(AnonymousClass01X r3) {
        this.A00 = r3;
        A0B(r3.A00);
        r3.A01.registerObserver(new IDxDObserverShape32S0100000_2_I1(this, 1));
    }

    public int A0C() {
        AnonymousClass01X r0 = this.A00;
        return r0.A0C() + ((C54622hr) r0).ACY();
    }

    public long A0D(int i2) {
        long A0E = A0E(i2);
        return StickyHeadersRecyclerView.A09(A0E) ? ((C54622hr) this.A00).ACZ((int) (A0E >> 32)) : this.A00.A0D((int) (A0E & 4294967295L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = r2 << 32;
        r0 = (long) (r6 + (r9 - r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0E(int r9) {
        /*
            r8 = this;
            X.01X r7 = r8.A00
            X.2hr r7 = (X.C54622hr) r7
            int r3 = r7.ACY()
            r2 = 0
            r6 = 0
            r5 = 0
        L_0x000b:
            r4 = 32
            if (r2 >= r3) goto L_0x002b
            if (r5 != r9) goto L_0x001a
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0018:
            long r2 = r2 | r0
            return r2
        L_0x001a:
            int r5 = r5 + 1
            int r1 = r7.AB1(r2)
            int r0 = r5 + r1
            if (r0 <= r9) goto L_0x0026
            long r2 = (long) r2
            goto L_0x002e
        L_0x0026:
            int r6 = r6 + r1
            int r2 = r2 + 1
            r5 = r0
            goto L_0x000b
        L_0x002b:
            int r0 = r3 + -1
            long r2 = (long) r0
        L_0x002e:
            long r2 = r2 << r4
            int r9 = r9 - r5
            int r6 = r6 + r9
            long r0 = (long) r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R4.A0E(int):long");
    }

    public void ANf(C005602k r6, int i2) {
        long A0E = A0E(i2);
        if (StickyHeadersRecyclerView.A09(A0E)) {
            ((C54622hr) this.A00).ANd(r6, (int) (A0E >> 32));
        } else {
            this.A00.ANf(r6, (int) (A0E & 4294967295L));
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        return i2 == -1000 ? ((C54622hr) this.A00).APB(viewGroup) : this.A00.APF(viewGroup, i2);
    }

    public int getItemViewType(int i2) {
        long A0E = A0E(i2);
        if (StickyHeadersRecyclerView.A09(A0E)) {
            return -1000;
        }
        return this.A00.getItemViewType((int) (A0E & 4294967295L));
    }
}
