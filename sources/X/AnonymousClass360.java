package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.360  reason: invalid class name */
public final class AnonymousClass360 extends C16690tT {
    private static AnonymousClass125 hcopy;
    public final C15830rv A00;
    public final /* synthetic */ AnonymousClass125 A01;

    public AnonymousClass360(C15830rv r1, AnonymousClass125 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A07Yo(C15830rv r8) {
        AnonymousClass125 r5 = hcopy;
        if (r5 == null) {
            r5 = AnonymousClass125.A21();
            hcopy = r5;
        }
        C15830rv r4 = r8;
        HashMap hashMap = r5.A06;
        AnonymousClass2Cl r0 = (AnonymousClass2Cl) hashMap.get(r4);
        if (r0 == null || r0.A01 != 1) {
            AnonymousClass124 r2 = r5.A03;
            C16600tK r1 = r2.A01;
            if (!r1.A05 || !r1.A08()) {
                r5.A07.add(r4);
                return;
            }
            Log.i(AnonymousClass000.A0g("app/send-presence-subscription jid=", r4));
            C17190ug r3 = r2.A02;
            Message obtain = Message.obtain((Handler) null, 0, 12, 0, r4);
            if (r4 != null) {
                Bundle data = obtain.getData();
            }
            r3.A09(obtain, false);
            AnonymousClass2Cl r02 = (AnonymousClass2Cl) hashMap.get(r4);
            if (r02 == null) {
                r02 = new AnonymousClass2Cl();
                hashMap.put(r4, r02);
            }
            r02.A01 = 1;
            r5.A07.remove(r4);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        UserJid of = UserJid.of(this.A00);
        return new AnonymousClass4IU(this, of == null ? null : this.A01.A02.A08(of));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4IU r9 = (AnonymousClass4IU) obj;
        AnonymousClass125 r6 = this.A01;
        C15830rv r4 = this.A00;
        AnonymousClass2Cl r0 = (AnonymousClass2Cl) r6.A06.get(r4);
        if ((r0 != null ? r0.A01 : 0) != 1) {
            AnonymousClass124 r2 = r6.A03;
            byte[] bArr = r9.A00;
            C16600tK r1 = r2.A01;
            if (!r1.A05 || !r1.A08()) {
                r6.A07.add(r4);
                return;
            }
            Log.i(AnonymousClass000.A0g("app/send-presence-subscription jid=", r4));
            C17190ug r3 = r2.A02;
            Message obtain = Message.obtain((Handler) null, 0, 12, 0, r4);
            if (bArr != null) {
                obtain.getData().putByteArray("tctoken", bArr);
            }
            r3.A09(obtain, false);
            r6.A07(r4, true);
            r6.A07.remove(r4);
        }
    }
}
