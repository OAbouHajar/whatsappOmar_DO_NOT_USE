package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass18X;
import X.AnonymousClass1HJ;
import X.AnonymousClass2Ba;
import X.AnonymousClass2SC;
import X.AnonymousClass3K3;
import X.AnonymousClass4J5;
import X.AnonymousClass4MF;
import X.AnonymousClass4QU;
import X.AnonymousClass5SX;
import X.C13680ns;
import X.C15860rz;
import X.C19550yc;
import X.C213513t;
import X.C228419m;
import X.C28371Vv;
import X.C29501aj;
import X.C29741b7;
import X.C34421kE;
import X.C34451kH;
import X.C48802Pe;
import X.C49092Qw;
import X.C802543d;
import com.obwhatsapp.jobqueue.job.GenerateTcTokenJob;
import com.obwhatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public class IDxRCallbackShape49S0200000_2_I0 implements C19550yc {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbackShape49S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void APb(String str) {
        switch (this.A02) {
            case 0:
                Log.e("Bloks : Reply node not found");
                ((AnonymousClass5SX) this.A01).APY();
                return;
            case 1:
                ((C34421kE) this.A01).A01(new C802543d(str));
                return;
            case 2:
                return;
            case 3:
                Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("ping/recv/ping_response/deliveryFailure id=")));
                return;
            case 4:
                ((C34421kE) this.A01).A01(AnonymousClass3K3.A0e("disconnected while waiting for response"));
                return;
            case 5:
                ((AnonymousClass2SC) this.A01).AQQ();
                return;
            case 6:
                Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("EncryptedBackupProtocolHelper/sendDeleteAccountIq/onDeliveryFailure id=")));
                ((C29741b7) this.A01).AQf(3, "delivery failure", -1);
                return;
            case 7:
                ((AnonymousClass2Ba) this.A00).APb(str);
                ((C19550yc) this.A01).APb(str);
                return;
            default:
                PrivacyNoticeDialogFragment.A03(((AnonymousClass4QU) this.A01).A00, 0);
                return;
        }
    }

    public void AQe(C28371Vv r5, String str) {
        switch (this.A02) {
            case 0:
                Log.e("Bloks : Reply node not found");
                ((C213513t) this.A00).A00.AcB("EncryptionProtocolHelper failed with a server error", (String) null, false);
                ((AnonymousClass5SX) this.A01).AQZ(new C48802Pe(r5, str));
                return;
            case 1:
                ((C34421kE) this.A01).A01(new C48802Pe(r5, str));
                return;
            case 2:
                ((AtomicInteger) this.A01).set(C34451kH.A00(r5));
                return;
            case 3:
                Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("ping/recv/ping_response/error id=")));
                AnonymousClass1HJ r3 = (AnonymousClass1HJ) this.A00;
                r3.A09.post(new RunnableRunnableShape11S0100000_I0_10((Object) r3, 11));
                return;
            case 4:
                ((C34421kE) this.A01).A02(r5);
                return;
            case 5:
                ((AnonymousClass2SC) this.A01).AQQ();
                return;
            case 6:
                AnonymousClass18X.A00(r5, (C29741b7) this.A01, str);
                return;
            case 7:
                ((AnonymousClass2Ba) this.A00).AQe(r5, str);
                ((C19550yc) this.A01).AQe(r5, str);
                return;
            default:
                PrivacyNoticeDialogFragment.A03(((AnonymousClass4QU) this.A01).A00, 1);
                return;
        }
    }

    public void AYG(C28371Vv r5, String str) {
        String A0L;
        switch (this.A02) {
            case 0:
                AnonymousClass4MF A002 = C213513t.A00(r5);
                C28371Vv A0J = r5.A0J("tos_id");
                Integer num = null;
                if (!(A0J == null || (A0L = A0J.A0L()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(A0L));
                }
                ((AnonymousClass5SX) this.A01).AYJ(A002, num);
                return;
            case 1:
                GenerateTcTokenJob generateTcTokenJob = (GenerateTcTokenJob) this.A00;
                generateTcTokenJob.A00.A07(generateTcTokenJob.A01, generateTcTokenJob.timestamp);
                ((C34421kE) this.A01).A02((Object) null);
                return;
            case 2:
                return;
            case 3:
                long A012 = C29501aj.A01(r5.A0N("t", (String) null), 0);
                StringBuilder A0r = AnonymousClass000.A0r("ping/recv/ping_response; timestamp=");
                A0r.append(A012);
                C13680ns.A1V(A0r);
                AnonymousClass1HJ r3 = (AnonymousClass1HJ) this.A00;
                r3.A09.post(new RunnableRunnableShape11S0100000_I0_10((Object) r3, 11));
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((C34421kE) this.A01).A02(r5);
                return;
            case 5:
                Log.i(((IDxCallbackShape445S0100000_2_I1) ((AnonymousClass2SC) this.A01)).A01 != 0 ? "fpm/ReceiverTransferTask/setMigrationIntentFlag()/success" : "fpm/DonorTransferTask/setMigrationIntentFlag()/success");
                return;
            case 6:
                C49092Qw r32 = (C49092Qw) this.A01;
                Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("EncryptedBackupProtocolHelper/deleteAccountOnSuccess id=")));
                if (r5.A0J("success") == null) {
                    Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("EncryptedBackupProtocolHelper/deleteAccountOnSuccess success was empty id=")));
                    r32.AQf(1, "success was empty", -1);
                    return;
                }
                r32.onSuccess();
                return;
            case 7:
                ((AnonymousClass2Ba) this.A00).AYG(r5, str);
                ((C19550yc) this.A01).AYG(r5, str);
                return;
            default:
                C13680ns.A0w(((C15860rz) ((C228419m) ((AnonymousClass4J5) this.A00).A01.get()).A01.get()).A0K(), "shops_privacy_notice", Integer.valueOf(r5.A0J("shops_notice").A0N("tos_version", (String) null)).intValue());
                PrivacyNoticeDialogFragment.A03(((AnonymousClass4QU) this.A01).A00, 2);
                return;
        }
    }
}
