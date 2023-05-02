package X;

import android.text.SpannableString;
import android.text.TextUtils;
import java.math.BigDecimal;

/* renamed from: X.1KX  reason: invalid class name */
public class AnonymousClass1KX {
    public final C16180sb A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16760tb A03;
    public final C17170ue A04;
    public final C16440t3 A05;
    public final C16260sj A06;
    public final AnonymousClass013 A07;
    public final C16460t6 A08;
    public final C18630x0 A09;
    public final AnonymousClass1GN A0A;
    public final C16320sq A0B;

    public AnonymousClass1KX(C16180sb r1, C14870pt r2, C16040sK r3, C16760tb r4, C17170ue r5, C16440t3 r6, C16260sj r7, AnonymousClass013 r8, C16460t6 r9, C18630x0 r10, AnonymousClass1GN r11, C16320sq r12) {
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = r12;
        this.A00 = r1;
        this.A03 = r4;
        this.A09 = r10;
        this.A0A = r11;
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
    }

    public static String A00(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public SpannableString A01(C38891ra r8) {
        String str;
        if (r8.A0A == null || TextUtils.isEmpty(r8.A03)) {
            str = r8.A04;
            if (str == null) {
                return null;
            }
        } else {
            C39651sq r5 = new C39651sq(r8.A03);
            BigDecimal bigDecimal = r8.A0B;
            BigDecimal bigDecimal2 = r8.A0A;
            AnonymousClass013 r2 = this.A07;
            str = r5.A03(r2, bigDecimal2, true);
            if (!(bigDecimal == null || BigDecimal.ZERO.compareTo(bigDecimal) == 0 || bigDecimal.compareTo(bigDecimal2) >= 0)) {
                return AnonymousClass2RK.A02(str, r5.A03(r2, bigDecimal, true));
            }
        }
        return new SpannableString(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r5v0 int) = (r29v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    public void A02(X.C14550pN r23, X.C50262Yq r24, X.C15830rv r25, com.whatsapp.jid.UserJid r26, java.util.List r27, int r28, int r29, long r30) {
        /*
            r22 = this;
            r8 = r27
            if (r27 == 0) goto L_0x0104
            int r0 = r8.size()
            if (r0 == 0) goto L_0x0104
            int r0 = r8.size()
            r5 = r29
            if (r5 >= r0) goto L_0x0104
            r4 = r22
            r6 = r28
            if (r29 != 0) goto L_0x011a
            r0 = 1
            if (r6 == r0) goto L_0x0116
            r0 = 3
            if (r6 != r0) goto L_0x011a
            java.lang.String r7 = "Forward"
        L_0x0020:
            X.0x0 r3 = r4.A09
            r1 = 774779800(0x2e2e3398, float:3.9608844E-11)
            java.lang.String r2 = "send_product_message_tag"
            java.lang.String r0 = "CatalogUtils"
            r3.A00(r1, r2, r0)
            int r0 = r8.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ProductsCount"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "EntryPoint"
            r3.A03(r2, r0, r7)
            r17 = 1
        L_0x0041:
            r0 = 1
            if (r6 == r0) goto L_0x0112
            r0 = 2
            r9 = 55
            if (r6 == r0) goto L_0x004b
            r9 = 66
        L_0x004b:
            X.0sj r0 = r4.A06
            boolean r0 = r0.A0B()
            r7 = r23
            if (r0 != 0) goto L_0x010f
            r3 = 2131890765(0x7f12124d, float:1.9416231E38)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r1 = 2131890764(0x7f12124c, float:1.941623E38)
            if (r2 < r0) goto L_0x006b
            r0 = 33
            r1 = 2131890767(0x7f12124f, float:1.9416235E38)
            if (r2 >= r0) goto L_0x006b
            r1 = 2131890766(0x7f12124e, float:1.9416233E38)
        L_0x006b:
            com.obwhatsapp.RequestPermissionActivity.A0L(r7, r3, r1, r9)
            r0 = 0
        L_0x006f:
            r2 = 0
            java.lang.String r10 = "send_product_message_tag"
            if (r0 == 0) goto L_0x011e
            java.lang.Object r3 = r8.get(r5)
            X.1mM r3 = (X.C35701mM) r3
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x011e
            X.0sK r0 = r4.A02
            r9 = r26
            boolean r0 = r0.A0I(r9)
            if (r0 == 0) goto L_0x00bf
            X.0ue r13 = r4.A04
            java.lang.String r15 = r3.A0D
            r16 = 34
            X.00F r12 = r13.A06
            java.lang.String r14 = r13.A00
            if (r14 != 0) goto L_0x0105
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x00bf
        L_0x009b:
            X.2RI r11 = new X.2RI
            r11.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r11.A02 = r0
            r11.A06 = r14
            r11.A0A = r15
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A08
            int r0 = r0.get()
            if (r0 == 0) goto L_0x00b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A03 = r0
        L_0x00b8:
            X.0t9 r1 = r13.A04
            int r0 = r12.A03
            r1.A07(r11, r0)
        L_0x00bf:
            if (r17 == 0) goto L_0x00d2
            X.0x0 r0 = r4.A09
            java.util.Map r0 = r0.A02
            java.lang.Object r1 = r0.get(r10)
            X.1dR r1 = (X.C31081dR) r1
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "image_upload"
            r1.A08(r0)
        L_0x00d2:
            java.util.List r0 = r3.A06
            java.lang.Object r2 = r0.get(r2)
            X.1mL r2 = (X.C35691mL) r2
            X.4vk r10 = new X.4vk
            r14 = r24
            r15 = r25
            r20 = r30
            r16 = r9
            r17 = r8
            r18 = r5
            r19 = r6
            r12 = r4
            r13 = r3
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.4vd r1 = new X.4vd
            r1.<init>(r7, r8, r5)
            X.4vg r0 = new X.4vg
            r0.<init>(r7, r4)
            r5 = 0
            r11 = 3
            r4 = r14
            r6 = r2
            r7 = r1
            r8 = r5
            r9 = r0
            r4.A01(r5, r6, r7, r8, r9, r10, r11)
        L_0x0104:
            return
        L_0x0105:
            int r1 = r14.hashCode()
            int r0 = r12.A03
            int r1 = r1 % r0
            if (r1 != 0) goto L_0x00bf
            goto L_0x009b
        L_0x010f:
            r0 = 1
            goto L_0x006f
        L_0x0112:
            r9 = 44
            goto L_0x004b
        L_0x0116:
            java.lang.String r7 = "Attachment"
            goto L_0x0020
        L_0x011a:
            r17 = 0
            goto L_0x0041
        L_0x011e:
            X.0x0 r0 = r4.A09
            r0.A05(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KX.A02(X.0pN, X.2Yq, X.0rv, com.whatsapp.jid.UserJid, java.util.List, int, int, long):void");
    }
}
