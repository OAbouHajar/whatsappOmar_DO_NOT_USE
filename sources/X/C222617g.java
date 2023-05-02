package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.17g  reason: invalid class name and case insensitive filesystem */
public class C222617g {
    public final C16300so A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;
    public final C18860xN A03;
    public final C14710pd A04;
    public final C224718b A05;

    public C222617g(C16300so r1, C16980tz r2, AnonymousClass013 r3, C18860xN r4, C14710pd r5, C224718b r6) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }

    public static C38651rC A00(GroupJid groupJid, String str, String str2, long j2) {
        C38651rC r1 = new C38651rC(new C28381Vw(groupJid, "", false), j2);
        r1.A0b(groupJid);
        r1.A0X(2);
        r1.A00 = str;
        r1.A01 = str2;
        return r1;
    }

    public C16740tZ A01(C28381Vw r3, byte b2, long j2) {
        C29861bL A002 = C37461pC.A00(r3, b2, j2);
        if (A002 != null) {
            return A002;
        }
        switch (b2) {
            case 0:
                return new C30581cc(r3, j2);
            case 1:
                return new C38681rF(r3, j2);
            case 2:
                return new C38701rH(r3, j2);
            case 3:
                return new C38711rI(r3, j2);
            case 4:
                return new C38741rL(r3, j2);
            case 5:
                return new C38751rM(r3, j2);
            case 8:
                return new C38761rN(r3, j2);
            case 9:
                return new C38631rA(r3, j2);
            case 10:
                return new C38771rO(r3, j2);
            case 11:
                return new C38781rP(r3, j2);
            case 12:
                return new C38791rQ(r3, j2);
            case 13:
                return new C38801rR(r3, j2);
            case 14:
                return new C38811rS(r3, j2);
            case 15:
                return new C38821rT(r3, j2);
            case 16:
                return new C38841rV(r3, j2);
            case 19:
                return new C38851rW(r3, j2);
            case 20:
                return new C38641rB(r3, j2);
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return new C38861rX(r3, j2);
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return new C38881rZ(r3, j2);
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return new C38891ra(r3, j2);
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return new C30071bh(r3, j2);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new C38901rb(r3, j2);
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new C38911rc(r3, j2);
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return new C30571cb(r3, j2);
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return new C38921rd(r3, j2);
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return new C38931re(r3, j2);
            case 30:
                return new C38941rf(r3, j2);
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return new C38951rg(r3, j2);
            case 32:
                return new C38961rh(r3, j2);
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                return new C38651rC(r3, j2);
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                return new C38971ri(r3, j2);
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                return new C38981rj(r3, j2);
            case 42:
                return new C38991rk(r3, j2);
            case 43:
                return new C39011rm(r3, j2);
            case 44:
                return new C39021rn(this.A00, r3, j2);
            case 45:
                return new C39031ro(r3, j2);
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                return new C39041rp(r3, j2);
            case 49:
                return new C39051rq(r3, j2);
            case 51:
                return new C39061rr(r3, j2);
            case 52:
                return new C39081rt(r3, j2);
            case 54:
                return new C39091ru(r3, j2);
            case 55:
                return new C16830ti(r3, (byte) 55, j2);
            case 56:
                return new C39101rv(r3, j2);
            case 57:
                return new C39111rw(r3, j2);
            case 58:
                return new C39121rx(r3, j2);
            case 62:
                return new C39141rz(r3, j2);
            case 63:
                return new C39151s0(r3, j2);
            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                return new C39161s1(r3, j2);
            case 66:
                return new C39171s2(r3, j2);
            case 67:
                return new C39181s3(r3, j2);
            case 68:
                return new C39191s4(r3, j2);
            case 69:
                return new C39201s5(r3, j2);
            case AnonymousClass2EA.A02 /*72*/:
                return new C39211s6(r3, j2);
            case 73:
                return new C39221s7(r3, j2);
            case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                return new C39231s8(r3, j2);
            case 78:
                return new C39241s9(r3, j2);
            default:
                StringBuilder sb = new StringBuilder("FMessageFactory/newFMessage/message type not handled; type=");
                sb.append(b2);
                AnonymousClass00B.A08(sb.toString());
                return new C38671rE(r3, b2, j2);
        }
    }

    public C38701rH A02(C16750ta r6, C15830rv r7, C16740tZ r8, String str, long j2, long j3) {
        C16740tZ A012 = A01(this.A05.A02(r7, true), (byte) 2, j2);
        if (A012 instanceof C16730tY) {
            C16730tY r1 = (C16730tY) A012;
            r1.A02 = r6;
            r1.A02 = 1;
            r1.A0W(0);
            r1.A07 = str;
            r1.A01 = j3;
            r1.A08 = 1;
            A05(r1, r8);
            return (C38701rH) r1;
        }
        StringBuilder sb = new StringBuilder("FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=");
        sb.append(2);
        throw new IllegalArgumentException(sb.toString());
    }

    public C38831rU A03(C16740tZ r6, long j2) {
        C224718b r2 = this.A05;
        C28381Vw r4 = r6.A11;
        C38821rT r1 = new C38821rT(r2.A02(r4.A00, true), r6.A0I);
        r1.A0M = r6.A0B();
        r1.A0r = r6.A0Q();
        r1.A01 = r4.A01;
        r1.A00 = j2;
        r1.A0Z = r6.A0Z;
        r1.A06 = 0;
        return r1;
    }

    public C30581cc A04(AnonymousClass1ZR r4, C15830rv r5, C16740tZ r6, C30771cv r7, String str, List list, long j2, boolean z2, boolean z3) {
        String str2;
        byte[] bArr;
        C30581cc r1 = new C30581cc(this.A05.A02(r5, true), j2);
        r1.A0k(str);
        r1.A0u(list);
        if (r4 != null && r4.A0F()) {
            r1.A06 = r4.A0K;
            Integer num = r4.A0B;
            if (num == null || num.intValue() != 2 || (str2 = r4.A0F) == null) {
                str2 = r4.A0H;
            }
            r1.A04 = str2;
            r1.A07 = r4.A0D;
            r1.A01 = r4.A02;
            if (r7 != null) {
                r1.A0h(r7);
            }
            if (!z2 || (bArr = r4.A0U) == null || z3) {
                bArr = r4.A0T;
            }
            r1.A16(bArr);
            Integer num2 = r4.A0B;
            if (num2 != null) {
                r1.A00 = num2.intValue();
            }
        }
        A05(r1, r6);
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C16740tZ r5, X.C16740tZ r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0079
            X.0tm r1 = r6.A0F()
            if (r1 == 0) goto L_0x009d
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x009d
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x0023
            byte[] r0 = r1.A06()
            if (r0 != 0) goto L_0x0020
            X.0xN r0 = r4.A03
            byte[] r0 = r0.A09(r6)
        L_0x0020:
            r1.A01(r0)
        L_0x0023:
            byte[] r2 = r1.A07()
        L_0x0027:
            boolean r0 = r6 instanceof X.C16850tk
            if (r0 == 0) goto L_0x0096
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r6.A10(r0)
            if (r0 != 0) goto L_0x007a
            r1 = r6
            X.0tk r1 = (X.C16850tk) r1
            X.1Vw r0 = r6.A11
            X.0tZ r3 = r1.A6M(r0)
        L_0x003c:
            java.lang.String r0 = r6.A0n
            r3.A0n = r0
            X.1Vt r0 = r6.A0L
            r3.A0L = r0
        L_0x0044:
            int r1 = r3.A09
            r0 = -1025(0xfffffffffffffbff, float:NaN)
            r0 = r0 & r1
            r3.A09 = r0
            r0 = 2
            r3.A0X(r0)
            boolean r0 = r6.A0x()
            if (r0 == 0) goto L_0x005e
            X.1sA r0 = r6.A0E()
            X.1sB r0 = r0.A00
            r3.A0f(r0)
        L_0x005e:
            r5.A0e(r3)
            X.0tZ r0 = r5.A0D()
            if (r0 == 0) goto L_0x0079
            X.0tm r0 = r0.A0F()
            if (r0 == 0) goto L_0x0079
            X.0tZ r0 = r5.A0D()
            X.0tm r1 = r0.A0F()
            r0 = 1
            r1.A03(r2, r0)
        L_0x0079:
            return
        L_0x007a:
            X.1sC r0 = r6.A0G()
            if (r0 == 0) goto L_0x009f
            r1 = r6
            X.0tk r1 = (X.C16850tk) r1
            X.1sC r0 = r6.A0G()
            X.1Vw r0 = r0.A02
            X.0tZ r3 = r1.A6M(r0)
            int r1 = r3.A09
            r0 = -131073(0xfffffffffffdffff, float:NaN)
            r0 = r0 & r1
            r3.A09 = r0
            goto L_0x003c
        L_0x0096:
            boolean r0 = r6 instanceof X.C38651rC
            r3 = 0
            if (r0 == 0) goto L_0x005e
            r3 = r6
            goto L_0x0044
        L_0x009d:
            r2 = 0
            goto L_0x0027
        L_0x009f:
            java.lang.String r1 = "FMessageFactory/cloneQuotedMessage Message"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222617g.A05(X.0tZ, X.0tZ):void");
    }
}
