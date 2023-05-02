package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
public class C19220xx {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C17120uZ A02;
    public final C14710pd A03;
    public final AnonymousClass13I A04;
    public final AnonymousClass13F A05;
    public final AnonymousClass13L A06;
    public final AnonymousClass13H A07;
    public final C15960sC A08;
    public final AnonymousClass12P A09;

    public C19220xx(C16300so r1, C16440t3 r2, C17120uZ r3, C14710pd r4, AnonymousClass13I r5, AnonymousClass13F r6, AnonymousClass13L r7, AnonymousClass13H r8, C15960sC r9, AnonymousClass12P r10) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A09 = r10;
        this.A06 = r7;
        this.A08 = r9;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A02 = r3;
    }

    public static C46312Dn A00(C34171jo r2, int i2) {
        C46322Dr r0;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 != 2) {
                if (i2 == 3) {
                    r0 = r2.A04;
                } else if (i2 == 4) {
                    r0 = r2.A03;
                } else if (i2 != 5) {
                    StringBuilder sb = new StringBuilder("Unexpected value: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                AnonymousClass2Dp r02 = r2.A02;
                if (r02 != null) {
                    return r02.A00;
                }
            }
        }
        return null;
    }

    public AnonymousClass2Dp A01() {
        String str;
        AnonymousClass13F r8 = this.A05;
        C46352Dw A012 = r8.A01();
        if (A012 != null && A012.A00 == 2) {
            int i2 = A012.A01;
            C14710pd r4 = this.A03;
            if (AnonymousClass2E5.A00(r4, i2)) {
                StringBuilder sb = new StringBuilder("UserNoticeManager/getBanner/green alert disabled, notice: ");
                sb.append(i2);
                str = sb.toString();
            } else {
                C34171jo A032 = this.A04.A03(A012);
                if (A032 != null) {
                    AnonymousClass2Dp r3 = A032.A02;
                    if (r3 == null) {
                        Log.e("UserNoticeManager/getBanner/no content for stage 2");
                        this.A00.AcB("UserNoticeManager/getBanner/noContent", (String) null, true);
                        return null;
                    }
                    if (AnonymousClass2E5.A01(r4, A012)) {
                        if (this.A01.A00() < r8.A00().getLong("current_user_notice_banner_dismiss_timestamp", 0) + 86400000) {
                            str = "UserNoticeManager/getBanner/dismissed banner not shown as per timing";
                        } else {
                            Log.i("UserNoticeManager/getBanner/eligible to show dismissible banner");
                            r8.A00().edit().putLong("current_user_notice_banner_dismiss_timestamp", 0).apply();
                        }
                    }
                    C46312Dn r1 = r3.A00;
                    if (!A0A(r1)) {
                        str = "UserNoticeManager/getBanner/banner not shown as per timing";
                    } else {
                        A08(r1, AnonymousClass2E5.A01(r4, A012));
                        Log.i("UserNoticeManager/getBanner/banner shown");
                        return r3;
                    }
                }
            }
            Log.i(str);
        }
        return null;
    }

    public void A02() {
        C46352Dw A012 = this.A05.A01();
        if (A012 == null) {
            Log.e("UserNoticeManager/agreeUserNotice/no current notice to agree");
            this.A00.AcB("UserNoticeManager/agreeUserNotice/noContent", (String) null, true);
            return;
        }
        Log.i("UserNoticeManager/agreeUserNotice");
        A09(A012, 5);
    }

    public void A03() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        AnonymousClass13I r4 = this.A04;
        Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
        File A022 = AnonymousClass13I.A02(r4.A02.A00.getFilesDir(), "user_notice");
        if (A022 != null) {
            r4.A08.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) A022, 20));
        }
        r4.A00 = null;
        AnonymousClass13F r2 = this.A05;
        r2.A00().edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").remove("user_notices").apply();
        r2.A02.clear();
    }

    public void A04() {
        StringBuilder sb = new StringBuilder("UserNoticeManager/updateUserNoticeStage/expected current stage: ");
        sb.append(2);
        Log.i(sb.toString());
        C46352Dw A012 = this.A05.A01();
        AnonymousClass00B.A06(A012);
        int i2 = A012.A00;
        if (2 < i2) {
            StringBuilder sb2 = new StringBuilder("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: ");
            sb2.append(i2);
            Log.i(sb2.toString());
            return;
        }
        C34171jo A032 = this.A04.A03(A012);
        AnonymousClass00B.A06(A032);
        int i3 = 3;
        if (A032.A04 == null) {
            i3 = 4;
            if (A032.A03 == null) {
                i3 = 5;
            }
        }
        A09(A012, i3);
    }

    public final void A05() {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        ((AnonymousClass022) this.A09.get()).A09("tag.whatsapp.usernotice.getStage()update");
        AnonymousClass13I r1 = this.A04;
        Log.i("UserNoticeContentManager/cancelWork");
        AnonymousClass12P r2 = r1.A09;
        ((AnonymousClass022) r2.get()).A09("tag.whatsapp.usernotice.content.fetch");
        ((AnonymousClass022) r2.get()).A09("tag.whatsapp.usernotice.icon.fetch");
        ((AnonymousClass022) this.A06.A04.A04.get()).A09("tag.whatsapp.usernotice.cms.content.fetch");
    }

    public final void A06(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("UserNoticeManager/enqueueStageUpdateWork/notice id: ");
        sb.append(i2);
        sb.append(" stage: ");
        sb.append(i3);
        sb.append(" version: ");
        sb.append(i4);
        Log.i(sb.toString());
        C007103g r1 = new C007103g();
        r1.A01("notice_id", i2);
        r1.A01("stage", i3);
        r1.A01("version", i4);
        C007203h A002 = r1.A00();
        AnonymousClass040 r12 = new AnonymousClass040();
        r12.A01(AnonymousClass041.CONNECTED);
        AnonymousClass042 A003 = r12.A00();
        C006903e r4 = new C006903e(UserNoticeStageUpdateWorker.class);
        r4.A03.add("tag.whatsapp.usernotice.getStage()update");
        r4.A00.A0A = A003;
        r4.A03(AnonymousClass04P.EXPONENTIAL, TimeUnit.HOURS, 1);
        r4.A00.A0B = A002;
        StringBuilder sb2 = new StringBuilder("tag.whatsapp.usernotice.getStage()update.");
        sb2.append(i2);
        sb2.append(".");
        sb2.append(i3);
        String obj = sb2.toString();
        ((AnonymousClass022) this.A09.get()).A06(AnonymousClass03z.REPLACE, (AnonymousClass043) r4.A00(), obj);
    }

    public final void A07(C34171jo r11, C46352Dw r12) {
        String str;
        String str2;
        int i2;
        AnonymousClass2Dy r0;
        AnonymousClass2Dy r02;
        AnonymousClass2Dy r03;
        int i3 = r12.A00;
        StringBuilder sb = new StringBuilder("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        sb.append(r12.A01);
        sb.append(" currentStage: ");
        sb.append(i3);
        Log.i(sb.toString());
        if (i3 == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            A09(r12, 1);
            return;
        }
        if (i3 == 5) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed";
        } else if (r11 == null) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/no content";
        } else {
            long A002 = this.A01.A00();
            ArrayList arrayList = new ArrayList();
            C46312Dn A003 = A00(r11, i3);
            if (!(A003 == null || (r03 = A003.A01) == null)) {
                arrayList.add(new AnonymousClass2E9(i3, r03.A00, 1));
            }
            int i4 = 2;
            if (i3 >= 2 || r11.A02 == null) {
                i4 = 3;
                if (i3 >= 3 || r11.A04 == null) {
                    i4 = 4;
                    if (i3 >= 4 || r11.A03 == null) {
                        i4 = 5;
                    }
                }
            }
            int i5 = i4;
            while (i4 < 5) {
                C46312Dn A004 = A00(r11, i4);
                if (!(A004 == null || (r02 = A004.A02) == null)) {
                    arrayList.add(new AnonymousClass2E9(i4, r02.A00, 0));
                }
                C46312Dn A005 = A00(r11, i4);
                if (!(A005 == null || (r0 = A005.A01) == null)) {
                    arrayList.add(new AnonymousClass2E9(i4, r0.A00, 1));
                }
                i4++;
            }
            Iterator it = arrayList.iterator();
            AnonymousClass2E9 r5 = null;
            while (it.hasNext()) {
                AnonymousClass2E9 r6 = (AnonymousClass2E9) it.next();
                if (r6.A02 > A002) {
                    break;
                }
                r5 = r6;
            }
            if (r5 != null) {
                if (r5.A01 == 0) {
                    StringBuilder sb2 = new StringBuilder("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing: ");
                    sb2.append(r5.A02);
                    sb2.append(" of stage:");
                    i2 = r5.A00;
                    sb2.append(i2);
                    Log.i(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing: ");
                    sb3.append(r5.A02);
                    sb3.append(" of stage: ");
                    int i6 = r5.A00;
                    sb3.append(i6);
                    Log.i(sb3.toString());
                    if (i6 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                        if (i6 >= 2 || r11.A02 == null) {
                            i2 = 3;
                            if (i6 >= 3 || r11.A04 == null) {
                                i2 = 4;
                                if (i6 >= 4 || r11.A03 == null) {
                                    i2 = 5;
                                }
                            }
                        }
                    }
                }
                A09(r12, i2);
                str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/handleEligibleFutureStartEndTiming";
            } else {
                C46312Dn A006 = A00(r11, i3);
                StringBuilder sb4 = new StringBuilder("UserNoticeManager/transitionUserNoticeStageIfNecessary/currentStage = ");
                sb4.append(i3);
                sb4.append("  next stage: ");
                sb4.append(i5);
                Log.i(sb4.toString());
                C46312Dn A007 = A00(r11, i5);
                if (A007 != null && A007.A02 != null) {
                    str2 = "UserNoticeManager/handleNextStageStartTime/next stage start time exists";
                } else if (A006 == null) {
                    return;
                } else {
                    if (A006.A01 != null) {
                        str2 = "UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists";
                    } else {
                        AnonymousClass2Dx r3 = A006.A00;
                        if (r3 != null) {
                            Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                            long j2 = r3.A00;
                            if (j2 != -1) {
                                long j3 = r12.A03;
                                Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                                if (A002 >= j3 + j2) {
                                    str = "UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired";
                                } else {
                                    return;
                                }
                            } else {
                                long[] jArr = r3.A01;
                                if (jArr != null) {
                                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                                    if (this.A05.A00().getInt("current_user_notice_duration_repeat_index", 0) > jArr.length) {
                                        str = "UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete";
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            Log.i(str);
                            A09(r12, i5);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str2);
    }

    public final void A08(C46312Dn r6, boolean z2) {
        AnonymousClass2Dx r0 = r6.A00;
        if (r0 == null || r0.A01 == null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
        int i2 = 1;
        if (!z2) {
            i2 = 1 + this.A05.A00().getInt("current_user_notice_duration_repeat_index", 0);
        }
        AnonymousClass13F r4 = this.A05;
        r4.A00().edit().putInt("current_user_notice_duration_repeat_index", i2).apply();
        r4.A00().edit().putLong("current_user_notice_duration_repeat_timestamp", this.A01.A00()).apply();
    }

    public final void A09(C46352Dw r8, int i2) {
        int i3 = r8.A01;
        StringBuilder sb = new StringBuilder("UserNoticeManager/updateUserNoticeStage/updating to new stage: ");
        sb.append(i2);
        sb.append(" noticeId: ");
        sb.append(i3);
        Log.i(sb.toString());
        long A002 = this.A01.A00();
        int i4 = r8.A02;
        C46352Dw r1 = new C46352Dw(i3, i2, i4, A002);
        AnonymousClass13F r0 = this.A05;
        r0.A03(r1);
        r0.A00().edit().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_duration_static_timestamp_start").apply();
        A06(i3, i2, i4);
    }

    public final boolean A0A(C46312Dn r12) {
        String obj;
        AnonymousClass2Dx r5 = r12.A00;
        boolean z2 = true;
        if (r5 == null) {
            obj = "UserNoticeManager/shouldShowStage/no duration";
        } else {
            long A002 = this.A01.A00();
            long j2 = r5.A00;
            if (j2 != -1) {
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/has static duration");
                AnonymousClass13F r10 = this.A05;
                long j3 = r10.A00().getLong("current_user_notice_duration_static_timestamp_start", 0);
                if (j3 == 0) {
                    StringBuilder sb = new StringBuilder("UserNoticeManager/shouldShowStageForStaticDuration/static duration start: ");
                    sb.append(A002);
                    Log.i(sb.toString());
                    r10.A00().edit().putLong("current_user_notice_duration_static_timestamp_start", A002).apply();
                    j3 = A002;
                }
                if (A002 >= j3 + j2) {
                    Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration expired");
                    return false;
                }
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration valid");
                return true;
            }
            long[] jArr = r5.A01;
            if (jArr == null) {
                obj = "UserNoticeManager/shouldShowStage/no repeat duration";
            } else {
                AnonymousClass13F r52 = this.A05;
                int i2 = r52.A00().getInt("current_user_notice_duration_repeat_index", 0);
                if (i2 == 0) {
                    obj = "UserNoticeManager/shouldShowStage/allow first repeat";
                } else if (i2 > jArr.length) {
                    Log.i("UserNoticeManager/shouldShowStage/no more repeats");
                    return false;
                } else {
                    if (A002 - r52.A00().getLong("current_user_notice_duration_repeat_timestamp", 0) < jArr[i2 - 1]) {
                        z2 = false;
                    }
                    StringBuilder sb2 = new StringBuilder("UserNoticeManager/shouldShowStage/repeatTimeElapse: ");
                    sb2.append(z2);
                    obj = sb2.toString();
                }
            }
        }
        Log.i(obj);
        return z2;
    }
}
