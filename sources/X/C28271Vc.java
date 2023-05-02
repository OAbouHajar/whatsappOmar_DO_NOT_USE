package X;

import android.app.IntentService;
import com.obwhatsapp.backup.google.GoogleBackupService;
import com.obwhatsapp.notification.AndroidWear;
import com.obwhatsapp.notification.DirectReplyService;
import java.util.Random;

/* renamed from: X.1Vc  reason: invalid class name and case insensitive filesystem */
public abstract class C28271Vc extends IntentService implements AnonymousClass006 {
    public final Object A00 = new Object();
    public volatile AnonymousClass54I A01;

    public C28271Vc(String str) {
        super(str);
    }

    public void A00() {
        if (this instanceof DirectReplyService) {
            DirectReplyService directReplyService = (DirectReplyService) this;
            if (!directReplyService.A0A) {
                directReplyService.A0A = true;
                C16150sX r2 = ((C59132uj) ((AnonymousClass54H) directReplyService.generatedComponent())).A04;
                directReplyService.A00 = (C14870pt) r2.AB3.get();
                directReplyService.A01 = (C16760tb) r2.APV.get();
                directReplyService.A02 = (C16000sG) r2.A4x.get();
                directReplyService.A05 = (AnonymousClass01V) r2.AOi.get();
                directReplyService.A06 = (C19150xq) r2.AFC.get();
                directReplyService.A04 = (AnonymousClass15I) r2.A3r.get();
                directReplyService.A07 = (C14770pj) r2.AF9.get();
                directReplyService.A08 = (C14760pi) r2.AFo.get();
                directReplyService.A03 = (AnonymousClass10Y) r2.A5X.get();
                directReplyService.A09 = (C17020u3) r2.AMG.get();
            }
        } else if (this instanceof AndroidWear) {
            AndroidWear androidWear = (AndroidWear) this;
            if (!androidWear.A08) {
                androidWear.A08 = true;
                C16150sX r22 = ((C59132uj) ((AnonymousClass54H) androidWear.generatedComponent())).A04;
                androidWear.A00 = (C14870pt) r22.AB3.get();
                androidWear.A01 = (C16760tb) r22.APV.get();
                androidWear.A02 = (C16000sG) r22.A4x.get();
                androidWear.A05 = (AnonymousClass01V) r22.AOi.get();
                androidWear.A04 = (AnonymousClass15I) r22.A3r.get();
                androidWear.A06 = (C14770pj) r22.AF9.get();
                androidWear.A03 = (AnonymousClass10Y) r22.A5X.get();
                androidWear.A07 = (C17020u3) r22.AMG.get();
            }
        } else {
            GoogleBackupService googleBackupService = (GoogleBackupService) this;
            if (!googleBackupService.A0a) {
                googleBackupService.A0a = true;
                googleBackupService.A0Z = new Random();
                C16150sX r23 = ((C59132uj) ((AnonymousClass54H) googleBackupService.generatedComponent())).A04;
                googleBackupService.A0H = (C16440t3) r23.AP2.get();
                googleBackupService.A0Q = (C14710pd) r23.A05.get();
                googleBackupService.A03 = (C14870pt) r23.AB3.get();
                googleBackupService.A01 = (C16300so) r23.A5p.get();
                googleBackupService.A04 = (C16040sK) r23.ADr.get();
                googleBackupService.A0I = (C16980tz) r23.AQB.get();
                googleBackupService.A02 = (C16180sb) r23.A8b.get();
                googleBackupService.A0R = (C16490t9) r23.AQz.get();
                googleBackupService.A0F = (C16190sc) r23.A8R.get();
                googleBackupService.A0U = (C18990xa) r23.ADh.get();
                googleBackupService.A0T = (C17190ug) r23.AEu.get();
                googleBackupService.A0E = (C19080xj) r23.A1f.get();
                googleBackupService.A0S = C16150sX.A0s(r23);
                googleBackupService.A0X = (AnonymousClass12P) r23.ARD.get();
                googleBackupService.A05 = (C16200sd) r23.A7h.get();
                googleBackupService.A0W = (C16210se) r23.AQr.get();
                googleBackupService.A0G = (AnonymousClass12W) r23.AEM.get();
                googleBackupService.A0P = (AnonymousClass11D) r23.AFm.get();
                googleBackupService.A0L = (C16480t8) r23.AEF.get();
                googleBackupService.A0V = (C27841Ti) r23.AEH.get();
                googleBackupService.A0M = (C16250si) r23.AFP.get();
                googleBackupService.A06 = (AnonymousClass1KN) r23.A1T.get();
                googleBackupService.A09 = (AnonymousClass12U) r23.AB5.get();
                googleBackupService.A0O = (C16900tq) r23.AFT.get();
                googleBackupService.A0D = (AnonymousClass12T) r23.AL6.get();
                googleBackupService.A0J = (C16260sj) r23.AQe.get();
                googleBackupService.A0K = (C15860rz) r23.AQh.get();
                googleBackupService.A07 = (AnonymousClass1I1) r23.A1Y.get();
                googleBackupService.A0N = (C19650ym) r23.AFS.get();
                googleBackupService.A08 = (C19670yo) r23.AB4.get();
                googleBackupService.A0A = (AnonymousClass12M) r23.AB6.get();
                googleBackupService.A0C = (AnonymousClass12Q) r23.AB8.get();
                googleBackupService.A0B = (AnonymousClass12N) r23.AB7.get();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new AnonymousClass54I(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }
}
