package X;

import java.util.ArrayList;

/* renamed from: X.5wC  reason: invalid class name */
public final class AnonymousClass5wC {
    public static final ArrayList A01;
    public static final ArrayList A02;
    public final C28371Vv A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "1";
        A02 = AnonymousClass3K2.A0q("2", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A01 = AnonymousClass3K2.A0q("1", strArr2, 1);
    }

    public AnonymousClass5wC(C51812cK r18, Long l2, Long l3, String str, String str2, String str3, String str4, String str5) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-bind-device");
        String str6 = str;
        if (C110105dW.A1W(str6, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", str6);
        }
        String str7 = str2;
        if (C32271fx.A0D(str7, 1, 35, false)) {
            C32461gQ.A00(A0Y, "verification-data", str7);
        }
        String str8 = str3;
        if (C32271fx.A0D(str8, 1, 10, false)) {
            C32461gQ.A00(A0Y, "provider-type", str8);
        }
        String str9 = str4;
        if (str4 != null && C110115dX.A1A(str9, 1, true)) {
            C32461gQ.A00(A0Y, "sms-phone-number", str9);
        }
        Long l4 = l2;
        if (C32271fx.A0B(l4, 0, true)) {
            C110115dX.A13(A0Y, "delay", l4.longValue());
        }
        Long l5 = l3;
        if (C32271fx.A0B(l5, 0, true)) {
            C110115dX.A13(A0Y, "counter", l5.longValue());
        }
        A0Y.A0A("2", "version", A02);
        A0Y.A09(str5, "existing-account", A01);
        this.A00 = C110105dW.A0T(A0Y, A0X, r18);
    }
}
