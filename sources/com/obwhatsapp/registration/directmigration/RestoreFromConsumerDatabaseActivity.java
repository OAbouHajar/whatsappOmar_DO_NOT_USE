package com.obwhatsapp.registration.directmigration;

import X.AnonymousClass04o;
import X.AnonymousClass0y3;
import X.AnonymousClass11L;
import X.AnonymousClass12W;
import X.C001500q;
import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16210se;
import X.C16220sf;
import X.C16250si;
import X.C16280sl;
import X.C16900tq;
import X.C17240ul;
import X.C18790xG;
import X.C19090xk;
import X.C19640yl;
import X.C19650ym;
import X.C19760yx;
import X.C210112l;
import X.C210312n;
import X.C27851Tj;
import X.C27861Tk;
import X.C447725m;
import X.C46532Et;
import X.C49132Rg;
import X.C57312qt;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.obwhatsapp.components.RoundCornerProgressBar;

public class RestoreFromConsumerDatabaseActivity extends C14530pL {
    public WaButton A00;
    public WaTextView A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public GoogleDriveRestoreAnimationView A05;
    public RoundCornerProgressBar A06;
    public AnonymousClass12W A07;
    public C18790xG A08;
    public C16250si A09;
    public C19650ym A0A;
    public C16900tq A0B;
    public C210312n A0C;
    public C17240ul A0D;
    public C19090xk A0E;
    public AnonymousClass0y3 A0F;
    public AnonymousClass11L A0G;
    public C19760yx A0H;
    public C27851Tj A0I;
    public C46532Et A0J;
    public C19640yl A0K;
    public C27861Tk A0L;
    public C210112l A0M;
    public C16220sf A0N;
    public C16210se A0O;
    public C16280sl A0P;
    public boolean A0Q;

    public RestoreFromConsumerDatabaseActivity() {
        this(0);
    }

    public RestoreFromConsumerDatabaseActivity(int i2) {
        this.A0Q = false;
        C13680ns.A1G(this, 112);
    }

    public void A1q() {
        if (!this.A0Q) {
            this.A0Q = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0E = (C19090xk) r1.AF1.get();
            this.A08 = (C18790xG) r1.A1S.get();
            this.A0C = (C210312n) r1.A4A.get();
            this.A0D = C16150sX.A0o(r1);
            this.A0P = (C16280sl) r1.ANX.get();
            this.A0O = (C16210se) r1.AQr.get();
            this.A0N = (C16220sf) r1.A3y.get();
            this.A07 = (AnonymousClass12W) r1.AEM.get();
            this.A09 = (C16250si) r1.AFP.get();
            this.A0F = (AnonymousClass0y3) r1.ALd.get();
            this.A0B = (C16900tq) r1.AFT.get();
            this.A0H = (C19760yx) r1.AKx.get();
            this.A0I = (C27851Tj) r1.A6u.get();
            this.A0M = (C210112l) r1.AFg.get();
            this.A0K = (C19640yl) r1.ACo.get();
            this.A0A = (C19650ym) r1.AFS.get();
            this.A0L = (C27861Tk) r1.AEG.get();
            this.A0G = (AnonymousClass11L) r1.AIx.get();
        }
    }

    public final void A35() {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A05;
        if (googleDriveRestoreAnimationView.A01 != 1) {
            googleDriveRestoreAnimationView.A01();
        }
        this.A01.setVisibility(0);
        this.A00.setVisibility(8);
        this.A04.setText(R.string.str0d70);
        this.A03.setText(R.string.str0d6f);
        this.A01.setText(R.string.str0d72);
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0504);
        this.A04 = (WaTextView) findViewById(R.id.restore_from_consumer_title);
        this.A03 = (WaTextView) findViewById(R.id.restore_from_consumer_sub_title);
        this.A01 = (WaTextView) findViewById(R.id.restore_from_consumer_bottom_info);
        this.A00 = (WaButton) findViewById(R.id.restore_from_consumer_action_btn);
        this.A02 = (WaTextView) findViewById(R.id.restore_from_consumer_progress_description);
        this.A06 = (RoundCornerProgressBar) findViewById(R.id.restore_from_consumer_progress_bar);
        this.A05 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_from_consumer_animation_view);
        findViewById(R.id.restore_from_consumer_background_image).setBackgroundDrawable(C447725m.A00(this, this.A01, R.drawable.graphic_migration));
        C13680ns.A15(this.A00, this, 42);
        A35();
        C46532Et r0 = (C46532Et) new C006602z((AnonymousClass04o) new C57312qt(this), (C001500q) this).A01(C46532Et.class);
        this.A0J = r0;
        C13680ns.A1M(this, r0.A02, 31);
        C13680ns.A1L(this, this.A0J.A04, 129);
    }
}
