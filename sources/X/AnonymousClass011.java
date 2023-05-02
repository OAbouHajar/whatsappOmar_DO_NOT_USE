package X;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: X.011  reason: invalid class name */
public abstract class AnonymousClass011 extends AnonymousClass012 {
    public AnonymousClass050 A00 = null;
    public AnonymousClass01A A01 = null;
    public boolean A02;
    public final int A03;
    public final AnonymousClass02C A04;

    public AnonymousClass011(AnonymousClass02C r2, int i2) {
        this.A04 = r2;
        this.A03 = i2;
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass050(this.A04);
        }
        long A0F = A0F(i2);
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(A0F);
        AnonymousClass01A A0B = this.A04.A0B(sb.toString());
        if (A0B != null) {
            this.A00.A0G(new AnonymousClass0W0(A0B, 7));
        } else {
            A0B = A0G(i2);
            AnonymousClass050 r5 = this.A00;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(A0F);
            r5.A0D(A0B, sb2.toString(), id2);
        }
        if (A0B != this.A01) {
            A0B.A0b(false);
            if (this.A03 == 1) {
                this.A00.A0B(A0B, C011005f.STARTED);
            } else {
                A0B.A0o(false);
                return A0B;
            }
        }
        return A0B;
    }

    /* JADX INFO: finally extract failed */
    public void A0A(ViewGroup viewGroup) {
        AnonymousClass050 r2 = this.A00;
        if (r2 != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    r2.A04();
                    this.A02 = false;
                } catch (Throwable th) {
                    this.A02 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    public void A0B(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass01A r6 = (AnonymousClass01A) obj;
        AnonymousClass01A r0 = this.A01;
        if (r6 != r0) {
            if (r0 != null) {
                r0.A0b(false);
                if (this.A03 == 1) {
                    AnonymousClass050 r2 = this.A00;
                    if (r2 == null) {
                        r2 = new AnonymousClass050(this.A04);
                        this.A00 = r2;
                    }
                    r2.A0B(this.A01, C011005f.STARTED);
                } else {
                    this.A01.A0o(false);
                }
            }
            r6.A0b(true);
            if (this.A03 == 1) {
                AnonymousClass050 r1 = this.A00;
                if (r1 == null) {
                    r1 = new AnonymousClass050(this.A04);
                    this.A00 = r1;
                }
                r1.A0B(r6, C011005f.RESUMED);
            } else {
                r6.A0o(true);
            }
            this.A01 = r6;
        }
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass01A r5 = (AnonymousClass01A) obj;
        AnonymousClass050 r2 = this.A00;
        if (r2 == null) {
            r2 = new AnonymousClass050(this.A04);
            this.A00 = r2;
        }
        AnonymousClass02C r1 = r5.A0H;
        if (r1 == null || r1 == r2.A0J) {
            r2.A0G(new AnonymousClass0W0(r5, 6));
            if (r5.equals(this.A01)) {
                this.A01 = null;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r5.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public boolean A0E(View view, Object obj) {
        return ((AnonymousClass01A) obj).A0A == view;
    }

    public long A0F(int i2) {
        return (long) i2;
    }

    public abstract AnonymousClass01A A0G(int i2);
}
