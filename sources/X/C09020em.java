package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import com.facebook.redex.IDxUListenerShape8S0400000_I1;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0em  reason: invalid class name and case insensitive filesystem */
public class C09020em implements C25261Jc {
    public final C25261Jc A00;

    public C09020em(C25261Jc r1) {
        this.A00 = r1;
    }

    public static void A00(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) list.get(i2);
            j2 = Math.max(j2, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: A01 */
    public Object A8l(C14960q4 r19, C14950q3 r20, C99354tt r21) {
        String str;
        float f2;
        float f3;
        int i2;
        C99354tt r2 = r21;
        String str2 = r2.A00;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -914746283:
                if (str2.equals("bk.action.animated.Stagger")) {
                    c2 = 0;
                    break;
                }
                break;
            case -387628292:
                if (str2.equals("bk.action.animated.Loop")) {
                    c2 = 1;
                    break;
                }
                break;
            case -214348689:
                if (str2.equals("bk.action.animated.CreateColor")) {
                    c2 = 2;
                    break;
                }
                break;
            case 177085473:
                if (str2.equals("bk.action.animated.CancelWithToken")) {
                    c2 = 3;
                    break;
                }
                break;
            case 445536294:
                if (str2.equals("bk.action.animated.GetCurrentDimensionValue")) {
                    c2 = 4;
                    break;
                }
                break;
            case 511230409:
                if (str2.equals("bk.action.animated.GetCurrentColorValue")) {
                    c2 = 5;
                    break;
                }
                break;
            case 748692594:
                if (str2.equals("bk.action.animated.CreateDimension")) {
                    c2 = 6;
                    break;
                }
                break;
            case 880735442:
                if (str2.equals("bk.action.animated.Cancel")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1208990953:
                if (str2.equals("bk.action.animated.StartWithToken")) {
                    c2 = 8;
                    break;
                }
                break;
            case 1572781663:
                if (str2.equals("bk.action.animated.Parallel")) {
                    c2 = 9;
                    break;
                }
                break;
            case 1750927385:
                if (str2.equals("bk.action.animated.Sequence")) {
                    c2 = 10;
                    break;
                }
                break;
            case 2100418198:
                if (str2.equals("bk.action.animated.GetCurrentValue")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        C14960q4 r14 = r19;
        C14950q3 r3 = r20;
        switch (c2) {
            case 0:
                float A04 = AnonymousClass000.A04(r3.A02(0));
                List list = (List) r3.A01(1);
                long j2 = (long) (A04 * ((float) C06380Vm.A00));
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Animator) list.get(i3)).setStartDelay(((long) i3) * j2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                A00(animatorSet, list);
                return animatorSet;
            case 1:
                return new C020109j(AnonymousClass000.A0D(r3.A02(0)), (Animator) r3.A01(1));
            case 2:
                C31421e9 A002 = C31411e8.A00(r3.A02(0));
                C31421e9 A01 = C31411e8.A01(r3.A01(1));
                int parseColor = Color.parseColor((String) r3.A01(2));
                int parseColor2 = Color.parseColor((String) r3.A01(3));
                float A042 = AnonymousClass000.A04(r3.A02(4));
                C14990q7 A02 = C62563Eb.A02(r14, r3, 6);
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{parseColor, parseColor2});
                ofInt.setEvaluator(new ArgbEvaluator());
                ofInt.setDuration((long) (A042 * ((float) C06380Vm.A00)));
                ofInt.setInterpolator((TimeInterpolator) r3.A01(5));
                C14940q2 r0 = new C14940q2();
                r0.A03(ofInt, 0);
                ofInt.addUpdateListener(new IDxUListenerShape8S0400000_I1(this, r14, r0.A01(), A002, 0));
                C06380Vm.A00(ofInt, A02, r14, A01);
                return ofInt;
            case 3:
                C14990q7 r02 = r14.A00;
                AnonymousClass44n.A00(r02);
                Animator A003 = C62183Bz.A00(r02, (String) r3.A01(0));
                if (A003 != null) {
                    A003.cancel();
                }
                return null;
            case 4:
                C021509z r03 = (C021509z) r3.A01(0);
                Number number = (Number) r03.getAnimatedValue();
                float floatValue = number.floatValue();
                int i4 = r03.A00;
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                if (i4 == 0) {
                    objArr[0] = number;
                    str = "%.2f%%";
                } else {
                    AnonymousClass000.A1M(objArr, Math.round(floatValue), 0);
                    str = "%dpx";
                }
                return String.format(locale, str, objArr);
            case 5:
                Object animatedValue = ((ValueAnimator) r3.A01(0)).getAnimatedValue();
                return String.format(Locale.US, "#%08x", new Object[]{animatedValue});
            case 6:
                C31421e9 A004 = C31411e8.A00(r3.A02(0));
                C31421e9 A012 = C31411e8.A01(r3.A01(1));
                String str3 = (String) r3.A01(2);
                String str4 = (String) r3.A01(3);
                float A043 = AnonymousClass000.A04(r3.A02(4));
                TimeInterpolator timeInterpolator = (TimeInterpolator) r3.A01(5);
                C14990q7 A022 = C62563Eb.A02(r14, r3, 6);
                try {
                    if (str3.endsWith("%")) {
                        f2 = C62163Bx.A00(str3);
                        f3 = C62163Bx.A00(str4);
                        i2 = 0;
                    } else {
                        f2 = C62163Bx.A01(str3);
                        f3 = C62163Bx.A01(str4);
                        i2 = 1;
                    }
                    C021509z r32 = new C021509z(i2);
                    r32.setFloatValues(new float[]{f2, f3});
                    r32.setDuration((long) (A043 * ((float) C06380Vm.A00)));
                    r32.setInterpolator(timeInterpolator);
                    C14940q2 r04 = new C14940q2();
                    r04.A03(r32, 0);
                    r32.addUpdateListener(new IDxUListenerShape8S0400000_I1(this, r14, r04.A01(), A004, 1));
                    C06380Vm.A00(r32, A022, r14, A012);
                    return r32;
                } catch (AnonymousClass40K e2) {
                    throw AnonymousClass000.A0T(AnonymousClass000.A0g("Could not parse start and end values. ", e2));
                }
            case 7:
                ((Animator) r3.A01(0)).cancel();
                return null;
            case 8:
                C06380Vm.A01((Animator) r3.A01(0), r14, (String) r3.A01(1));
                return null;
            case 9:
                C31421e9 A013 = C31411e8.A01(r3.A01(0));
                float A044 = AnonymousClass000.A04(r3.A02(1));
                C14990q7 A023 = C62563Eb.A02(r14, r3, 3);
                AnimatorSet animatorSet2 = new AnimatorSet();
                A00(animatorSet2, (List) r3.A01(2));
                C06380Vm.A00(animatorSet2, A023, r14, A013);
                animatorSet2.setStartDelay((long) (A044 * ((float) C06380Vm.A00)));
                return animatorSet2;
            case 10:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially((List) r3.A01(0));
                return animatorSet3;
            case 11:
                return C89554cQ.A01(AnonymousClass000.A03((ValueAnimator) r3.A01(0)));
            default:
                return this.A00.A8l(r3, r2, r14);
        }
    }
}
