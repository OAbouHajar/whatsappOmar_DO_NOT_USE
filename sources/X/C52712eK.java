package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2eK  reason: invalid class name and case insensitive filesystem */
public class C52712eK {
    public final long A00;
    public final AnonymousClass01Q A01;
    public final C17930vs A02;
    public final C17930vs A03;
    public final C17930vs A04;
    public final C17930vs A05;
    public final UserJid A06;
    public final C30641ci A07;
    public final String A08;
    public final String A09;
    public final byte[] A0A;

    public C52712eK(AnonymousClass01Q r4, C17930vs r5, C17930vs r6, UserJid userJid, C30641ci r8, String str, byte[] bArr, long j2) {
        this.A06 = userJid;
        this.A08 = str;
        this.A09 = null;
        this.A07 = r8;
        AnonymousClass01Q A002 = A00(r5);
        AnonymousClass01Q A003 = A00(r6);
        this.A02 = (C17930vs) A002.A00;
        this.A03 = (C17930vs) A003.A00;
        this.A04 = (C17930vs) A002.A01;
        this.A05 = (C17930vs) A003.A01;
        this.A0A = bArr;
        this.A00 = j2;
        this.A01 = r4;
    }

    public C52712eK(C30641ci r4, String str) {
        this.A06 = null;
        this.A08 = null;
        this.A09 = str;
        C17930vs of = C17930vs.of();
        this.A02 = of;
        this.A03 = of;
        this.A04 = of;
        this.A05 = of;
        this.A07 = r4;
        this.A0A = null;
        this.A00 = 0;
        this.A01 = null;
    }

    public static final AnonymousClass01Q A00(C17930vs r7) {
        AnonymousClass1C5 r6 = new AnonymousClass1C5();
        AnonymousClass1C5 r5 = new AnonymousClass1C5();
        C28031Ub it = r7.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AnonymousClass2TX r3 = (AnonymousClass2TX) entry.getValue();
            Object key = entry.getKey();
            Long valueOf = Long.valueOf(r3.A00);
            r6.put(key, valueOf);
            DeviceJid deviceJid = r3.A02;
            if (deviceJid != null) {
                r5.put(deviceJid, valueOf);
            }
        }
        return new AnonymousClass01Q(r6.build(), r5.build());
    }
}
