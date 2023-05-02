package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0600000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1Bm  reason: invalid class name and case insensitive filesystem */
public abstract class C23311Bm {
    public void A00() {
        SharedPreferences.Editor putBoolean;
        String str;
        C16320sq r2;
        int i2;
        if (this instanceof C24411Fv) {
            C24411Fv r3 = (C24411Fv) this;
            if (!r3.A01 && C34311k3.A01(r3.A03)) {
                r2 = r3.A04;
                i2 = 15;
            } else if (!r3.A00 && C34311k3.A00(r3.A03)) {
                r2 = r3.A04;
                i2 = 16;
            } else {
                return;
            }
            r2.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) r3, i2));
        } else if (this instanceof C23341Bp) {
            C23341Bp r0 = (C23341Bp) this;
            r0.A01.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r0.A00, 31));
        } else if (this instanceof C27941Ts) {
            C27941Ts r5 = (C27941Ts) this;
            Runnable runnable = r5.A00;
            if (runnable != null) {
                r5.A04.Ac3(runnable);
            }
            r5.A00 = r5.A04.Ad4(r5.A08, "AbPropsTamperManager/ap-props-hash-update", 500);
        } else if (this instanceof C24421Fw) {
            C24421Fw r22 = (C24421Fw) this;
            if (!r22.A00 && C34321k4.A04(r22.A05)) {
                C16320sq r32 = r22.A09;
                r32.Acl(new RunnableRunnableShape9S0100000_I0_8(r22, 4));
                C16440t3 r7 = r22.A02;
                C16490t9 r9 = r22.A06;
                C222617g r6 = r22.A08;
                C16460t6 r8 = r22.A04;
                C18040w3 r10 = r22.A07;
                C15860rz r02 = r22.A03;
                C15800rs r52 = r22.A01;
                if (!((SharedPreferences) r02.A01.get()).getBoolean("ephemeral_kic_nux", false)) {
                    r32.Acl(new RunnableRunnableShape0S0600000_I0(r52, r6, r7, r8, r9, r10, 3));
                }
            }
        } else if (this instanceof C34301k2) {
            C34301k2 r4 = (C34301k2) this;
            C222317d r33 = r4.A01;
            if (!r33.A02.A0E(C16620tM.A02, 736) && r4.A00) {
                AnonymousClass139 r34 = r33.A01;
                synchronized ("syncd_bootstrapped_mutations") {
                    Set A02 = r34.A02();
                    A02.remove("setting_unarchiveChats");
                    r34.A01().edit().putStringSet("syncd_bootstrapped_mutations", A02).apply();
                }
            }
        } else if (this instanceof C24401Fu) {
            C24401Fu r35 = (C24401Fu) this;
            if (!r35.A00) {
                C14710pd r23 = r35.A02;
                C16620tM r1 = C16620tM.A02;
                if (r23.A0E(r1, 2190) || r23.A0E(r1, 2189)) {
                    r35.A03.Acl(new RunnableRunnableShape7S0100000_I0_6(r35, 28));
                }
            }
        } else if (this instanceof C24441Fy) {
            C24441Fy r36 = (C24441Fy) this;
            if (r36.A00.A0G() && r36.A02.A0E(C16620tM.A02, 1761)) {
                Log.i("CompanionModeABPropsObserver/onAfterABPropsChanged/deregister");
                r36.A03.Aco(new RunnableRunnableShape6S0100000_I0_5(r36, 34));
            }
        } else if (this instanceof C23331Bo) {
            C23331Bo r37 = (C23331Bo) this;
            if (!r37.A02 && r37.A05.A03(C16620tM.A02, 1829) >= 3) {
                r37.A07.Acm(new RunnableRunnableShape6S0100000_I0_5(r37, 24), "recent_sticker_abprop_enabled");
            }
            if (!r37.A01 && r37.A05.A0E(C16620tM.A02, 1967)) {
                r37.A07.Acm(new RunnableRunnableShape6S0100000_I0_5(r37, 23), "note_to_self_enabled");
            }
            if (!r37.A00 && r37.A05.A0E(C16620tM.A02, 2775)) {
                r37.A07.Acm(new RunnableRunnableShape6S0100000_I0_5(r37, 25), "favorite_sticker_sync_enabled");
            }
            C18930xU r38 = r37.A03;
            r38.A0n.Acl(new RunnableRunnableShape6S0100000_I0_5(r38, 28));
        } else if (this instanceof AnonymousClass1G0) {
            AnonymousClass1G0 r39 = (AnonymousClass1G0) this;
            int A03 = r39.A01.A03(C16620tM.A02, 2304);
            if (A03 > r39.A00) {
                C17240ul r03 = r39.A02;
                r03.A10.Acl(r03.A04);
                r39.A00 = A03;
            }
        } else if (this instanceof C24451Fz) {
            C24451Fz r42 = (C24451Fz) this;
            int A032 = r42.A02.A03(C16620tM.A02, 2507);
            if (A032 > r42.A00) {
                int A00 = r42.A01.A00();
                if (A00 < 2 || A00 > 7) {
                    C17240ul r24 = r42.A03;
                    r24.A10.Acl(new RunnableRunnableShape9S0100000_I0_8(r24, 28));
                    r42.A00 = A032;
                }
            }
        } else if (this instanceof C24431Fx) {
            C24431Fx r92 = (C24431Fx) this;
            Log.i("CommunityAbPropsObserver/onAfterABPropsChanged");
            long A033 = (long) r92.A03.A03(C16620tM.A02, 1228);
            if (r92.A00 == -1 || A033 != -1) {
                C15860rz r82 = r92.A01;
                if (!((SharedPreferences) r82.A01.get()).getBoolean("groups_type_discovered", false)) {
                    long j2 = A033 * 1000;
                    long A0J = r82.A0J("client_version_upgrade_timestamp");
                    if (j2 == 0 || A0J < j2) {
                        putBoolean = r82.A0K().putBoolean("groups_type_discovered", true);
                        putBoolean.apply();
                    }
                    str = "CommunityAbPropsObserver/fetch needed";
                } else {
                    return;
                }
            } else {
                str = "CommunityAbPropsObserver/force fetch";
            }
            Log.i(str);
            C17240ul r12 = r92.A04;
            if (r12.A14 || !r92.A02.A00) {
                Log.i("CommunityAbPropsObserver/onAfterABPropsChanged/skip");
                return;
            }
            r12.A0E(0, false, false);
            putBoolean = r92.A01.A0K().putBoolean("groups_type_discovered", true);
            putBoolean.apply();
        } else {
            C23301Bl r310 = (C23301Bl) this;
            r310.A06.Acl(new RunnableRunnableShape3S0100000_I0_2(r310, 41));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r2.A0E(r1, 2189) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C24411Fv
            if (r0 == 0) goto L_0x0016
            r2 = r6
            X.1Fv r2 = (X.C24411Fv) r2
            X.0pd r1 = r2.A03
            boolean r0 = X.C34311k3.A01(r1)
            r2.A01 = r0
            boolean r0 = X.C34311k3.A00(r1)
            r2.A00 = r0
        L_0x0015:
            return
        L_0x0016:
            boolean r0 = r6 instanceof X.C24421Fw
            if (r0 == 0) goto L_0x0026
            r1 = r6
            X.1Fw r1 = (X.C24421Fw) r1
            X.0pd r0 = r1.A05
            boolean r0 = X.C34321k4.A04(r0)
            r1.A00 = r0
            return
        L_0x0026:
            boolean r0 = r6 instanceof X.C34301k2
            if (r0 == 0) goto L_0x003c
            r3 = r6
            X.1k2 r3 = (X.C34301k2) r3
            X.17d r0 = r3.A01
            X.0pd r2 = r0.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3.A00 = r0
            return
        L_0x003c:
            boolean r0 = r6 instanceof X.C24401Fu
            if (r0 == 0) goto L_0x005c
            r3 = r6
            X.1Fu r3 = (X.C24401Fu) r3
            X.0pd r2 = r3.A02
            r0 = 2190(0x88e, float:3.069E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r2.A0E(r1, r0)
            if (r0 != 0) goto L_0x0058
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r1 = r2.A0E(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            r3.A00 = r0
            return
        L_0x005c:
            boolean r0 = r6 instanceof X.C23331Bo
            if (r0 == 0) goto L_0x0085
            r5 = r6
            X.1Bo r5 = (X.C23331Bo) r5
            X.0pd r4 = r5.A05
            r0 = 1829(0x725, float:2.563E-42)
            X.0tM r3 = X.C16620tM.A02
            int r2 = r4.A03(r3, r0)
            r1 = 3
            r0 = 0
            if (r2 < r1) goto L_0x0072
            r0 = 1
        L_0x0072:
            r5.A02 = r0
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r4.A0E(r3, r0)
            r5.A01 = r0
            r0 = 2775(0xad7, float:3.889E-42)
            boolean r0 = r4.A0E(r3, r0)
            r5.A00 = r0
            return
        L_0x0085:
            boolean r0 = r6 instanceof X.AnonymousClass1G0
            if (r0 == 0) goto L_0x0099
            r3 = r6
            X.1G0 r3 = (X.AnonymousClass1G0) r3
            X.0pd r2 = r3.A01
            r1 = 2304(0x900, float:3.229E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            r3.A00 = r0
            return
        L_0x0099:
            boolean r0 = r6 instanceof X.C24451Fz
            if (r0 == 0) goto L_0x00ad
            r3 = r6
            X.1Fz r3 = (X.C24451Fz) r3
            X.0pd r2 = r3.A02
            r1 = 2507(0x9cb, float:3.513E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            r3.A00 = r0
            return
        L_0x00ad:
            boolean r0 = r6 instanceof X.C24431Fx
            if (r0 == 0) goto L_0x00c1
            r3 = r6
            X.1Fx r3 = (X.C24431Fx) r3
            X.0pd r2 = r3.A03
            r1 = 1228(0x4cc, float:1.721E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            r3.A00 = r0
            return
        L_0x00c1:
            boolean r0 = r6 instanceof X.C23301Bl
            if (r0 == 0) goto L_0x0015
            r3 = r6
            X.1Bl r3 = (X.C23301Bl) r3
            X.0uc r0 = r3.A03
            boolean r0 = r0.A09()
            r3.A01 = r0
            X.0pd r2 = r3.A05
            r1 = 1846(0x736, float:2.587E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r0 = r2.A06(r0, r1)
            if (r0 == 0) goto L_0x0015
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23311Bm.A01():void");
    }
}
