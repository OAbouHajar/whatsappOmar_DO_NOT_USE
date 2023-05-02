package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import com.instagram.common.bloks.mutations.IDxUOperationShape10S0200000_2_I1;
import com.instagram.common.bloks.mutations.IDxUOperationShape50S0100000_2_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;

/* renamed from: X.3Eb  reason: invalid class name and case insensitive filesystem */
public class C62563Eb implements C25261Jc {
    public final C62553Ea A00 = new C62553Ea();

    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static View A01(C14960q4 r2, C14950q3 r3) {
        return ((C31201dg) r3.A00.get(0)).A0C(r2.A00);
    }

    @Deprecated
    public static C14990q7 A02(C14960q4 r2, C14950q3 r3, int i2) {
        List list = r3.A00;
        if (i2 < list.size()) {
            Object obj = list.get(i2);
            if (obj instanceof C14990q7) {
                return (C14990q7) obj;
            }
        }
        return r2.A00;
    }

    public static AnonymousClass2Wa A03(C14960q4 r10, C31201dg r11, String str, List list, List list2, List list3, List list4, List list5, boolean z2) {
        List list6 = list5;
        List list7 = list4;
        C31201dg r4 = r11;
        ArrayList A0u = AnonymousClass000.A0u();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                Object obj = A06(r10).A02.get(A0m);
                if (obj != null) {
                    A0u.add(obj);
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Data Manifest for referenced internal variable id ");
                    A0r.append(A0m);
                    throw AnonymousClass000.A0T(AnonymousClass000.A0h("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", AnonymousClass000.A0q(AnonymousClass000.A0h(" not found! ", A0r))));
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String A0m2 = AnonymousClass000.A0m(it2);
                A0u.add(new AnonymousClass229(A0m2, Collections.singletonMap("initial", A0C(r10, A0m2))));
            }
        }
        HashMap A0x = AnonymousClass000.A0x();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String A0m3 = AnonymousClass000.A0m(it3);
                A0x.put(A0m3, A09(r10, A0m3));
            }
        }
        if (z2 && r11 != null) {
            r4 = AnonymousClass382.A00(new C99154tZ(r11), r11);
        }
        if (list5 == null) {
            list6 = Collections.EMPTY_LIST;
        }
        if (list4 == null) {
            list7 = Collections.EMPTY_LIST;
        }
        return new AnonymousClass2Wa(r4, str, A0u, list6, list7, A0x);
    }

    public static AnonymousClass2Wa A04(C14960q4 r8, C85424Oj r9, boolean z2) {
        C31201dg r1 = r9.A00;
        List list = r9.A09;
        List list2 = r9.A08;
        List list3 = r9.A07;
        List list4 = r9.A06;
        List list5 = r9.A03;
        AnonymousClass4CM r0 = r9.A01;
        return A03(r8, r1, r0 != null ? r0.A00 : null, list, list2, list3, list4, list5, z2);
    }

    public static C14910pz A05(C14960q4 r0, C14950q3 r1, int i2) {
        return C62183Bz.A03(A02(r0, r1, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r4 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C88964bN A06(X.C14960q4 r5) {
        /*
            X.4bN r4 = r5.A01
            if (r4 != 0) goto L_0x0019
            X.0q7 r0 = r5.A00
            if (r0 == 0) goto L_0x0026
            X.0pz r1 = X.C62183Bz.A03(r0)
            java.lang.String r0 = "Tree resources can only be read from the UI Thread"
            X.C62003Bg.A02(r0)
            X.4bN r4 = r1.A04
            java.util.Map r3 = r1.A08
            if (r3 != 0) goto L_0x001a
            if (r4 == 0) goto L_0x0026
        L_0x0019:
            return r4
        L_0x001a:
            java.util.Map r2 = r4.A02
            java.util.Map r1 = r4.A01
            java.util.Map r0 = r4.A00
            X.4bN r4 = new X.4bN
            r4.<init>(r2, r1, r3, r0)
            return r4
        L_0x0026:
            java.lang.String r0 = "No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about."
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62563Eb.A06(X.0q4):X.4bN");
    }

    public static C99294tn A07(String str) {
        return new C99294tn(new C99314tp(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = X.AnonymousClass45Y.A00((r1 = X.AnonymousClass45Y.A00(r3, new X.C99304to((long) r4.intValue()))), new X.C99314tp(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C31201dg A08(X.C31201dg r3, java.lang.Integer r4, java.lang.String r5) {
        /*
            if (r5 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            if (r4 == 0) goto L_0x0022
            int r0 = r4.intValue()
            long r1 = (long) r0
            X.4to r0 = new X.4to
            r0.<init>(r1)
            X.1dg r1 = X.AnonymousClass45Y.A00(r3, r0)
            if (r1 == 0) goto L_0x0022
            X.4tp r0 = new X.4tp
            r0.<init>(r5)
            X.1dg r0 = X.AnonymousClass45Y.A00(r1, r0)
            if (r0 == 0) goto L_0x0022
            return r0
        L_0x0022:
            X.4tp r0 = new X.4tp
            r0.<init>(r5)
            X.1dg r0 = X.AnonymousClass45Y.A00(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62563Eb.A08(X.1dg, java.lang.Integer, java.lang.String):X.1dg");
    }

    public static C87884Za A09(C14960q4 r1, String str) {
        C87884Za r0 = (C87884Za) A06(r1).A01.get(str);
        if (r0 != null) {
            return r0;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Payload for referenced embedded payload id ");
        A0r.append(str);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", AnonymousClass000.A0q(AnonymousClass000.A0h(" not found!", A0r))));
    }

    public static Number A0A(String str, float f2) {
        if (!"px".equalsIgnoreCase(str)) {
            if ("dp".equalsIgnoreCase(str)) {
                f2 /= C13680ns.A01(C90154da.A00().A00);
            } else {
                C29691b2.A00("BloksCoreInterpreterExtensions", C13680ns.A0h("Unrecognised unit string ", str));
                return null;
            }
        }
        return C89554cQ.A00((double) f2);
    }

    public static Object A0B(C14960q4 r2, C14950q3 r3, List list, int i2) {
        return C62183Bz.A05(A02(r2, r3, i2), (C31201dg) list.get(0));
    }

    public static Object A0C(C14960q4 r2, Object obj) {
        Object obj2 = A06(r2).A03.get(obj);
        Set set = r2.A05;
        if (set != null) {
            set.add(obj);
        }
        return obj2;
    }

    public static Object A0D(C14960q4 r2, String str) {
        Map map = r2.A04;
        if (map == null) {
            C14910pz A03 = C62183Bz.A03(r2.A00);
            if (C62003Bg.A03()) {
                AnonymousClass4O3 r0 = A03.A02;
                map = r0 == null ? Collections.emptyMap() : r0.A05;
            } else {
                throw AnonymousClass000.A0a("Expanded Variables can only be read from the UI Thread");
            }
        }
        Object obj = map.get(str);
        Set set = r2.A05;
        if (set != null) {
            set.add(str);
        }
        return obj;
    }

    public static String A0E(C795440g r4, String str, List list, int i2) {
        List subList = list.subList(0, i2);
        char c2 = '|';
        if (r4 == C795440g.INTERNAL_VARIABLE) {
            c2 = IOUtils.DIR_SEPARATOR_UNIX;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            A0o.append(c2);
            A0o.append(A0m);
        }
        String obj = A0o.toString();
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append("#");
        return AnonymousClass000.A0h(obj, A0q);
    }

    public static List A0F(C14910pz r5, List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2Wa r2 = (AnonymousClass2Wa) it.next();
            C88184a5 r1 = r2.A00;
            if (r5.A09) {
                C29691b2.A00("BloksTreeManager", "Trying to enqueue resources update on a destroyed BloksTreeManager");
            } else {
                C62003Bg.A02("Tree operations are only supported from the UI Thread");
                r5.A0J.add(r1);
                Handler handler = C14910pz.A0L;
                Runnable runnable = r5.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
            A0u.add(r2.A01);
        }
        return A0u;
    }

    public static void A0G(C14910pz r2, Object obj, String str, int i2) {
        r2.A05(new C99314tp(str), new IDxUOperationShape50S0100000_2_I1(obj, i2));
    }

    public static void A0H(C14910pz r4, String str, List list) {
        C99314tp r3 = new C99314tp(str);
        Pair A0I = C13690nt.A0I(new C99294tn(r3), new IDxUOperationShape10S0200000_2_I1(list, 0, r3));
        r4.A05((AnonymousClass5OP) A0I.first, (AnonymousClass4SR) A0I.second);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v121, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v129, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v135, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v297, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v298, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v301, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v302, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v303, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v304, resolved type: X.1az} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v305, resolved type: X.4Oj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v306, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v307, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v308, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v309, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v310, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v312, resolved type: X.1b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v313, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v314, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v316, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v318, resolved type: X.1dg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v319, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v320, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v321, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v322, resolved type: X.4Oj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v325, resolved type: X.3fl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v326, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v327, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v329, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v330, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v331, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v332, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v333, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v334, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v335, resolved type: X.1b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v336, resolved type: X.2Wa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v338, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v339, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v340, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v353, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v354, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v356, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v360, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v361, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v362, resolved type: android.view.animation.Interpolator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v363, resolved type: android.animation.ValueAnimator} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:454|455|456|457|458|586|598|599) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0340, code lost:
        r0 = "bk.action.trace.EndSection";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0343, code lost:
        r0 = "bk.action.errorreporting.ReportError";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0346, code lost:
        r0 = "bk.action.bloks.TimestampOfLastTouchUpV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0349, code lost:
        r0 = "bk.action.animated.Start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x034c, code lost:
        r0 = "bk.action.animated.Create";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x034f, code lost:
        r0 = "bk.action.media.LoadMediaV2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0352, code lost:
        r0 = "bk.action.trace.BeginSection";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0355, code lost:
        r0 = "bk.action.text.IsTruncated";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0358, code lost:
        r0 = "bk.action.i18n.LanguagePackResolveFbt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x035b, code lost:
        r0 = "bk.action.bloks.TimestampOfLastTouchUp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x035e, code lost:
        r0 = "bk.action.tooltip.Hide";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0361, code lost:
        r0 = "bk.action.tooltip.Show";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0364, code lost:
        r0 = "bk.action.ttrc.SurfaceLeft";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0367, code lost:
        r0 = "bk.action.string.MatchesRegex";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0369, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x036e, code lost:
        if (r2.equals(r0) != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0377, code lost:
        if ("bk.action.animated.Create".equals(r2) == false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0379, code lost:
        X.C18450wi.A0H(r1, 0);
        X.C18450wi.A0H(r15, 1);
        r10 = r1.A00;
        r8 = ((X.C31411e8) r10.get(0)).A00;
        r6 = X.C31411e8.A01(r10.get(1));
        r0 = r10.get(2);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r3 = X.AnonymousClass000.A04(r0);
        r0 = r10.get(3);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r2 = X.AnonymousClass000.A04(r0);
        r0 = r10.get(4);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r11 = X.AnonymousClass000.A04(r0);
        r4 = A02(r15, r1, 6);
        r1 = new android.animation.ValueAnimator();
        r1.setFloatValues(new float[]{r3, r2});
        r1.setDuration((long) (r11 * ((float) X.C06380Vm.A00)));
        r1.setInterpolator((android.animation.TimeInterpolator) r10.get(5));
        r0 = new X.C14940q2();
        r0.A02(r1, 0);
        r1.addUpdateListener(new X.C06630Xa(r15, new X.C14950q3(r0.A00), r8));
        X.C18450wi.A0B(r4);
        X.C06380Vm.A00(r1, r4, r15, r6);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0400, code lost:
        if ("bk.action.animated.easing.CreateCubicBezier".equals(r2) == false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0402, code lost:
        X.C18450wi.A0H(r1, 0);
        r8 = r1.A00;
        r0 = r8.get(0);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r3 = X.AnonymousClass000.A04(r0);
        r0 = r8.get(1);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r2 = X.AnonymousClass000.A04(r0);
        r0 = r8.get(2);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r1 = X.AnonymousClass000.A04(r0);
        r0 = r8.get(3);
        X.C18450wi.A0M(r0, "null cannot be cast to non-null type kotlin.Number");
        r1 = X.C04240Lt.A00(r3, r2, r1, X.AnonymousClass000.A04(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0442, code lost:
        if ("bk.action.animated.Start".equals(r2) == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0444, code lost:
        X.C18450wi.A0H(r1, 0);
        X.C18450wi.A0H(r15, 1);
        r1 = X.C14950q3.A00(r1);
        X.C18450wi.A0M(r1, "null cannot be cast to non-null type android.animation.Animator");
        X.C06380Vm.A01((android.animation.Animator) r1, r15, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0461, code lost:
        if ("bk.action.bloks.TimestampOfLastTouchUp".equals(r2) == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0463, code lost:
        r1 = com.bloks.foa.signatures.bkactionblokstimestampoflasttouchup.BKBloksActionBloksTimestampOfLastTouchUpImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x046f, code lost:
        if ("bk.action.bloks.TimestampOfLastTouchUpV2".equals(r2) == false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0471, code lost:
        r1 = com.bloks.foa.signatures.bkactionblokstimestampoflasttouchupv2.BKBloksActionBloksTimestampOfLastTouchUpImplV2.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x047d, code lost:
        if ("bk.action.caa.FoaFetchOpenIdTokens".equals(r2) == false) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x047f, code lost:
        r1 = com.bloks.foa.signatures.bkactioncaafoafetchopenidtokens.BKBloksActionCaaFoaFetchOpenIdTokensImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        if ("bk.action.caa.foa.reg.GetAgeFromBirthdayTimestamp".equals(r2) == false) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x048d, code lost:
        r1 = com.bloks.foa.signatures.bkactioncaafoareggetagefrombirthdaytimestamp.BKBloksActionCaaFoaRegGetAgeFromBirthdayTimestampImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0499, code lost:
        if ("bk.action.errorreporting.ReportError".equals(r2) == false) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x049b, code lost:
        r1 = com.bloks.foa.signatures.bkactionerrorreportingreporterror.BKBloksActionErrorreportingReportErrorImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04a7, code lost:
        if ("bk.action.string.MatchesRegex".equals(r2) == false) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a9, code lost:
        r1 = java.lang.Boolean.valueOf(com.bloks.foa.signatures.bkactionstringmatchesregex.BKActionStringMatchesRegexImpl.evaluate(r1, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04b9, code lost:
        if ("bk.action.string.SplitWithString".equals(r2) == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04bb, code lost:
        r1 = com.bloks.foa.signatures.bkactionstringsplitwithstring.BKBloksActionStringSplitWithStringImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c7, code lost:
        if ("bk.action.string.Trim".equals(r2) == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04c9, code lost:
        r1 = com.bloks.foa.signatures.bkactionstringtrim.BKActionStringTrimImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04d5, code lost:
        if ("bk.action.text.IsTruncated".equals(r2) == false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r1 = java.lang.Boolean.valueOf(com.bloks.foa.signatures.bkactiontextistruncated.BKBloksActionTextIsTruncatedImpl.evaluate(r1, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04e7, code lost:
        if ("bk.action.trace.BeginSection".equals(r2) == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04e9, code lost:
        r1 = com.bloks.foa.signatures.bkactiontracebeginsection.BKActionTraceBeginSection.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04f5, code lost:
        if ("bk.action.trace.EndSection".equals(r2) == false) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04f7, code lost:
        r1 = com.bloks.foa.signatures.bkactiontraceendsection.BKActionTraceEndSection.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0503, code lost:
        if ("bk.action.ttrc.CachedContentDisplayed".equals(r2) == false) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0505, code lost:
        r1 = com.bloks.foa.signatures.bkactionttrccachedcontentdisplayed.BKBloksActionTtrcCachedContentDisplayedImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0511, code lost:
        if ("bk.action.ttrc.MarkerStart".equals(r2) == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r1 = com.bloks.foa.signatures.bkactionttrcmarkerstart.BKActionTtrcMarkerStartImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x051f, code lost:
        if ("bk.action.ttrc.NetworkContentDisplayed".equals(r2) == false) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0521, code lost:
        r1 = com.bloks.foa.signatures.bkactionttrcnetworkcontentdisplayed.BKBloksActionTtrcNetworkContentDisplayedImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x052d, code lost:
        if ("bk.action.ttrc.SurfaceLeft".equals(r2) == false) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x052f, code lost:
        r1 = com.bloks.foa.signatures.bkactionttrcsurfaceleft.BKBloksActionTtrcSurfaceLeftImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x053b, code lost:
        if ("bk.action.media.LoadAlbums".equals(r2) == false) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x053d, code lost:
        r1 = com.bloks.stdlib.signatures.bkactionmedialoadalbums.BKBloksActionMediaLoadAlbumsImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0549, code lost:
        if ("bk.action.media.LoadMediaV2".equals(r2) == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x054b, code lost:
        r1 = com.bloks.stdlib.signatures.bkactionmedialoadmediav2.BKBloksActionMediaLoadMediaV2Impl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0557, code lost:
        if ("bk.action.tooltip.Hide".equals(r2) == false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0559, code lost:
        r1 = com.bloks.stdlib.signatures.bkactiontooltiphide.BKBloksActionTooltipHideImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0565, code lost:
        if ("bk.action.tooltip.Show".equals(r2) == false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0567, code lost:
        r1 = com.bloks.stdlib.signatures.bkactiontooltipshow.BKBloksActionTooltipShowImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0573, code lost:
        if ("bk.action.i18n.LanguagePackResolveFbt".equals(r2) == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0575, code lost:
        r1 = com.facebook.bloks.facebook.actions.plugins.bkactioni18nlanguagepackresolvefbt.BKBloksActionI18nLanguagePackResolveFbtImpl.evaluate(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x057b, code lost:
        r0 = X.AnonymousClass000.A0T(java.lang.String.format("No implementation bound to key: %s", new java.lang.Object[]{r2}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x058c, code lost:
        r1 = r24.A00.A8l(r1, r12, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0596, code lost:
        r0 = r1.A00;
        r2 = X.C47842Kv.A00(r0, 0);
        r0 = X.C13690nt.A0l(r0, 1);
        r1 = A05(r15, r1, 2);
        A0G(r1, A0F(r1, r0), r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05ad, code lost:
        r2 = r1.A00;
        r0 = X.C13690nt.A0l(r2, 1);
        r2 = X.C47842Kv.A00(r2, 2);
        r6 = A05(r15, r1, 3);
        r1 = A0F(r6, r0);
        r5 = A07(r2);
        r4 = new X.C69943fr(r1, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05ca, code lost:
        r0 = r1.A00;
        A0G(A05(r15, r1, 2), X.C13690nt.A0l(r0, 1), X.C47842Kv.A00(r0, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05dd, code lost:
        r3 = X.C47842Kv.A00(r1.A00, 0);
        r2 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05e9, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05eb, code lost:
        r1 = (java.util.ArrayList) ((java.util.HashMap) r2.A02(com.obwhatsapp.R.id.bk_context_key_states)).get(r3);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05fa, code lost:
        if (r1 != null) goto L_0x12c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05fc, code lost:
        r0 = X.C62183Bz.A03(r2);
        r1 = new X.C99214tf(r3);
        r0.A02().A0Q(r1);
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x060e, code lost:
        if (r1 == null) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0610, code lost:
        r1 = (java.util.ArrayList) X.C14980q6.A00(r15, X.C14950q3.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x061c, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x061e, code lost:
        ((java.util.HashMap) r2.A02(com.obwhatsapp.R.id.bk_context_key_states)).put(r3, r1);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x062c, code lost:
        r0 = X.AnonymousClass000.A0a("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0634, code lost:
        r0 = X.AnonymousClass000.A0V(X.C13680ns.A0h("No state initializer available for id: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0640, code lost:
        r0 = X.AnonymousClass000.A0a("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0648, code lost:
        r2 = r1.A00;
        r0 = X.C13690nt.A0l(r2, 1);
        r2 = X.C47842Kv.A00(r2, 2);
        r1 = A05(r15, r1, 3);
        A0H(r1, r2, A0F(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x065f, code lost:
        r2 = r1.A00;
        r0 = X.C13690nt.A0l(r2, 1);
        r5 = X.C47842Kv.A00(r2, 2);
        r4 = A05(r15, r1, 3);
        r4.A05(A07(r5), new X.C69933fq(r5, A0F(r4, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x067f, code lost:
        r1 = java.lang.Integer.valueOf(A01(r15, r1).getWidth());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x068d, code lost:
        r0 = r1.A00;
        A0G(A05(r15, r1, 2), X.C13690nt.A0l(r0, 1), X.C47842Kv.A00(r0, 0), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06a0, code lost:
        r2 = r1.A00;
        r0 = X.C13690nt.A0l(r2, 1);
        r2 = X.C47842Kv.A00(r2, 2);
        r6 = A05(r15, r1, 3);
        r1 = A0F(r6, r0);
        r5 = A07(r2);
        r4 = new X.C69943fr(r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06bc, code lost:
        r6.A05(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06c1, code lost:
        r1 = A06(r15).A00.get(X.AnonymousClass000.A0n(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06d3, code lost:
        r0 = r1.A00;
        r2 = X.C47842Kv.A00(r0, 0);
        r0 = X.C13690nt.A0l(r0, 1);
        r1 = A05(r15, r1, 2);
        A0G(r1, A0F(r1, r0), r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06ea, code lost:
        r1 = X.AnonymousClass2Wa.A02((X.C85424Oj) X.C14950q3.A00(r1), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06f6, code lost:
        r0 = r1.A00;
        r4 = X.C13690nt.A0Q(r0, 0);
        r2 = X.AnonymousClass000.A0n(r0, 1);
        r1 = (X.AnonymousClass38S) X.C62183Bz.A05(A02(r15, r1, 2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x070a, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x070c, code lost:
        r1.A0E.append(r2);
        r0 = r1.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0713, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0715, code lost:
        r0.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x071a, code lost:
        r4 = X.C47842Kv.A00(r1.A00, 1);
        A05(r15, r1, 2).A05(A07(r4), new X.C69903fn(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0732, code lost:
        r0 = r1.A00;
        r2 = X.C47842Kv.A00(r0, 0);
        r0 = X.C13690nt.A0l(r0, 1);
        r1 = A05(r15, r1, 2);
        A0G(r1, A0F(r1, r0), r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0749, code lost:
        r0 = r1.A00;
        r9 = X.C13690nt.A0Q(r0, 0);
        r11 = X.AnonymousClass000.A0n(r0, 1);
        r2 = r0.get(2);
        r10 = A02(r15, r1, 3);
        r8 = X.C807145e.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0761, code lost:
        if (r8 >= 32) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0763, code lost:
        r1 = new java.lang.Object[3];
        X.AnonymousClass000.A1M(r1, r8, 0);
        r1[1] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x076a, code lost:
        if (r9 == null) goto L_0x076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x076d, code lost:
        r0 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0771, code lost:
        r0 = java.lang.Integer.valueOf(r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0777, code lost:
        r1[2] = r0;
        X.C29691b2.A00("BloksCoreInterpreterExtensions", java.lang.String.format("Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0784, code lost:
        r1 = X.C62183Bz.A05(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0788, code lost:
        if (r1 == null) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x078c, code lost:
        if ((r1 instanceof X.AnonymousClass5OM) == false) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0794, code lost:
        if (((X.AnonymousClass5OM) r1).AdZ(r10, r2, r8) != false) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0796, code lost:
        X.C62183Bz.A03(r10).A05(new X.C99304to((long) r9.A00), new X.C69953fs(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07ac, code lost:
        r1 = new X.C29681b1((X.C14930q1) ((X.C31411e8) X.C14950q3.A00(r1)).A00, r15.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07bd, code lost:
        r0 = r1.A00;
        A05(r15, r1, 2).A05(new X.C99304to((long) X.C13690nt.A0Q(r0, 0).A00), new X.C69893fm(X.AnonymousClass000.A0D(r0.get(1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07e1, code lost:
        r1 = (X.AnonymousClass39I) A0B(r15, r1, r1.A00, 1);
        r2 = X.C90154da.A00().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x07f3, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x07f5, code lost:
        r1 = java.lang.Integer.valueOf((int) (((float) r1.A03.A03) / X.C13680ns.A01(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0806, code lost:
        r0 = X.AnonymousClass000.A0a("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x080e, code lost:
        r2 = r1.A00;
        r8 = X.C13690nt.A0Q(r2, 0);
        r6 = X.AnonymousClass000.A0D(r2.get(1));
        r2 = X.C89554cQ.A02(r2.get(2));
        r0 = (X.AnonymousClass39I) X.C62183Bz.A05(A02(r15, r1, 3), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x082e, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0830, code lost:
        r0.A01(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0835, code lost:
        r0 = A01(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0839, code lost:
        if (r0 == null) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x083b, code lost:
        r1 = r0.requestFocus();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0840, code lost:
        if (r1 != false) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0842, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0843, code lost:
        r1 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0849, code lost:
        r1 = X.C90154da.A00().A07.A00(X.C13690nt.A0Q(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x085b, code lost:
        r2 = r1.A00;
        A05(r15, r1, 3).A05(new X.C99304to((long) X.C13690nt.A0Q(r2, 0).A00), new X.C69923fp(X.C47842Kv.A00(r2, 1), X.C47842Kv.A00(r2, 2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x087f, code lost:
        r0 = (X.AnonymousClass38S) A0B(r15, r1, r1.A00, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0887, code lost:
        if (r0 == null) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0889, code lost:
        r0 = r0.A0E.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x088f, code lost:
        if (r0 == null) goto L_0x0897;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0891, code lost:
        r1 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0897, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x089b, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x089f, code lost:
        r0 = r1.A00;
        r4 = X.AnonymousClass000.A0n(r0, 0);
        r2 = r0.get(1);
        r0 = (java.util.Map) r15.A00.A02(com.obwhatsapp.R.id.bk_context_key_data_modules);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x08b4, code lost:
        if (r0 != null) goto L_0x08b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x08b7, code lost:
        r1 = (X.C17360ux) r0.get("gs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x08be, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x08bf, code lost:
        if (r1 == null) goto L_0x0e94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x08c3, code lost:
        if ((r1 instanceof X.C99284tm) == false) goto L_0x0e94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08c5, code lost:
        ((X.C99284tm) r1).A00.A01(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x08ce, code lost:
        r0 = r1.A00;
        r6 = X.C13690nt.A0l(r0, 1);
        r5 = X.C47842Kv.A00(r0, 2);
        A05(r15, r1, 3).A05(A07(r5), new X.C69943fr(r6, 0, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x08eb, code lost:
        r8 = r1.A00;
        r4 = (X.AnonymousClass39I) A0B(r15, r1, r8, 3);
        r1 = (java.lang.Number) r8.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x08f9, code lost:
        if (r4 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x08fb, code lost:
        r2 = (int) android.util.TypedValue.applyDimension(1, r1.floatValue(), X.AnonymousClass000.A0M(X.C90154da.A00().A00));
        r1 = X.C89554cQ.A02(r8.get(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x091a, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0920, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0922, code lost:
        r4.A00(r2 - r4.A03.A03, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x092c, code lost:
        r0 = X.AnonymousClass000.A0a("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0934, code lost:
        r0 = X.AnonymousClass000.A0a("setXOffset cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x093d, code lost:
        r1 = (java.util.Map) X.C14950q3.A00(r1);
        X.C89644cb.A01("InflateSync");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        r1 = X.AnonymousClass000.A0y(r1);
        X.C90154da.A00();
        r0 = new X.AnonymousClass3EY(r15, r1);
        r0.ALo();
        r1 = X.C611837x.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x095c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        X.C29691b2.A02("inflate_sync_error", r1);
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        r1 = X.AnonymousClass000.A0n(r1.A00, 0);
        X.C89644cb.A01("ParseEmbedded");
        r1 = A04(r15, X.C87884Za.A00(r1), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x097c, code lost:
        r4 = r1.A00;
        r1 = new X.C69883fl(r15.A03, ((java.lang.Integer) r4.get(0)).intValue(), r4.size() / 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0998, code lost:
        if (r7 >= r4.size()) goto L_0x09b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x099a, code lost:
        r1.A02.put(((java.lang.Integer) r4.get(r7)).intValue(), r4.get(r7 + 1));
        r7 = r7 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x09b2, code lost:
        r1.A0R();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x09b7, code lost:
        r0 = r1.A00;
        r2 = X.C13690nt.A0Q(r0, 0);
        r6 = X.C47842Kv.A00(r0, 1);
        r7 = X.C89554cQ.A02(r0.get(2));
        r5 = (X.AnonymousClass39I) X.C62183Bz.A05(A02(r15, r1, 3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x09d3, code lost:
        if (r5 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x09d9, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0a05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x09db, code lost:
        r4 = r5.A02.A04;
        r2 = r4.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x09e4, code lost:
        if (r1 >= r2) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x09e6, code lost:
        r0 = ((X.C83364Gj) r4.get(r1)).A01.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x09f2, code lost:
        if (r0 == null) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x09f8, code lost:
        if (r0.equals(r6) == false) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x09fb, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x09fe, code lost:
        if (r1 < 0) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0a00, code lost:
        r5.A01(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0a05, code lost:
        r0 = X.AnonymousClass000.A0a("setIndexById cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0a0e, code lost:
        r0 = r1.A00;
        r4 = (X.C29681b1) r0.get(0);
        r1 = java.util.Collections.unmodifiableList(r0);
        r3 = new X.C14950q3(r1.subList(1, r1.size()));
        r2 = r4.A01;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0a2b, code lost:
        if (r0 == null) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0a2d, code lost:
        r1 = X.C14980q6.A00(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0a33, code lost:
        r12 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0a35, code lost:
        if (r12 == null) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0a37, code lost:
        if (r15 == null) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a39, code lost:
        r7 = r15.A00;
        r13 = r15.A04;
        r5 = new X.C14960q4(r15.A00, r7, r15.A01, r15.A01, X.C62183Bz.A04(r7), r15.A02, r12, r13, r15.A05);
        r4 = r5.A03;
        r1 = r15.A03.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a5a, code lost:
        if (r1.isEmpty() != false) goto L_0x0a61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0a5c, code lost:
        r4.A00.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0a61, code lost:
        r1 = X.C14980q6.A00(r5, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0a67, code lost:
        X.C29691b2.A00("BloksCallback", "An attempt to invoke an invalid callback");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0a70, code lost:
        r1 = A09(r15, X.AnonymousClass000.A0n(r1.A00, 0)).A00.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0a82, code lost:
        r0 = r1.A00;
        r6 = X.C13690nt.A0l(r0, 1);
        r5 = X.C47842Kv.A00(r0, 2);
        A05(r15, r1, 3).A05(A07(r5), new X.C69933fq(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0a9e, code lost:
        r0 = r1.A00;
        A0H(A05(r15, r1, 3), X.C47842Kv.A00(r0, 2), X.C13690nt.A0l(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0ab1, code lost:
        r1 = A04(r15, A09(r15, X.AnonymousClass000.A0n(r1.A00, 0)).A00.A00.A00, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0ac7, code lost:
        r0 = r1.A00;
        r1 = A0A(X.AnonymousClass000.A0n(r0, 1), (float) X.C13690nt.A0Q(r0, 0).A0C(r15.A00).getWidth());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0ae2, code lost:
        r0 = r1.A00;
        r16 = X.C13690nt.A0Q(r0, 0);
        r1 = X.C13690nt.A0Q(r0, 1);
        r18 = r1.A0N(40);
        r19 = r1.A0N(38);
        r2 = 36;
        r20 = r1.A0N(36);
        r0 = r1.A0N(41);
        r3 = X.AnonymousClass000.A0u();
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0b10, code lost:
        if (r4.hasNext() == false) goto L_0x0b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0b12, code lost:
        r1 = (X.C31201dg) r4.next();
        r2 = r1.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0b1c, code lost:
        if (r2 == null) goto L_0x0b39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0b1e, code lost:
        r1 = r1.A0J(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0b24, code lost:
        if (r1 == null) goto L_0x0b31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0b26, code lost:
        r3.add(new X.AnonymousClass4ZZ(r2, r1));
        r2 = 36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0b31, code lost:
        r0 = X.AnonymousClass000.A0T("Received null name from props in the payload.Make tree resource references");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0b39, code lost:
        r0 = X.AnonymousClass000.A0T("Received null variable id from props in the payload.Make tree resource references");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0b41, code lost:
        r22 = java.util.Collections.emptyList();
        r0 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0b47, code lost:
        if (r0 != null) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0b49, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0b4b, code lost:
        r0 = (java.lang.String) r0.A01.get(com.obwhatsapp.R.id.bk_context_key_logging_id);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0b56, code lost:
        r1 = A03(r15, r16, r0, r18, r19, r20, r3, r22, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0b62, code lost:
        r2 = r1.A00;
        r12 = new com.facebook.redex.RunnableRunnableShape1S1300000_I1(0, X.AnonymousClass000.A0n(r2, 0), r15, ((X.C31411e8) r2.get(2)).A00, ((X.C31411e8) r2.get(1)).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0b84, code lost:
        if (X.C62003Bg.A00 != null) goto L_0x0ba9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0b86, code lost:
        r4 = X.C62003Bg.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0b88, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0b8b, code lost:
        if (X.C62003Bg.A00 != null) goto L_0x0ba3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0b8d, code lost:
        r0 = new android.os.HandlerThread("ThreadUtilsBackgroundHandler", 5);
        r0.start();
        X.C62003Bg.A00 = new android.os.Handler(r0.getLooper());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0ba3, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0ba5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        X.C62003Bg.A00.post(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0bb0, code lost:
        r1 = A01(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0bb4, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0bb6, code lost:
        r1.sendAccessibilityEvent(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0bbd, code lost:
        r0 = r1.A00;
        r4 = X.C13690nt.A0Q(r0, 0);
        r2 = X.C13690nt.A0Q(r0, 1);
        r6 = (X.AnonymousClass39I) X.C62183Bz.A05(A02(r15, r1, 2), r4);
        r7 = r2.A02.get(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0bd9, code lost:
        if (r7 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0bdd, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x0be2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0bdf, code lost:
        r7 = (java.lang.String) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0be2, code lost:
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0be6, code lost:
        if (r6 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0be8, code lost:
        r5 = r2.A0J(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0bf2, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0c44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0bf4, code lost:
        r2 = r6.A02.A04;
        r1 = r2.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0bfd, code lost:
        if (r4 >= r1) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0bff, code lost:
        r0 = ((X.C83364Gj) r2.get(r4)).A01.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0c0b, code lost:
        if (r0 == null) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0c11, code lost:
        if (r0.equals(r7) == false) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0c14, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0c17, code lost:
        if (r4 < 0) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0c19, code lost:
        r2 = r6.A03;
        r0 = r2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0c1d, code lost:
        if (r0 == null) goto L_0x0c3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0c1f, code lost:
        r1 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0c21, code lost:
        if (r1 != null) goto L_0x0c2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0c23, code lost:
        r1 = new X.C64473Ql(r0.getContext());
        r6.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0c2e, code lost:
        r1.A09(r5);
        r1.A00 = r4;
        r2.A06.getLayoutManager().A0Q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0c3e, code lost:
        r2.A00 = r4;
        r2.A07 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0c44, code lost:
        r0 = X.AnonymousClass000.A0a("scrollToIndexById cannot be called from a background thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0c4d, code lost:
        r1 = X.C611937y.A00(A02(r15, r1, 3), r15, X.C13690nt.A0Q(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0c5d, code lost:
        r0 = r1.A00;
        r1 = X.C13690nt.A0Q(r0, 0).A0L().get(X.AnonymousClass000.A0D(r0.get(1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0c75, code lost:
        r1 = (X.AnonymousClass39I) A0B(r15, r1, r1.A00, 1);
        r2 = X.C90154da.A00().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0c87, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0c9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0c89, code lost:
        r1 = java.lang.Integer.valueOf((int) (((float) r1.A03.A04) / X.C13680ns.A01(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0c9a, code lost:
        r0 = X.AnonymousClass000.A0a("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0ca2, code lost:
        r1 = A0C(r15, X.AnonymousClass000.A0n(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0cae, code lost:
        r1 = java.lang.Integer.valueOf(A01(r15, r1).getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0cbc, code lost:
        r8 = r1.A00;
        r4 = (X.AnonymousClass39I) A0B(r15, r1, r8, 3);
        r1 = (java.lang.Number) r8.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0cca, code lost:
        if (r4 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0ccc, code lost:
        r2 = (int) android.util.TypedValue.applyDimension(1, r1.floatValue(), X.AnonymousClass000.A0M(X.C90154da.A00().A00));
        r1 = X.C89554cQ.A02(r8.get(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0ceb, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0d05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0cf1, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0cfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0cf3, code lost:
        r4.A00(0, r2 - r4.A03.A04, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0cfd, code lost:
        r0 = X.AnonymousClass000.A0a("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0d05, code lost:
        r0 = X.AnonymousClass000.A0a("setYOffset cannot be called from  a background thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0d0e, code lost:
        r2 = A01(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0d12, code lost:
        if (r2 == null) goto L_0x0d27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0d14, code lost:
        r2.requestFocus();
        ((android.view.inputmethod.InputMethodManager) r2.getContext().getSystemService("input_method")).showSoftInput(r2, 0);
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0d27, code lost:
        r1 = java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0d2d, code lost:
        r0 = r1.A00;
        A0G(A05(r15, r1, 2), X.C13690nt.A0l(r0, 1), X.C47842Kv.A00(r0, 0), 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0d40, code lost:
        r4 = X.C47842Kv.A00(r1.A00, 0);
        r1 = X.C62183Bz.A03(r15.A00);
        r2 = new X.C14980q6(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0d55, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0d73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0d57, code lost:
        X.C89644cb.A01("Bloks Reflow");
        r1 = r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0d69, code lost:
        if (r1 == X.AnonymousClass382.A00(new X.C99184tc(r2, r4), r1)) goto L_0x0e2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0d6b, code lost:
        r0 = X.AnonymousClass000.A0V("Reflow traversal produced an updated component");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0d73, code lost:
        r0 = X.AnonymousClass000.A0a("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0d7b, code lost:
        r4 = r1.A00;
        r1 = (java.util.Map) r4.get(0);
        r2 = ((X.C31411e8) r4.get(1)).A00;
        r5 = ((X.C31411e8) r4.get(2)).A00;
        X.C89644cb.A01("Inflate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        r1 = X.AnonymousClass000.A0y(r1);
        X.C90154da.A00();
        r0 = new X.AnonymousClass3EY(r15, r1);
        r0.ALo();
        r0 = new X.C14940q2();
        r0.A03((X.C31201dg) X.C611837x.A00(r0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        X.C807345g.A00(new X.C14950q3(r0.A00), r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0dc2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        X.C29691b2.A01("BloksCoreInterpreterExtensions", X.C13680ns.A0h("Exception while executing ", "SuccessCallback"), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        X.C807345g.A00(X.C14950q3.A01, r5, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0dd7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:?, code lost:
        X.C29691b2.A01("BloksCoreInterpreterExtensions", X.C13680ns.A0h("Exception while executing ", "FailureCallback"), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0de4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        X.C89644cb.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0dea, code lost:
        r1 = new X.C29681b1(r15, (X.C14930q1) ((X.C31411e8) X.C14950q3.A00(r1)).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0df9, code lost:
        r4 = X.C47842Kv.A00(r1.A00, 0);
        r1 = X.C62183Bz.A03(r15.A00);
        r2 = new X.C14980q6(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0e0e, code lost:
        if (X.C62003Bg.A03() == false) goto L_0x0e31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0e10, code lost:
        X.C89644cb.A01("Bloks Reduce");
        r1 = r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0e22, code lost:
        if (r1 == X.AnonymousClass382.A00(new X.C99174tb(r2, r4), r1)) goto L_0x0e2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0e24, code lost:
        r0 = X.AnonymousClass000.A0V("Reflow traversal produced an updated component");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0e31, code lost:
        r0 = X.AnonymousClass000.A0a("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0e39, code lost:
        r0 = r1.A00;
        r11 = X.AnonymousClass000.A0n(r0, 0);
        r2 = ((X.C31411e8) r0.get(1)).A00;
        r0 = (java.util.Map) r15.A00.A02(com.obwhatsapp.R.id.bk_context_key_data_modules);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0e52, code lost:
        if (r0 != null) goto L_0x0e55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0e55, code lost:
        r1 = (X.C17360ux) r0.get("gs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0e5c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0e5d, code lost:
        if (r1 == null) goto L_0x0e94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0e61, code lost:
        if ((r1 instanceof X.C99284tm) == false) goto L_0x0e94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0e63, code lost:
        r1 = (X.C99284tm) r1;
        r7 = r1.A00;
        r5 = new X.C84284Jy(r1, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0e6c, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:?, code lost:
        r4 = r7.A01.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        r2 = r5.A01;
        r0 = new X.C14940q2();
        r0.A02(r4, 0);
        r4 = X.C807345g.A00(new X.C14950q3(r0.A00), r2, r5.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        r7.A01(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0e94, code lost:
        X.C29691b2.A00("BloksDataModule", "Global State Module not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0e99, code lost:
        r0 = r1.A00;
        r1 = X.C13690nt.A0Q(r0, 0);
        r6 = X.AnonymousClass000.A0n(r0, 1);
        r4 = (X.AnonymousClass38S) X.C62183Bz.A05((X.C14990q7) r0.get(2), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0eaf, code lost:
        if (r4 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0eb1, code lost:
        r0 = r4.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0eb3, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0eb5, code lost:
        r2 = r0.getSelectionStart();
        r1 = r4.A0K.getSelectionEnd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0ebf, code lost:
        if (r2 == r1) goto L_0x0ed9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0ec1, code lost:
        r4.A0E.replace(r2, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0ec6, code lost:
        r4.A0K.setText(r4.A0E);
        r4.A0K.setSelection(r2 + r6.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0ed9, code lost:
        r4.A0E.insert(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0edf, code lost:
        r0 = r1.A00;
        r10 = X.C13690nt.A0Q(r0, 0);
        r2 = X.C13690nt.A0Q(r0, 1);
        r9 = X.AnonymousClass000.A0D(r0.get(2));
        r8 = X.C62183Bz.A03(r15.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0efb, code lost:
        if (r2.A01 != 13346) goto L_0x0f27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0efd, code lost:
        r7 = r2.A0M(32).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0f0b, code lost:
        if (r7.hasNext() == false) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0f0d, code lost:
        r8.A05(new X.C99304to((long) r10.A00), new X.C69913fo((X.C31201dg) r7.next(), r9));
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0f27, code lost:
        r8.A05(new X.C99304to((long) r10.A00), new X.C69913fo(r2, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0f39, code lost:
        r2 = java.lang.String.valueOf(X.AnonymousClass494.A00.incrementAndGet());
        r9 = new java.util.LinkedList(r15.A03);
        r9.add(r2);
        r4 = r15.A00;
        r10 = r15.A04;
        r1 = X.C14980q6.A00(new X.C14960q4(r15.A00, r4, r15.A01, r15.A01, X.C62183Bz.A04(r4), r15.A02, r9, r10, r15.A05), X.C14950q3.A01, ((X.C31411e8) X.C14950q3.A00(r1)).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0f74, code lost:
        r0 = r1.A00;
        r6 = X.C13690nt.A0l(r0, 1);
        r5 = X.C47842Kv.A00(r0, 2);
        A05(r15, r1, 3).A05(A07(r5), new X.C69943fr(r6, 1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0f90, code lost:
        r0 = r1.A00;
        r1 = A0A(X.AnonymousClass000.A0n(r0, 1), (float) X.C13690nt.A0Q(r0, 0).A0C(r15.A00).getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0fab, code lost:
        r2 = X.C13690nt.A0Q(r1.A00, 0);
        r1 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0fb7, code lost:
        if (r2.A0C(r1) == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0fb9, code lost:
        r2.A0C(r1).clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0fc2, code lost:
        r2 = X.AnonymousClass000.A0D(X.C14950q3.A00(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0fce, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0fe7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0fd0, code lost:
        r1 = (android.view.accessibility.AccessibilityManager) r15.A00.A00.getSystemService("accessibility");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0fda, code lost:
        if (r1 == null) goto L_0x0fe7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0fdc, code lost:
        r1 = java.lang.Integer.valueOf(r1.getRecommendedTimeoutMillis(r2, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0fe7, code lost:
        r1 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0fed, code lost:
        r4 = X.C47842Kv.A00(r1.A00, 0);
        r3 = A05(r15, r1, 1);
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ff9, code lost:
        if (r0 == null) goto L_0x100a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ffb, code lost:
        r1 = X.AnonymousClass45Y.A00(r0.A01, new X.C99314tp(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x1006, code lost:
        if (r1 == null) goto L_0x100a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x1008, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x100a, code lost:
        r1 = X.AnonymousClass45Y.A00(r3.A02(), new X.C99314tp(r4));
        r2 = new java.lang.Object[2];
        r2[0] = r4;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x101d, code lost:
        if (r0 != null) goto L_0x1021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x101f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x1021, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x1023, code lost:
        r2[1] = r0;
        X.C29691b2.A00("BloksCoreInterpreterExtensions", java.lang.String.format("Found node %s in unbound tree but not in bound tree %s", r2));
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x1032, code lost:
        r1 = X.C87884Za.A00(X.AnonymousClass000.A0n(r1.A00, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x103e, code lost:
        r1 = (X.AnonymousClass38S) A0B(r15, r1, r1.A00, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x1046, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x1048, code lost:
        r1.A0E.clear();
        r0 = r1.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x104f, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x1051, code lost:
        r0.getText().clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x105a, code lost:
        r1 = (X.C85424Oj) X.C14950q3.A00(r1);
        r6 = r1.A02;
        r5 = r1.A04;
        r4 = X.AnonymousClass2Wa.A03(r1.A05);
        r2 = r1.A06;
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x106e, code lost:
        if (r0 == null) goto L_0x1072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x1070, code lost:
        r3 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x1072, code lost:
        r1 = new X.C29661az(new X.C88184a5(r5, r2, (java.util.List) null, r4), r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x107f, code lost:
        r0 = r1.A00;
        r2 = X.C13690nt.A0Q(r0, 0);
        r3 = X.C47842Kv.A00(r0, 1);
        r1 = A02(r15, r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x108d, code lost:
        if (r2 == null) goto L_0x10c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x1093, code lost:
        if (r2.A0I() == null) goto L_0x10c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x1095, code lost:
        r1 = X.C62183Bz.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x109d, code lost:
        if (r2.A0I() == null) goto L_0x10c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x109f, code lost:
        r0 = X.AnonymousClass45Y.A00(r1.A02(), new X.C99314tp(r2.A0I()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x10b0, code lost:
        if (r0 == null) goto L_0x10c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x10b2, code lost:
        r0 = X.C89524cN.A00(new X.C99314tp(r3), r0.A0L());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x10bf, code lost:
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x10c5, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x10c7, code lost:
        X.C29691b2.A00("index_of_child_without_id", "bk.action.bloks.IndexOfChild called on a container without an ID");
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x10d5, code lost:
        r0 = r1.A00;
        r2 = X.C13690nt.A0Q(r0, 0);
        r4 = (java.lang.CharSequence) r0.get(1);
        r5 = (X.AnonymousClass38S) X.C62183Bz.A05(A02(r15, r1, 2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x10eb, code lost:
        if (r5 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x10ed, code lost:
        r5.A0E = X.C13690nt.A0F(r5.A0E);
        r0 = r5.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x10f7, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x10f9, code lost:
        r2 = r0.getText().length() - r5.A0K.getSelectionEnd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x110d, code lost:
        r1 = X.AnonymousClass000.A1P(r5.A0K.getSelectionEnd());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:?, code lost:
        r5.A0K.setText(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x1117, code lost:
        if (r1 != false) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x1119, code lost:
        r0 = r4.length();
        r1 = r4.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x1121, code lost:
        if (r0 < r2) goto L_0x1124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x1123, code lost:
        r1 = r1 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x1124, code lost:
        r5.A0K.setSelection(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x112b, code lost:
        r1 = A04(r15, (X.C85424Oj) X.C14950q3.A00(r1), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x1137, code lost:
        r3 = r15.A03;
        r0 = r1.A00;
        r2 = X.AnonymousClass000.A0n(r0, 0);
        r1 = X.AnonymousClass000.A0D(r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x1147, code lost:
        if (r1 != 0) goto L_0x114f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x1149, code lost:
        r1 = A0D(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x114f, code lost:
        if (r3 == null) goto L_0x1169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x1155, code lost:
        if (r1 > r3.size()) goto L_0x1163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x1157, code lost:
        r1 = A0D(r15, A0E(X.C795440g.A00, r2, r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x1163, code lost:
        r0 = X.AnonymousClass000.A0T("Depth supplied should never exceed the size of the key path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x1169, code lost:
        r0 = X.AnonymousClass000.A0T("Keypath must be set on environment if trying to GetTemplateArg on a depth larger than 0.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x1171, code lost:
        r5 = (android.view.accessibility.AccessibilityManager) r15.A00.A00.getSystemService("accessibility");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x117b, code lost:
        if (r5 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x1181, code lost:
        if (r5.isEnabled() == false) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x1183, code lost:
        r4 = android.view.accessibility.AccessibilityEvent.obtain();
        r4.setEventType(16384);
        r4.getText().add(X.C14950q3.A00(r1));
        r5.sendAccessibilityEvent(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x119c, code lost:
        r8 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x119e, code lost:
        if (r8 == null) goto L_0x11e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x11a0, code lost:
        r0 = r1.A00;
        r6 = X.AnonymousClass000.A0n(r0, 0);
        r4 = r0.get(1);
        r2 = X.AnonymousClass000.A0D(r0.get(2));
        r1 = r15.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x11b4, code lost:
        if (r2 != 0) goto L_0x11bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x11b6, code lost:
        X.C62183Bz.A03(r8).A08(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x11bf, code lost:
        if (r1 == null) goto L_0x11dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x11c5, code lost:
        if (r2 > r1.size()) goto L_0x11d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x11c7, code lost:
        X.C62183Bz.A03(r8).A08(A0E(X.C795440g.A01, r6, r1, r2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x11d6, code lost:
        r0 = X.AnonymousClass000.A0T("Depth supplied should never exceed the size of the key path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x11dc, code lost:
        r0 = X.AnonymousClass000.A0T("Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x11e4, code lost:
        r0 = X.AnonymousClass000.A0V("Called WriteLocalState when not attached to a tree");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x11ec, code lost:
        r2 = r15.A03;
        r0 = r1.A00;
        r1 = (X.C14990q7) r0.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x11f6, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x11f8, code lost:
        r4 = X.AnonymousClass000.A0n(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x11fc, code lost:
        if (r2 == null) goto L_0x1214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x1202, code lost:
        if (r2.isEmpty() != false) goto L_0x1214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x1204, code lost:
        r3 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(X.AnonymousClass000.A0n(r2, X.C13700nu.A00(r2, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x1214, code lost:
        r2 = X.C62183Bz.A03(r1);
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x121a, code lost:
        if (r0 == null) goto L_0x1226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x121c, code lost:
        r1 = A08(r0.A01, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x1222, code lost:
        if (r1 == null) goto L_0x1226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x1224, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x1226, code lost:
        r1 = A08(r2.A02(), r3, r4);
        X.C29691b2.A00("BloksCoreInterpreterExtensions", java.lang.String.format("Found unexpanded node %s in unbound tree when looking for key path %s.", new java.lang.Object[]{r4, java.lang.String.valueOf(r3)}));
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x1244, code lost:
        r1 = A02(r15, r1, 0);
        r2 = X.C62183Bz.A03(r1).A05.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x1254, code lost:
        if (r2 == null) goto L_0x126b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x1256, code lost:
        ((android.view.inputmethod.InputMethodManager) r2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(r2.getWindowToken(), 0);
        r2.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x126b, code lost:
        r2 = r1.A00;
        r1 = A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x1271, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x1273, code lost:
        r0 = r1.findViewById(16908290);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x127a, code lost:
        if (r0 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x127c, code lost:
        r1 = (android.view.inputmethod.InputMethodManager) r2.getSystemService("input_method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x1282, code lost:
        if (r1 == null) goto L_0x128b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x1284, code lost:
        r1.hideSoftInputFromWindow(r0.getWindowToken(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x128d, code lost:
        r3 = r15.A03;
        r0 = r1.A00;
        r2 = X.AnonymousClass000.A0n(r0, 0);
        r1 = X.AnonymousClass000.A0D(r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x129d, code lost:
        if (r1 == 0) goto L_0x12bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x129f, code lost:
        if (r3 == null) goto L_0x12a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x12a2, code lost:
        r0 = X.AnonymousClass000.A0T("Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x12ad, code lost:
        if (r1 > r3.size()) goto L_0x12c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x12af, code lost:
        r1 = A0C(r15, A0E(X.C795440g.A01, r2, r3, r1));
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x12b9, code lost:
        if (r1 != null) goto L_0x12c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x12bb, code lost:
        r1 = A0C(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x12c0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:?, code lost:
        r0 = X.AnonymousClass000.A0T("Depth supplied should never exceed the size of the key path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x12c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x030b, code lost:
        if (r1 == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x030d, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x030e, code lost:
        r3 = 0;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x031b, code lost:
        switch(r0) {
            case 0: goto L_0x112b;
            case 1: goto L_0x10d5;
            case 2: goto L_0x107f;
            case 3: goto L_0x105a;
            case 4: goto L_0x103e;
            case 5: goto L_0x1032;
            case 6: goto L_0x128d;
            case 7: goto L_0x0fed;
            case 8: goto L_0x0fed;
            case 9: goto L_0x0fc2;
            case 10: goto L_0x0fab;
            case 11: goto L_0x0f90;
            case 12: goto L_0x0f74;
            case 13: goto L_0x1244;
            case 14: goto L_0x0f39;
            case 15: goto L_0x0edf;
            case 16: goto L_0x0964;
            case 17: goto L_0x0e99;
            case 18: goto L_0x0e39;
            case 19: goto L_0x0df9;
            case 20: goto L_0x0d40;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_singleLine :int: goto L_0x0dea;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_ellipsize :int: goto L_0x0d7b;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_maxLines :int: goto L_0x0d2d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_size :int: goto L_0x0d0e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_style :int: goto L_0x0cbc;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_customFont :int: goto L_0x0cae;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowColor :int: goto L_0x11ec;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowRadius :int: goto L_0x0ca2;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowXOffset :int: goto L_0x0c75;
            case 30: goto L_0x0c5d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorNormal :int: goto L_0x0c4d;
            case 32: goto L_0x0bbd;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorRipple :int: goto L_0x0bb0;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_openDirection :int: goto L_0x0b62;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_backgroundColor :int: goto L_0x0ae2;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_label :int: goto L_0x0fed;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_show_animation :int: goto L_0x0ac7;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_hide_animation :int: goto L_0x0ab1;
            case 39: goto L_0x0a9e;
            case 40: goto L_0x0a82;
            case 41: goto L_0x0a70;
            case 42: goto L_0x0a0e;
            case 43: goto L_0x09b7;
            case 44: goto L_0x097c;
            case 45: goto L_0x093d;
            case com.obwhatsapp.calling.crypto.DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH :int: goto L_0x08eb;
            case 47: goto L_0x08ce;
            case 48: goto L_0x089f;
            case 49: goto L_0x087f;
            case com.google.android.search.verification.client.SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS :int: goto L_0x085b;
            case 51: goto L_0x0849;
            case 52: goto L_0x0835;
            case 53: goto L_0x080e;
            case 54: goto L_0x07e1;
            case 55: goto L_0x07bd;
            case 56: goto L_0x07ac;
            case 57: goto L_0x10d5;
            case 58: goto L_0x119c;
            case 59: goto L_0x0749;
            case 60: goto L_0x0732;
            case 61: goto L_0x071a;
            case 62: goto L_0x06f6;
            case 63: goto L_0x06ea;
            case android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS :int: goto L_0x06d3;
            case 65: goto L_0x1171;
            case 66: goto L_0x06c1;
            case 67: goto L_0x06a0;
            case 68: goto L_0x068d;
            case 69: goto L_0x067f;
            case 70: goto L_0x065f;
            case 71: goto L_0x0648;
            case X.2EA.A02 :int: goto L_0x05dd;
            case 73: goto L_0x0648;
            case 74: goto L_0x05ca;
            case 75: goto L_0x05ad;
            case 76: goto L_0x1137;
            case com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.NOINTERNET_CALLING :int: goto L_0x0596;
            default: goto L_0x031e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x031e, code lost:
        switch(r14) {
            case -1356421512: goto L_0x0325;
            case -1298116857: goto L_0x0328;
            case -1137953049: goto L_0x032b;
            case -965026292: goto L_0x032e;
            case -925654548: goto L_0x0331;
            case -903105410: goto L_0x0334;
            case -762607233: goto L_0x0337;
            case -573790654: goto L_0x033a;
            case 31908788: goto L_0x033d;
            case 141784070: goto L_0x0340;
            case 284330655: goto L_0x0343;
            case 480128519: goto L_0x0346;
            case 875025162: goto L_0x0349;
            case 896165716: goto L_0x034c;
            case 944376541: goto L_0x034f;
            case 1067520376: goto L_0x0352;
            case 1096446054: goto L_0x0355;
            case 1156533274: goto L_0x0358;
            case 1242956331: goto L_0x035b;
            case 1335151616: goto L_0x035e;
            case 1335478715: goto L_0x0361;
            case 1771618954: goto L_0x0364;
            case 1856118462: goto L_0x0367;
            default: goto L_0x0321;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0321, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0322, code lost:
        if (r6 == false) goto L_0x058c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0325, code lost:
        r0 = "bk.action.caa.foa.reg.GetAgeFromBirthdayTimestamp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0328, code lost:
        r0 = "bk.action.string.SplitWithString";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x032b, code lost:
        r0 = "bk.action.media.LoadAlbums";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x032e, code lost:
        r0 = "bk.action.string.Trim";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0331, code lost:
        r0 = "bk.action.ttrc.NetworkContentDisplayed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0334, code lost:
        r0 = "bk.action.ttrc.MarkerStart";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0337, code lost:
        r0 = "bk.action.caa.FoaFetchOpenIdTokens";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x033a, code lost:
        r0 = "bk.action.animated.easing.CreateCubicBezier";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x033d, code lost:
        r0 = "bk.action.ttrc.CachedContentDisplayed";
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:454:0x0e8a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r25, X.C99354tt r26, X.C14970q5 r27) {
        /*
            r24 = this;
            r15 = r27
            X.0q4 r15 = (X.C14960q4) r15
            r12 = r26
            java.lang.String r2 = r12.A00     // Catch:{ all -> 0x12ca }
            X.C89644cb.A01(r2)     // Catch:{ all -> 0x12ca }
            int r14 = r2.hashCode()     // Catch:{ all -> 0x12ca }
            r4 = 3
            r5 = 2
            r7 = 1
            r6 = 0
            switch(r14) {
                case -2080830203: goto L_0x0304;
                case -2033151317: goto L_0x02fc;
                case -2022606713: goto L_0x02f4;
                case -2016910886: goto L_0x02ec;
                case -2010677929: goto L_0x02e4;
                case -1915088416: goto L_0x02dc;
                case -1841247856: goto L_0x02d4;
                case -1802986003: goto L_0x02cc;
                case -1781978860: goto L_0x02c3;
                case -1742190338: goto L_0x02ba;
                case -1695660097: goto L_0x02b1;
                case -1676484103: goto L_0x02a8;
                case -1659672016: goto L_0x029f;
                case -1646637091: goto L_0x0296;
                case -1623031430: goto L_0x028d;
                case -1620560081: goto L_0x0284;
                case -1611102039: goto L_0x027a;
                case -1588639886: goto L_0x0270;
                case -1518247991: goto L_0x0266;
                case -1458151270: goto L_0x025c;
                case -1458099947: goto L_0x0252;
                case -1392615196: goto L_0x0248;
                case -1391375021: goto L_0x023e;
                case -1384591763: goto L_0x0234;
                case -1370121672: goto L_0x022a;
                case -1228789912: goto L_0x0220;
                case -1162458791: goto L_0x0216;
                case -1127489635: goto L_0x020c;
                case -1113972044: goto L_0x0202;
                case -1014172836: goto L_0x01f8;
                case -985271337: goto L_0x01ee;
                case -980451716: goto L_0x01e4;
                case -954842977: goto L_0x01da;
                case -919818711: goto L_0x01d0;
                case -766932141: goto L_0x01c6;
                case -736419327: goto L_0x01bc;
                case -730857839: goto L_0x01b2;
                case -729463970: goto L_0x01a8;
                case -640941045: goto L_0x019e;
                case -587000068: goto L_0x0194;
                case -545332995: goto L_0x018a;
                case -422759907: goto L_0x0180;
                case -232028360: goto L_0x0176;
                case -169377409: goto L_0x016c;
                case -71914581: goto L_0x0162;
                case -27526514: goto L_0x0158;
                case 107264602: goto L_0x014e;
                case 117073323: goto L_0x0144;
                case 144735095: goto L_0x013a;
                case 201706399: goto L_0x0130;
                case 211494449: goto L_0x0126;
                case 250746789: goto L_0x011c;
                case 258140093: goto L_0x0112;
                case 290488333: goto L_0x0108;
                case 321881678: goto L_0x00fe;
                case 327957399: goto L_0x00f4;
                case 330028918: goto L_0x00ea;
                case 351706759: goto L_0x00e0;
                case 358283377: goto L_0x00d6;
                case 445300143: goto L_0x00cc;
                case 610867619: goto L_0x00c2;
                case 617100356: goto L_0x00b8;
                case 697497290: goto L_0x00ae;
                case 782295044: goto L_0x00a4;
                case 827053335: goto L_0x009a;
                case 907240538: goto L_0x0090;
                case 922966311: goto L_0x0086;
                case 1073247701: goto L_0x007c;
                case 1287216889: goto L_0x0072;
                case 1500489556: goto L_0x0068;
                case 1522534035: goto L_0x005e;
                case 1588846766: goto L_0x0054;
                case 1607063823: goto L_0x004a;
                case 1668690578: goto L_0x0040;
                case 1787916319: goto L_0x0036;
                case 1834855622: goto L_0x002c;
                case 1841033634: goto L_0x0022;
                case 2009638089: goto L_0x0018;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x12ca }
        L_0x0016:
            goto L_0x030d
        L_0x0018:
            java.lang.String r0 = "bk.action.bloks.ReplaceEmbeddedChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 77
            goto L_0x030b
        L_0x0022:
            java.lang.String r0 = "bk.action.core.GetTemplateArg"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 76
            goto L_0x030b
        L_0x002c:
            java.lang.String r0 = "bk.action.bloks.InsertEmbeddedChildrenAfter"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 75
            goto L_0x030b
        L_0x0036:
            java.lang.String r0 = "bk.action.bloks.ReplaceChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 74
            goto L_0x030b
        L_0x0040:
            java.lang.String r0 = "bk.action.bloks.ReplaceEmbeddedChild"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 73
            goto L_0x030b
        L_0x004a:
            java.lang.String r0 = "bk.action.bloks.GetState"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 72
            goto L_0x030b
        L_0x0054:
            java.lang.String r0 = "bk.action.bloks.ReplaceEmbeddedChildV2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 71
            goto L_0x030b
        L_0x005e:
            java.lang.String r0 = "bk.action.bloks.ReplaceEmbeddedChildrenAfter"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 70
            goto L_0x030b
        L_0x0068:
            java.lang.String r0 = "bk.action.component.GetWidth"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 69
            goto L_0x030b
        L_0x0072:
            java.lang.String r0 = "bk.action.bloks.PrependChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 68
            goto L_0x030b
        L_0x007c:
            java.lang.String r0 = "bk.action.bloks.InsertEmbeddedChildrenBefore"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 67
            goto L_0x030b
        L_0x0086:
            java.lang.String r0 = "bk.action.bloks.GetParameter"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 66
            goto L_0x030b
        L_0x0090:
            java.lang.String r0 = "bk.action.accessibility.Announcement"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 65
            goto L_0x030b
        L_0x009a:
            java.lang.String r0 = "bk.action.bloks.AppendEmbeddedChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 64
            goto L_0x030b
        L_0x00a4:
            java.lang.String r0 = "bk.action.bloks.CreateParseResultFromPayload"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 63
            goto L_0x030b
        L_0x00ae:
            java.lang.String r0 = "bk.action.text_input.AppendText"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 62
            goto L_0x030b
        L_0x00b8:
            java.lang.String r0 = "bk.action.bloks.RemoveChild"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 61
            goto L_0x030b
        L_0x00c2:
            java.lang.String r0 = "bk.action.bloks.PrependEmbeddedChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 60
            goto L_0x030b
        L_0x00cc:
            java.lang.String r0 = "bk.action.component.SetAttr"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 59
            goto L_0x030b
        L_0x00d6:
            java.lang.String r0 = "bk.action.bloks.WriteLocalState"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 58
            goto L_0x030b
        L_0x00e0:
            java.lang.String r0 = "bk.action.textinput.SetTextV2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 57
            goto L_0x030b
        L_0x00ea:
            java.lang.String r0 = "bk.action.callback.MakeWithScopeOnly"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 56
            goto L_0x030b
        L_0x00f4:
            java.lang.String r0 = "bk.action.bloks.RemoveChildAt"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 55
            goto L_0x030b
        L_0x00fe:
            java.lang.String r0 = "bk.action.hcollection.GetOffset"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 54
            goto L_0x030b
        L_0x0108:
            java.lang.String r0 = "bk.action.collection.SetIndex"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 53
            goto L_0x030b
        L_0x0112:
            java.lang.String r0 = "bk.action.bloks.RequestFocus"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 52
            goto L_0x030b
        L_0x011c:
            java.lang.String r0 = "bk.action.string.FromProvider"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 51
            goto L_0x030b
        L_0x0126:
            java.lang.String r0 = "bk.action.bloks.RemoveChildrenBetween"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 50
            goto L_0x030b
        L_0x0130:
            java.lang.String r0 = "bk.action.textinput.GetText"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 49
            goto L_0x030b
        L_0x013a:
            java.lang.String r0 = "bk.action.bloks.WriteGlobalConsistencyStore"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 48
            goto L_0x030b
        L_0x0144:
            java.lang.String r0 = "bk.action.bloks.InsertChildrenBefore"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 47
            goto L_0x030b
        L_0x014e:
            java.lang.String r0 = "bk.action.hcollection.SetOffset"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 46
            goto L_0x030b
        L_0x0158:
            java.lang.String r0 = "bk.action.bloks.InflateSync"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 45
            goto L_0x030b
        L_0x0162:
            java.lang.String r0 = "bk.action.tree.Make"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 44
            goto L_0x030b
        L_0x016c:
            java.lang.String r0 = "bk.action.collection.SetIndexById"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 43
            goto L_0x030b
        L_0x0176:
            java.lang.String r0 = "bk.action.callback.Apply"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 42
            goto L_0x030b
        L_0x0180:
            java.lang.String r0 = "bk.action.bloks.GetDeserializedEmbeddedPayload"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 41
            goto L_0x030b
        L_0x018a:
            java.lang.String r0 = "bk.action.bloks.ReplaceChildrenAfter"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 40
            goto L_0x030b
        L_0x0194:
            java.lang.String r0 = "bk.action.bloks.ReplaceChild"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 39
            goto L_0x030b
        L_0x019e:
            java.lang.String r0 = "bk.action.bloks.ParseHoistedPayload"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 38
            goto L_0x030b
        L_0x01a8:
            java.lang.String r0 = "bk.action.component.GetWidth2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 37
            goto L_0x030b
        L_0x01b2:
            java.lang.String r0 = "bk.action.bloks.FindWidget"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 36
            goto L_0x030b
        L_0x01bc:
            java.lang.String r0 = "bk.action.payload.Make"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 35
            goto L_0x030b
        L_0x01c6:
            java.lang.String r0 = "bk.action.bloks.ParseEmbeddedAsync"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 34
            goto L_0x030b
        L_0x01d0:
            java.lang.String r0 = "bk.action.accessibility.SetFocus"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 33
            goto L_0x030b
        L_0x01da:
            java.lang.String r0 = "bk.action.collection.ScrollToIndexById"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 32
            goto L_0x030b
        L_0x01e4:
            java.lang.String r0 = "bk.action.bloks.OneTimeBind"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 31
            goto L_0x030b
        L_0x01ee:
            java.lang.String r0 = "bk.action.bloks.ChildAtIndex"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 30
            goto L_0x030b
        L_0x01f8:
            java.lang.String r0 = "bk.action.vcollection.GetOffset"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 29
            goto L_0x030b
        L_0x0202:
            java.lang.String r0 = "bk.action.bloks.GetVariable2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 28
            goto L_0x030b
        L_0x020c:
            java.lang.String r0 = "bk.action.bloks.ScopedFind"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 27
            goto L_0x030b
        L_0x0216:
            java.lang.String r0 = "bk.action.component.GetHeight"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 26
            goto L_0x030b
        L_0x0220:
            java.lang.String r0 = "bk.action.vcollection.SetOffset"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 25
            goto L_0x030b
        L_0x022a:
            java.lang.String r0 = "bk.action.bloks.ShowKeyboard"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 24
            goto L_0x030b
        L_0x0234:
            java.lang.String r0 = "bk.action.bloks.AppendChildren"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 23
            goto L_0x030b
        L_0x023e:
            java.lang.String r0 = "bk.action.bloks.Inflate"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 22
            goto L_0x030b
        L_0x0248:
            java.lang.String r0 = "bk.action.callback.Make"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 21
            goto L_0x030b
        L_0x0252:
            java.lang.String r0 = "bk.action.bloks.Reflow"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 20
            goto L_0x030b
        L_0x025c:
            java.lang.String r0 = "bk.action.bloks.Reduce"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 19
            goto L_0x030b
        L_0x0266:
            java.lang.String r0 = "bk.action.bloks.UpdateGlobalConsistencyStore"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 18
            goto L_0x030b
        L_0x0270:
            java.lang.String r0 = "bk.action.text_input.InsertTextAtCursor"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 17
            goto L_0x030b
        L_0x027a:
            java.lang.String r0 = "bk.action.bloks.ParseEmbedded"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 16
            goto L_0x030b
        L_0x0284:
            java.lang.String r0 = "bk.action.bloks.AddChild"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 15
            goto L_0x030b
        L_0x028d:
            java.lang.String r0 = "bk.action.bloks.WithScope"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 14
            goto L_0x030b
        L_0x0296:
            java.lang.String r0 = "bk.action.bloks.DismissKeyboard"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 13
            goto L_0x030b
        L_0x029f:
            java.lang.String r0 = "bk.action.bloks.InsertChildrenAfter"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 12
            goto L_0x030b
        L_0x02a8:
            java.lang.String r0 = "bk.action.component.GetHeight2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 11
            goto L_0x030b
        L_0x02b1:
            java.lang.String r0 = "bk.action.bloks.ClearFocus"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 10
            goto L_0x030b
        L_0x02ba:
            java.lang.String r0 = "bk.action.accessibility.GetTimeout"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 9
            goto L_0x030b
        L_0x02c3:
            java.lang.String r0 = "bk.action.bloks.FindContainer"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 8
            goto L_0x030b
        L_0x02cc:
            java.lang.String r0 = "bk.action.bloks.Find"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 7
            goto L_0x030b
        L_0x02d4:
            java.lang.String r0 = "bk.action.bloks.GetVariableWithScope"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 6
            goto L_0x030b
        L_0x02dc:
            java.lang.String r0 = "bk.action.bloks.ParseBloksPayload"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 5
            goto L_0x030b
        L_0x02e4:
            java.lang.String r0 = "bk.action.text_input.ClearText"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 4
            goto L_0x030b
        L_0x02ec:
            java.lang.String r0 = "bk.action.bloks.CreateActionParseResultFromPayload"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 3
            goto L_0x030b
        L_0x02f4:
            java.lang.String r0 = "bk.action.bloks.IndexOfChild"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 2
            goto L_0x030b
        L_0x02fc:
            java.lang.String r0 = "bk.action.textinput.SetText"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 1
            goto L_0x030b
        L_0x0304:
            java.lang.String r0 = "bk.action.bloks.ParseEmbeddedV2"
            boolean r1 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r0 = 0
        L_0x030b:
            if (r1 != 0) goto L_0x030e
        L_0x030d:
            r0 = -1
        L_0x030e:
            java.lang.String r9 = "Global State Module not found"
            java.lang.String r8 = "BloksDataModule"
            java.lang.String r11 = "accessibility"
            java.lang.String r10 = "gs"
            java.lang.String r13 = "Depth supplied should never exceed the size of the key path."
            r3 = 0
            r1 = r25
            switch(r0) {
                case 0: goto L_0x112b;
                case 1: goto L_0x10d5;
                case 2: goto L_0x107f;
                case 3: goto L_0x105a;
                case 4: goto L_0x103e;
                case 5: goto L_0x1032;
                case 6: goto L_0x128d;
                case 7: goto L_0x0fed;
                case 8: goto L_0x0fed;
                case 9: goto L_0x0fc2;
                case 10: goto L_0x0fab;
                case 11: goto L_0x0f90;
                case 12: goto L_0x0f74;
                case 13: goto L_0x1244;
                case 14: goto L_0x0f39;
                case 15: goto L_0x0edf;
                case 16: goto L_0x0964;
                case 17: goto L_0x0e99;
                case 18: goto L_0x0e39;
                case 19: goto L_0x0df9;
                case 20: goto L_0x0d40;
                case 21: goto L_0x0dea;
                case 22: goto L_0x0d7b;
                case 23: goto L_0x0d2d;
                case 24: goto L_0x0d0e;
                case 25: goto L_0x0cbc;
                case 26: goto L_0x0cae;
                case 27: goto L_0x11ec;
                case 28: goto L_0x0ca2;
                case 29: goto L_0x0c75;
                case 30: goto L_0x0c5d;
                case 31: goto L_0x0c4d;
                case 32: goto L_0x0bbd;
                case 33: goto L_0x0bb0;
                case 34: goto L_0x0b62;
                case 35: goto L_0x0ae2;
                case 36: goto L_0x0fed;
                case 37: goto L_0x0ac7;
                case 38: goto L_0x0ab1;
                case 39: goto L_0x0a9e;
                case 40: goto L_0x0a82;
                case 41: goto L_0x0a70;
                case 42: goto L_0x0a0e;
                case 43: goto L_0x09b7;
                case 44: goto L_0x097c;
                case 45: goto L_0x093d;
                case 46: goto L_0x08eb;
                case 47: goto L_0x08ce;
                case 48: goto L_0x089f;
                case 49: goto L_0x087f;
                case 50: goto L_0x085b;
                case 51: goto L_0x0849;
                case 52: goto L_0x0835;
                case 53: goto L_0x080e;
                case 54: goto L_0x07e1;
                case 55: goto L_0x07bd;
                case 56: goto L_0x07ac;
                case 57: goto L_0x10d5;
                case 58: goto L_0x119c;
                case 59: goto L_0x0749;
                case 60: goto L_0x0732;
                case 61: goto L_0x071a;
                case 62: goto L_0x06f6;
                case 63: goto L_0x06ea;
                case 64: goto L_0x06d3;
                case 65: goto L_0x1171;
                case 66: goto L_0x06c1;
                case 67: goto L_0x06a0;
                case 68: goto L_0x068d;
                case 69: goto L_0x067f;
                case 70: goto L_0x065f;
                case 71: goto L_0x0648;
                case 72: goto L_0x05dd;
                case 73: goto L_0x0648;
                case 74: goto L_0x05ca;
                case 75: goto L_0x05ad;
                case 76: goto L_0x1137;
                case 77: goto L_0x0596;
                default: goto L_0x031e;
            }     // Catch:{ all -> 0x12ca }
        L_0x031e:
            switch(r14) {
                case -1356421512: goto L_0x0325;
                case -1298116857: goto L_0x0328;
                case -1137953049: goto L_0x032b;
                case -965026292: goto L_0x032e;
                case -925654548: goto L_0x0331;
                case -903105410: goto L_0x0334;
                case -762607233: goto L_0x0337;
                case -573790654: goto L_0x033a;
                case 31908788: goto L_0x033d;
                case 141784070: goto L_0x0340;
                case 284330655: goto L_0x0343;
                case 480128519: goto L_0x0346;
                case 875025162: goto L_0x0349;
                case 896165716: goto L_0x034c;
                case 944376541: goto L_0x034f;
                case 1067520376: goto L_0x0352;
                case 1096446054: goto L_0x0355;
                case 1156533274: goto L_0x0358;
                case 1242956331: goto L_0x035b;
                case 1335151616: goto L_0x035e;
                case 1335478715: goto L_0x0361;
                case 1771618954: goto L_0x0364;
                case 1856118462: goto L_0x0367;
                default: goto L_0x0321;
            }     // Catch:{ all -> 0x12ca }
        L_0x0321:
            r6 = 0
        L_0x0322:
            if (r6 == 0) goto L_0x058c
            goto L_0x0371
        L_0x0325:
            java.lang.String r0 = "bk.action.caa.foa.reg.GetAgeFromBirthdayTimestamp"
            goto L_0x0369
        L_0x0328:
            java.lang.String r0 = "bk.action.string.SplitWithString"
            goto L_0x0369
        L_0x032b:
            java.lang.String r0 = "bk.action.media.LoadAlbums"
            goto L_0x0369
        L_0x032e:
            java.lang.String r0 = "bk.action.string.Trim"
            goto L_0x0369
        L_0x0331:
            java.lang.String r0 = "bk.action.ttrc.NetworkContentDisplayed"
            goto L_0x0369
        L_0x0334:
            java.lang.String r0 = "bk.action.ttrc.MarkerStart"
            goto L_0x0369
        L_0x0337:
            java.lang.String r0 = "bk.action.caa.FoaFetchOpenIdTokens"
            goto L_0x0369
        L_0x033a:
            java.lang.String r0 = "bk.action.animated.easing.CreateCubicBezier"
            goto L_0x0369
        L_0x033d:
            java.lang.String r0 = "bk.action.ttrc.CachedContentDisplayed"
            goto L_0x0369
        L_0x0340:
            java.lang.String r0 = "bk.action.trace.EndSection"
            goto L_0x0369
        L_0x0343:
            java.lang.String r0 = "bk.action.errorreporting.ReportError"
            goto L_0x0369
        L_0x0346:
            java.lang.String r0 = "bk.action.bloks.TimestampOfLastTouchUpV2"
            goto L_0x0369
        L_0x0349:
            java.lang.String r0 = "bk.action.animated.Start"
            goto L_0x0369
        L_0x034c:
            java.lang.String r0 = "bk.action.animated.Create"
            goto L_0x0369
        L_0x034f:
            java.lang.String r0 = "bk.action.media.LoadMediaV2"
            goto L_0x0369
        L_0x0352:
            java.lang.String r0 = "bk.action.trace.BeginSection"
            goto L_0x0369
        L_0x0355:
            java.lang.String r0 = "bk.action.text.IsTruncated"
            goto L_0x0369
        L_0x0358:
            java.lang.String r0 = "bk.action.i18n.LanguagePackResolveFbt"
            goto L_0x0369
        L_0x035b:
            java.lang.String r0 = "bk.action.bloks.TimestampOfLastTouchUp"
            goto L_0x0369
        L_0x035e:
            java.lang.String r0 = "bk.action.tooltip.Hide"
            goto L_0x0369
        L_0x0361:
            java.lang.String r0 = "bk.action.tooltip.Show"
            goto L_0x0369
        L_0x0364:
            java.lang.String r0 = "bk.action.ttrc.SurfaceLeft"
            goto L_0x0369
        L_0x0367:
            java.lang.String r0 = "bk.action.string.MatchesRegex"
        L_0x0369:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x12ca }
            r6 = 1
            if (r0 != 0) goto L_0x0322
            goto L_0x0321
        L_0x0371:
            java.lang.String r0 = "bk.action.animated.Create"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x03fa
            r9 = 0
            X.C18450wi.A0H(r1, r9)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0H(r15, r7)     // Catch:{ all -> 0x12ca }
            java.util.List r10 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r8 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r10.get(r7)     // Catch:{ all -> 0x12ca }
            X.1e9 r6 = X.C31411e8.A01(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r10.get(r5)     // Catch:{ all -> 0x12ca }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Number"
            X.C18450wi.A0M(r0, r11)     // Catch:{ all -> 0x12ca }
            float r3 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r10.get(r4)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0M(r0, r11)     // Catch:{ all -> 0x12ca }
            float r2 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            r0 = 4
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0M(r0, r11)     // Catch:{ all -> 0x12ca }
            float r11 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            r0 = 5
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x12ca }
            android.animation.TimeInterpolator r10 = (android.animation.TimeInterpolator) r10     // Catch:{ all -> 0x12ca }
            r0 = 6
            X.0q7 r4 = A02(r15, r1, r0)     // Catch:{ all -> 0x12ca }
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator     // Catch:{ all -> 0x12ca }
            r1.<init>()     // Catch:{ all -> 0x12ca }
            float[] r0 = new float[r5]     // Catch:{ all -> 0x12ca }
            r0[r9] = r3     // Catch:{ all -> 0x12ca }
            r0[r7] = r2     // Catch:{ all -> 0x12ca }
            r1.setFloatValues(r0)     // Catch:{ all -> 0x12ca }
            long r2 = X.C06380Vm.A00     // Catch:{ all -> 0x12ca }
            float r0 = (float) r2     // Catch:{ all -> 0x12ca }
            float r11 = r11 * r0
            long r2 = (long) r11     // Catch:{ all -> 0x12ca }
            r1.setDuration(r2)     // Catch:{ all -> 0x12ca }
            r1.setInterpolator(r10)     // Catch:{ all -> 0x12ca }
            X.0q2 r0 = new X.0q2     // Catch:{ all -> 0x12ca }
            r0.<init>()     // Catch:{ all -> 0x12ca }
            r0.A02(r1, r9)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.0q3 r2 = new X.0q3     // Catch:{ all -> 0x12ca }
            r2.<init>(r0)     // Catch:{ all -> 0x12ca }
            X.0Xa r0 = new X.0Xa     // Catch:{ all -> 0x12ca }
            r0.<init>(r15, r2, r8)     // Catch:{ all -> 0x12ca }
            r1.addUpdateListener(r0)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0B(r4)     // Catch:{ all -> 0x12ca }
            X.C06380Vm.A00(r1, r4, r15, r6)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x03fa:
            java.lang.String r0 = "bk.action.animated.easing.CreateCubicBezier"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x043c
            r0 = 0
            X.C18450wi.A0H(r1, r0)     // Catch:{ all -> 0x12ca }
            java.util.List r8 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x12ca }
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Number"
            X.C18450wi.A0M(r0, r6)     // Catch:{ all -> 0x12ca }
            float r3 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r7)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0M(r0, r6)     // Catch:{ all -> 0x12ca }
            float r2 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r5)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0M(r0, r6)     // Catch:{ all -> 0x12ca }
            float r1 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r4)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0M(r0, r6)     // Catch:{ all -> 0x12ca }
            float r0 = X.AnonymousClass000.A04(r0)     // Catch:{ all -> 0x12ca }
            android.view.animation.Interpolator r1 = X.C04240Lt.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x043c:
            java.lang.String r0 = "bk.action.animated.Start"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x045b
            r0 = 0
            X.C18450wi.A0H(r1, r0)     // Catch:{ all -> 0x12ca }
            X.C18450wi.A0H(r15, r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "null cannot be cast to non-null type android.animation.Animator"
            X.C18450wi.A0M(r1, r0)     // Catch:{ all -> 0x12ca }
            android.animation.Animator r1 = (android.animation.Animator) r1     // Catch:{ all -> 0x12ca }
            X.C06380Vm.A01(r1, r15, r3)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x045b:
            java.lang.String r0 = "bk.action.bloks.TimestampOfLastTouchUp"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0469
            java.lang.Number r1 = com.bloks.foa.signatures.bkactionblokstimestampoflasttouchup.BKBloksActionBloksTimestampOfLastTouchUpImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0469:
            java.lang.String r0 = "bk.action.bloks.TimestampOfLastTouchUpV2"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0477
            java.lang.Number r1 = com.bloks.foa.signatures.bkactionblokstimestampoflasttouchupv2.BKBloksActionBloksTimestampOfLastTouchUpImplV2.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0477:
            java.lang.String r0 = "bk.action.caa.FoaFetchOpenIdTokens"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0485
            java.lang.Object r1 = com.bloks.foa.signatures.bkactioncaafoafetchopenidtokens.BKBloksActionCaaFoaFetchOpenIdTokensImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0485:
            java.lang.String r0 = "bk.action.caa.foa.reg.GetAgeFromBirthdayTimestamp"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0493
            java.lang.Object r1 = com.bloks.foa.signatures.bkactioncaafoareggetagefrombirthdaytimestamp.BKBloksActionCaaFoaRegGetAgeFromBirthdayTimestampImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0493:
            java.lang.String r0 = "bk.action.errorreporting.ReportError"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04a1
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionerrorreportingreporterror.BKBloksActionErrorreportingReportErrorImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04a1:
            java.lang.String r0 = "bk.action.string.MatchesRegex"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04b3
            boolean r0 = com.bloks.foa.signatures.bkactionstringmatchesregex.BKActionStringMatchesRegexImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04b3:
            java.lang.String r0 = "bk.action.string.SplitWithString"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04c1
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionstringsplitwithstring.BKBloksActionStringSplitWithStringImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04c1:
            java.lang.String r0 = "bk.action.string.Trim"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04cf
            java.lang.String r1 = com.bloks.foa.signatures.bkactionstringtrim.BKActionStringTrimImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04cf:
            java.lang.String r0 = "bk.action.text.IsTruncated"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04e1
            boolean r0 = com.bloks.foa.signatures.bkactiontextistruncated.BKBloksActionTextIsTruncatedImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04e1:
            java.lang.String r0 = "bk.action.trace.BeginSection"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04ef
            java.lang.Object r1 = com.bloks.foa.signatures.bkactiontracebeginsection.BKActionTraceBeginSection.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04ef:
            java.lang.String r0 = "bk.action.trace.EndSection"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x04fd
            java.lang.Object r1 = com.bloks.foa.signatures.bkactiontraceendsection.BKActionTraceEndSection.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x04fd:
            java.lang.String r0 = "bk.action.ttrc.CachedContentDisplayed"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x050b
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionttrccachedcontentdisplayed.BKBloksActionTtrcCachedContentDisplayedImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x050b:
            java.lang.String r0 = "bk.action.ttrc.MarkerStart"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0519
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionttrcmarkerstart.BKActionTtrcMarkerStartImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0519:
            java.lang.String r0 = "bk.action.ttrc.NetworkContentDisplayed"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0527
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionttrcnetworkcontentdisplayed.BKBloksActionTtrcNetworkContentDisplayedImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0527:
            java.lang.String r0 = "bk.action.ttrc.SurfaceLeft"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0535
            java.lang.Object r1 = com.bloks.foa.signatures.bkactionttrcsurfaceleft.BKBloksActionTtrcSurfaceLeftImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0535:
            java.lang.String r0 = "bk.action.media.LoadAlbums"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0543
            java.lang.Object r1 = com.bloks.stdlib.signatures.bkactionmedialoadalbums.BKBloksActionMediaLoadAlbumsImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0543:
            java.lang.String r0 = "bk.action.media.LoadMediaV2"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0551
            java.lang.Object r1 = com.bloks.stdlib.signatures.bkactionmedialoadmediav2.BKBloksActionMediaLoadMediaV2Impl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0551:
            java.lang.String r0 = "bk.action.tooltip.Hide"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x055f
            java.lang.Object r1 = com.bloks.stdlib.signatures.bkactiontooltiphide.BKBloksActionTooltipHideImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x055f:
            java.lang.String r0 = "bk.action.tooltip.Show"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x056d
            java.lang.Object r1 = com.bloks.stdlib.signatures.bkactiontooltipshow.BKBloksActionTooltipShowImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x056d:
            java.lang.String r0 = "bk.action.i18n.LanguagePackResolveFbt"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x057b
            java.lang.Object r1 = com.facebook.bloks.facebook.actions.plugins.bkactioni18nlanguagepackresolvefbt.BKBloksActionI18nLanguagePackResolveFbtImpl.evaluate(r1, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x057b:
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x12ca }
            r0 = 0
            r1[r0] = r2     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x12ca }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x058c:
            r0 = r24
            X.3Ea r0 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.A8l(r1, r12, r15)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0596:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r1 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = A0F(r1, r0)     // Catch:{ all -> 0x12ca }
            A0G(r1, r0, r2, r6)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x05ad:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r2, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r6 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.util.List r1 = A0F(r6, r0)     // Catch:{ all -> 0x12ca }
            X.4tn r5 = A07(r2)     // Catch:{ all -> 0x12ca }
            X.3fr r4 = new X.3fr     // Catch:{ all -> 0x12ca }
            r4.<init>(r1, r7, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x06bc
        L_0x05ca:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            A0G(r0, r2, r4, r6)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x05dd:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r3 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r2 = r15.A00     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0640
            r0 = 2131362243(0x7f0a01c3, float:1.8344261E38)
            java.lang.Object r0 = r2.A02(r0)     // Catch:{ all -> 0x12ca }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x12ca }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x12ca }
            if (r1 != 0) goto L_0x12c1
            X.0pz r0 = X.C62183Bz.A03(r2)     // Catch:{ all -> 0x12ca }
            X.4tf r1 = new X.4tf     // Catch:{ all -> 0x12ca }
            r1.<init>(r3)     // Catch:{ all -> 0x12ca }
            X.1dg r0 = r0.A02()     // Catch:{ all -> 0x12ca }
            r0.A0Q(r1)     // Catch:{ all -> 0x12ca }
            X.0q1 r1 = r1.A00     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x0634
            X.0q3 r0 = X.C14950q3.A01     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = X.C14980q6.A00(r15, r0, r1)     // Catch:{ all -> 0x12ca }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x062c
            r0 = 2131362243(0x7f0a01c3, float:1.8344261E38)
            java.lang.Object r0 = r2.A02(r0)     // Catch:{ all -> 0x12ca }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x12ca }
            r0.put(r3, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x062c:
            java.lang.String r0 = "Accessing state is only supported from the UI Thread"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0634:
            java.lang.String r0 = "No state initializer available for id: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r3)     // Catch:{ all -> 0x12ca }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0640:
            java.lang.String r0 = "Accessing state is only supported from the UI Thread"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0648:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r2, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r1 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = A0F(r1, r0)     // Catch:{ all -> 0x12ca }
            A0H(r1, r2, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x065f:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r5 = X.C47842Kv.A00(r2, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r4 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = A0F(r4, r0)     // Catch:{ all -> 0x12ca }
            X.4tn r1 = A07(r5)     // Catch:{ all -> 0x12ca }
            X.3fq r0 = new X.3fq     // Catch:{ all -> 0x12ca }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x12ca }
            r4.A05(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x067f:
            android.view.View r0 = A01(r15, r1)     // Catch:{ all -> 0x12ca }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x12ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x068d:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            A0G(r0, r2, r4, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x06a0:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r2, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r6 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.util.List r1 = A0F(r6, r0)     // Catch:{ all -> 0x12ca }
            r0 = 0
            X.4tn r5 = A07(r2)     // Catch:{ all -> 0x12ca }
            X.3fr r4 = new X.3fr     // Catch:{ all -> 0x12ca }
            r4.<init>(r1, r0, r2)     // Catch:{ all -> 0x12ca }
        L_0x06bc:
            r6.A05(r5, r4)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x06c1:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            X.4bN r0 = A06(r15)     // Catch:{ all -> 0x12ca }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x06d3:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r1 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = A0F(r1, r0)     // Catch:{ all -> 0x12ca }
            A0G(r1, r0, r2, r5)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x06ea:
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.4Oj r0 = (X.C85424Oj) r0     // Catch:{ all -> 0x12ca }
            X.2Wa r1 = X.AnonymousClass2Wa.A02(r0, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x06f6:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r4 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = X.C62183Bz.A05(r0, r4)     // Catch:{ all -> 0x12ca }
            X.38S r1 = (X.AnonymousClass38S) r1     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            android.text.Editable r0 = r1.A0E     // Catch:{ all -> 0x12ca }
            r0.append(r2)     // Catch:{ all -> 0x12ca }
            android.widget.EditText r0 = r1.A0K     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            r0.append(r2)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x071a:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r2 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            X.4tn r1 = A07(r4)     // Catch:{ all -> 0x12ca }
            X.3fn r0 = new X.3fn     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r2.A05(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0732:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r1 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = A0F(r1, r0)     // Catch:{ all -> 0x12ca }
            A0G(r1, r0, r2, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0749:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r9 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r11 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x12ca }
            X.0q7 r10 = A02(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            int r8 = X.C807145e.A00(r11)     // Catch:{ all -> 0x12ca }
            r0 = 32
            if (r8 >= r0) goto L_0x0784
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x12ca }
            X.AnonymousClass000.A1M(r1, r8, r6)     // Catch:{ all -> 0x12ca }
            r1[r7] = r11     // Catch:{ all -> 0x12ca }
            if (r9 == 0) goto L_0x076d
            goto L_0x0771
        L_0x076d:
            java.lang.String r0 = "unknown"
            goto L_0x0777
        L_0x0771:
            int r0 = r9.A01     // Catch:{ all -> 0x12ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
        L_0x0777:
            r1[r5] = r0     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "BloksCoreInterpreterExtensions"
            X.C29691b2.A00(r0, r1)     // Catch:{ all -> 0x12ca }
        L_0x0784:
            java.lang.Object r1 = X.C62183Bz.A05(r10, r9)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x0796
            boolean r0 = r1 instanceof X.AnonymousClass5OM     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0796
            X.5OM r1 = (X.AnonymousClass5OM) r1     // Catch:{ all -> 0x12ca }
            boolean r0 = r1.AdZ(r10, r2, r8)     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x128b
        L_0x0796:
            X.0pz r6 = X.C62183Bz.A03(r10)     // Catch:{ all -> 0x12ca }
            int r0 = r9.A00     // Catch:{ all -> 0x12ca }
            long r4 = (long) r0     // Catch:{ all -> 0x12ca }
            X.3fs r1 = new X.3fs     // Catch:{ all -> 0x12ca }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x12ca }
            X.4to r0 = new X.4to     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r6.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x07ac:
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r2 = r0.A00     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r15.A03     // Catch:{ all -> 0x12ca }
            X.1b1 r1 = new X.1b1     // Catch:{ all -> 0x12ca }
            r1.<init>((X.C14930q1) r2, (java.util.List) r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x07bd:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r4 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            int r6 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            X.0pz r2 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            int r0 = r4.A00     // Catch:{ all -> 0x12ca }
            long r4 = (long) r0     // Catch:{ all -> 0x12ca }
            X.3fm r1 = new X.3fm     // Catch:{ all -> 0x12ca }
            r1.<init>(r6)     // Catch:{ all -> 0x12ca }
            X.4to r0 = new X.4to     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r2.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x07e1:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0B(r15, r1, r0, r7)     // Catch:{ all -> 0x12ca }
            X.39I r1 = (X.AnonymousClass39I) r1     // Catch:{ all -> 0x12ca }
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x12ca }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0806
            X.4Oi r0 = r1.A03     // Catch:{ all -> 0x12ca }
            int r0 = r0.A03     // Catch:{ all -> 0x12ca }
            float r1 = (float) r0     // Catch:{ all -> 0x12ca }
            float r0 = X.C13680ns.A01(r2)     // Catch:{ all -> 0x12ca }
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch:{ all -> 0x12ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0806:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x080e:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r8 = X.C13690nt.A0Q(r2, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r2.get(r7)     // Catch:{ all -> 0x12ca }
            int r6 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x12ca }
            boolean r2 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = X.C62183Bz.A05(r0, r8)     // Catch:{ all -> 0x12ca }
            X.39I r0 = (X.AnonymousClass39I) r0     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            r0.A01(r6, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0835:
            android.view.View r0 = A01(r15, r1)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0842
            boolean r1 = r0.requestFocus()     // Catch:{ all -> 0x12ca }
            r0 = 1
            if (r1 != 0) goto L_0x0843
        L_0x0842:
            r0 = 0
        L_0x0843:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0849:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x12ca }
            X.4aX r0 = r0.A07     // Catch:{ all -> 0x12ca }
            java.lang.CharSequence r1 = r0.A00(r1)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x085b:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r0 = X.C13690nt.A0Q(r2, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r7 = X.C47842Kv.A00(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r6 = X.C47842Kv.A00(r2, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r2 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            int r0 = r0.A00     // Catch:{ all -> 0x12ca }
            long r4 = (long) r0     // Catch:{ all -> 0x12ca }
            X.3fp r1 = new X.3fp     // Catch:{ all -> 0x12ca }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x12ca }
            X.4to r0 = new X.4to     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r2.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x087f:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = A0B(r15, r1, r0, r7)     // Catch:{ all -> 0x12ca }
            X.38S r0 = (X.AnonymousClass38S) r0     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x089b
            android.text.Editable r0 = r0.A0E     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0897
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0897:
            java.lang.String r1 = ""
            goto L_0x12c1
        L_0x089b:
            java.lang.String r1 = ""
            goto L_0x12c1
        L_0x089f:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r1 = r15.A00     // Catch:{ all -> 0x12ca }
            r0 = 2131362229(0x7f0a01b5, float:1.8344233E38)
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x12ca }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x08b7
            goto L_0x08be
        L_0x08b7:
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x12ca }
            X.0ux r1 = (X.C17360ux) r1     // Catch:{ all -> 0x12ca }
            goto L_0x08bf
        L_0x08be:
            r1 = 0
        L_0x08bf:
            if (r1 == 0) goto L_0x0e94
            boolean r0 = r1 instanceof X.C99284tm     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0e94
            X.4tm r1 = (X.C99284tm) r1     // Catch:{ all -> 0x12ca }
            X.4TM r0 = r1.A00     // Catch:{ all -> 0x12ca }
            r0.A01(r4, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x08ce:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r6 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r5 = X.C47842Kv.A00(r0, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r4 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            r2 = 0
            X.4tn r1 = A07(r5)     // Catch:{ all -> 0x12ca }
            X.3fr r0 = new X.3fr     // Catch:{ all -> 0x12ca }
            r0.<init>(r6, r2, r5)     // Catch:{ all -> 0x12ca }
            r4.A05(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x08eb:
            java.util.List r8 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = A0B(r15, r1, r8, r4)     // Catch:{ all -> 0x12ca }
            X.39I r4 = (X.AnonymousClass39I) r4     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r8.get(r7)     // Catch:{ all -> 0x12ca }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x12ca }
            if (r4 == 0) goto L_0x128b
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x12ca }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x12ca }
            float r1 = r1.floatValue()     // Catch:{ all -> 0x12ca }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x12ca }
            float r0 = android.util.TypedValue.applyDimension(r7, r1, r0)     // Catch:{ all -> 0x12ca }
            int r2 = (int) r0     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r5)     // Catch:{ all -> 0x12ca }
            boolean r1 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0934
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x092c
            X.4Oi r0 = r4.A03     // Catch:{ all -> 0x12ca }
            int r0 = r0.A03     // Catch:{ all -> 0x12ca }
            int r2 = r2 - r0
            r4.A00(r2, r6, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x092c:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0934:
            java.lang.String r0 = "setXOffset cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x093d:
            java.lang.Object r1 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "InflateSync"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x12ca }
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r1)     // Catch:{ IOException -> 0x095c }
            X.C90154da.A00()     // Catch:{ IOException -> 0x095c }
            X.3EY r0 = new X.3EY     // Catch:{ IOException -> 0x095c }
            r0.<init>(r15, r1)     // Catch:{ IOException -> 0x095c }
            r0.ALo()     // Catch:{ IOException -> 0x095c }
            java.lang.Object r1 = X.C611837x.A00(r0)     // Catch:{ IOException -> 0x095c }
            goto L_0x0977
        L_0x095c:
            r1 = move-exception
            java.lang.String r0 = "inflate_sync_error"
            X.C29691b2.A02(r0, r1)     // Catch:{ all -> 0x0de4 }
            r1 = 0
            goto L_0x0977
        L_0x0964:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "ParseEmbedded"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x12ca }
            X.4Oj r0 = X.C87884Za.A00(r1)     // Catch:{ all -> 0x12ca }
            X.2Wa r1 = A04(r15, r0, r6)     // Catch:{ all -> 0x12ca }
        L_0x0977:
            X.C89644cb.A00()     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x097c:
            java.util.List r4 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r4.get(r6)     // Catch:{ all -> 0x12ca }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x12ca }
            int r3 = r0.intValue()     // Catch:{ all -> 0x12ca }
            int r2 = r4.size()     // Catch:{ all -> 0x12ca }
            int r2 = r2 / r5
            java.util.List r0 = r15.A03     // Catch:{ all -> 0x12ca }
            X.3fl r1 = new X.3fl     // Catch:{ all -> 0x12ca }
            r1.<init>(r0, r3, r2)     // Catch:{ all -> 0x12ca }
        L_0x0994:
            int r0 = r4.size()     // Catch:{ all -> 0x12ca }
            if (r7 >= r0) goto L_0x09b2
            java.lang.Object r0 = r4.get(r7)     // Catch:{ all -> 0x12ca }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x12ca }
            int r3 = r0.intValue()     // Catch:{ all -> 0x12ca }
            int r0 = r7 + 1
            java.lang.Object r2 = r4.get(r0)     // Catch:{ all -> 0x12ca }
            android.util.SparseArray r0 = r1.A02     // Catch:{ all -> 0x12ca }
            r0.put(r3, r2)     // Catch:{ all -> 0x12ca }
            int r7 = r7 + 2
            goto L_0x0994
        L_0x09b2:
            r1.A0R()     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x09b7:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r6 = X.C47842Kv.A00(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x12ca }
            boolean r7 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            java.lang.Object r5 = X.C62183Bz.A05(r0, r2)     // Catch:{ all -> 0x12ca }
            X.39I r5 = (X.AnonymousClass39I) r5     // Catch:{ all -> 0x12ca }
            if (r5 == 0) goto L_0x128b
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0a05
            X.2rJ r0 = r5.A02     // Catch:{ all -> 0x12ca }
            java.util.List r4 = r0.A04     // Catch:{ all -> 0x12ca }
            int r2 = r4.size()     // Catch:{ all -> 0x12ca }
            r1 = 0
        L_0x09e4:
            if (r1 >= r2) goto L_0x128b
            java.lang.Object r0 = r4.get(r1)     // Catch:{ all -> 0x12ca }
            X.4Gj r0 = (X.C83364Gj) r0     // Catch:{ all -> 0x12ca }
            X.1dg r0 = r0.A01     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = r0.A0I()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x09fb
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x09fb
            goto L_0x09fe
        L_0x09fb:
            int r1 = r1 + 1
            goto L_0x09e4
        L_0x09fe:
            if (r1 < 0) goto L_0x128b
            r5.A01(r1, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0a05:
            java.lang.String r0 = "setIndexById cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0a0e:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = r0.get(r6)     // Catch:{ all -> 0x12ca }
            X.1b1 r4 = (X.C29681b1) r4     // Catch:{ all -> 0x12ca }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x12ca }
            int r0 = r1.size()     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r1.subList(r7, r0)     // Catch:{ all -> 0x12ca }
            X.0q3 r3 = new X.0q3     // Catch:{ all -> 0x12ca }
            r3.<init>(r0)     // Catch:{ all -> 0x12ca }
            X.0q1 r2 = r4.A01     // Catch:{ all -> 0x12ca }
            X.0q4 r0 = r4.A00     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0a33
            java.lang.Object r1 = X.C14980q6.A00(r0, r3, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0a33:
            java.util.List r12 = r4.A02     // Catch:{ all -> 0x12ca }
            if (r12 == 0) goto L_0x0a67
            if (r15 == 0) goto L_0x0a67
            X.0q7 r7 = r15.A00     // Catch:{ all -> 0x12ca }
            java.util.Map r13 = r15.A04     // Catch:{ all -> 0x12ca }
            X.4bN r8 = r15.A01     // Catch:{ all -> 0x12ca }
            java.util.Set r14 = r15.A05     // Catch:{ all -> 0x12ca }
            X.4K0 r9 = r15.A01     // Catch:{ all -> 0x12ca }
            X.1Jc r10 = X.C62183Bz.A04(r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r11 = r15.A02     // Catch:{ all -> 0x12ca }
            X.4YH r6 = r15.A00     // Catch:{ all -> 0x12ca }
            X.0q4 r5 = new X.0q4     // Catch:{ all -> 0x12ca }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x12ca }
            X.4ts r4 = r5.A03     // Catch:{ all -> 0x12ca }
            X.4ts r0 = r15.A03     // Catch:{ all -> 0x12ca }
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.A00     // Catch:{ all -> 0x12ca }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x0a61
            java.util.concurrent.CopyOnWriteArraySet r0 = r4.A00     // Catch:{ all -> 0x12ca }
            r0.addAll(r1)     // Catch:{ all -> 0x12ca }
        L_0x0a61:
            java.lang.Object r1 = X.C14980q6.A00(r5, r3, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0a67:
            java.lang.String r1 = "BloksCallback"
            java.lang.String r0 = "An attempt to invoke an invalid callback"
            X.C29691b2.A00(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c0
        L_0x0a70:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            X.4Za r0 = A09(r15, r0)     // Catch:{ all -> 0x12ca }
            X.4CO r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.4CN r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.4Oj r1 = r0.A00     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0a82:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r6 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r5 = X.C47842Kv.A00(r0, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r2 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            X.4tn r1 = A07(r5)     // Catch:{ all -> 0x12ca }
            X.3fq r0 = new X.3fq     // Catch:{ all -> 0x12ca }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x12ca }
            r2.A05(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0a9e:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r6 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.C47842Kv.A00(r0, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            A0H(r0, r2, r6)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0ab1:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            X.4Za r0 = A09(r15, r0)     // Catch:{ all -> 0x12ca }
            X.4CO r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.4CN r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.4Oj r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.2Wa r1 = A04(r15, r0, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0ac7:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            android.view.View r0 = r2.A0C(r0)     // Catch:{ all -> 0x12ca }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x12ca }
            float r0 = (float) r0     // Catch:{ all -> 0x12ca }
            java.lang.Number r1 = A0A(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0ae2:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r16 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.C13690nt.A0Q(r0, r7)     // Catch:{ all -> 0x12ca }
            r0 = 40
            java.util.List r18 = r1.A0N(r0)     // Catch:{ all -> 0x12ca }
            r0 = 38
            java.util.List r19 = r1.A0N(r0)     // Catch:{ all -> 0x12ca }
            r2 = 36
            java.util.List r20 = r1.A0N(r2)     // Catch:{ all -> 0x12ca }
            r0 = 41
            java.util.List r0 = r1.A0N(r0)     // Catch:{ all -> 0x12ca }
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x12ca }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x12ca }
        L_0x0b0c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0b41
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x12ca }
            X.1dg r1 = (X.C31201dg) r1     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = r1.A0J(r2)     // Catch:{ all -> 0x12ca }
            if (r2 == 0) goto L_0x0b39
            r0 = 35
            java.lang.String r1 = r1.A0J(r0)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x0b31
            X.4ZZ r0 = new X.4ZZ     // Catch:{ all -> 0x12ca }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x12ca }
            r3.add(r0)     // Catch:{ all -> 0x12ca }
            r2 = 36
            goto L_0x0b0c
        L_0x0b31:
            java.lang.String r0 = "Received null name from props in the payload.Make tree resource references"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0b39:
            java.lang.String r0 = "Received null variable id from props in the payload.Make tree resource references"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0b41:
            java.util.List r22 = java.util.Collections.emptyList()     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x0b4b
            r0 = 0
            goto L_0x0b56
        L_0x0b4b:
            r1 = 2131362235(0x7f0a01bb, float:1.8344245E38)
            android.util.SparseArray r0 = r0.A01     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x12ca }
        L_0x0b56:
            r23 = 0
            r17 = r0
            r21 = r3
            X.2Wa r1 = A03(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0b62:
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r14 = X.AnonymousClass000.A0n(r2, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r2.get(r7)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r1 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r2.get(r5)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r0 = r0.A00     // Catch:{ all -> 0x12ca }
            com.facebook.redex.RunnableRunnableShape1S1300000_I1 r12 = new com.facebook.redex.RunnableRunnableShape1S1300000_I1     // Catch:{ all -> 0x12ca }
            r13 = 0
            r16 = r0
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x12ca }
            android.os.Handler r0 = X.C62003Bg.A00     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x0ba9
            java.lang.Class<X.3Bg> r4 = X.C62003Bg.class
            monitor-enter(r4)     // Catch:{ all -> 0x12ca }
            android.os.Handler r0 = X.C62003Bg.A00     // Catch:{ all -> 0x0ba5 }
            if (r0 != 0) goto L_0x0ba3
            java.lang.String r2 = "ThreadUtilsBackgroundHandler"
            r1 = 5
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ all -> 0x0ba5 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0ba5 }
            r0.start()     // Catch:{ all -> 0x0ba5 }
            android.os.Looper r1 = r0.getLooper()     // Catch:{ all -> 0x0ba5 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0ba5 }
            r0.<init>(r1)     // Catch:{ all -> 0x0ba5 }
            X.C62003Bg.A00 = r0     // Catch:{ all -> 0x0ba5 }
        L_0x0ba3:
            monitor-exit(r4)     // Catch:{ all -> 0x0ba5 }
            goto L_0x0ba9
        L_0x0ba5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0ba5 }
            goto L_0x12c9
        L_0x0ba9:
            android.os.Handler r0 = X.C62003Bg.A00     // Catch:{ all -> 0x12ca }
            r0.post(r12)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0bb0:
            android.view.View r1 = A01(r15, r1)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            r0 = 8
            r1.sendAccessibilityEvent(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0bbd:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r4 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.lang.Object r6 = X.C62183Bz.A05(r0, r4)     // Catch:{ all -> 0x12ca }
            X.39I r6 = (X.AnonymousClass39I) r6     // Catch:{ all -> 0x12ca }
            r1 = 36
            android.util.SparseArray r0 = r2.A02     // Catch:{ all -> 0x12ca }
            java.lang.Object r7 = r0.get(r1)     // Catch:{ all -> 0x12ca }
            if (r7 == 0) goto L_0x128b
            boolean r0 = r7 instanceof java.lang.String     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0be2
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x12ca }
            goto L_0x0be6
        L_0x0be2:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x12ca }
        L_0x0be6:
            if (r6 == 0) goto L_0x128b
            r0 = 35
            java.lang.String r5 = r2.A0J(r0)     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0c44
            X.2rJ r0 = r6.A02     // Catch:{ all -> 0x12ca }
            java.util.List r2 = r0.A04     // Catch:{ all -> 0x12ca }
            int r1 = r2.size()     // Catch:{ all -> 0x12ca }
            r4 = 0
        L_0x0bfd:
            if (r4 >= r1) goto L_0x128b
            java.lang.Object r0 = r2.get(r4)     // Catch:{ all -> 0x12ca }
            X.4Gj r0 = (X.C83364Gj) r0     // Catch:{ all -> 0x12ca }
            X.1dg r0 = r0.A01     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = r0.A0I()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0c14
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0c14
            goto L_0x0c17
        L_0x0c14:
            int r4 = r4 + 1
            goto L_0x0bfd
        L_0x0c17:
            if (r4 < 0) goto L_0x128b
            X.4Oi r2 = r6.A03     // Catch:{ all -> 0x12ca }
            androidx.recyclerview.widget.RecyclerView r0 = r2.A06     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0c3e
            X.3Ql r1 = r6.A00     // Catch:{ all -> 0x12ca }
            if (r1 != 0) goto L_0x0c2e
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x12ca }
            X.3Ql r1 = new X.3Ql     // Catch:{ all -> 0x12ca }
            r1.<init>(r0)     // Catch:{ all -> 0x12ca }
            r6.A00 = r1     // Catch:{ all -> 0x12ca }
        L_0x0c2e:
            r1.A09(r5)     // Catch:{ all -> 0x12ca }
            r1.A00 = r4     // Catch:{ all -> 0x12ca }
            androidx.recyclerview.widget.RecyclerView r0 = r2.A06     // Catch:{ all -> 0x12ca }
            X.02W r0 = r0.getLayoutManager()     // Catch:{ all -> 0x12ca }
            r0.A0Q(r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0c3e:
            r2.A00 = r4     // Catch:{ all -> 0x12ca }
            r2.A07 = r5     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0c44:
            java.lang.String r0 = "scrollToIndexById cannot be called from a background thread."
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0c4d:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.C611937y.A00(r0, r15, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0c5d:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            int r1 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r2.A0L()     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0c75:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0B(r15, r1, r0, r7)     // Catch:{ all -> 0x12ca }
            X.39I r1 = (X.AnonymousClass39I) r1     // Catch:{ all -> 0x12ca }
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x12ca }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0c9a
            X.4Oi r0 = r1.A03     // Catch:{ all -> 0x12ca }
            int r0 = r0.A04     // Catch:{ all -> 0x12ca }
            float r1 = (float) r0     // Catch:{ all -> 0x12ca }
            float r0 = X.C13680ns.A01(r2)     // Catch:{ all -> 0x12ca }
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch:{ all -> 0x12ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0c9a:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0ca2:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0C(r15, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0cae:
            android.view.View r0 = A01(r15, r1)     // Catch:{ all -> 0x12ca }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x12ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0cbc:
            java.util.List r8 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = A0B(r15, r1, r8, r4)     // Catch:{ all -> 0x12ca }
            X.39I r4 = (X.AnonymousClass39I) r4     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r8.get(r7)     // Catch:{ all -> 0x12ca }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x12ca }
            if (r4 == 0) goto L_0x128b
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x12ca }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x12ca }
            float r1 = r1.floatValue()     // Catch:{ all -> 0x12ca }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x12ca }
            float r0 = android.util.TypedValue.applyDimension(r7, r1, r0)     // Catch:{ all -> 0x12ca }
            int r2 = (int) r0     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r8.get(r5)     // Catch:{ all -> 0x12ca }
            boolean r1 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0d05
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0cfd
            X.4Oi r0 = r4.A03     // Catch:{ all -> 0x12ca }
            int r0 = r0.A04     // Catch:{ all -> 0x12ca }
            int r2 = r2 - r0
            r4.A00(r6, r2, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0cfd:
            java.lang.String r0 = "Cannot getScroll off the main thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0d05:
            java.lang.String r0 = "setYOffset cannot be called from  a background thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0d0e:
            android.view.View r2 = A01(r15, r1)     // Catch:{ all -> 0x12ca }
            if (r2 == 0) goto L_0x0d27
            android.content.Context r1 = r2.getContext()     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x12ca }
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ all -> 0x12ca }
            r2.requestFocus()     // Catch:{ all -> 0x12ca }
            r0.showSoftInput(r2, r6)     // Catch:{ all -> 0x12ca }
            r6 = 1
        L_0x0d27:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0d2d:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = A05(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            A0G(r0, r2, r4, r5)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0d40:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            X.0pz r1 = X.C62183Bz.A03(r0)     // Catch:{ all -> 0x12ca }
            X.0q6 r2 = new X.0q6     // Catch:{ all -> 0x12ca }
            r2.<init>(r15)     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0d73
            java.lang.String r0 = "Bloks Reflow"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = r1.A02()     // Catch:{ all -> 0x12ca }
            X.4tc r0 = new X.4tc     // Catch:{ all -> 0x12ca }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x12ca }
            X.1dg r0 = X.AnonymousClass382.A00(r0, r1)     // Catch:{ all -> 0x12ca }
            if (r1 == r0) goto L_0x0e2c
            java.lang.String r0 = "Reflow traversal produced an updated component"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0d73:
            java.lang.String r0 = "Accessing state is only supported from the UI Thread"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0d7b:
            java.util.List r4 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r4.get(r6)     // Catch:{ all -> 0x12ca }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r4.get(r7)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r2 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r5 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "Inflate"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x12ca }
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r1)     // Catch:{ IOException -> 0x0dcf }
            X.C90154da.A00()     // Catch:{ IOException -> 0x0dcf }
            X.3EY r0 = new X.3EY     // Catch:{ IOException -> 0x0dcf }
            r0.<init>(r15, r1)     // Catch:{ IOException -> 0x0dcf }
            r0.ALo()     // Catch:{ IOException -> 0x0dcf }
            java.lang.Object r1 = X.C611837x.A00(r0)     // Catch:{ IOException -> 0x0dcf }
            X.1dg r1 = (X.C31201dg) r1     // Catch:{ IOException -> 0x0dcf }
            java.lang.String r4 = "SuccessCallback"
            X.0q2 r0 = new X.0q2     // Catch:{ IOException -> 0x0dcf }
            r0.<init>()     // Catch:{ IOException -> 0x0dcf }
            r0.A03(r1, r6)     // Catch:{ IOException -> 0x0dcf }
            java.util.List r1 = r0.A00     // Catch:{ IOException -> 0x0dcf }
            X.0q3 r0 = new X.0q3     // Catch:{ IOException -> 0x0dcf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0dcf }
            X.C807345g.A00(r0, r2, r15)     // Catch:{ 43P -> 0x0dc2 }
            goto L_0x0e2c
        L_0x0dc2:
            r2 = move-exception
            java.lang.String r0 = "Exception while executing "
            java.lang.String r1 = X.C13680ns.A0h(r0, r4)     // Catch:{ IOException -> 0x0dcf }
            java.lang.String r0 = "BloksCoreInterpreterExtensions"
            X.C29691b2.A01(r0, r1, r2)     // Catch:{ IOException -> 0x0dcf }
            goto L_0x0e2c
        L_0x0dcf:
            java.lang.String r1 = "FailureCallback"
            X.0q3 r0 = X.C14950q3.A01     // Catch:{ all -> 0x0de4 }
            X.C807345g.A00(r0, r5, r15)     // Catch:{ 43P -> 0x0dd7 }
            goto L_0x0e2c
        L_0x0dd7:
            r2 = move-exception
            java.lang.String r0 = "Exception while executing "
            java.lang.String r1 = X.C13680ns.A0h(r0, r1)     // Catch:{ all -> 0x0de4 }
            java.lang.String r0 = "BloksCoreInterpreterExtensions"
            X.C29691b2.A01(r0, r1, r2)     // Catch:{ all -> 0x0de4 }
            goto L_0x0e2c
        L_0x0de4:
            r0 = move-exception
            X.C89644cb.A00()     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0dea:
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r0 = r0.A00     // Catch:{ all -> 0x12ca }
            X.1b1 r1 = new X.1b1     // Catch:{ all -> 0x12ca }
            r1.<init>((X.C14960q4) r15, (X.C14930q1) r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0df9:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            X.0pz r1 = X.C62183Bz.A03(r0)     // Catch:{ all -> 0x12ca }
            X.0q6 r2 = new X.0q6     // Catch:{ all -> 0x12ca }
            r2.<init>(r15)     // Catch:{ all -> 0x12ca }
            boolean r0 = X.C62003Bg.A03()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0e31
            java.lang.String r0 = "Bloks Reduce"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = r1.A02()     // Catch:{ all -> 0x12ca }
            X.4tb r0 = new X.4tb     // Catch:{ all -> 0x12ca }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x12ca }
            X.1dg r0 = X.AnonymousClass382.A00(r0, r1)     // Catch:{ all -> 0x12ca }
            if (r1 == r0) goto L_0x0e2c
            java.lang.String r0 = "Reflow traversal produced an updated component"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0e2c:
            X.C89644cb.A00()     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0e31:
            java.lang.String r0 = "Accessing state is only supported from the UI Thread"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0e39:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r11 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r2 = r0.A00     // Catch:{ all -> 0x12ca }
            X.0q7 r1 = r15.A00     // Catch:{ all -> 0x12ca }
            r0 = 2131362229(0x7f0a01b5, float:1.8344233E38)
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x12ca }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x0e55
            goto L_0x0e5c
        L_0x0e55:
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x12ca }
            X.0ux r1 = (X.C17360ux) r1     // Catch:{ all -> 0x12ca }
            goto L_0x0e5d
        L_0x0e5c:
            r1 = 0
        L_0x0e5d:
            if (r1 == 0) goto L_0x0e94
            boolean r0 = r1 instanceof X.C99284tm     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x0e94
            X.4tm r1 = (X.C99284tm) r1     // Catch:{ all -> 0x12ca }
            X.4TM r7 = r1.A00     // Catch:{ all -> 0x12ca }
            X.4Jy r5 = new X.4Jy     // Catch:{ all -> 0x12ca }
            r5.<init>(r1, r2, r15)     // Catch:{ all -> 0x12ca }
            monitor-enter(r7)     // Catch:{ all -> 0x12ca }
            java.util.Map r0 = r7.A01     // Catch:{ all -> 0x0e90 }
            java.lang.Object r4 = r0.get(r11)     // Catch:{ all -> 0x0e90 }
            X.0q1 r2 = r5.A01     // Catch:{ Exception -> 0x0e8a }
            X.0q2 r0 = new X.0q2     // Catch:{ Exception -> 0x0e8a }
            r0.<init>()     // Catch:{ Exception -> 0x0e8a }
            r0.A02(r4, r6)     // Catch:{ Exception -> 0x0e8a }
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x0e8a }
            X.0q3 r1 = new X.0q3     // Catch:{ Exception -> 0x0e8a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0e8a }
            X.0q5 r0 = r5.A02     // Catch:{ Exception -> 0x0e8a }
            java.lang.Object r4 = X.C807345g.A00(r1, r2, r0)     // Catch:{ Exception -> 0x0e8a }
        L_0x0e8a:
            r7.A01(r11, r4)     // Catch:{ all -> 0x0e90 }
            monitor-exit(r7)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0e90:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x0e94:
            X.C29691b2.A00(r8, r9)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0e99:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r6 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = (X.C14990q7) r0     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = X.C62183Bz.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            X.38S r4 = (X.AnonymousClass38S) r4     // Catch:{ all -> 0x12ca }
            if (r4 == 0) goto L_0x128b
            android.widget.EditText r0 = r4.A0K     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            int r2 = r0.getSelectionStart()     // Catch:{ all -> 0x12ca }
            android.widget.EditText r0 = r4.A0K     // Catch:{ all -> 0x12ca }
            int r1 = r0.getSelectionEnd()     // Catch:{ all -> 0x12ca }
            if (r2 == r1) goto L_0x0ed9
            android.text.Editable r0 = r4.A0E     // Catch:{ all -> 0x12ca }
            r0.replace(r2, r1, r6)     // Catch:{ all -> 0x12ca }
        L_0x0ec6:
            android.widget.EditText r1 = r4.A0K     // Catch:{ all -> 0x12ca }
            android.text.Editable r0 = r4.A0E     // Catch:{ all -> 0x12ca }
            r1.setText(r0)     // Catch:{ all -> 0x12ca }
            android.widget.EditText r1 = r4.A0K     // Catch:{ all -> 0x12ca }
            int r0 = r6.length()     // Catch:{ all -> 0x12ca }
            int r2 = r2 + r0
            r1.setSelection(r2)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0ed9:
            android.text.Editable r0 = r4.A0E     // Catch:{ all -> 0x12ca }
            r0.insert(r2, r6)     // Catch:{ all -> 0x12ca }
            goto L_0x0ec6
        L_0x0edf:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r10 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x12ca }
            int r9 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            X.0pz r8 = X.C62183Bz.A03(r0)     // Catch:{ all -> 0x12ca }
            int r1 = r2.A01     // Catch:{ all -> 0x12ca }
            r0 = 13346(0x3422, float:1.8702E-41)
            if (r1 != r0) goto L_0x0f27
            r0 = 32
            java.util.List r0 = r2.A0M(r0)     // Catch:{ all -> 0x12ca }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x12ca }
        L_0x0f07:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x12ca }
            X.1dg r6 = (X.C31201dg) r6     // Catch:{ all -> 0x12ca }
            int r2 = r9 + 1
            int r0 = r10.A00     // Catch:{ all -> 0x12ca }
            long r4 = (long) r0     // Catch:{ all -> 0x12ca }
            X.3fo r1 = new X.3fo     // Catch:{ all -> 0x12ca }
            r1.<init>(r6, r9)     // Catch:{ all -> 0x12ca }
            X.4to r0 = new X.4to     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r8.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            r9 = r2
            goto L_0x0f07
        L_0x0f27:
            int r0 = r10.A00     // Catch:{ all -> 0x12ca }
            long r4 = (long) r0     // Catch:{ all -> 0x12ca }
            X.3fo r1 = new X.3fo     // Catch:{ all -> 0x12ca }
            r1.<init>(r2, r9)     // Catch:{ all -> 0x12ca }
            X.4to r0 = new X.4to     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            r8.A05(r0, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0f39:
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass494.A00     // Catch:{ all -> 0x12ca }
            int r0 = r0.incrementAndGet()     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r15.A03     // Catch:{ all -> 0x12ca }
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x12ca }
            r9.<init>(r0)     // Catch:{ all -> 0x12ca }
            r9.add(r2)     // Catch:{ all -> 0x12ca }
            X.0q7 r4 = r15.A00     // Catch:{ all -> 0x12ca }
            java.util.Map r10 = r15.A04     // Catch:{ all -> 0x12ca }
            X.4bN r5 = r15.A01     // Catch:{ all -> 0x12ca }
            java.util.Set r11 = r15.A05     // Catch:{ all -> 0x12ca }
            X.4K0 r6 = r15.A01     // Catch:{ all -> 0x12ca }
            X.1Jc r7 = X.C62183Bz.A04(r4)     // Catch:{ all -> 0x12ca }
            java.lang.String r8 = r15.A02     // Catch:{ all -> 0x12ca }
            X.4YH r3 = r15.A00     // Catch:{ all -> 0x12ca }
            X.0q4 r2 = new X.0q4     // Catch:{ all -> 0x12ca }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.1e8 r0 = (X.C31411e8) r0     // Catch:{ all -> 0x12ca }
            X.1e9 r1 = r0.A00     // Catch:{ all -> 0x12ca }
            X.0q3 r0 = X.C14950q3.A01     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = X.C14980q6.A00(r2, r0, r1)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0f74:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.util.List r6 = X.C13690nt.A0l(r0, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r5 = X.C47842Kv.A00(r0, r5)     // Catch:{ all -> 0x12ca }
            X.0pz r4 = A05(r15, r1, r4)     // Catch:{ all -> 0x12ca }
            X.4tn r1 = A07(r5)     // Catch:{ all -> 0x12ca }
            X.3fr r0 = new X.3fr     // Catch:{ all -> 0x12ca }
            r0.<init>(r6, r7, r5)     // Catch:{ all -> 0x12ca }
            r4.A05(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0f90:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            android.view.View r0 = r2.A0C(r0)     // Catch:{ all -> 0x12ca }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x12ca }
            float r0 = (float) r0     // Catch:{ all -> 0x12ca }
            java.lang.Number r1 = A0A(r1, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0fab:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r1 = r15.A00     // Catch:{ all -> 0x12ca }
            android.view.View r0 = r2.A0C(r1)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            android.view.View r0 = r2.A0C(r1)     // Catch:{ all -> 0x12ca }
            r0.clearFocus()     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x0fc2:
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            int r2 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x12ca }
            r0 = 29
            if (r1 < r0) goto L_0x0fe7
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.getSystemService(r11)     // Catch:{ all -> 0x12ca }
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x0fe7
            r0 = 4
            int r0 = r1.getRecommendedTimeoutMillis(r2, r0)     // Catch:{ all -> 0x12ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0fe7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x0fed:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = X.C47842Kv.A00(r0, r6)     // Catch:{ all -> 0x12ca }
            X.0pz r3 = A05(r15, r1, r7)     // Catch:{ all -> 0x12ca }
            X.4O3 r0 = r3.A02     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x100a
            X.1dg r1 = r0.A01     // Catch:{ all -> 0x12ca }
            X.4tp r0 = new X.4tp     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.AnonymousClass45Y.A00(r1, r0)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x100a
            goto L_0x12c1
        L_0x100a:
            X.1dg r1 = r3.A02()     // Catch:{ all -> 0x12ca }
            X.4tp r0 = new X.4tp     // Catch:{ all -> 0x12ca }
            r0.<init>(r4)     // Catch:{ all -> 0x12ca }
            X.1dg r1 = X.AnonymousClass45Y.A00(r1, r0)     // Catch:{ all -> 0x12ca }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x12ca }
            r2[r6] = r4     // Catch:{ all -> 0x12ca }
            X.4O3 r0 = r3.A02     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x1021
            r0 = 0
            goto L_0x1023
        L_0x1021:
            X.1dg r0 = r0.A01     // Catch:{ all -> 0x12ca }
        L_0x1023:
            r2[r7] = r0     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "Found node %s in unbound tree but not in bound tree %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "BloksCoreInterpreterExtensions"
            X.C29691b2.A00(r0, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x1032:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            X.4Oj r1 = X.C87884Za.A00(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x103e:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0B(r15, r1, r0, r7)     // Catch:{ all -> 0x12ca }
            X.38S r1 = (X.AnonymousClass38S) r1     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            android.text.Editable r0 = r1.A0E     // Catch:{ all -> 0x12ca }
            r0.clear()     // Catch:{ all -> 0x12ca }
            android.widget.EditText r0 = r1.A0K     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x12ca }
            r0.clear()     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x105a:
            java.lang.Object r1 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.4Oj r1 = (X.C85424Oj) r1     // Catch:{ all -> 0x12ca }
            X.0q1 r6 = r1.A02     // Catch:{ all -> 0x12ca }
            java.util.List r5 = r1.A04     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r1.A05     // Catch:{ all -> 0x12ca }
            java.util.Map r4 = X.AnonymousClass2Wa.A03(r0)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = r1.A06     // Catch:{ all -> 0x12ca }
            X.4CM r0 = r1.A01     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x1072
            java.lang.String r3 = r0.A00     // Catch:{ all -> 0x12ca }
        L_0x1072:
            r1 = 0
            X.4a5 r0 = new X.4a5     // Catch:{ all -> 0x12ca }
            r0.<init>(r5, r2, r1, r4)     // Catch:{ all -> 0x12ca }
            X.1az r1 = new X.1az     // Catch:{ all -> 0x12ca }
            r1.<init>(r0, r6, r3)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x107f:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.String r3 = X.C47842Kv.A00(r0, r7)     // Catch:{ all -> 0x12ca }
            X.0q7 r1 = A02(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            if (r2 == 0) goto L_0x10c7
            java.lang.String r0 = r2.A0I()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x10c7
            X.0pz r1 = X.C62183Bz.A03(r1)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = r2.A0I()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x10c5
            java.lang.String r2 = r2.A0I()     // Catch:{ all -> 0x12ca }
            X.1dg r1 = r1.A02()     // Catch:{ all -> 0x12ca }
            X.4tp r0 = new X.4tp     // Catch:{ all -> 0x12ca }
            r0.<init>(r2)     // Catch:{ all -> 0x12ca }
            X.1dg r0 = X.AnonymousClass45Y.A00(r1, r0)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x10c5
            java.util.List r1 = r0.A0L()     // Catch:{ all -> 0x12ca }
            X.4tp r0 = new X.4tp     // Catch:{ all -> 0x12ca }
            r0.<init>(r3)     // Catch:{ all -> 0x12ca }
            int r0 = X.C89524cN.A00(r0, r1)     // Catch:{ all -> 0x12ca }
        L_0x10bf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x10c5:
            r0 = -1
            goto L_0x10bf
        L_0x10c7:
            java.lang.String r1 = "index_of_child_without_id"
            java.lang.String r0 = "bk.action.bloks.IndexOfChild called on a container without an ID"
            X.C29691b2.A00(r1, r0)     // Catch:{ all -> 0x12ca }
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x10d5:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            X.1dg r2 = X.C13690nt.A0Q(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x12ca }
            X.0q7 r0 = A02(r15, r1, r5)     // Catch:{ all -> 0x12ca }
            java.lang.Object r5 = X.C62183Bz.A05(r0, r2)     // Catch:{ all -> 0x12ca }
            X.38S r5 = (X.AnonymousClass38S) r5     // Catch:{ all -> 0x12ca }
            if (r5 == 0) goto L_0x128b
            android.text.Editable r0 = r5.A0E     // Catch:{ all -> 0x12ca }
            android.text.SpannableStringBuilder r0 = X.C13690nt.A0F(r0)     // Catch:{ all -> 0x12ca }
            r5.A0E = r0     // Catch:{ all -> 0x12ca }
            android.widget.EditText r0 = r5.A0K     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            android.text.Editable r0 = r0.getText()     // Catch:{ all -> 0x12ca }
            int r2 = r0.length()     // Catch:{ all -> 0x12ca }
            android.widget.EditText r0 = r5.A0K     // Catch:{ all -> 0x12ca }
            int r0 = r0.getSelectionEnd()     // Catch:{ all -> 0x12ca }
            int r2 = r2 - r0
            android.widget.EditText r0 = r5.A0K     // Catch:{ all -> 0x12ca }
            int r0 = r0.getSelectionEnd()     // Catch:{ all -> 0x12ca }
            boolean r1 = X.AnonymousClass000.A1P(r0)
            android.widget.EditText r0 = r5.A0K     // Catch:{ all -> 0x12ca }
            r0.setText(r4)     // Catch:{ all -> 0x12ca }
            if (r1 != 0) goto L_0x128b
            int r0 = r4.length()     // Catch:{ all -> 0x12ca }
            int r1 = r4.length()     // Catch:{ all -> 0x12ca }
            if (r0 < r2) goto L_0x1124
            int r1 = r1 - r2
        L_0x1124:
            android.widget.EditText r0 = r5.A0K     // Catch:{ all -> 0x12ca }
            r0.setSelection(r1)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x112b:
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            X.4Oj r0 = (X.C85424Oj) r0     // Catch:{ all -> 0x12ca }
            X.2Wa r1 = A04(r15, r0, r7)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x1137:
            java.util.List r3 = r15.A03     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            int r1 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            if (r1 != 0) goto L_0x114f
            java.lang.Object r1 = A0D(r15, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x114f:
            if (r3 == 0) goto L_0x1169
            int r0 = r3.size()     // Catch:{ all -> 0x12ca }
            if (r1 > r0) goto L_0x1163
            X.40g r0 = X.C795440g.EXPANDED_VARIABLE     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = A0E(r0, r2, r3, r1)     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0D(r15, r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x1163:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r13)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x1169:
            java.lang.String r0 = "Keypath must be set on environment if trying to GetTemplateArg on a depth larger than 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x1171:
            X.0q7 r0 = r15.A00     // Catch:{ all -> 0x12ca }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r5 = r0.getSystemService(r11)     // Catch:{ all -> 0x12ca }
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5     // Catch:{ all -> 0x12ca }
            if (r5 == 0) goto L_0x128b
            boolean r0 = r5.isEnabled()     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            android.view.accessibility.AccessibilityEvent r4 = android.view.accessibility.AccessibilityEvent.obtain()     // Catch:{ all -> 0x12ca }
            r0 = 16384(0x4000, float:2.2959E-41)
            r4.setEventType(r0)     // Catch:{ all -> 0x12ca }
            java.util.List r2 = r4.getText()     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = X.C14950q3.A00(r1)     // Catch:{ all -> 0x12ca }
            r2.add(r0)     // Catch:{ all -> 0x12ca }
            r5.sendAccessibilityEvent(r4)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x119c:
            X.0q7 r8 = r15.A00     // Catch:{ all -> 0x12ca }
            if (r8 == 0) goto L_0x11e4
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r6 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r4 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x12ca }
            int r2 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            java.util.List r1 = r15.A03     // Catch:{ all -> 0x12ca }
            if (r2 != 0) goto L_0x11bf
            X.0pz r0 = X.C62183Bz.A03(r8)     // Catch:{ all -> 0x12ca }
            r0.A08(r6, r4)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x11bf:
            if (r1 == 0) goto L_0x11dc
            int r0 = r1.size()     // Catch:{ all -> 0x12ca }
            if (r2 > r0) goto L_0x11d6
            X.40g r0 = X.C795440g.INTERNAL_VARIABLE     // Catch:{ all -> 0x12ca }
            java.lang.String r1 = A0E(r0, r6, r1, r2)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = X.C62183Bz.A03(r8)     // Catch:{ all -> 0x12ca }
            r0.A08(r1, r4)     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x11d6:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r13)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x11dc:
            java.lang.String r0 = "Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x11e4:
            java.lang.String r0 = "Called WriteLocalState when not attached to a tree"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x11ec:
            java.util.List r2 = r15.A03     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x12ca }
            X.0q7 r1 = (X.C14990q7) r1     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r7)     // Catch:{ all -> 0x12ca }
            if (r2 == 0) goto L_0x1214
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x12ca }
            if (r0 != 0) goto L_0x1214
            int r0 = X.C13700nu.A00(r2, r7)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = X.AnonymousClass000.A0n(r2, r0)     // Catch:{ all -> 0x12ca }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x12ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x12ca }
        L_0x1214:
            X.0pz r2 = X.C62183Bz.A03(r1)     // Catch:{ all -> 0x12ca }
            X.4O3 r0 = r2.A02     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x1226
            X.1dg r0 = r0.A01     // Catch:{ all -> 0x12ca }
            X.1dg r1 = A08(r0, r3, r4)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x1226
            goto L_0x12c1
        L_0x1226:
            X.1dg r0 = r2.A02()     // Catch:{ all -> 0x12ca }
            X.1dg r1 = A08(r0, r3, r4)     // Catch:{ all -> 0x12ca }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x12ca }
            r2[r6] = r4     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x12ca }
            r2[r7] = r0     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "Found unexpanded node %s in unbound tree when looking for key path %s."
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = "BloksCoreInterpreterExtensions"
            X.C29691b2.A00(r0, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x1244:
            X.0q7 r1 = A02(r15, r1, r6)     // Catch:{ all -> 0x12ca }
            X.0pz r0 = X.C62183Bz.A03(r1)     // Catch:{ all -> 0x12ca }
            X.1dg r0 = r0.A05     // Catch:{ all -> 0x12ca }
            android.view.View r2 = r0.A0C(r1)     // Catch:{ all -> 0x12ca }
            java.lang.String r4 = "input_method"
            if (r2 == 0) goto L_0x126b
            android.content.Context r0 = r2.getContext()     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = r0.getSystemService(r4)     // Catch:{ all -> 0x12ca }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ all -> 0x12ca }
            android.os.IBinder r0 = r2.getWindowToken()     // Catch:{ all -> 0x12ca }
            r1.hideSoftInputFromWindow(r0, r6)     // Catch:{ all -> 0x12ca }
            r2.clearFocus()     // Catch:{ all -> 0x12ca }
            goto L_0x128b
        L_0x126b:
            android.content.Context r2 = r1.A00     // Catch:{ all -> 0x12ca }
            android.app.Activity r1 = A00(r2)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x12ca }
            if (r0 == 0) goto L_0x128b
            java.lang.Object r1 = r2.getSystemService(r4)     // Catch:{ all -> 0x12ca }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x128b
            android.os.IBinder r0 = r0.getWindowToken()     // Catch:{ all -> 0x12ca }
            r1.hideSoftInputFromWindow(r0, r6)     // Catch:{ all -> 0x12ca }
        L_0x128b:
            r1 = r3
            goto L_0x12c1
        L_0x128d:
            java.util.List r3 = r15.A03     // Catch:{ all -> 0x12ca }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x12ca }
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r6)     // Catch:{ all -> 0x12ca }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x12ca }
            int r1 = X.AnonymousClass000.A0D(r0)     // Catch:{ all -> 0x12ca }
            if (r1 == 0) goto L_0x12bb
            if (r3 == 0) goto L_0x12a2
            goto L_0x12a9
        L_0x12a2:
            java.lang.String r0 = "Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x12ca }
            goto L_0x12c9
        L_0x12a9:
            int r0 = r3.size()     // Catch:{ all -> 0x12ca }
            if (r1 > r0) goto L_0x12c5
            X.40g r0 = X.C795440g.INTERNAL_VARIABLE     // Catch:{ all -> 0x12ca }
            java.lang.String r0 = A0E(r0, r2, r3, r1)     // Catch:{ all -> 0x12ca }
            java.lang.Object r1 = A0C(r15, r0)     // Catch:{ all -> 0x12ca }
            if (r1 != 0) goto L_0x12c1
        L_0x12bb:
            java.lang.Object r1 = A0C(r15, r2)     // Catch:{ all -> 0x12ca }
            goto L_0x12c1
        L_0x12c0:
            r1 = 0
        L_0x12c1:
            X.C89644cb.A00()
            return r1
        L_0x12c5:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r13)     // Catch:{ all -> 0x12ca }
        L_0x12c9:
            throw r0     // Catch:{ all -> 0x12ca }
        L_0x12ca:
            r0 = move-exception
            X.C89644cb.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62563Eb.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
