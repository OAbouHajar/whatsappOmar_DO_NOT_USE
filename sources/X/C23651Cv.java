package X;

/* renamed from: X.1Cv  reason: invalid class name and case insensitive filesystem */
public class C23651Cv {
    public static final int A0D = ((int) (AnonymousClass01S.A00 / 8192));
    public final C23661Cw A00;
    public final Object A01 = new Object();
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final Object A05 = new Object();
    public final Object A06 = new Object();
    public volatile C34701kj A07;
    public volatile C34701kj A08;
    public volatile C34701kj A09;
    public volatile C34701kj A0A;
    public volatile C34701kj A0B;
    public volatile C34701kj A0C;

    public C23651Cv(C23661Cw r2) {
        this.A00 = r2;
    }

    public C34711kk A00() {
        if (this.A08 == null) {
            synchronized (this.A02) {
                if (this.A08 == null) {
                    this.A08 = this.A00.A00("composerThumbCache", A0D);
                }
            }
        }
        return this.A08;
    }

    public C34711kk A01() {
        if (this.A09 == null) {
            synchronized (this.A03) {
                if (this.A09 == null) {
                    this.A09 = this.A00.A00("contactsThumbCache", A0D);
                }
            }
        }
        return this.A09;
    }

    public C34711kk A02() {
        if (this.A0A == null) {
            synchronized (this.A04) {
                if (this.A0A == null) {
                    this.A0A = this.A00.A00("mediaThumbCache", A0D);
                }
            }
        }
        return this.A0A;
    }

    public C34711kk A03() {
        if (this.A0B == null) {
            synchronized (this.A05) {
                if (this.A0B == null) {
                    this.A0B = this.A00.A00("stickerFrameCache", A0D / 2);
                }
            }
        }
        return this.A0B;
    }

    public C34711kk A04() {
        if (this.A0C == null) {
            synchronized (this.A06) {
                if (this.A0C == null) {
                    this.A0C = this.A00.A00("stickerTrayIconCache", A0D / 2);
                }
            }
        }
        return this.A0C;
    }
}
