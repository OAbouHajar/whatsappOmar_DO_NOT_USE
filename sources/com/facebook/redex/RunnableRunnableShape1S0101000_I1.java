package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass22J;
import X.AnonymousClass2JP;
import X.AnonymousClass35O;
import X.AnonymousClass37L;
import X.AnonymousClass3B5;
import X.AnonymousClass3GZ;
import X.AnonymousClass3T2;
import X.AnonymousClass4WT;
import X.AnonymousClass5PW;
import X.AnonymousClass5S6;
import X.C101174wq;
import X.C13680ns;
import X.C14530pL;
import X.C30141bo;
import X.C30151bp;
import X.C56542np;
import X.C62993Fs;
import X.C63073Ga;
import X.C63173Gk;
import X.C73293ne;
import X.C73303nf;
import X.C91764gS;
import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.obwhatsapp.companionmode.registration.CompanionBootstrapActivity;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.obwhatsapp.report.BusinessActivityReportViewModel;

public class RunnableRunnableShape1S0101000_I1 implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape1S0101000_I1(AnonymousClass37L r2, int i2, int i3) {
        this.A02 = i3;
        if (10 - i3 != 0) {
            this.A01 = r2;
            this.A00 = i2;
            return;
        }
        this.A01 = r2;
        this.A00 = R.string.str15fd;
    }

    public RunnableRunnableShape1S0101000_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A00 = i2;
        this.A01 = obj;
    }

    public final void run() {
        int i2;
        AcceptInviteLinkActivity acceptInviteLinkActivity;
        int i3;
        switch (this.A02) {
            case 0:
                int i4 = this.A00;
                AnonymousClass4WT r2 = ((C91764gS) this.A01).A01;
                if (i4 == -3) {
                    i2 = 3;
                } else if (i4 == -2) {
                    r2.A01(0);
                    i2 = 2;
                } else if (i4 == -1) {
                    r2.A01(-1);
                    r2.A00();
                    return;
                } else if (i4 != 1) {
                    Log.w("AudioFocusManager", C13680ns.A0c(i4, "Unknown focus change type: "));
                    return;
                } else {
                    r2.A02(1);
                    r2.A01(1);
                    return;
                }
                r2.A02(i2);
                return;
            case 1:
                C62993Fs r22 = (C62993Fs) this.A01;
                int i5 = this.A00;
                if (i5 != 500) {
                    switch (i5) {
                        case 403:
                            acceptInviteLinkActivity = r22.A00;
                            i3 = R.string.str1707;
                            break;
                        case 404:
                            acceptInviteLinkActivity = r22.A00;
                            i3 = R.string.str1708;
                            break;
                        case 405:
                            acceptInviteLinkActivity = r22.A00;
                            i3 = R.string.str1709;
                            break;
                        default:
                            return;
                    }
                } else {
                    acceptInviteLinkActivity = r22.A00;
                    i3 = R.string.str1706;
                }
                acceptInviteLinkActivity.A36(i3);
                return;
            case 2:
                int i6 = this.A00;
                AnonymousClass22J r1 = (AnonymousClass22J) this.A01;
                if (i6 == -1) {
                    r1.AIU(C73303nf.A00);
                    return;
                } else {
                    r1.AIU(C73293ne.A00);
                    return;
                }
            case 3:
                ((CompanionBootstrapActivity) this.A01).A35(this.A00);
                return;
            case 4:
                ((C63173Gk) this.A01).A05.A00(this.A00);
                return;
            case 8:
                AnonymousClass3T2 r8 = (AnonymousClass3T2) this.A01;
                int i7 = this.A00;
                C30151bp r4 = r8.A05;
                C30141bo r12 = r4.A09;
                int i8 = r12.A01;
                RecyclerView recyclerView = r12.A0Q;
                AnonymousClass3T2 r10 = (AnonymousClass3T2) recyclerView.A0D(i8);
                if (r10 != null) {
                    r10.A04.A04(false, true);
                    r10.A00.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                } else {
                    r4.A02(i8);
                }
                int size = AnonymousClass3B5.A00.size();
                if (i7 > 0 && i7 < (size >> 1)) {
                    i7--;
                } else if (i7 > (size >> 1) && i7 < size - 1) {
                    i7++;
                }
                recyclerView.A0a(i7);
                SelectionCheckView selectionCheckView = r8.A04;
                selectionCheckView.setScaleX(1.0f);
                selectionCheckView.setScaleY(1.0f);
                selectionCheckView.A04(true, true);
                r8.A00.animate().scaleX(r4.A05).scaleY(r4.A04).setDuration(100).start();
                return;
            case 9:
                int i9 = this.A00;
                C30151bp r3 = ((AnonymousClass3T2) this.A01).A05;
                r3.A02[i9 - 1] = false;
                r3.A02(i9);
                return;
            case 10:
                ((AnonymousClass37L) this.A01).A05.A09(R.string.str15fd, 0);
                return;
            case 11:
                ((AnonymousClass37L) this.A01).A05.A07(this.A00, 0);
                return;
            case 12:
                ((C56542np) this.A01).A08.ANz(this.A00);
                return;
            case 13:
                ((C101174wq) this.A01).A00.A05.ANz(this.A00);
                return;
            case 14:
                ((AnonymousClass5S6) this.A01).AQR(this.A00);
                return;
            case 15:
                BusinessActivityReportViewModel businessActivityReportViewModel = ((AnonymousClass3GZ) this.A01).A00.A00;
                if (businessActivityReportViewModel.A05.A00() == 1) {
                    BusinessActivityReportViewModel.A01(businessActivityReportViewModel);
                    return;
                }
                return;
            case 16:
                BusinessActivityReportViewModel businessActivityReportViewModel2 = ((C63073Ga) this.A01).A00.A00;
                C13680ns.A1O(businessActivityReportViewModel2.A01, 2);
                C13680ns.A1O(businessActivityReportViewModel2.A02, 0);
                return;
            case 17:
                AnonymousClass35O r13 = (AnonymousClass35O) this.A01;
                int i10 = this.A00;
                Context context = r13.A05.getContext();
                AnonymousClass01V r5 = r13.A06;
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1K(A1b, i10);
                AnonymousClass2JP.A00(context, r5, r13.A07.A0J(A1b, R.plurals.plurals016c, (long) i10));
                return;
            default:
                C14530pL.A0n((DeepLinkActivity) ((AnonymousClass5PW) this.A01));
                return;
        }
    }
}
