package X;

import android.widget.ImageView;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.3Er  reason: invalid class name and case insensitive filesystem */
public final class C62723Er implements AnonymousClass5TC {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public final int A04;
    public final C35691mL A05;
    public final C108515Oh A06;
    public final C108525Oi A07;
    public final C108535Oj A08;
    public final WeakReference A09;

    public C62723Er(ImageView imageView, C35691mL r3, C108515Oh r4, C108525Oi r5, C108535Oj r6, int i2, int i3, int i4) {
        this.A05 = r3;
        this.A04 = i2;
        this.A08 = r6;
        this.A06 = r4;
        this.A07 = r5;
        this.A01 = i3;
        this.A00 = i4;
        this.A09 = C13690nt.A0h(imageView);
    }

    public boolean A00() {
        ImageView ACj = ACj();
        if (ACj == null) {
            return !this.A03;
        }
        String str = (String) ACj.getTag(R.id.image_id);
        int A0D = AnonymousClass000.A0D(ACj.getTag(R.id.image_quality));
        if (this.A03 || !str.equals(this.A05.A04)) {
            return false;
        }
        return A0D == this.A04 || A0D == 1;
    }

    public boolean A8u() {
        return C13690nt.A1R(this.A04);
    }

    public ImageView ACj() {
        return (ImageView) this.A09.get();
    }

    public int ADO() {
        return this.A00;
    }

    public int ADQ() {
        return this.A01;
    }

    public Integer AE5() {
        return C13690nt.A0U();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2.A05.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AGp() {
        /*
            r2 = this;
            int r1 = r2.A04
            r0 = 2
            if (r1 != r0) goto L_0x000c
            X.1mL r0 = r2.A05
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            return r0
        L_0x000c:
            X.1mL r0 = r2.A05
            java.lang.String r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62723Er.AGp():java.lang.String");
    }

    public String getId() {
        String str = this.A05.A04;
        int i2 = this.A04;
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append('_');
        if (i2 == 1) {
            i2 = 3;
        }
        return AnonymousClass000.A0l(A0q, i2);
    }
}
