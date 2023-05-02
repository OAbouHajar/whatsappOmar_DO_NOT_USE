package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4VF  reason: invalid class name */
public final class AnonymousClass4VF {
    public final UserJid A00;
    public final UserJid A01;
    public final C28371Vv A02;
    public final AnonymousClass5NB A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public AnonymousClass4VF(C16300so r26, C28371Vv r27) {
        C28371Vv r5 = r27;
        C28371Vv.A06(r5, "group");
        Class<String> cls = String.class;
        this.A07 = (String) C32271fx.A01((C16300so) null, r5, cls, 10L, 50L, (Object) null, new String[]{"id"}, false);
        Class<UserJid> cls2 = UserJid.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C16300so r12 = r26;
        C28371Vv r13 = r5;
        this.A00 = (UserJid) C32271fx.A00(r12, r13, cls2, A0X, A0Y, (Object) null, new String[]{"creator"}, false);
        Class<Long> cls3 = Long.class;
        Long A0Z = AnonymousClass3K2.A0Z();
        C28371Vv r18 = r5;
        Long l2 = A0Y;
        this.A04 = (Long) C32271fx.A01((C16300so) null, r18, cls3, A0Z, l2, (Object) null, new String[]{"creation"}, false);
        Long A0a = AnonymousClass3K2.A0a();
        this.A09 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 20L, (Object) null, new String[]{"p_v_id"}, false);
        this.A06 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 20L, (Object) null, new String[]{"a_v_id"}, false);
        this.A05 = (Long) C32271fx.A01((C16300so) null, r18, cls3, A0Z, l2, (Object) null, new String[]{"s_t"}, false);
        this.A01 = (UserJid) C32271fx.A00(r12, r13, cls2, A0X, A0Y, (Object) null, new String[]{"s_o"}, false);
        this.A08 = (String) C32271fx.A00((C16300so) null, r5, cls, A0a, 20L, (Object) null, new String[]{"open_thread_id"}, false);
        C32261fw[] r3 = new C32261fw[2];
        r3[0] = AnonymousClass3K3.A0X(r12, 64);
        this.A03 = (AnonymousClass5NB) C32271fx.A04(r5, "NamedSubject|UnnamedSubject", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r12, 63), r3, 1), new String[0]);
        this.A02 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4VF.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4VF r5 = (AnonymousClass4VF) obj;
            if (!this.A07.equals(r5.A07) || !C34901l3.A00(this.A00, r5.A00) || !this.A04.equals(r5.A04) || !C34901l3.A00(this.A09, r5.A09) || !C34901l3.A00(this.A06, r5.A06) || !this.A05.equals(r5.A05) || !C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(this.A08, r5.A08) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A07;
        objArr[1] = this.A00;
        objArr[2] = this.A04;
        objArr[3] = this.A09;
        objArr[4] = this.A06;
        objArr[5] = this.A05;
        objArr[6] = this.A01;
        objArr[7] = this.A08;
        return AnonymousClass000.A0F(this.A03, objArr, 8);
    }
}
