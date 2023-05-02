package X;

import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.4V4  reason: invalid class name */
public final class AnonymousClass4V4 {
    public final C28371Vv A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass4V4(C28371Vv r11) {
        C28371Vv r3 = r11;
        C28371Vv.A06(r11, "state");
        String[] strArr = {FacebookFacade.RequestParameter.NAME};
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        this.A03 = (String) C32271fx.A01((C16300so) null, r3, cls, A0X, A0Y, (Object) null, strArr, false);
        this.A01 = (String) C32271fx.A00((C16300so) null, r3, cls, A0X, A0Y, (Object) null, new String[]{"input_path"}, false);
        this.A02 = (String) C32271fx.A00((C16300so) null, r3, cls, A0X, A0Y, (Object) null, new String[]{"input_selector"}, false);
        this.A04 = (String) C32271fx.A00((C16300so) null, r3, cls, A0X, A0Y, (Object) null, new String[]{"next"}, false);
        this.A06 = (String) C32271fx.A00((C16300so) null, r3, cls, A0X, A0Y, (Object) null, new String[]{"result_selector"}, false);
        this.A05 = (String) C32271fx.A00((C16300so) null, r3, cls, A0X, A0Y, (Object) null, new String[]{"result_path"}, false);
        this.A00 = r11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4V4.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4V4 r5 = (AnonymousClass4V4) obj;
            if (!this.A03.equals(r5.A03) || !C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A06, r5.A06) || !C34901l3.A00(this.A05, r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        objArr[3] = this.A04;
        objArr[4] = this.A06;
        return AnonymousClass000.A0F(this.A05, objArr, 5);
    }
}
