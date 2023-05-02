package X;

import java.net.InetAddress;

/* renamed from: X.1fJ  reason: invalid class name and case insensitive filesystem */
public class C31961fJ {
    public int A00;
    public boolean A01;
    public final C35771mT A02;
    public final boolean A03;
    public final InetAddress[] A04;

    public C31961fJ(C35771mT r3, InetAddress inetAddress, int i2, boolean z2) {
        this.A00 = i2;
        this.A02 = r3;
        this.A04 = new InetAddress[]{inetAddress};
        this.A03 = z2;
    }

    public C31961fJ(C35771mT r3, InetAddress[] inetAddressArr) {
        this.A00 = -1;
        this.A02 = r3;
        this.A04 = inetAddressArr;
        this.A03 = false;
    }
}
