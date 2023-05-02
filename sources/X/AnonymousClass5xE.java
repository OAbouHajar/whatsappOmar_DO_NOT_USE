package X;

import android.content.Context;
import android.content.DialogInterface;
import com.obwhatsapp.R;

/* renamed from: X.5xE  reason: invalid class name */
public class AnonymousClass5xE {
    public final C116595rd A00;

    public AnonymousClass5xE(C116595rd r1) {
        this.A00 = r1;
    }

    public static C005702l A00(Context context, DialogInterface.OnDismissListener onDismissListener, String str) {
        C32241fu A002 = C32241fu.A00(context);
        A002.A06(str);
        C13690nt.A1F(A002);
        C005702l create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }

    public static C005702l A01(Context context, DialogInterface.OnDismissListener onDismissListener, String str, String str2) {
        C32241fu A002 = C32241fu.A00(context);
        A002.setTitle(str);
        A002.A06(str2);
        C13690nt.A1F(A002);
        C005702l create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r1 != null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C005702l A02(android.content.Context r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, int r8) {
        /*
            r4 = this;
            r0 = 440(0x1b8, float:6.17E-43)
            r3 = 0
            if (r8 == r0) goto L_0x00b5
            r0 = 446(0x1be, float:6.25E-43)
            if (r8 == r0) goto L_0x00a9
            r0 = 2826026(0x2b1f2a, float:3.960106E-39)
            if (r8 == r0) goto L_0x009d
            r0 = 2826046(0x2b1f3e, float:3.960134E-39)
            if (r8 != r0) goto L_0x0026
            r0 = 2131887669(0x7f120635, float:1.9409952E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887668(0x7f120634, float:1.940995E38)
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.5rg r3 = new X.5rg
            r3.<init>(r1, r0)
        L_0x0026:
            r2 = 0
            if (r3 == 0) goto L_0x006a
            java.lang.Integer r1 = r3.A01
            java.lang.Integer r0 = r3.A00
        L_0x002d:
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.intValue()
            java.lang.String r2 = r4.A05(r5, r8, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x0045
            r0 = 403(0x193, float:5.65E-43)
            if (r8 == r0) goto L_0x0045
            r0 = 2826001(0x2b1f11, float:3.960071E-39)
            if (r8 == r0) goto L_0x0045
            r6 = r7
        L_0x0045:
            if (r1 != 0) goto L_0x005d
            r1 = 2826007(0x2b1f17, float:3.960079E-39)
            r0 = 2131887812(0x7f1206c4, float:1.9410242E38)
            if (r8 == r1) goto L_0x0057
            r0 = 2826009(0x2b1f19, float:3.960082E-39)
            if (r8 != r0) goto L_0x00c1
            r0 = 2131890530(0x7f121162, float:1.9415754E38)
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x00c1
        L_0x005d:
            int r0 = r1.intValue()
            java.lang.String r0 = r5.getString(r0)
            X.02l r0 = A01(r5, r6, r0, r2)
            return r0
        L_0x006a:
            r0 = 6
            if (r8 == r0) goto L_0x0090
            r0 = 7
            if (r8 == r0) goto L_0x0090
            switch(r8) {
                case -2: goto L_0x0090;
                case 400: goto L_0x0074;
                case 403: goto L_0x0074;
                case 443: goto L_0x0078;
                case 500: goto L_0x007c;
                case 503: goto L_0x007c;
                case 4002: goto L_0x007c;
                case 10702: goto L_0x0080;
                case 2826001: goto L_0x0074;
                case 2826004: goto L_0x0084;
                case 2826007: goto L_0x0088;
                case 2826009: goto L_0x008c;
                case 2826012: goto L_0x0094;
                default: goto L_0x0073;
            }
        L_0x0073:
            return r2
        L_0x0074:
            r0 = 2131890390(0x7f1210d6, float:1.941547E38)
            goto L_0x0097
        L_0x0078:
            r0 = 2131890536(0x7f121168, float:1.9415767E38)
            goto L_0x0097
        L_0x007c:
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            goto L_0x0097
        L_0x0080:
            r0 = 2131890159(0x7f120fef, float:1.9415002E38)
            goto L_0x0097
        L_0x0084:
            r0 = 2131890370(0x7f1210c2, float:1.941543E38)
            goto L_0x0097
        L_0x0088:
            r0 = 2131890369(0x7f1210c1, float:1.9415428E38)
            goto L_0x0097
        L_0x008c:
            r0 = 2131890372(0x7f1210c4, float:1.9415434E38)
            goto L_0x0097
        L_0x0090:
            r0 = 2131889655(0x7f120df7, float:1.941398E38)
            goto L_0x0097
        L_0x0094:
            r0 = 2131890371(0x7f1210c3, float:1.9415432E38)
        L_0x0097:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r2
            goto L_0x002d
        L_0x009d:
            r0 = 2131892271(0x7f12182f, float:1.9419286E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892270(0x7f12182e, float:1.9419284E38)
            goto L_0x001d
        L_0x00a9:
            r0 = 2131890292(0x7f121074, float:1.9415272E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890291(0x7f121073, float:1.941527E38)
            goto L_0x001d
        L_0x00b5:
            r0 = 2131892156(0x7f1217bc, float:1.9419052E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892155(0x7f1217bb, float:1.941905E38)
            goto L_0x001d
        L_0x00c1:
            X.02l r0 = A00(r5, r6, r2)
            return r0
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xE.A02(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, int):X.02l");
    }

    public C005702l A03(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, int i2) {
        int i3;
        if (i2 == 8 || i2 == 9 || i2 == 444 || i2 == 478) {
            i3 = R.string.str1031;
            onDismissListener2 = onDismissListener;
        } else if (i2 != 1448) {
            return null;
        } else {
            i3 = R.string.str1031;
        }
        return A00(context, onDismissListener2, A05(context, i2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r9 != 2826008) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r2 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r1 = A05(r4, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        r1 = A05(r4, r9, r0);
        r0 = com.obwhatsapp.R.string.str1162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r2 = r4.getString(r0);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        return A00(r4, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return A01(r4, r7, r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C005702l A04(android.content.Context r4, android.content.DialogInterface.OnDismissListener r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r0 = 405(0x195, float:5.68E-43)
            r1 = 2131890318(0x7f12108e, float:1.9415324E38)
            if (r9 == r0) goto L_0x00c0
            r0 = 406(0x196, float:5.69E-43)
            r1 = 2131890315(0x7f12108b, float:1.9415318E38)
            if (r9 == r0) goto L_0x00c0
            r0 = 409(0x199, float:5.73E-43)
            if (r9 == r0) goto L_0x00bd
            r0 = 410(0x19a, float:5.75E-43)
            r1 = 2131890317(0x7f12108d, float:1.9415322E38)
            if (r9 == r0) goto L_0x00c0
            r0 = 426(0x1aa, float:5.97E-43)
            r1 = 2131890314(0x7f12108a, float:1.9415316E38)
            if (r9 == r0) goto L_0x00c0
            r0 = 460(0x1cc, float:6.45E-43)
            r1 = 2131890319(0x7f12108f, float:1.9415326E38)
            if (r9 == r0) goto L_0x00c0
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r9 == r0) goto L_0x00bd
        L_0x002c:
            X.02l r0 = r3.A03(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0049
            X.02l r0 = r3.A02(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0049
            r2 = 0
            switch(r9) {
                case 2001: goto L_0x004a;
                case 2304: goto L_0x0055;
                case 2321: goto L_0x0055;
                case 10010: goto L_0x0059;
                case 10775: goto L_0x0061;
                case 12750: goto L_0x006c;
                case 2826003: goto L_0x007c;
                case 2826006: goto L_0x008b;
                case 2826015: goto L_0x0096;
                case 2826018: goto L_0x009a;
                case 2896003: goto L_0x00aa;
                case 2896004: goto L_0x00aa;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            java.lang.String r1 = r3.A05(r4, r9, r0)
        L_0x0043:
            if (r2 == 0) goto L_0x00db
            X.02l r0 = A01(r4, r7, r2, r1)
        L_0x0049:
            return r0
        L_0x004a:
            r0 = 2131890254(0x7f12104e, float:1.9415195E38)
            java.lang.String r1 = r3.A05(r4, r9, r0)
            r0 = 2131890255(0x7f12104f, float:1.9415197E38)
            goto L_0x0086
        L_0x0055:
            r0 = 2131889989(0x7f120f45, float:1.9414657E38)
            goto L_0x005c
        L_0x0059:
            r0 = 2131890180(0x7f121004, float:1.9415045E38)
        L_0x005c:
            java.lang.String r1 = r3.A05(r4, r9, r0)
            goto L_0x00b8
        L_0x0061:
            r0 = 2131890084(0x7f120fa4, float:1.941485E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131890085(0x7f120fa5, float:1.9414852E38)
            goto L_0x00a4
        L_0x006c:
            r2 = 2131890331(0x7f12109b, float:1.941535E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            r0 = 0
            java.lang.String r1 = X.C13680ns.A0d(r4, r8, r1, r0, r2)
            r0 = 2131890332(0x7f12109c, float:1.9415353E38)
            goto L_0x00b4
        L_0x007c:
            r0 = 2131890191(0x7f12100f, float:1.9415067E38)
            java.lang.String r1 = r3.A05(r4, r9, r0)
            r0 = 2131890530(0x7f121162, float:1.9415754E38)
        L_0x0086:
            java.lang.String r2 = r4.getString(r0)
            goto L_0x00b9
        L_0x008b:
            r0 = 2131890391(0x7f1210d7, float:1.9415472E38)
            java.lang.String r1 = r3.A05(r4, r9, r0)
            r0 = 2131890293(0x7f121075, float:1.9415274E38)
            goto L_0x00b4
        L_0x0096:
            r0 = 2131890092(0x7f120fac, float:1.9414866E38)
            goto L_0x009d
        L_0x009a:
            r0 = 2131890093(0x7f120fad, float:1.9414868E38)
        L_0x009d:
            java.lang.String r1 = r3.A05(r4, r9, r0)
            r0 = 2131890530(0x7f121162, float:1.9415754E38)
        L_0x00a4:
            java.lang.String r2 = r4.getString(r0)
            r5 = r7
            goto L_0x00b9
        L_0x00aa:
            r0 = 2131888981(0x7f120b55, float:1.9412613E38)
            java.lang.String r1 = r3.A05(r4, r9, r0)
            r0 = 2131888982(0x7f120b56, float:1.9412615E38)
        L_0x00b4:
            java.lang.String r2 = r4.getString(r0)
        L_0x00b8:
            r5 = r6
        L_0x00b9:
            if (r1 == 0) goto L_0x003c
            r7 = r5
            goto L_0x0043
        L_0x00bd:
            r1 = 2131890316(0x7f12108c, float:1.941532E38)
        L_0x00c0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002c
            int r2 = r0.intValue()
            X.AnonymousClass00B.A06(r8)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            r0 = 0
            java.lang.String r0 = X.C13680ns.A0d(r4, r8, r1, r0, r2)
            X.02l r0 = A00(r4, r6, r0)
            return r0
        L_0x00db:
            X.02l r0 = A00(r4, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xE.A04(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, java.lang.String, int):X.02l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r3.A00.ADW(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(android.content.Context r5, int r6, int r7) {
        /*
            r4 = this;
            X.5rd r3 = r4.A00
            java.lang.String r2 = java.lang.String.valueOf(r6)
            X.0w8 r0 = r3.A01
            X.0pd r1 = r0.A03
            r0 = 698(0x2ba, float:9.78E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x001b
            X.61t r0 = r3.A00
            java.lang.String r0 = r0.ADW(r2)
            if (r0 == 0) goto L_0x001b
            return r0
        L_0x001b:
            java.lang.String r0 = r5.getString(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xE.A05(android.content.Context, int, int):java.lang.String");
    }
}
