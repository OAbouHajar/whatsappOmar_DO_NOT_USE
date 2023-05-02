package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass052;
import X.C1036652g;
import X.C112085hv;
import X.C114695oP;
import X.C114755oW;
import X.C117495t5;
import X.C1206462l;
import X.C1206562m;
import X.C1206662n;
import X.C1206862p;
import X.C1207062r;
import X.C1207162s;
import X.C1207262t;
import X.C1207462v;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import X.C18450wi;
import X.C29671b0;
import X.C52412dl;
import X.C53842gO;
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;
import com.obwhatsapp.wabloks.ui.FcsBottomsheetBaseContainer;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.obwhatsapp.wabloks.ui.WaFcsBottomsheetModalActivity;
import java.util.ArrayList;
import java.util.List;

public class IDxCEventShape181S0100000_3_I1 implements C52412dl {
    public Object A00;
    public final int A01;

    public IDxCEventShape181S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQk(Object obj) {
        int i2;
        Activity activity;
        switch (this.A01) {
            case 0:
                C1207262t r9 = (C1207262t) obj;
                C1222969a ACC = ((C112085hv) this.A00).A04.A05("FBPAY").ACC();
                if (ACC != null) {
                    C53842gO A7M = ACC.A7M();
                    A7M.A08 = C13680ns.A0Y();
                    A7M.A0a = C13690nt.A0e(r9.A01, C112085hv.A0C);
                    A7M.A07 = (Integer) C112085hv.A0D.get(r9.A00);
                    ACC.AKR(A7M);
                    return;
                }
                return;
            case 1:
                C117495t5 r2 = (C117495t5) this.A00;
                if (!((C1206562m) obj).A00.contains(r2.A04) && (activity = (Activity) r2.A05.get()) != null) {
                    activity.finish();
                    return;
                }
                return;
            case 2:
                BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = (BkFcsPreloadingScreenFragment) this.A00;
                C1207462v r92 = (C1207462v) obj;
                if (bkFcsPreloadingScreenFragment.A05 && bkFcsPreloadingScreenFragment.A04 != null && TextUtils.equals(r92.A01, bkFcsPreloadingScreenFragment.A03)) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add("");
                    String str = r92.A00;
                    if ("onLoadingFailure".equals(str)) {
                        A0u.add(r92.A02);
                    }
                    bkFcsPreloadingScreenFragment.A1D((C29671b0) bkFcsPreloadingScreenFragment.A04.get(str), A0u);
                    return;
                }
                return;
            case 3:
                AnonymousClass01A r0 = (AnonymousClass01A) this.A00;
                String str2 = ((C1206462l) obj).A00;
                AnonymousClass02C A0F = r0.A0F();
                if (str2 == null) {
                    int A04 = A0F.A04();
                    if (A04 != 1) {
                        i2 = A04 - 2;
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass02C A0F2 = r0.A0F();
                    i2 = 0;
                    while (true) {
                        if (i2 >= A0F2.A04()) {
                            i2 = -1;
                        } else if (!((AnonymousClass050) ((AnonymousClass052) A0F2.A0E.get(i2))).A0A.equals(str2)) {
                            i2++;
                        }
                    }
                }
                A0F.A0N(i2);
                return;
            case 4:
                FdsContentFragmentManager.A02((FdsContentFragmentManager) this.A00, (C1207062r) obj);
                return;
            case 5:
                ((DialogFragment) this.A00).A1C();
                return;
            case 6:
                FcsBottomsheetBaseContainer fcsBottomsheetBaseContainer = (FcsBottomsheetBaseContainer) this.A00;
                C1207162s r93 = (C1207162s) obj;
                String str3 = r93.A01;
                String str4 = r93.A00;
                fcsBottomsheetBaseContainer.A07 = str3;
                fcsBottomsheetBaseContainer.A06 = str4;
                fcsBottomsheetBaseContainer.A1N();
                return;
            case 7:
                ((FcsBottomsheetBaseContainer) this.A00).A02.setText(((C1206862p) obj).A00);
                return;
            case 8:
                C114695oP r22 = (C114695oP) this.A00;
                C1206562m r94 = (C1206562m) obj;
                C18450wi.A0H(r94, 1);
                List list = r94.A00;
                String str5 = r22.A04;
                if (str5 == null) {
                    C18450wi.A0O("stateName");
                    throw AnonymousClass000.A0a("Redex: Unreachable code after no-return invoke");
                } else if (!list.contains(str5)) {
                    r22.finish();
                    return;
                } else {
                    return;
                }
            case 9:
                C1206662n r95 = (C1206662n) obj;
                C18450wi.A0H(r95, 1);
                ((C114695oP) this.A00).A05 = r95.A00;
                return;
            case 10:
                C1036652g r96 = (C1036652g) obj;
                C18450wi.A0H(r96, 1);
                ((C114695oP) this.A00).A03 = r96.A00;
                return;
            case 11:
                WaFcsBottomsheetModalActivity waFcsBottomsheetModalActivity = (WaFcsBottomsheetModalActivity) this.A00;
                if (!((C1206562m) obj).A00.contains(waFcsBottomsheetModalActivity.getIntent().getStringExtra("fds_state_name"))) {
                    FcsBottomsheetBaseContainer fcsBottomsheetBaseContainer2 = waFcsBottomsheetModalActivity.A03;
                    fcsBottomsheetBaseContainer2.A05 = Boolean.FALSE;
                    fcsBottomsheetBaseContainer2.A1D();
                    waFcsBottomsheetModalActivity.finish();
                    return;
                }
                return;
            default:
                C1207162s r97 = (C1207162s) obj;
                String str6 = r97.A01;
                String str7 = r97.A00;
                C114755oW r02 = (C114755oW) ((WaBloksActivity) this.A00).A04;
                r02.A00.A01(r02.A00, new IDxPCallbackShape467S0100000_3_I1(r02.A03, 1), str6, (String) null, str7);
                return;
        }
    }
}
