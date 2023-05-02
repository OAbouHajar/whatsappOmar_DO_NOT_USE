package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5wD  reason: invalid class name */
public final class AnonymousClass5wD {
    public static final ArrayList A01;
    public static final ArrayList A02;
    public final C28371Vv A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "0";
        A01 = AnonymousClass3K2.A0q("1", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A02 = AnonymousClass3K2.A0q("1", strArr2, 1);
    }

    public AnonymousClass5wD(C51812cK r22, AnonymousClass5w7 r23, AnonymousClass5w8 r24, C118025tw r25, AnonymousClass5wA r26, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-create-mandate");
        String str15 = str;
        if (C110105dW.A1V(str15, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", str15);
        }
        String str16 = str2;
        if (C32271fx.A0D(str16, 0, 35, false)) {
            C32461gQ.A00(A0Y, "seq-no", str16);
        }
        String str17 = str3;
        if (C32271fx.A0D(str17, 1, 100, false)) {
            C32461gQ.A00(A0Y, "sender-vpa", str17);
        }
        String str18 = str4;
        if (C32271fx.A0D(str18, 1, 100, false)) {
            C32461gQ.A00(A0Y, "receiver-vpa", str18);
        }
        String str19 = str5;
        if (C32271fx.A0D(str19, 0, 1000, false)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str19);
        }
        String str20 = str6;
        if (str6 != null && C110115dX.A1D(str20, true)) {
            C32461gQ.A00(A0Y, "mandate-name", str20);
        }
        Long l4 = l2;
        if (C32271fx.A0B(l4, 0, false)) {
            C110115dX.A13(A0Y, "start-ts", l4.longValue());
        }
        Long l5 = l3;
        if (C32271fx.A0B(l5, 0, false)) {
            C110115dX.A13(A0Y, "end-ts", l5.longValue());
        }
        String str21 = str7;
        if (str7 != null && C32271fx.A0D(str21, 1, 2, true)) {
            C32461gQ.A00(A0Y, "recurrence-day", str21);
        }
        String str22 = str8;
        if (C32271fx.A0D(str22, 0, 1000, false)) {
            C32461gQ.A00(A0Y, "mpin", str22);
        }
        String str23 = str9;
        if (C32271fx.A0D(str23, 1, 100, false)) {
            C32461gQ.A00(A0Y, "receiver-name", str23);
        }
        String str24 = str10;
        if (C32271fx.A0D(str24, 1, 100, false)) {
            C32461gQ.A00(A0Y, "purpose-code", str24);
        }
        String str25 = str11;
        if (C32271fx.A0D(str25, 0, 4, false)) {
            C32461gQ.A00(A0Y, "mcc", str25);
        }
        String str26 = str12;
        if (str12 != null && C110105dW.A1V(str26, 1, true)) {
            C32461gQ.A00(A0Y, "ref-id", str26);
        }
        String str27 = str13;
        if (C32271fx.A0D(str27, 1, 100, false)) {
            C32461gQ.A00(A0Y, "credential-id", str27);
        }
        A0Y.A0A(str14, "is-revocable", A01);
        A0Y.A0A("1", "share-to-payee", A02);
        C32461gQ A0S = AnonymousClass3K4.A0S("amount");
        C118025tw r5 = r25;
        A0S.A05(r5.A00, AnonymousClass000.A0u());
        r5.A00(A0S, Collections.EMPTY_LIST);
        AnonymousClass3K4.A0s(A0S, A0Y);
        C28371Vv r6 = r23.A00;
        A0Y.A05(r6, AnonymousClass000.A0u());
        C28371Vv r52 = r24.A00;
        A0Y.A05(r52, AnonymousClass000.A0u());
        AnonymousClass5wA r8 = r26;
        if (r26 != null) {
            A0Y.A05(r8.A00, AnonymousClass000.A0u());
        }
        List list = Collections.EMPTY_LIST;
        A0Y.A07(r6, list, AnonymousClass000.A0u());
        A0Y.A07(r52, list, AnonymousClass000.A0u());
        if (r26 != null) {
            A0Y.A07(r8.A00, list, AnonymousClass000.A0u());
        }
        this.A00 = C110105dW.A0U(A0Y, A0X, r22, list);
    }
}
