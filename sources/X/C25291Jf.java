package X;

import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Jf  reason: invalid class name and case insensitive filesystem */
public final class C25291Jf implements C25301Jg {
    public C25281Je A00;
    public final C14870pt A01;
    public final C17150uc A02;
    public final C25271Jd A03;
    public final C15860rz A04;
    public final C16320sq A05;

    public C25291Jf(C25281Je r2, C14870pt r3, C17150uc r4, C25271Jd r5, C15860rz r6, C16320sq r7) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r4, 3);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r3, 5);
        C18450wi.A0H(r6, 6);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
    }

    public static final /* synthetic */ void A00(AnonymousClass4H6 r7, AnonymousClass1Z6 r8, UserJid userJid, C25291Jf r10, String str, String str2) {
        String str3;
        Object obj;
        String str4;
        String str5;
        int hashCode = str.hashCode();
        AnonymousClass1Z6 r5 = r8;
        C25291Jf r4 = r10;
        if (hashCode != -1930003499) {
            if (hashCode != -1867169789) {
                if (hashCode == 688255102 && str.equals("unserviceable_location")) {
                    str4 = "in_pin_code_not_servicable";
                }
            } else if (str.equals("success")) {
                r10.A01.A0K(new RunnableRunnableShape0S1300000_I0(9, "success", r4, r5, AnonymousClass1Z8.A00));
                if (r7 != null && (str5 = r7.A00) != null) {
                    C15860rz r1 = r10.A04;
                    r1.A16(userJid.getRawString(), str2);
                    r1.A15(userJid.getRawString(), str5);
                    return;
                }
                return;
            }
            str3 = "error";
            obj = AnonymousClass1Z8.A00;
            r10.A01.A0K(new RunnableRunnableShape0S1300000_I0(9, str3, r4, r5, obj));
        }
        if (str.equals("invalid_postcode")) {
            str4 = "in_pin_code_invalid";
        }
        str3 = "error";
        obj = AnonymousClass1Z8.A00;
        r10.A01.A0K(new RunnableRunnableShape0S1300000_I0(9, str3, r4, r5, obj));
        obj = C25421Js.A09(new C25401Jq("validation_errors", C25421Js.A09(new C25401Jq("in_pin_code", str4))));
        str3 = "success";
        r10.A01.A0K(new RunnableRunnableShape0S1300000_I0(9, str3, r4, r5, obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = (java.util.Map) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaS(android.app.Activity r13, X.AnonymousClass1Z6 r14, java.util.Map r15) {
        /*
            r12 = this;
            if (r15 != 0) goto L_0x0004
            X.1Z8 r15 = X.AnonymousClass1Z8.A00
        L_0x0004:
            java.lang.String r0 = "values"
            java.lang.Object r1 = r15.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            r2 = 0
            if (r0 == 0) goto L_0x0063
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "in_pin_code"
            java.lang.Object r8 = r1.get(r0)
        L_0x001a:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x0061
            java.lang.String r8 = (java.lang.String) r8
        L_0x0020:
            if (r13 == 0) goto L_0x0034
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x0034
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "chat_id"
            java.lang.String r2 = r1.getString(r0)
        L_0x0034:
            r4 = r12
            r5 = r14
            if (r8 == 0) goto L_0x005e
            boolean r0 = X.C008703y.A0L(r8)
            if (r0 != 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            X.0rz r0 = r12.A04
            java.lang.String r0 = r0.A0R(r2)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r3 = "success"
        L_0x004f:
            X.1Z8 r6 = X.AnonymousClass1Z8.A00
            X.0pt r0 = r12.A01
            r2 = 9
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0K(r1)
            return
        L_0x005e:
            java.lang.String r3 = "error"
            goto L_0x004f
        L_0x0061:
            r8 = r2
            goto L_0x0020
        L_0x0063:
            r8 = r2
            goto L_0x001a
        L_0x0065:
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.get(r2)
            X.C18450wi.A0B(r10)
            X.0sq r0 = r12.A05
            r7 = 10
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r6 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r9 = r12
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r0.Acl(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25291Jf.AaS(android.app.Activity, X.1Z6, java.util.Map):void");
    }
}
