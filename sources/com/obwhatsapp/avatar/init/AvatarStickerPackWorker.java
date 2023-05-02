package com.obwhatsapp.avatar.init;

import X.AnonymousClass000;
import X.AnonymousClass01F;
import X.AnonymousClass02P;
import X.AnonymousClass02Q;
import X.AnonymousClass2Xe;
import X.AnonymousClass3Hp;
import X.AnonymousClass5F7;
import X.C02890Gc;
import X.C13700nu;
import X.C16150sX;
import X.C18450wi;
import X.C27101Ql;
import X.C34421kE;
import X.C41201vP;
import X.C41211vQ;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class AvatarStickerPackWorker extends Worker {
    public final AnonymousClass01F A00;
    public final C27101Ql A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0J(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        C18450wi.A0B(applicationContext);
        AnonymousClass01F A0A = C13700nu.A0A(applicationContext);
        this.A00 = A0A;
        this.A01 = (C27101Ql) ((C16150sX) A0A).A1K.get();
    }

    public AnonymousClass02Q A04() {
        Object obj;
        C34421kE r1 = new C34421kE();
        C27101Ql r3 = this.A01;
        AnonymousClass5F7 r5 = new AnonymousClass5F7(r1);
        r3.A0F.set(false);
        r3.A0E.Acl(new AnonymousClass3Hp(r3, "retry", r5, false, false));
        try {
            obj = (Boolean) r1.get();
        } catch (Throwable th) {
            obj = new C41211vQ(th);
        }
        Throwable A002 = C41201vP.A00(obj);
        if (A002 != null) {
            Log.e(A002);
        }
        if (obj instanceof C41211vQ) {
            obj = null;
        }
        if (obj == null ? true : obj.equals(Boolean.FALSE)) {
            int i2 = this.A01.A00;
            if (i2 > 10) {
                StringBuilder A0r = AnonymousClass000.A0r("AvatarStickerPackWorker/too many attempts (");
                A0r.append(i2);
                Log.w(AnonymousClass000.A0h("), marking as failed", A0r));
                return new C02890Gc();
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("AvatarStickerPackWorker/sticker download failed, scheduling retry (");
            A0r2.append(i2);
            A0r2.append(')');
            Log.w(A0r2.toString());
            return new AnonymousClass02P();
        } else if (C18450wi.A0R(obj, Boolean.TRUE)) {
            return AnonymousClass02Q.A00();
        } else {
            throw new AnonymousClass2Xe();
        }
    }
}
