package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1br  reason: invalid class name and case insensitive filesystem */
public class C30161br {
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public AnonymousClass1Vt A07;
    public Jid A08;
    public C30821d1 A09;
    public C30821d1 A0A;
    public C16740tZ A0B;
    public C28381Vw A0C;
    public C798941t A0D;
    public C40111ta A0E;
    public Boolean A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public byte[] A0g;
    public byte[] A0h;
    public byte[] A0i;
    public final long A0j;
    public final Jid A0k;
    public final UserJid A0l;
    public final C28381Vw A0m;
    public final C222617g A0n;
    public final String A0o;

    public C30161br(Jid jid, UserJid userJid, C222617g r5, String str, long j2, boolean z2) {
        this.A0n = r5;
        AnonymousClass00B.A06(jid);
        this.A0k = jid;
        this.A0l = userJid;
        this.A0o = str;
        this.A0j = j2;
        C15830rv A002 = C16030sJ.A00(jid);
        AnonymousClass00B.A06(str);
        this.A0m = new C28381Vw(A002, str, z2);
        if (userJid != null) {
            this.A0C = new C28381Vw(userJid, str, true);
        }
    }

    public int A00() {
        Integer num = this.A0J;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Jid A01() {
        Jid jid = this.A0k;
        return (C16030sJ.A0L(jid) || C16030sJ.A0G(jid)) ? this.A08 : jid;
    }

    public C16740tZ A02(byte b2) {
        C16740tZ r0 = this.A0B;
        if (r0 == null) {
            C222617g r3 = this.A0n;
            C28381Vw r2 = this.A0C;
            if (r2 == null) {
                r2 = this.A0m;
            }
            r0 = r3.A01(r2, b2, this.A0j);
            this.A0B = r0;
        }
        A03(r0);
        return this.A0B;
    }

    public void A03(C16740tZ r5) {
        int i2;
        this.A0B = r5;
        r5.A19 = DeviceJid.of(A01());
        C28381Vw r0 = this.A0C;
        if (r0 == null) {
            r0 = this.A0m;
        }
        if (r0.A02) {
            this.A0B.A0W(4);
            this.A0B.A1D = true;
        } else {
            Jid jid = this.A08;
            if (jid != null) {
                this.A0B.A0b(C16030sJ.A00(jid));
            }
        }
        Integer num = this.A0J;
        if (num != null) {
            this.A0B.A0B = num.intValue();
        }
        Integer num2 = this.A0I;
        if (num2 != null) {
            this.A0B.A0A = num2.intValue();
        }
        C16740tZ r1 = this.A0B;
        r1.A0I = this.A0j;
        Long l2 = this.A0L;
        if (l2 != null) {
            r1.A0G = l2.longValue();
        }
        r1.A16 = this.A06;
        Integer num3 = this.A0H;
        if (num3 != null) {
            r1.A0X = num3;
        }
        String str = this.A0V;
        if (str != null) {
            r1.A0l = str;
        }
        String str2 = this.A0U;
        if (str2 != null) {
            r1.A0h = str2;
        }
        String str3 = this.A0a;
        if (str3 != null) {
            r1.A0p = str3;
        }
        String str4 = this.A0Z;
        if (str4 != null) {
            r1.A0o = str4;
        }
        r1.A0t = this.A0c;
        Long l3 = this.A0P;
        if (l3 != null) {
            r1.A0d = l3;
        }
        r1.A0E = this.A05;
        r1.A0V = this.A0E;
        r1.A0c = this.A0O;
        r1.A0b = this.A0N;
        r1.A0a = this.A0M;
        int i3 = this.A01;
        if (i3 != 0) {
            r1.A01 = i3;
        }
        int i4 = this.A03;
        if (i4 != 0) {
            r1.A0S(i4);
        }
        AnonymousClass1Vt r02 = this.A07;
        if (r02 != null) {
            C16740tZ r12 = this.A0B;
            r12.A0L = r02;
            String str5 = r02.A0K;
            if (str5 == null) {
                str5 = "UNSET";
            }
            r12.A0n = str5;
        }
        C16740tZ r2 = this.A0B;
        r2.A0w = this.A0f;
        if (r2.A0t && r2.A0B == 0) {
            r2.A0T(0);
            this.A0B.A0i((Long) null);
        } else if (r2.A04 <= 0 && (i2 = this.A02) != 0 && C16030sJ.A0L(r2.A11.A00)) {
            r2.A0T(i2);
        }
    }
}
