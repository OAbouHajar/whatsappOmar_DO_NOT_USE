package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1P3  reason: invalid class name */
public abstract class AnonymousClass1P3 {
    public final C14710pd A00;
    public final AnonymousClass175 A01;
    public final C18090w8 A02;

    public AnonymousClass1P3(C14710pd r1, AnonymousClass175 r2, C18090w8 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String A00() {
        C30681cm A012;
        if (!(this instanceof AnonymousClass1P2) || (A012 = ((AnonymousClass1P2) this).A02.A01()) == null) {
            return null;
        }
        return ((C35491m1) A012.A02).A05;
    }

    public void A01() {
        C15860rz r3;
        long currentTimeMillis;
        String str;
        if (this instanceof AnonymousClass1P2) {
            r3 = ((AnonymousClass1P2) this).A01;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_onboarding_banner_start_cool_off_timestamp";
        } else {
            r3 = ((AnonymousClass1P4) this).A01;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_incentive_banner_start_cool_off_timestamp";
        }
        r3.A14(str, currentTimeMillis);
    }

    public void A02() {
        boolean z2;
        SharedPreferences.Editor A0K;
        String str;
        if (this instanceof AnonymousClass1P2) {
            z2 = true;
            A0K = ((AnonymousClass1P2) this).A01.A0K();
            str = "payments_onboarding_chat_banner_dismmissed";
        } else {
            z2 = true;
            A0K = ((AnonymousClass1P4) this).A01.A0K();
            str = "payments_incentive_banner_dismissed";
        }
        A0K.putBoolean(str, z2).apply();
    }

    public void A03(Context context) {
        String str;
        if (this instanceof AnonymousClass1P2) {
            AnonymousClass1P2 r3 = (AnonymousClass1P2) this;
            Intent AEx = r3.A03.A03().AEx(context, "in_app_banner", true);
            if (AEx == null) {
                str = "Pay : PaymentsOnboardingBannerManager/showPaymentsOnboardingScreen intent is null";
            } else {
                context.startActivity(AEx);
                r3.A02();
                return;
            }
        } else {
            AnonymousClass1P4 r4 = (AnonymousClass1P4) this;
            C18290wS r1 = r4.A02;
            Intent ACk = r1.A03().ACk(context);
            if (ACk == null) {
                str = "Pay : PaymentsIncentiveBannerManager/getIncentivesOnboardingIntent intent is null";
            } else {
                context.startActivity(ACk);
                C42711yJ AEd = r1.A03().AEd();
                if (AEd != null) {
                    C14710pd r12 = AEd.A07;
                    C16620tM r5 = C16620tM.A02;
                    if (!r12.A0E(r5, 979)) {
                        C15860rz r32 = r4.A01;
                        int i2 = ((SharedPreferences) r32.A01.get()).getInt("payments_incentive_banner_clicked_count", 0) + 1;
                        r32.A0K().putInt("payments_incentive_banner_clicked_count", i2).apply();
                        int A03 = r4.A00.A03(r5, 2217);
                        if (A03 != 0 && i2 >= A03) {
                            r4.A02();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.e(str);
    }

    public boolean A04() {
        C42711yJ AEd;
        C53302fU A022;
        if (this instanceof AnonymousClass1P2) {
            AnonymousClass1P2 r6 = (AnonymousClass1P2) this;
            C14710pd r2 = r6.A00;
            C16620tM r1 = C16620tM.A02;
            AnonymousClass1P2.A04 = r2.A03(r1, 486);
            if (!r2.A0E(r1, 484)) {
                return false;
            }
            C15860rz r3 = r6.A01;
            AnonymousClass01D r22 = r3.A01;
            if (((SharedPreferences) r22.get()).getBoolean("payments_onboarding_banner_registration_started", false) || !r6.A02.A09()) {
                return false;
            }
            AnonymousClass175 r12 = r6.A01;
            if (r12.A0C() || r12.A0G("tos_no_wallet")) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long A0J = r3.A0J("payments_onboarding_banner_start_cool_off_timestamp");
            if ((A0J != -1 && currentTimeMillis <= A0J + 604800000) || ((SharedPreferences) r22.get()).getBoolean("payments_onboarding_chat_banner_dismmissed", false)) {
                return false;
            }
            if (r3.A0J("payments_onboarding_banner_start_timestamp") == -1) {
                r3.A14("payments_onboarding_banner_start_timestamp", System.currentTimeMillis());
                r3.A14("payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
                r3.A0K().putInt("payments_onboarding_banner_total_days", 0).apply();
            } else if (r3.A1n("payments_onboarding_banner_last_seen_timestamp", 86400000)) {
                int i2 = ((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0);
                int i3 = AnonymousClass1P2.A04;
                if (i2 >= i3) {
                    r3.A0K().putInt("payments_onboarding_banner_total_days", i3).apply();
                    r6.A02();
                } else {
                    r3.A0K().putInt("payments_onboarding_banner_total_days", ((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0) + 1).apply();
                }
                r3.A14("payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
            }
            return ((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0) < AnonymousClass1P2.A04;
        }
        AnonymousClass1P4 r62 = (AnonymousClass1P4) this;
        C18290wS r8 = r62.A02;
        C42711yJ AEd2 = r8.A03().AEd();
        if (!(AEd2 == null || !AEd2.A07.A0E(C16620tM.A02, 842) || (A022 = r62.A03.A02()) == null)) {
            long j2 = A022.A08.A01;
            C15860rz r7 = r62.A01;
            if (j2 != ((SharedPreferences) r7.A01.get()).getLong("payments_incentive_banner_offer_id", -1)) {
                r7.A14("payments_incentive_banner_start_timestamp", -1);
                r62.A05(0);
                r7.A0K().putInt("payments_incentive_banner_clicked_count", 0).apply();
                r7.A0K().putBoolean("payments_incentive_banner_dismissed", false).apply();
                r7.A0K().putLong("payments_incentive_banner_offer_id", j2).apply();
            }
        }
        C14710pd r5 = r62.A00;
        C16620tM r4 = C16620tM.A02;
        if (!r5.A0E(r4, 884) || !r62.A02.A09()) {
            return false;
        }
        C15860rz r23 = r62.A01;
        AnonymousClass01D r72 = r23.A01;
        if (((SharedPreferences) r72.get()).getBoolean("payments_incentive_banner_dismissed", false)) {
            return false;
        }
        long A03 = ((long) r5.A03(r4, 905)) * 60000;
        long currentTimeMillis2 = System.currentTimeMillis();
        long A0J2 = r23.A0J("payments_incentive_banner_start_cool_off_timestamp");
        if ((A0J2 != -1 && currentTimeMillis2 <= A0J2 + A03) || (AEd = r8.A03().AEd()) == null || !AEd.A07.A0E(r4, 842)) {
            return false;
        }
        C53322fW A002 = r62.A03.A00();
        C53302fU r0 = A002.A01;
        C53292fT r82 = A002.A02;
        boolean A0A = AEd.A0A(r0, r82);
        if (r0 == null || A0A) {
            r62.A04.Acl(new RunnableRunnableShape0S0110000_I0(r62, 22, A0A));
        }
        if (A002.A00(TimeUnit.MILLISECONDS.toSeconds(r62.A00.A00())) != 1) {
            return false;
        }
        if (r82 != null && (!r82.A04 || r82.A01 >= 1 || r82.A00 >= 1)) {
            return false;
        }
        if (r23.A0J("payments_incentive_banner_start_timestamp") == -1) {
            r23.A14("payments_incentive_banner_start_timestamp", System.currentTimeMillis());
            r23.A14("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
            r62.A05(0);
        } else if (r23.A1n("payments_incentive_banner_last_seen_timestamp", 86400000)) {
            int A032 = r5.A03(r4, 885);
            if (((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) >= A032) {
                r62.A05(A032);
                r62.A02();
            } else {
                r62.A05(((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) + 1);
            }
            r23.A14("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
        }
        return ((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) < r5.A03(r4, 885);
    }
}
