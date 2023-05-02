package X;

import com.whatsapp.util.Log;

/* renamed from: X.16n  reason: invalid class name and case insensitive filesystem */
public class C220716n {
    public final C16070sO A00;
    public final AnonymousClass122 A01;

    public C220716n(C16070sO r1, AnonymousClass122 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass1WU A00(C16050sL r10, C34141jl r11, C34141jl r12, long j2) {
        AnonymousClass122 r2;
        int i2;
        if (r12 != null) {
            C16050sL r4 = r10;
            if (this.A00.A0A(r10)) {
                if (r11 == null) {
                    r11 = new C34141jl(0, 0);
                }
                int i3 = r11.A00;
                if (i3 == 0) {
                    if (r12.A00 == 1) {
                        r2 = this.A01;
                        StringBuilder sb = new StringBuilder("SystemMessageFactory/newInviteViaLinkUnavailableSystemMessage/gjid=");
                        sb.append(r10);
                        Log.i(sb.toString());
                        i2 = 73;
                    }
                } else if (i3 == 1 && r12.A00 == 0) {
                    r2 = this.A01;
                    StringBuilder sb2 = new StringBuilder("SystemMessageFactory/newInviteViaLinkAvailableAgainSystemMessage/gjid=");
                    sb2.append(r10);
                    Log.i(sb2.toString());
                    i2 = 74;
                }
                return r2.A06((C30361cE) null, r4, (C30641ci) null, i2, j2);
            }
        }
        return null;
    }
}
