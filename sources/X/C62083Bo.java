package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.youbasha.others;
import java.util.List;

/* renamed from: X.3Bo  reason: invalid class name and case insensitive filesystem */
public abstract class C62083Bo {
    public final Activity A00;
    public final Context A01;
    public final C16040sK A02;
    public final C15900s5 A03;
    public final AnonymousClass15Z A04;
    public final C17150uc A05;
    public final AnonymousClass01Y A06;
    public final C16000sG A07;
    public final C16080sP A08;
    public final AnonymousClass2J6 A09;
    public final ViewHolder A0A;
    public final C16440t3 A0B;
    public final C16980tz A0C;
    public final AnonymousClass013 A0D;
    public final C15810rt A0E;
    public final C18560wt A0F;
    public final C14710pd A0G;
    public final C20260zl A0H;
    public final C17240ul A0I;
    public final C19990zK A0J;
    public final C18090w8 A0K;
    public final C18290wS A0L;
    public final C218315p A0M;
    public final AnonymousClass2TP A0N;

    public C62083Bo(Activity activity, Context context, C16040sK r4, C15900s5 r5, AnonymousClass15Z r6, C17150uc r7, AnonymousClass01Y r8, C16000sG r9, C16080sP r10, AnonymousClass2J6 r11, ViewHolder viewHolder, C16440t3 r13, C16980tz r14, AnonymousClass013 r15, C15810rt r16, C18560wt r17, C14710pd r18, C20260zl r19, C17240ul r20, C19990zK r21, C18090w8 r22, C18290wS r23, C218315p r24, AnonymousClass2TP r25) {
        this.A0A = viewHolder;
        this.A01 = context;
        this.A00 = activity;
        this.A0B = r13;
        this.A0G = r18;
        this.A0J = r21;
        this.A02 = r4;
        this.A0C = r14;
        this.A0E = r16;
        this.A03 = r5;
        this.A0H = r19;
        this.A0M = r24;
        this.A07 = r9;
        this.A0F = r17;
        this.A08 = r10;
        this.A0D = r15;
        this.A0L = r23;
        this.A0N = r25;
        this.A06 = r8;
        this.A0I = r20;
        this.A0K = r22;
        this.A05 = r7;
        this.A04 = r6;
        this.A09 = r11;
    }

    public static Drawable A00(Context context, ImageView imageView, C39001rl r5) {
        Drawable drawable = null;
        if (r5.AGz() != 1) {
            drawable = AnonymousClass2SR.A00(context, R.drawable.msg_status_viewonce_one);
        }
        others.setHomeIc(imageView, drawable);
        Drawable A002 = AnonymousClass2SR.A00(context, R.drawable.msg_status_ephemeral_ring);
        imageView.setBackground(A002);
        imageView.setVisibility(0);
        return A002;
    }

    public static Drawable A01(Context context, C62083Bo r4, int i2) {
        Drawable A022 = AnonymousClass2SR.A02(context, i2, R.color.color055a);
        ImageView imageView = r4.A0A.A0B;
        imageView.setVisibility(0);
        others.setHomeIc(imageView, A022);
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r1 != 6) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r1 = com.obwhatsapp.R.drawable.msg_status_waiting;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if ((r9.A0I + 86400000) < r8.A00()) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (X.C42881yp.A02(r9.A0C, 4) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A02(android.content.Context r7, X.C16440t3 r8, X.C16740tZ r9) {
        /*
            boolean r0 = X.C38621r6.A0o(r9)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r3 = 4
            r2 = 0
            if (r0 == 0) goto L_0x001a
            X.1Vw r0 = r9.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            int r0 = r9.A0C
            boolean r0 = X.C42881yp.A02(r0, r3)
            if (r0 == 0) goto L_0x005f
        L_0x0019:
            return r2
        L_0x001a:
            X.1Vw r0 = r9.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0019
            int r1 = r9.A0C
            if (r1 == 0) goto L_0x005f
            r0 = 8
            if (r1 == r0) goto L_0x0051
            r0 = 13
            if (r1 == r0) goto L_0x0051
            r0 = 20
            if (r1 == r0) goto L_0x006a
            if (r1 == r3) goto L_0x004a
            r0 = 5
            if (r1 == r0) goto L_0x0043
            r0 = 6
            if (r1 == r0) goto L_0x0019
        L_0x0038:
            r1 = 2131232196(0x7f0805c4, float:1.8080494E38)
        L_0x003b:
            r0 = 2131101018(0x7f06055a, float:1.7814434E38)
        L_0x003e:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r7, r1)
            return r0
        L_0x0043:
            java.lang.String r1 = "msg_status_client"
            int r1 = com.obwhatsapp.yo.yo.getBubbleTick(r1)
            goto L_0x003b
        L_0x004a:
            java.lang.String r1 = "msg_status_server_receive"
            int r1 = com.obwhatsapp.yo.yo.getBubbleTick(r1)
            goto L_0x003b
        L_0x0051:
            java.lang.String r1 = "msg_status_client"
            int r1 = com.obwhatsapp.yo.yo.getBubbleTick(r1)
            r0 = 2131101017(0x7f060559, float:1.7814432E38)
            int r1 = com.obwhatsapp.yo.yo.getReadTick(r0, r1)
            goto L_0x003e
        L_0x005f:
            long r3 = r9.A0I
            long r3 = r3 + r5
            long r1 = r8.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
        L_0x006a:
            r0 = 2131232178(0x7f0805b2, float:1.8080458E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62083Bo.A02(android.content.Context, X.0t3, X.0tZ):android.graphics.drawable.Drawable");
    }

    public static String A03(Context context, C39001rl r4) {
        int i2;
        int AGz = r4.AGz();
        if (AGz != 0) {
            i2 = R.string.str19f8;
            if (AGz != 1) {
                if (AGz != 2) {
                    throw AnonymousClass000.A0V("unhandled view once state");
                }
            }
            return context.getString(i2);
        }
        if (r4 instanceof C38991rk) {
            i2 = R.string.str05e0;
        } else {
            boolean z2 = r4 instanceof C39011rm;
            i2 = R.string.str05e7;
            if (z2) {
                i2 = R.string.str05e9;
            }
        }
        return context.getString(i2);
    }

    public static void A04(View view, ViewHolder viewHolder) {
        view.setVisibility(8);
        viewHolder.A0G.setVisibility(8);
        viewHolder.A07.setVisibility(8);
        viewHolder.A0E.setVisibility(8);
        viewHolder.A0B.setVisibility(8);
        viewHolder.A0C.setVisibility(8);
        viewHolder.A0P.setVisibility(8);
        viewHolder.A0D.setVisibility(8);
        viewHolder.A03.setVisibility(8);
        viewHolder.A0K(false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v147, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v148, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0399, code lost:
        if (r1.A03 != 5) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03bd, code lost:
        r1 = (r1 = r9.A0L.A02(r10.A0L.A0G)).AEp(r10.A0L.A0I);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0494  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A05(X.C16740tZ r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C30581cc
            java.lang.String r5 = ""
            r7 = 5
            r4 = 0
            r2 = 0
            if (r0 == 0) goto L_0x007b
            boolean r0 = r10 instanceof X.C39241s9
            if (r0 == 0) goto L_0x0039
            r2 = r10
            X.1s9 r2 = (X.C39241s9) r2
            android.content.Context r1 = r9.A01
            java.lang.String r5 = A03(r1, r2)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            android.graphics.drawable.Drawable r2 = A00(r1, r0, r2)
        L_0x001e:
            android.content.Context r4 = r9.A01
            X.0zK r3 = r9.A0J
            java.util.List r0 = r10.A0q
            if (r0 == 0) goto L_0x0034
            android.text.SpannableStringBuilder r5 = X.C13690nt.A0F(r5)
            java.util.List r1 = r10.A0q
            X.4zi r0 = new X.4zi
            r0.<init>(r4)
            r3.A03(r5, r0, r1)
        L_0x0034:
            android.util.Pair r0 = X.C13690nt.A0I(r2, r5)
            return r0
        L_0x0039:
            boolean r0 = X.C42551xz.A04(r10)
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = X.C42551xz.A01(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004a
            r5 = r1
        L_0x004a:
            java.lang.String r0 = r10.A0I()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "*"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r10.A0I()
            r1.append(r0)
            java.lang.String r0 = "*\n\n"
            r1.append(r0)
            java.lang.String r5 = X.AnonymousClass000.A0h(r5, r1)
            goto L_0x001e
        L_0x006b:
            X.1Vt r1 = r10.A0L
            if (r1 != 0) goto L_0x0490
            r0 = r10
            X.1cc r0 = (X.C30581cc) r0
            java.lang.String r5 = r0.A13()
            java.lang.String r5 = com.obwhatsapp.yo.Conversation.pNotifi((X.C16740tZ) r0, (java.lang.String) r5)
            goto L_0x001e
        L_0x007b:
            boolean r0 = r10 instanceof X.AnonymousClass1WU
            r3 = 3
            r8 = 2
            r6 = 8
            if (r0 == 0) goto L_0x00bc
            r1 = r10
            X.1WU r1 = (X.AnonymousClass1WU) r1
            int r0 = r1.A00
            if (r0 == r8) goto L_0x00ab
            if (r0 == r3) goto L_0x009a
            X.15Z r0 = r9.A04
            java.lang.String r5 = r0.A0C(r1, r4)
        L_0x0092:
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0E
            r0.setVisibility(r6)
            goto L_0x001e
        L_0x009a:
            android.content.Context r1 = r9.A01
            r0 = 2131888727(0x7f120a57, float:1.9412097E38)
            java.lang.String r5 = r1.getString(r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.view.View r0 = r0.A07
            r0.setVisibility(r6)
            goto L_0x0092
        L_0x00ab:
            android.content.Context r1 = r9.A01
            r0 = 2131888728(0x7f120a58, float:1.94121E38)
            java.lang.String r5 = r1.getString(r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.view.View r0 = r0.A07
            r0.setVisibility(r4)
            goto L_0x0092
        L_0x00bc:
            boolean r0 = r10 instanceof X.C16840tj
            if (r0 == 0) goto L_0x00e3
            r0 = r10
            X.0tj r0 = (X.C16840tj) r0
            X.1xE r1 = X.C42091xD.A01(r0)
            if (r1 == 0) goto L_0x001e
            android.content.Context r0 = r9.A01
            java.lang.String r5 = r1.A07(r0)
            android.graphics.drawable.Drawable r2 = r1.A01(r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            if (r2 != 0) goto L_0x00db
            r4 = 8
        L_0x00db:
            r0.setVisibility(r4)
            com.obwhatsapp.youbasha.others.setHomeIc(r0, r2)
            goto L_0x001e
        L_0x00e3:
            boolean r0 = r10 instanceof X.C30591cd
            if (r0 == 0) goto L_0x00fc
            r3 = r10
            X.1cd r3 = (X.C30591cd) r3
            int r1 = X.AnonymousClass46X.A00(r3)
            if (r1 == 0) goto L_0x00f6
            android.content.Context r0 = r9.A01
            android.graphics.drawable.Drawable r2 = A01(r0, r9, r1)
        L_0x00f6:
            java.lang.String r5 = r3.AFB()
            goto L_0x001e
        L_0x00fc:
            boolean r0 = r10 instanceof X.C38681rF
            if (r0 == 0) goto L_0x017a
            boolean r0 = r10 instanceof X.C38891ra
            if (r0 == 0) goto L_0x014b
            android.content.Context r1 = r9.A01
            r0 = 2131232189(0x7f0805bd, float:1.808048E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            r4 = r10
            X.1ra r4 = (X.C38891ra) r4
            java.lang.String r5 = r4.A09
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0142
            java.lang.String r1 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = " "
            if (r0 != 0) goto L_0x012d
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)
            r0.append(r3)
            java.lang.String r5 = X.AnonymousClass000.A0h(r1, r0)
        L_0x012d:
            java.lang.String r1 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)
            r0.append(r3)
            java.lang.String r5 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x001e
        L_0x0142:
            r0 = 2131886364(0x7f12011c, float:1.9407305E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x014b:
            r3 = r10
            X.0tY r3 = (X.C16730tY) r3
            android.content.Context r1 = r9.A01
            r0 = 2131232181(0x7f0805b5, float:1.8080464E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            java.lang.String r5 = X.C42551xz.A01(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r3.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0171
            boolean r0 = X.C42551xz.A04(r3)
            if (r0 == 0) goto L_0x0292
        L_0x0171:
            r0 = 2131887584(0x7f1205e0, float:1.940978E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x017a:
            boolean r0 = r10 instanceof X.C38631rA
            if (r0 == 0) goto L_0x01f7
            r6 = r10
            X.1rA r6 = (X.C38631rA) r6
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r5 = r0.A0B
            r5.setVisibility(r4)
            boolean r0 = X.C42941yx.A02(r10)
            if (r0 == 0) goto L_0x01a0
            android.content.Context r1 = r9.A01
            r0 = 2131232175(0x7f0805af, float:1.8080452E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A00(r1, r0)
            com.obwhatsapp.youbasha.others.setHomeIc(r5, r2)
            java.lang.String r5 = X.AnonymousClass2QA.A01(r1, r10)
            goto L_0x001e
        L_0x01a0:
            android.content.Context r3 = r9.A01
            r0 = 2131232176(0x7f0805b0, float:1.8080454E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A00(r3, r0)
            com.obwhatsapp.youbasha.others.setHomeIc(r5, r2)
            java.lang.String r1 = X.C42551xz.A01(r10)
            java.lang.String r5 = r6.A01
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x001e
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r6.A14()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01ef
            r0 = 2131887579(0x7f1205db, float:1.940977E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x01cf:
            int r4 = r6.A00
            if (r4 == 0) goto L_0x01f4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r1)
            java.lang.String r0 = " ("
            r3.append(r0)
            X.013 r1 = r9.A0D
            java.lang.String r0 = r6.A06
            java.lang.String r0 = X.C18820xJ.A05(r1, r0, r4)
            r3.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r5 = X.AnonymousClass000.A0h(r0, r3)
            goto L_0x001e
        L_0x01ef:
            java.lang.String r1 = r6.A14()
            goto L_0x01cf
        L_0x01f4:
            r5 = r1
            goto L_0x001e
        L_0x01f7:
            boolean r0 = r10 instanceof X.C38701rH
            r1 = 1
            if (r0 == 0) goto L_0x023c
            r3 = r10
            X.1rH r3 = (X.C38701rH) r3
            int r0 = r3.A08
            if (r0 != r1) goto L_0x022a
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0220
            X.013 r2 = r9.A0D
            long r0 = (long) r0
            java.lang.String r5 = X.C28961Zl.A04(r2, r0)
        L_0x020e:
            android.content.Context r0 = r9.A01
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3Ar.A00(r0, r3)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            r0.setVisibility(r4)
            r0.setImageDrawable(r2)
            goto L_0x001e
        L_0x0220:
            android.content.Context r1 = r9.A01
            r0 = 2131887597(0x7f1205ed, float:1.9409806E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x020e
        L_0x022a:
            android.content.Context r1 = r9.A01
            r0 = 2131887573(0x7f1205d5, float:1.9409757E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 2131232172(0x7f0805ac, float:1.8080446E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x023c:
            boolean r0 = r10 instanceof X.C38711rI
            if (r0 == 0) goto L_0x026f
            r3 = r10
            X.0tY r3 = (X.C16730tY) r3
            android.content.Context r1 = r9.A01
            r0 = 2131232194(0x7f0805c2, float:1.808049E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            java.lang.String r5 = X.C42551xz.A01(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r3.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0266
            boolean r0 = X.C42551xz.A04(r3)
            if (r0 == 0) goto L_0x0292
        L_0x0266:
            r0 = 2131887593(0x7f1205e9, float:1.9409797E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x026f:
            boolean r0 = r10 instanceof X.C38801rR
            if (r0 == 0) goto L_0x0298
            r3 = r10
            X.0tY r3 = (X.C16730tY) r3
            android.content.Context r1 = r9.A01
            r0 = 2131232179(0x7f0805b3, float:1.808046E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            java.lang.String r0 = r3.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0292
            r0 = 2131887580(0x7f1205dc, float:1.9409771E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x0292:
            java.lang.String r5 = r3.A13()
            goto L_0x001e
        L_0x0298:
            boolean r0 = r10 instanceof X.C38741rL
            if (r0 == 0) goto L_0x02c4
            r1 = r10
            X.1rL r1 = (X.C38741rL) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02c1
            android.content.Context r1 = r9.A01
            r0 = 2131887577(0x7f1205d9, float:1.9409765E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x02b2:
            java.lang.String r5 = X.AnonymousClass1ZW.A04(r2, r0)
            android.content.Context r1 = r9.A01
            r0 = 2131232175(0x7f0805af, float:1.8080452E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x02c1:
            java.lang.String r0 = r1.A00
            goto L_0x02b2
        L_0x02c4:
            boolean r0 = r10 instanceof X.C38811rS
            if (r0 == 0) goto L_0x02dc
            X.013 r1 = r9.A0D
            r0 = r10
            X.1rS r0 = (X.C38811rS) r0
            java.lang.String r5 = X.C41061vA.A08(r1, r0)
            android.content.Context r1 = r9.A01
            r0 = 2131232175(0x7f0805af, float:1.8080452E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x02dc:
            boolean r0 = r10 instanceof X.C38751rM
            if (r0 == 0) goto L_0x030c
            java.lang.String r5 = X.C42551xz.A01(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x02fe
            r1 = r10
            X.1rM r1 = (X.C38751rM) r1
            java.lang.String r0 = r1.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0309
            android.content.Context r1 = r9.A01
            r0 = 2131887586(0x7f1205e2, float:1.9409783E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x02fe:
            android.content.Context r1 = r9.A01
            r0 = 2131232183(0x7f0805b7, float:1.8080468E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x0309:
            java.lang.String r5 = r1.A01
            goto L_0x02fe
        L_0x030c:
            boolean r0 = r10 instanceof X.C38841rV
            if (r0 == 0) goto L_0x032f
            r0 = r10
            X.1rV r0 = (X.C38841rV) r0
            java.lang.String r5 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0324
            android.content.Context r1 = r9.A01
            r0 = 2131887585(0x7f1205e1, float:1.9409781E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x0324:
            android.content.Context r1 = r9.A01
            r0 = 2131231710(0x7f0803de, float:1.8079509E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x032f:
            boolean r0 = X.C41061vA.A0I(r10)
            if (r0 == 0) goto L_0x034b
            X.1Vt r1 = r10.A0L
            if (r1 != 0) goto L_0x0490
            android.content.Context r1 = r9.A01
            r0 = 2131232180(0x7f0805b4, float:1.8080462E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            r0 = 2131887578(0x7f1205da, float:1.9409767E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x034b:
            boolean r0 = r10 instanceof X.C38771rO
            if (r0 == 0) goto L_0x038f
            r6 = r10
            X.1rO r6 = (X.C38771rO) r6
            int r2 = r6.A15()
            if (r2 == 0) goto L_0x038b
            if (r2 == r1) goto L_0x0387
            r0 = 2131887583(0x7f1205df, float:1.9409777E38)
            if (r2 == r8) goto L_0x0362
            r0 = 2131887582(0x7f1205de, float:1.9409775E38)
        L_0x0362:
            android.content.Context r2 = r9.A01
            java.lang.String r5 = r2.getString(r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r3 = r0.A0B
            r3.setVisibility(r4)
            boolean r0 = r6.A16()
            r1 = 2131232185(0x7f0805b9, float:1.8080472E38)
            if (r0 == 0) goto L_0x037b
            r1 = 2131232186(0x7f0805ba, float:1.8080474E38)
        L_0x037b:
            r0 = 2131101016(0x7f060558, float:1.781443E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A02(r2, r1, r0)
            r3.setImageDrawable(r2)
            goto L_0x001e
        L_0x0387:
            r0 = 2131887595(0x7f1205eb, float:1.9409802E38)
            goto L_0x0362
        L_0x038b:
            r0 = 2131887599(0x7f1205ef, float:1.940981E38)
            goto L_0x0362
        L_0x038f:
            boolean r0 = r10 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x03f8
            X.1Vt r1 = r10.A0L
            if (r1 == 0) goto L_0x064e
            int r0 = r1.A03
            if (r0 == r7) goto L_0x064e
        L_0x039b:
            android.content.Context r6 = r9.A01
            if (r6 == 0) goto L_0x03df
            java.lang.CharSequence r3 = X.C218315p.A06(r6, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x03df
            X.0w8 r0 = r9.A0K
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x03f1
            X.0wS r1 = r9.A0L
            X.1Vt r0 = r10.A0L
            java.lang.String r0 = r0.A0G
            X.1Vx r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x03f1
            X.1Vt r0 = r10.A0L
            java.lang.String r0 = r0.A0I
            X.19r r1 = r1.AEp(r0)
            if (r1 == 0) goto L_0x03f1
            X.1Vt r0 = r10.A0L
            int r1 = r1.AGf(r0)
        L_0x03cd:
            android.content.res.Resources r0 = r6.getResources()
            int r1 = r0.getColor(r1)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            com.obwhatsapp.WaTextView r0 = r0.A0P
            r0.setVisibility(r4)
            r0.setText(r3)
        L_0x03df:
            X.15p r7 = r9.A0M
            X.1Vt r3 = r10.A0L
            if (r3 == 0) goto L_0x001e
            int r1 = r3.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x04a6
            java.lang.String r5 = r7.A0L(r3)
            goto L_0x001e
        L_0x03f1:
            X.1Vt r0 = r10.A0L
            int r1 = X.C218315p.A01(r0)
            goto L_0x03cd
        L_0x03f8:
            boolean r0 = r10 instanceof X.C39161s1
            if (r0 == 0) goto L_0x0439
            r0 = r10
            X.1s1 r0 = (X.C39161s1) r0
            com.whatsapp.jid.UserJid r2 = r0.A00
            X.AnonymousClass00B.A06(r2)
            X.0sK r0 = r9.A02
            boolean r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x041e
            android.content.Context r6 = r9.A01
            r0 = 2131886289(0x7f1200d1, float:1.9407153E38)
            java.lang.String r5 = r6.getString(r0)
        L_0x0415:
            r0 = 2131232174(0x7f0805ae, float:1.808045E38)
            android.graphics.drawable.Drawable r2 = A01(r6, r9, r0)
            goto L_0x001e
        L_0x041e:
            X.0sP r3 = r9.A08
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r1]
            r0[r4] = r2
            java.util.ArrayList r2 = X.AnonymousClass3Bv.newArrayList((java.lang.Object[]) r0)
            r0 = -1
            java.lang.String r3 = r3.A0L(r2, r0)
            android.content.Context r6 = r9.A01
            r2 = 2131886288(0x7f1200d0, float:1.940715E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r5 = X.C13680ns.A0d(r6, r3, r0, r4, r2)
            goto L_0x0415
        L_0x0439:
            boolean r0 = r10 instanceof X.C38831rU
            if (r0 == 0) goto L_0x0467
            X.1Vw r0 = r10.A11
            boolean r2 = r0.A02
            android.content.Context r1 = r9.A01
            r0 = 2131891317(0x7f121475, float:1.941735E38)
            if (r2 == 0) goto L_0x044b
            r0 = 2131891318(0x7f121476, float:1.9417353E38)
        L_0x044b:
            java.lang.String r5 = r1.getString(r0)
            X.013 r0 = r9.A0D
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x045e
            java.lang.String r0 = " "
            java.lang.String r5 = X.C13680ns.A0h(r0, r5)
        L_0x045e:
            r0 = 2131232174(0x7f0805ae, float:1.808045E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x0467:
            boolean r0 = r10 instanceof X.C38851rW
            if (r0 == 0) goto L_0x0476
            android.content.Context r1 = r9.A01
            r0 = 2131893622(0x7f121d76, float:1.9422026E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x0476:
            boolean r0 = r10 instanceof X.C38641rB
            if (r0 == 0) goto L_0x050c
            X.1Vt r1 = r10.A0L
            if (r1 != 0) goto L_0x0490
            android.content.Context r1 = r9.A01
            r0 = 2131887590(0x7f1205e6, float:1.9409791E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 2131232192(0x7f0805c0, float:1.8080486E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x0490:
            int r0 = r1.A03
            if (r0 != r7) goto L_0x039b
            android.content.Context r1 = r9.A01
            r0 = 2131232193(0x7f0805c1, float:1.8080488E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            r0 = 2131887603(0x7f1205f3, float:1.9409818E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x04a6:
            java.lang.String r0 = r3.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04ca
            X.1Vt r1 = r10.A0L
            X.1Vy r0 = r1.A08
            if (r0 == 0) goto L_0x04ca
            X.1Vz r6 = r1.A00()
            r0 = r6
            X.1m1 r0 = (X.C35491m1) r0
            int r5 = r0.A00
            r3 = 1
            X.013 r1 = r7.A06
            X.1Vt r0 = r10.A0L
            X.1Vy r0 = r0.A08
            if (r3 != r5) goto L_0x04e8
            java.lang.String r5 = r6.A9H(r1, r0, r4)
        L_0x04ca:
            boolean r0 = r10 instanceof X.C38641rB
            java.lang.String r4 = " • "
            if (r0 == 0) goto L_0x04ed
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r5)
            r3.append(r4)
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131891870(0x7f12169e, float:1.9418472E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r5 = X.AnonymousClass000.A0h(r0, r3)
            goto L_0x001e
        L_0x04e8:
            java.lang.String r5 = r6.A9F(r1, r0)
            goto L_0x04ca
        L_0x04ed:
            byte r0 = r10.A10
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r10.A0I()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            r1.append(r4)
            java.lang.String r0 = r10.A0I()
            java.lang.String r5 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x001e
        L_0x050c:
            boolean r0 = r10 instanceof X.C38861rX
            if (r0 == 0) goto L_0x052b
            android.content.Context r3 = r9.A01
            X.1Vw r0 = r10.A11
            boolean r0 = r0.A02
            r1 = 2131890053(0x7f120f85, float:1.9414787E38)
            if (r0 == 0) goto L_0x051e
            r1 = 2131890080(0x7f120fa0, float:1.9414842E38)
        L_0x051e:
            java.lang.String r5 = r3.getString(r1)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0E
            r0.setVisibility(r6)
            goto L_0x001e
        L_0x052b:
            boolean r0 = r10 instanceof X.C38881rZ
            if (r0 == 0) goto L_0x053e
            android.content.Context r3 = r9.A01
            X.1Vw r0 = r10.A11
            boolean r0 = r0.A02
            r1 = 2131890078(0x7f120f9e, float:1.9414838E38)
            if (r0 == 0) goto L_0x051e
            r1 = 2131890079(0x7f120f9f, float:1.941484E38)
            goto L_0x051e
        L_0x053e:
            boolean r0 = r10 instanceof X.C30071bh
            if (r0 == 0) goto L_0x056e
            X.0ul r1 = r9.A0I
            r0 = r10
            X.1bh r0 = (X.C30071bh) r0
            int r0 = r0.A00
            boolean r2 = r1.A0d(r0)
            android.content.Context r1 = r9.A01
            r0 = 2131888804(0x7f120aa4, float:1.9412254E38)
            if (r2 == 0) goto L_0x0557
            r0 = 2131889935(0x7f120f0f, float:1.9414548E38)
        L_0x0557:
            java.lang.String r5 = r1.getString(r0)
            r0 = 2131232182(0x7f0805b6, float:1.8080466E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A00(r1, r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            com.obwhatsapp.youbasha.others.setHomeIc(r0, r2)
            r0.setVisibility(r4)
            goto L_0x001e
        L_0x056e:
            boolean r0 = r10 instanceof X.C39021rn
            if (r0 == 0) goto L_0x0590
            r2 = r10
            X.1rn r2 = (X.C39021rn) r2
            android.content.Context r1 = r9.A01
            X.013 r0 = r9.A0D
            java.lang.String r5 = X.C218415q.A05(r1, r0, r2)
            r0 = 2131232187(0x7f0805bb, float:1.8080476E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A00(r1, r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            com.obwhatsapp.youbasha.others.setHomeIc(r0, r2)
            r0.setVisibility(r4)
            goto L_0x001e
        L_0x0590:
            boolean r0 = r10 instanceof X.C38971ri
            if (r0 == 0) goto L_0x05b8
            r5 = r10
            X.1ri r5 = (X.C38971ri) r5
            X.15Z r4 = r9.A04
            X.1Vw r3 = r5.A11
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x05b5
            X.0sK r0 = r9.A02
            r0.A0B()
            X.1ZT r3 = r0.A05
        L_0x05a6:
            int r0 = r5.A00
            java.lang.String r5 = r4.A06(r3, r0, r1)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0E
            r0.setVisibility(r6)
            goto L_0x001e
        L_0x05b5:
            X.0rv r3 = r3.A00
            goto L_0x05a6
        L_0x05b8:
            boolean r0 = r10 instanceof X.C38991rk
            if (r0 == 0) goto L_0x05cf
            r2 = r10
            X.1rk r2 = (X.C38991rk) r2
            android.content.Context r1 = r9.A01
            java.lang.String r5 = A03(r1, r2)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            android.graphics.drawable.Drawable r2 = A00(r1, r0, r2)
            goto L_0x001e
        L_0x05cf:
            boolean r0 = r10 instanceof X.C39011rm
            if (r0 == 0) goto L_0x05e6
            r2 = r10
            X.1rm r2 = (X.C39011rm) r2
            android.content.Context r1 = r9.A01
            java.lang.String r5 = A03(r1, r2)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            android.graphics.drawable.Drawable r2 = A00(r1, r0, r2)
            goto L_0x001e
        L_0x05e6:
            boolean r0 = r10 instanceof X.C39061rr
            if (r0 == 0) goto L_0x0660
            X.15p r7 = r9.A0M
            r8 = r10
            X.1rr r8 = (X.C39061rr) r8
            int r0 = r8.A00
            if (r0 != r3) goto L_0x064e
            android.content.Context r6 = r9.A01
            X.1Vw r0 = r10.A11
            boolean r5 = r0.A02
            X.0rv r4 = r0.A00
            X.AnonymousClass00B.A06(r4)
            X.0sP r3 = r7.A03
            X.0sG r0 = r7.A01
            X.0sH r0 = r0.A0A(r4)
            java.lang.String r4 = r3.A0E(r0)
            X.0w8 r0 = r7.A0B
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x061b
            X.0wS r0 = r7.A0C
            X.19r r0 = r0.A03()
            r0.AEf()
        L_0x061b:
            r3 = 2131890026(0x7f120f6a, float:1.9414732E38)
            if (r5 == 0) goto L_0x0623
            r3 = 2131890027(0x7f120f6b, float:1.9414734E38)
        L_0x0623:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            java.lang.String r5 = X.C13680ns.A0d(r6, r4, r1, r0, r3)
            int r0 = r8.A00
            java.lang.CharSequence r4 = r7.A0E(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131101207(0x7f060617, float:1.7814817E38)
            int r3 = r1.getColor(r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            com.obwhatsapp.WaTextView r1 = r0.A0P
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r4)
            goto L_0x001e
        L_0x064e:
            android.content.Context r1 = r9.A01
            r0 = 2131232193(0x7f0805c1, float:1.8080488E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            r0 = 2131887602(0x7f1205f2, float:1.9409816E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        L_0x0660:
            boolean r0 = r10 instanceof X.C39171s2
            if (r0 == 0) goto L_0x0674
            r0 = r10
            X.1s2 r0 = (X.C39171s2) r0
            java.lang.String r5 = r0.A03
            android.content.Context r1 = r9.A01
            r0 = 2131232188(0x7f0805bc, float:1.8080478E38)
            android.graphics.drawable.Drawable r2 = A01(r1, r9, r0)
            goto L_0x001e
        L_0x0674:
            boolean r0 = r10 instanceof X.C39221s7
            if (r0 == 0) goto L_0x0699
            X.0tz r3 = r9.A0C
            android.content.Context r2 = r3.A00
            r1 = 2131231811(0x7f080443, float:1.8079714E38)
            r0 = 2131100048(0x7f060190, float:1.7812466E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A02(r2, r1, r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            r0.setVisibility(r4)
            com.obwhatsapp.youbasha.others.setHomeIc(r0, r2)
            r0 = 2131890871(0x7f1212b7, float:1.9416446E38)
            java.lang.String r5 = r3.A02(r0)
            goto L_0x001e
        L_0x0699:
            boolean r0 = r10 instanceof X.C39211s6
            if (r0 == 0) goto L_0x06be
            X.0tz r3 = r9.A0C
            android.content.Context r2 = r3.A00
            r1 = 2131231811(0x7f080443, float:1.8079714E38)
            r0 = 2131100048(0x7f060190, float:1.7812466E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A02(r2, r1, r0)
            com.obwhatsapp.conversationslist.ViewHolder r0 = r9.A0A
            android.widget.ImageView r0 = r0.A0B
            r0.setVisibility(r4)
            com.obwhatsapp.youbasha.others.setHomeIc(r0, r2)
            r0 = 2131890886(0x7f1212c6, float:1.9416476E38)
            java.lang.String r5 = r3.A02(r0)
            goto L_0x001e
        L_0x06be:
            android.content.Context r1 = r9.A01
            r0 = 2131887592(0x7f1205e8, float:1.9409795E38)
            java.lang.String r5 = r1.getString(r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62083Bo.A05(X.0tZ):android.util.Pair");
    }

    public void A06() {
        if (this instanceof C603731f) {
            C73953pO r0 = ((C603731f) this).A00;
            if (r0 != null) {
                r0.A00();
            }
        } else if (this instanceof C603931h) {
            C603931h r1 = (C603931h) this;
            C604031i r02 = r1.A01;
            if (r02 != null) {
                r02.A00();
            }
            C604031i r03 = r1.A02;
            if (r03 != null) {
                r03.A00();
            }
            C73943pN r04 = r1.A00;
            if (r04 != null) {
                r04.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0254, code lost:
        if (r12.A00() == false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C49902Wp r16, X.AnonymousClass5PS r17, int r18, boolean r19) {
        /*
            r15 = this;
            r1 = r16
            boolean r0 = r15 instanceof X.C603731f
            r2 = r18
            r3 = r17
            if (r0 == 0) goto L_0x008f
            r5 = r15
            X.31f r5 = (X.C603731f) r5
            X.2l2 r1 = (X.C56142l2) r1
            X.0sG r6 = r5.A02
            X.0tZ r1 = r1.A00
            X.1Vw r0 = r1.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.0sH r7 = r6.A07(r0)
            r4 = 0
            if (r7 == 0) goto L_0x002f
            X.0sK r0 = r5.A02
            X.0rv r0 = X.C61963Bc.A00(r0, r7, r1)
            if (r0 == 0) goto L_0x0086
            X.0sH r4 = r6.A07(r0)
            if (r4 != 0) goto L_0x0086
        L_0x002f:
            X.013 r10 = r5.A05
            com.obwhatsapp.conversationslist.ViewHolder r4 = r5.A0A
            android.view.View r9 = r4.A06
            android.content.Context r8 = r5.A01
            android.content.res.Resources r7 = r8.getResources()
            r0 = 2131166444(0x7f0704ec, float:1.7947134E38)
            int r11 = r7.getDimensionPixelSize(r0)
            r12 = 0
            r13 = 0
            r14 = 0
            X.C45902Bo.A0A(r9, r10, r11, r12, r13, r14)
            android.view.View r7 = r4.A05
            r0 = 8
            r7.setVisibility(r0)
            com.obwhatsapp.TextEmojiLabel r0 = r4.A0M
            A04(r0, r4)
            com.obwhatsapp.TextEmojiLabel r7 = r4.A0L
            r7.setVisibility(r12)
            r0 = 2131100933(0x7f060505, float:1.7814261E38)
            X.C13680ns.A0v(r8, r7, r0)
            r0 = 0
            X.C13700nu.A0T(r7)
            r0 = 80
            r7.setPlaceholder(r0)
            X.4Vz r0 = r4.A00
            r0.A01()
            X.0sK r0 = r5.A02
            X.3pO r4 = new X.3pO
            r4.<init>(r0, r6, r1)
            r5.A00 = r4
            X.4Qo r1 = r5.A03
            com.facebook.redex.IDxCallbackShape342S0100000_2_I1 r0 = new com.facebook.redex.IDxCallbackShape342S0100000_2_I1
            r0.<init>(r5, r12)
            r1.A00(r0, r4)
        L_0x0080:
            if (r17 == 0) goto L_0x0085
            r3.AWf(r2)
        L_0x0085:
            return
        L_0x0086:
            X.4KU r0 = new X.4KU
            r0.<init>(r7, r4, r1)
            r5.A0A(r0)
            goto L_0x0080
        L_0x008f:
            boolean r0 = r15 instanceof X.C603931h
            if (r0 == 0) goto L_0x01d1
            r6 = r15
            X.31h r6 = (X.C603931h) r6
            X.2Wo r1 = (X.AnonymousClass2Wo) r1
            X.0rv r5 = r1.A00
            X.4OV r8 = r6.A0A(r5)
            int r11 = r6.A05
            r0 = 3
            if (r11 == r0) goto L_0x00a9
            r0 = 4
            if (r11 == r0) goto L_0x00a9
            r0 = 5
            if (r11 != r0) goto L_0x0106
        L_0x00a9:
            com.obwhatsapp.conversationslist.ViewHolder r10 = r6.A0A
            android.widget.ImageView r7 = r10.A09
            android.content.res.Resources r9 = r7.getResources()
            r0 = 2131165634(0x7f0701c2, float:1.794549E38)
            int r4 = r9.getDimensionPixelSize(r0)
            r1 = 4
            r0 = 2131165723(0x7f07021b, float:1.7945671E38)
            if (r11 != r1) goto L_0x00c1
            r0 = 2131165862(0x7f0702a6, float:1.7945953E38)
        L_0x00c1:
            int r12 = r9.getDimensionPixelSize(r0)
            r0 = 2131165700(0x7f070204, float:1.7945625E38)
            if (r11 != r1) goto L_0x00cd
            r0 = 2131165862(0x7f0702a6, float:1.7945953E38)
        L_0x00cd:
            int r11 = r9.getDimensionPixelSize(r0)
            r0 = 2131167078(0x7f070766, float:1.794842E38)
            int r1 = r9.getDimensionPixelSize(r0)
            android.view.View r0 = r10.A05
            X.C55352jN.A02(r0, r12, r11)
            com.obwhatsapp.WaImageView r0 = r10.A0O
            X.C55352jN.A02(r0, r1, r1)
            android.widget.ImageView r0 = r10.A0D
            X.C55352jN.A02(r0, r1, r1)
            android.widget.ImageView r0 = r10.A0C
            X.C55352jN.A02(r0, r1, r1)
            android.view.View r0 = r10.A03
            X.C55352jN.A02(r0, r1, r1)
            X.42g r1 = X.C800242g.A04
            int r0 = r1.dimension
            int r0 = r9.getDimensionPixelSize(r0)
            if (r4 == r0) goto L_0x00fd
            X.42g r1 = X.C800242g.A03
        L_0x00fd:
            boolean r0 = r7 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x01cc
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r7 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r7
            r7.setProfilePhotoSize(r1)
        L_0x0106:
            if (r8 == 0) goto L_0x0123
            r6.A0B(r8, r3, r2)
        L_0x010b:
            com.whatsapp.jid.GroupJid r2 = com.whatsapp.jid.GroupJid.of(r5)
            if (r2 == 0) goto L_0x0121
            X.195 r1 = r6.A0D
            boolean r0 = r1.A07(r2)
            if (r0 == 0) goto L_0x031f
            X.1r0 r0 = r1.A02(r2)
        L_0x011d:
            r6.A0E(r5, r0)
            return
        L_0x0121:
            r0 = 0
            goto L_0x011d
        L_0x0123:
            r11 = 1
            if (r19 == 0) goto L_0x0167
            r1 = 0
            X.31i r0 = new X.31i
            r0.<init>(r6, r5, r1)
            r6.A01 = r0
            java.lang.Object r0 = r0.call()
            X.4OV r0 = (X.AnonymousClass4OV) r0
            r6.A0B(r0, r3, r2)
            X.0rt r0 = r6.A0E
            X.0rx r7 = r0.A06(r5)
            X.0pd r4 = r6.A0G
            r1 = 1605(0x645, float:2.249E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            if (r0 == 0) goto L_0x010b
            if (r7 == 0) goto L_0x010b
            long r9 = r7.A00()
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x010b
            X.31i r4 = new X.31i
            r4.<init>(r6, r5, r11)
            r6.A02 = r4
            X.4Qo r1 = r6.A0A
            com.facebook.redex.IDxCallbackShape5S0201000_2_I1 r0 = new com.facebook.redex.IDxCallbackShape5S0201000_2_I1
            r0.<init>(r6, r3, r2, r11)
            r1.A00(r0, r4)
            goto L_0x010b
        L_0x0167:
            X.31i r0 = new X.31i
            r0.<init>(r6, r5, r11)
            r6.A01 = r0
            android.content.Context r8 = r6.A01
            X.AnonymousClass00B.A06(r8)
            com.obwhatsapp.conversationslist.ViewHolder r10 = r6.A0A
            android.view.View r0 = r10.A06
            r7 = 0
            r0.setPadding(r7, r7, r7, r7)
            android.widget.ImageView r11 = r10.A09
            r11.setEnabled(r7)
            android.view.View r9 = r10.A05
            r4 = 0
            r9.setOnClickListener(r4)
            r11.setOnClickListener(r4)
            r9.setOnLongClickListener(r4)
            r11.setOnLongClickListener(r4)
            r0 = 2131231364(0x7f080284, float:1.8078807E38)
            r11.setImageResource(r0)
            X.0ud r1 = r6.A08
            int r0 = r1.A02(r5)
            r1.A05(r11, r0)
            r9.setVisibility(r7)
            com.obwhatsapp.TextEmojiLabel r1 = r10.A0M
            A04(r1, r10)
            X.4Vz r0 = r10.A00
            r0.A01()
            com.obwhatsapp.TextEmojiLabel r1 = r10.A0L
            r1.setVisibility(r7)
            r0 = 2131100933(0x7f060505, float:1.7814261E38)
            X.C13680ns.A0v(r8, r1, r0)
            X.C13700nu.A0T(r1)
            r0 = 80
            r1.setPlaceholder(r0)
            X.4Qo r4 = r6.A0A
            X.31i r1 = r6.A01
            com.facebook.redex.IDxCallbackShape5S0201000_2_I1 r0 = new com.facebook.redex.IDxCallbackShape5S0201000_2_I1
            r0.<init>(r6, r3, r2, r7)
            r4.A00(r0, r1)
            goto L_0x010b
        L_0x01cc:
            X.C55352jN.A02(r7, r4, r4)
            goto L_0x0106
        L_0x01d1:
            r9 = r15
            X.31g r9 = (X.C603831g) r9
            X.2Wq r1 = (X.C49912Wq) r1
            X.0sH r8 = r1.A00
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r7 = r8.A08(r0)
            X.AnonymousClass00B.A06(r7)
            com.obwhatsapp.conversationslist.ViewHolder r6 = r9.A0A
            android.view.View r0 = r6.A06
            r5 = 0
            r0.setPadding(r5, r5, r5, r5)
            X.2Ao r0 = r9.A02
            android.widget.ImageView r10 = r6.A09
            r0.A06(r10, r8)
            boolean r1 = X.C16030sJ.A0R(r7)
            r0 = 1
            r4 = 0
            if (r1 != 0) goto L_0x02fd
            r10.setEnabled(r0)
            java.lang.String r0 = "com.obwhatsapp.conversationslist.ConversationsFragment"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C16030sJ.A03(r7)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.C004601z.A0n(r10, r0)
            r0 = 3
            com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1 r12 = new com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1
            r12.<init>(r9, r2, r7, r0)
            r0 = 17
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r11 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r11.<init>(r9, r0, r7)
            r0 = 4
            com.facebook.redex.IDxCListenerShape53S0200000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape53S0200000_2_I1
            r1.<init>(r9, r0, r7)
            r10.setOnClickListener(r12)
            r10.setOnLongClickListener(r1)
            android.view.View r0 = r6.A0H
            r0.setOnClickListener(r11)
            r0.setOnLongClickListener(r1)
            android.view.View r11 = r6.A05
            r11.setOnClickListener(r12)
            r11.setOnLongClickListener(r1)
            boolean r0 = r10 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0266
            X.2XQ r12 = r9.A00
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r10
            X.0pd r13 = r9.A0G
            X.0tM r1 = X.C16620tM.A01
            r0 = 1533(0x5fd, float:2.148E-42)
            boolean r0 = r13.A0E(r1, r0)
            if (r0 == 0) goto L_0x0266
            if (r12 == 0) goto L_0x0256
            int r0 = r12.A01
            if (r0 <= 0) goto L_0x0256
            boolean r1 = r12.A00()
            r0 = 1
            if (r1 != 0) goto L_0x0257
        L_0x0256:
            r0 = 0
        L_0x0257:
            r10.setStatusIndicatorEnabled(r0)
            if (r0 == 0) goto L_0x0266
            X.42X r1 = X.AnonymousClass42X.A03
            X.3zx r0 = new X.3zx
            r0.<init>(r1)
            r10.setProfileStatus(r0)
        L_0x0266:
            r6.A0K(r5, r5)
            r11.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r10 = r6.A0L
            r10.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r0 = r6.A0M
            r11 = 8
            r0.setVisibility(r11)
            android.widget.ImageView r0 = r6.A0C
            r0.setVisibility(r11)
            android.widget.ImageView r1 = r6.A0D
            X.0sf r12 = r9.A05
            X.AnonymousClass00B.A06(r7)
            java.lang.String r0 = r7.getRawString()
            X.1WS r0 = r12.A07(r0)
            boolean r0 = r0.A0G
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
            android.widget.TextView r0 = r6.A0G
            r0.setVisibility(r11)
            android.widget.ImageView r7 = r6.A0E
            r7.setVisibility(r11)
            android.widget.ImageView r1 = r6.A0B
            r1.setVisibility(r11)
            android.view.View r0 = r6.A07
            X.C13690nt.A14(r0, r7, r1, r11)
            android.view.View r0 = r6.A03
            r0.setVisibility(r11)
            com.obwhatsapp.WaTextView r0 = r6.A0P
            r0.setVisibility(r11)
            android.content.Context r7 = r9.A01
            r1 = 2131100933(0x7f060505, float:1.7814261E38)
            X.C13680ns.A0v(r7, r10, r1)
            X.4Vz r11 = r6.A00
            com.obwhatsapp.components.ConversationListRowHeaderView r6 = r11.A00
            com.obwhatsapp.WaTextView r0 = r6.A01
            r0.setVisibility(r5)
            r10.setPlaceholder(r5)
            int r1 = X.AnonymousClass00T.A00(r7, r1)
            com.obwhatsapp.WaTextView r0 = r6.A01
            X.2J6 r0 = r9.A03
            java.util.List r1 = r0.AF2()
            X.2TP r0 = r9.A0N
            r11.A02(r8, r0, r1)
            X.3h7 r0 = r11.A02
            r0.A09(r8)
            X.013 r0 = r9.A04
            java.lang.CharSequence r1 = X.C16080sP.A00(r7, r0, r8)
            if (r1 == 0) goto L_0x02ef
            com.obwhatsapp.WaTextView r0 = r6.A01
            r0.setText(r1)
            com.obwhatsapp.WaTextView r0 = r6.A01
            r0.setContentDescription(r4)
        L_0x02ef:
            java.lang.String r0 = r8.A0T
            if (r0 != 0) goto L_0x02f5
            java.lang.String r0 = ""
        L_0x02f5:
            r10.A0I(r4, r0)
            r10.setVisibility(r5)
            goto L_0x0080
        L_0x02fd:
            r0 = 18
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r1 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r1.<init>(r9, r0, r7)
            r10.setEnabled(r5)
            r10.setOnClickListener(r1)
            r10.setOnLongClickListener(r4)
            android.view.View r0 = r6.A0H
            r0.setOnClickListener(r1)
            r0.setOnLongClickListener(r4)
            android.view.View r11 = r6.A05
            r11.setOnClickListener(r1)
            r11.setOnLongClickListener(r4)
            goto L_0x0266
        L_0x031f:
            r0 = r5
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            X.3pN r2 = new X.3pN
            r2.<init>(r6, r0)
            r6.A00 = r2
            X.4Qo r1 = r6.A0A
            X.4xd r0 = new X.4xd
            r0.<init>(r6, r5)
            r1.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62083Bo.A07(X.2Wp, X.5PS, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f3, code lost:
        if (r3 != false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015c, code lost:
        if (r1.A0C == 6) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C16010sH r20, X.C16010sH r21, X.C16010sH r22, X.C16740tZ r23, X.C39531sd r24) {
        /*
            r19 = this;
            r0 = r19
            X.0pd r3 = r0.A0G
            r2 = 2579(0xa13, float:3.614E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r2 = r3.A0E(r1, r2)
            r18 = r21
            r17 = r22
            r1 = r23
            if (r2 == 0) goto L_0x00cf
            if (r23 == 0) goto L_0x00cf
            boolean r2 = r1 instanceof X.C30581cc
            if (r2 == 0) goto L_0x00cf
            android.content.Context r9 = r0.A01
            X.0zK r2 = r0.A0J
            X.0t3 r12 = r0.A0B
            X.0sK r10 = r0.A02
            X.0sP r11 = r0.A08
            X.3pQ r8 = new X.3pQ
            r13 = r18
            r14 = r17
            r15 = r2
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.obwhatsapp.conversationslist.ViewHolder r6 = r0.A0A
            com.obwhatsapp.TextEmojiLabel r9 = r6.A0L
            android.content.Context r5 = r8.A00
            X.0tZ r4 = r8.A06
            java.lang.CharSequence r11 = r8.A07
            X.0zK r7 = r8.A00
            java.util.List r2 = r4.A0q
            if (r2 == 0) goto L_0x004e
            android.text.SpannableStringBuilder r11 = X.C13690nt.A0F(r11)
            java.util.List r3 = r4.A0q
            X.4zi r2 = new X.4zi
            r2.<init>(r5)
            r7.A03(r11, r2, r3)
        L_0x004e:
            X.2J6 r2 = r0.A09
            java.util.List r12 = r2.AF2()
            X.2TP r10 = r0.A0N
            int r2 = r1.A0C
            r1 = 6
            r14 = 0
            if (r2 == r1) goto L_0x005d
            r14 = 1
        L_0x005d:
            android.app.Activity r7 = r0.A00
            if (r7 != 0) goto L_0x00b5
            r1 = 0
        L_0x0062:
            r13 = r1
            r9.A0F(r10, r11, r12, r13, r14)
            X.0t3 r1 = r8.A03
            android.graphics.drawable.Drawable r3 = A02(r5, r1, r4)
            android.widget.ImageView r2 = r6.A0E
            r2.setImageDrawable(r3)
            r1 = 0
            if (r3 != 0) goto L_0x0076
            r1 = 8
        L_0x0076:
            r2.setVisibility(r1)
            r1 = 0
            android.widget.ImageView r2 = r6.A0B
            com.obwhatsapp.youbasha.others.setHomeIc(r2, r1)
            r1 = 8
            r2.setVisibility(r1)
            X.0sH r6 = r8.A05
            if (r6 != 0) goto L_0x008d
            r1 = 0
        L_0x0089:
            r0.A09(r1)
            return
        L_0x008d:
            X.0sK r4 = r8.A01
            X.0sP r3 = r8.A02
            X.0sH r2 = r8.A04
            X.0rv r1 = r6.A0E
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r4.A0I(r1)
            if (r1 != 0) goto L_0x00ad
            boolean r1 = r2.A0J()
            r2 = 2
            if (r1 == 0) goto L_0x00a5
            r2 = 1
        L_0x00a5:
            r1 = 0
            X.0sQ r1 = r3.A06(r6, r2, r1, r1)
            java.lang.String r1 = r1.A01
            goto L_0x0089
        L_0x00ad:
            r1 = 2131888915(0x7f120b13, float:1.9412479E38)
            java.lang.String r1 = r5.getString(r1)
            goto L_0x0089
        L_0x00b5:
            android.view.View r1 = X.C13690nt.A0J(r7)
            int r1 = r1.getWidth()
            float r3 = (float) r1
            r1 = 1077936128(0x40400000, float:3.0)
            float r2 = X.C13680ns.A01(r7)
            float r2 = r2 * r1
            android.content.res.Configuration r1 = X.C13700nu.A03(r7)
            float r1 = r1.fontScale
            float r2 = r2 * r1
            float r3 = r3 / r2
            int r1 = (int) r3
            goto L_0x0062
        L_0x00cf:
            com.obwhatsapp.conversationslist.ViewHolder r6 = r0.A0A
            android.view.View r2 = r6.A07
            r10 = 8
            r2.setVisibility(r10)
            android.widget.ImageView r9 = r6.A0E
            r12 = 0
            r9.setVisibility(r12)
            android.widget.ImageView r3 = r6.A0F
            r3.setVisibility(r10)
            android.widget.ImageView r4 = r6.A0B
            r4.setVisibility(r10)
            com.obwhatsapp.WaTextView r2 = r6.A0P
            r2.setVisibility(r10)
            android.content.Context r8 = r0.A01
            X.AnonymousClass00B.A06(r8)
            r7 = 0
            r4.setBackground(r7)
            X.01Y r5 = r0.A06
            r2 = r18
            X.0rv r2 = r2.A0E
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r2)
            boolean r2 = r5.A0V(r2)
            java.lang.String r15 = ""
            r5 = 1
            if (r2 == 0) goto L_0x01ad
            X.0zl r3 = r0.A0H
            r2 = r18
            X.0rv r2 = r2.A0E
            boolean r2 = X.C40561uK.A01(r3, r2)
            if (r2 == 0) goto L_0x019b
            r2 = 2131893037(0x7f121b2d, float:1.942084E38)
            java.lang.String r2 = X.C34811ku.A05(r8, r2)
        L_0x011c:
            r9.setVisibility(r10)
            r3 = r15
            r13 = 0
            r15 = r2
            r12 = r3
        L_0x0123:
            if (r22 == 0) goto L_0x0148
            if (r13 != 0) goto L_0x0148
            X.0sK r4 = r0.A02
            X.0sP r7 = r0.A08
            r2 = r17
            X.0rv r2 = r2.A0E
            if (r2 == 0) goto L_0x0193
            boolean r2 = r4.A0I(r2)
            if (r2 != 0) goto L_0x0193
            boolean r2 = r18.A0J()
            r5 = 2
            if (r2 == 0) goto L_0x013f
            r5 = 1
        L_0x013f:
            r4 = 0
            r2 = r17
            X.0sQ r2 = r7.A06(r2, r5, r4, r4)
            java.lang.String r7 = r2.A01
        L_0x0148:
            r0.A09(r7)
            com.obwhatsapp.TextEmojiLabel r13 = r6.A0L
            X.2J6 r2 = r0.A09
            java.util.List r16 = r2.AF2()
            X.2TP r14 = r0.A0N
            if (r23 == 0) goto L_0x015e
            int r2 = r1.A0C
            r1 = 6
            r18 = 1
            if (r2 != r1) goto L_0x0160
        L_0x015e:
            r18 = 0
        L_0x0160:
            android.app.Activity r4 = r0.A00
            if (r4 != 0) goto L_0x0179
            r0 = 0
        L_0x0165:
            r17 = r0
            r13.A0F(r14, r15, r16, r17, r18)
            X.4Vz r0 = r6.A00
            com.obwhatsapp.components.ConversationListRowHeaderView r1 = r0.A00
            com.obwhatsapp.WaTextView r0 = r1.A01
            r0.setText(r12)
            com.obwhatsapp.WaTextView r0 = r1.A01
            r0.setContentDescription(r3)
            return
        L_0x0179:
            android.view.View r0 = X.C13690nt.A0J(r4)
            int r0 = r0.getWidth()
            float r2 = (float) r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = X.C13680ns.A01(r4)
            float r1 = r1 * r0
            android.content.res.Configuration r0 = X.C13700nu.A03(r4)
            float r0 = r0.fontScale
            float r1 = r1 * r0
            float r2 = r2 / r1
            int r0 = (int) r2
            goto L_0x0165
        L_0x0193:
            r2 = 2131888915(0x7f120b13, float:1.9412479E38)
            java.lang.String r7 = r8.getString(r2)
            goto L_0x0148
        L_0x019b:
            boolean r3 = r18.A0H()
            r2 = 2131886657(0x7f120241, float:1.94079E38)
            if (r3 == 0) goto L_0x01a7
            r2 = 2131886654(0x7f12023e, float:1.9407893E38)
        L_0x01a7:
            java.lang.String r2 = r8.getString(r2)
            goto L_0x011c
        L_0x01ad:
            if (r23 == 0) goto L_0x031d
            android.util.Pair r2 = r0.A05(r1)
            java.lang.Object r15 = r2.second
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r11 = r24
            boolean r2 = X.AnonymousClass3A4.A01(r1, r11)
            if (r2 == 0) goto L_0x0302
            X.0tZ r14 = r11.A00
            android.util.Pair r13 = r0.A05(r14)
            r4.setVisibility(r10)
            r9.setVisibility(r10)
            boolean r15 = r18.A0J()
            X.1qx r4 = r11.A01
            X.1Vw r2 = r4.A11
            boolean r3 = r2.A02
            if (r15 == 0) goto L_0x02f3
            if (r3 != 0) goto L_0x02f5
            r15 = r20
            if (r20 == 0) goto L_0x02fe
            X.0sP r2 = r0.A08
            X.0sQ r2 = r2.A06(r15, r5, r12, r12)
            java.lang.String r2 = r2.A01
            r16 = r2
        L_0x01e7:
            X.AnonymousClass00B.A06(r11)
            X.0tz r11 = r0.A0C
            boolean r2 = r4 instanceof X.C39101rv
            if (r2 == 0) goto L_0x0292
            X.1rv r4 = (X.C39101rv) r4
            java.lang.String r15 = r4.A01
            boolean r2 = android.text.TextUtils.isEmpty(r15)
            if (r2 != 0) goto L_0x0206
            X.AnonymousClass00B.A06(r15)
            boolean r2 = X.C37941pz.A02(r15)
            if (r2 != 0) goto L_0x0206
            java.lang.String r15 = "□"
        L_0x0206:
            java.lang.Object r14 = r13.first
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            java.lang.Object r3 = r13.second
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r14 == 0) goto L_0x0216
            java.lang.String r2 = "  "
            java.lang.String r3 = X.AnonymousClass000.A0g(r2, r3)
        L_0x0216:
            X.1Vw r2 = r4.A11
            boolean r2 = r2.A02
            r13 = 2
            if (r2 == 0) goto L_0x027a
            android.content.Context r11 = r11.A00
            r4 = 2131891021(0x7f12134d, float:1.941675E38)
        L_0x0222:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r12] = r15
            r2[r5] = r3
        L_0x0228:
            java.lang.String r11 = r11.getString(r4, r2)
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r11)
            if (r14 == 0) goto L_0x0254
            int r4 = r14.getIntrinsicWidth()
            int r2 = r14.getIntrinsicHeight()
            r14.setBounds(r12, r12, r4, r2)
            X.2nn r13 = new X.2nn
            r13.<init>(r14)
            int r4 = r11.length()
            int r2 = r3.length()
            int r4 = r4 - r2
            int r4 = r4 - r5
            int r3 = r4 + 1
        L_0x024f:
            r2 = 17
            r15.setSpan(r13, r4, r3, r2)
        L_0x0254:
            r13 = 1
        L_0x0255:
            X.0t3 r4 = r0.A0B
            X.013 r11 = r0.A0D
            long r2 = r1.A0I
            long r2 = r4.A02(r2)
            java.lang.String r12 = X.C28961Zl.A0A(r11, r2, r12)
            long r2 = r1.A0I
            long r2 = r4.A02(r2)
            java.lang.String r3 = X.C28961Zl.A0A(r11, r2, r5)
            android.graphics.drawable.Drawable r2 = A02(r8, r4, r1)
            if (r2 == 0) goto L_0x0318
            if (r13 != 0) goto L_0x0318
            r9.setImageDrawable(r2)
            goto L_0x0123
        L_0x027a:
            boolean r2 = android.text.TextUtils.isEmpty(r16)
            android.content.Context r11 = r11.A00
            r4 = 2131891020(0x7f12134c, float:1.9416748E38)
            if (r2 != 0) goto L_0x0222
            r4 = 2131891019(0x7f12134b, float:1.9416746E38)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r12] = r16
            r2[r5] = r15
            r2[r13] = r3
            goto L_0x0228
        L_0x0292:
            boolean r2 = r14 instanceof X.C39171s2
            if (r2 == 0) goto L_0x02ef
            X.1s2 r14 = (X.C39171s2) r14
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0o()
            android.content.Context r11 = r11.A00
            if (r3 == 0) goto L_0x02df
            android.content.res.Resources r3 = r11.getResources()
            r2 = 2131890891(0x7f1212cb, float:1.9416487E38)
            java.lang.String r4 = r3.getString(r2)
        L_0x02ab:
            r13.append(r4)
            java.lang.String r2 = "   "
            r13.append(r2)
            java.lang.String r2 = r14.A03
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r13)
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r2)
            r2 = 2131232188(0x7f0805bc, float:1.8080478E38)
            android.graphics.drawable.Drawable r11 = X.AnonymousClass2SR.A00(r11, r2)
            int r3 = r11.getIntrinsicWidth()
            int r2 = r11.getIntrinsicHeight()
            r11.setBounds(r12, r12, r3, r2)
            X.2nn r13 = new X.2nn
            r13.<init>(r11)
            int r2 = r4.length()
            int r4 = r2 + 1
            int r3 = r2 + 2
            goto L_0x024f
        L_0x02df:
            android.content.res.Resources r15 = r11.getResources()
            r3 = 2131890892(0x7f1212cc, float:1.9416489E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r4 = r4.A0l
            java.lang.String r4 = X.C13700nu.A0F(r15, r4, r2, r12, r3)
            goto L_0x02ab
        L_0x02ef:
            r15 = 0
            r13 = 0
            goto L_0x0255
        L_0x02f3:
            if (r3 == 0) goto L_0x02fe
        L_0x02f5:
            r2 = 2131888915(0x7f120b13, float:1.9412479E38)
            java.lang.String r16 = r8.getString(r2)
            goto L_0x01e7
        L_0x02fe:
            r16 = r7
            goto L_0x01e7
        L_0x0302:
            X.0tZ r2 = r1.A0D()
            if (r2 == 0) goto L_0x0315
            X.1Vw r2 = r2.A11
            X.0rv r2 = r2.A00
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 == 0) goto L_0x0315
            r3.setVisibility(r12)
        L_0x0315:
            r13 = 0
            goto L_0x0255
        L_0x0318:
            r9.setVisibility(r10)
            goto L_0x0123
        L_0x031d:
            r9.setVisibility(r10)
            r12 = r15
            r3 = r15
            r13 = 0
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62083Bo.A08(X.0sH, X.0sH, X.0sH, X.0tZ, X.1sd):void");
    }

    public final void A09(CharSequence charSequence) {
        StringBuilder A0r;
        TextEmojiLabel textEmojiLabel;
        int i2;
        if (TextUtils.isEmpty(charSequence)) {
            textEmojiLabel = this.A0A.A0M;
            i2 = 8;
        } else {
            if (C13680ns.A1Z(this.A0D) == C45902Bo.A0G(charSequence)) {
                A0r = AnonymousClass000.A0o();
                A0r.append(charSequence);
                A0r.append(": ");
            } else {
                A0r = AnonymousClass000.A0r(" :");
                A0r.append(charSequence);
            }
            String obj = A0r.toString();
            textEmojiLabel = this.A0A.A0M;
            textEmojiLabel.A0I((List) null, obj);
            i2 = 0;
        }
        textEmojiLabel.setVisibility(i2);
    }
}
