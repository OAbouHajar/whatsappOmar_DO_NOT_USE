package com.obwhatsapp.privacy.usernotice;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass02O;
import X.AnonymousClass0RM;
import X.AnonymousClass13G;
import X.AnonymousClass3GY;
import X.C007203h;
import X.C02890Gc;
import X.C08970eh;
import X.C16150sX;
import X.C17190ug;
import X.C19220xx;
import X.C28371Vv;
import X.C29981bY;
import X.C35081lL;
import X.C82924Er;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class UserNoticeStageUpdateWorker extends AnonymousClass02O {
    public final C17190ug A00;
    public final AnonymousClass13G A01;
    public final C19220xx A02;

    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (C17190ug) r1.AEu.get();
        this.A01 = (AnonymousClass13G) r1.APh.get();
        this.A02 = (C19220xx) r1.APi.get();
    }

    public C29981bY A02() {
        Object obj;
        C82924Er r1 = new C82924Er(this);
        AnonymousClass0RM r7 = new AnonymousClass0RM();
        C08970eh r6 = new C08970eh(r7);
        r7.A00 = r6;
        r7.A02 = r1.getClass();
        try {
            UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = r1.A00;
            C007203h r2 = userNoticeStageUpdateWorker.A01.A01;
            int A022 = r2.A02("notice_id", -1);
            int A023 = r2.A02("stage", -1);
            int A024 = r2.A02("version", -1);
            if (A022 == -1 || A023 == -1 || A024 == -1) {
                obj = new C02890Gc();
            } else {
                StringBuilder sb = new StringBuilder("UserNoticeStageUpdateWorker/startWork/noticeId: ");
                sb.append(A022);
                sb.append(" stage: ");
                sb.append(A023);
                Log.i(sb.toString());
                C17190ug r4 = userNoticeStageUpdateWorker.A00;
                String A025 = r4.A02();
                int i2 = A022;
                UserNoticeStageUpdateWorker userNoticeStageUpdateWorker2 = userNoticeStageUpdateWorker;
                AnonymousClass0RM r12 = r7;
                C17190ug r13 = r4;
                r13.A0G(new AnonymousClass3GY(r12, userNoticeStageUpdateWorker2, i2, A024, A023), new C28371Vv(new C28371Vv("notice", new C35081lL[]{new C35081lL("id", Integer.toString(A022)), new C35081lL("stage", Integer.toString(A023))}), "iq", new C35081lL[]{new C35081lL("to", "s.whatsapp.net"), new C35081lL("type", "set"), new C35081lL("xmlns", "tos"), new C35081lL("id", A025)}), A025, 254, 32000);
                obj = "Send Stage Update";
            }
            r7.A02 = obj;
            return r6;
        } catch (Exception e2) {
            r6.A00(e2);
            return r6;
        }
    }
}
