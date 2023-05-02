package X;

import android.os.Build;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.14x  reason: invalid class name and case insensitive filesystem */
public class C216514x implements C19400yN {
    public final C52232dM A00;

    public C216514x(C16040sK r3, AnonymousClass01V r4, C16980tz r5, C14710pd r6) {
        this.A00 = Build.VERSION.SDK_INT >= 28 ? new C52232dM(r3, r4, r5, r6) : null;
    }

    public int A00() {
        C52232dM A04 = A04();
        AnonymousClass00B.A01();
        return A04.A07.size();
    }

    public int A01() {
        C52232dM r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null) {
            return 0;
        }
        return r0.A04();
    }

    public Connection A02(ConnectionRequest connectionRequest, boolean z2) {
        return A04().A05(connectionRequest, z2);
    }

    public AnonymousClass3M9 A03(String str) {
        return A04().A06(str);
    }

    public final C52232dM A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            C52232dM r0 = this.A00;
            AnonymousClass00B.A06(r0);
            return r0;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public void A05() {
        A04().A07();
    }

    public void A06(ConnectionRequest connectionRequest) {
        A04().A0A(connectionRequest);
    }

    public void A07(ConnectionRequest connectionRequest) {
        A04().A0B(connectionRequest);
    }

    public void A08(C52242dN r2) {
        A04().A02(r2);
    }

    public void A09(C52242dN r2) {
        A04().A03(r2);
    }

    public void A0A(String str) {
        A04().A0E(str);
    }

    public void A0B(String str, String str2) {
        A04().A0G(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0011
            X.2dM r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0H()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216514x.A0C():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0011
            X.2dM r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0I()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216514x.A0D():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0011
            X.2dM r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0J()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216514x.A0E():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0011
            X.2dM r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0K()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216514x.A0F():boolean");
    }

    public boolean A0G(UserJid userJid, String str, String str2, boolean z2) {
        return A04().A0L(userJid, str, str2, z2);
    }

    public boolean A0H(UserJid userJid, String str, String str2, boolean z2, boolean z3) {
        return A04().A0M(userJid, str, str2, z2, z3);
    }

    public String AGT() {
        return "SelfManagedConnectionsManager";
    }

    public void AMc() {
        C52232dM r0;
        Log.i("voip/SelfManagedConnectionsManager/onAsyncInit");
        if (A0E() || A0D()) {
            A0F();
        } else if (Build.VERSION.SDK_INT >= 30 && (r0 = this.A00) != null) {
            r0.A08();
        }
    }
}
