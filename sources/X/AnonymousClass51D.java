package X;

import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;

/* renamed from: X.51D  reason: invalid class name */
public final class AnonymousClass51D implements C19550yc {
    public final AnonymousClass4QC A00;
    public final C17190ug A01;

    public AnonymousClass51D(AnonymousClass4QC r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
        DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity = this.A00.A00;
        deactivateCommunityDisclaimerActivity.Ac1();
        View view = deactivateCommunityDisclaimerActivity.A00;
        if (view == null) {
            throw C18450wi.A03("mainView");
        }
        C32291fz.A00(view, R.string.str0648, -1).A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r4 != 404) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQe(X.C28371Vv r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            X.C18450wi.A0H(r6, r0)
            java.lang.String r0 = "error"
            X.1Vv r1 = r6.A0J(r0)
            r4 = -2
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "code"
            int r4 = r1.A0A(r0, r4)
        L_0x0013:
            X.4QC r0 = r5.A00
            com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r3 = r0.A00
            r3.Ac1()
            r0 = -2
            r2 = -1
            if (r4 == r0) goto L_0x002f
            if (r4 == r2) goto L_0x002f
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x002f
            r0 = 401(0x191, float:5.62E-43)
            if (r4 == r0) goto L_0x003d
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2131887685(0x7f120645, float:1.9409984E38)
            if (r4 == r0) goto L_0x0032
        L_0x002f:
            r1 = 2131887688(0x7f120648, float:1.940999E38)
        L_0x0032:
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "mainView"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x003d:
            r1 = 2131887684(0x7f120644, float:1.9409982E38)
            goto L_0x0032
        L_0x0041:
            X.1fz r0 = X.C32291fz.A00(r0, r1, r2)
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51D.AQe(X.1Vv, java.lang.String):void");
    }

    public void AYG(C28371Vv r6, String str) {
        String str2;
        DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity = this.A00.A00;
        deactivateCommunityDisclaimerActivity.Ac1();
        Object[] A1b = C13680ns.A1b();
        C16080sP r1 = deactivateCommunityDisclaimerActivity.A02;
        if (r1 != null) {
            C16010sH r0 = deactivateCommunityDisclaimerActivity.A04;
            if (r0 == null) {
                str2 = "parentGroupContact";
            } else {
                String A0d = C13680ns.A0d(deactivateCommunityDisclaimerActivity, r1.A08(r0), A1b, 0, R.string.str064a);
                C18450wi.A0B(A0d);
                C19980zJ r2 = deactivateCommunityDisclaimerActivity.A00;
                Intent A02 = C14750ph.A02(deactivateCommunityDisclaimerActivity);
                A02.putExtra("snackbar_message", A0d);
                A02.setFlags(67108864);
                r2.A06(deactivateCommunityDisclaimerActivity, A02);
                return;
            }
        } else {
            str2 = "waContactNames";
        }
        throw C18450wi.A03(str2);
    }
}
