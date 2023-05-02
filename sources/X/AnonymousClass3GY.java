package X;

import android.util.Pair;
import com.obwhatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.TreeMap;

/* renamed from: X.3GY  reason: invalid class name */
public class AnonymousClass3GY implements C19550yc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0RM A03;
    public final /* synthetic */ UserNoticeStageUpdateWorker A04;

    public AnonymousClass3GY(AnonymousClass0RM r1, UserNoticeStageUpdateWorker userNoticeStageUpdateWorker, int i2, int i3, int i4) {
        this.A04 = userNoticeStageUpdateWorker;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A03 = r1;
    }

    public void APb(String str) {
        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
        this.A03.A01(this.A04.A01.A00 > 4 ? new C02890Gc() : new AnonymousClass02P());
    }

    public void AQe(C28371Vv r4, String str) {
        Pair A012 = C34451kH.A01(r4);
        Log.e(AnonymousClass000.A0g("UserNoticeStageUpdateWorker/onError ", A012));
        if (A012 != null && AnonymousClass000.A0D(A012.first) == 400) {
            this.A04.A01.A02(C13680ns.A0Y());
        }
        this.A03.A01(this.A04.A01.A00 > 4 ? new C02890Gc() : new AnonymousClass02P());
    }

    public void AYG(C28371Vv r10, String str) {
        Log.i("UserNoticeStageUpdateWorker/success");
        C28371Vv A0J = r10.A0J("notice");
        if (A0J != null) {
            C19220xx r2 = this.A04.A02;
            int i2 = this.A00;
            int i3 = this.A02;
            Log.i(C13680ns.A0c(i2, "UserNoticeManager/handleStaleClientStage/notice id: "));
            r2.A05.A03(new C46352Dw(i2, C28371Vv.A00(A0J, "stage"), i3, 1000 * A0J.A0E(A0J.A0M("t"), "t")));
        }
        if (this.A01 == 5) {
            C19220xx r3 = this.A04.A02;
            int i4 = this.A00;
            Log.i(C13680ns.A0c(i4, "UserNoticeManager/handleCleanup/notice id: "));
            Log.i(C13680ns.A0c(i4, "UserNoticeManager/deleteUserNotice/notice id: "));
            r3.A04.A04(i4);
            AnonymousClass13F r22 = r3.A05;
            TreeMap treeMap = r22.A02;
            treeMap.remove(Integer.valueOf(i4));
            C46352Dw A012 = r22.A01();
            if (A012 != null && A012.A01 == i4) {
                C13690nt.A0v(r22.A00().edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp"), "current_user_notice_banner_dismiss_timestamp");
            }
            r22.A04(C13680ns.A0n(treeMap.values()));
            r3.A05();
        }
        this.A03.A01(AnonymousClass02Q.A00());
    }
}
