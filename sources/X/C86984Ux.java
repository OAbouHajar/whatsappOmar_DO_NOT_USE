package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ux  reason: invalid class name and case insensitive filesystem */
public final class C86984Ux {
    public final UserJid A00;
    public final C28371Vv A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public C86984Ux(C16300so r21, C28371Vv r22) {
        C28371Vv r5 = r22;
        C28371Vv.A06(r5, FacebookFacade.RequestParameter.DESCRIPTION);
        Class<String> cls = String.class;
        Long A0a = AnonymousClass3K2.A0a();
        this.A04 = (String) C32271fx.A01((C16300so) null, r5, cls, A0a, 256L, (Object) null, new String[]{"id"}, false);
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C16300so r12 = r21;
        C28371Vv r13 = r5;
        this.A00 = (UserJid) C32271fx.A00(r12, r13, UserJid.class, A0X, A0Y, (Object) null, new String[]{"participant"}, false);
        this.A02 = (Long) C32271fx.A01((C16300so) null, r13, Long.class, AnonymousClass3K2.A0Z(), A0Y, (Object) null, new String[]{"t"}, false);
        this.A03 = (String) C32271fx.A01((C16300so) null, r5, cls, A0a, 65536L, (Object) null, new String[]{"body", "#elementValue"}, false);
        this.A01 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86984Ux.class != obj.getClass()) {
                return false;
            }
            C86984Ux r5 = (C86984Ux) obj;
            if (!this.A04.equals(r5.A04) || !C34901l3.A00(this.A00, r5.A00) || !this.A02.equals(r5.A02) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        return AnonymousClass000.A0F(this.A03, objArr, 3);
    }
}
