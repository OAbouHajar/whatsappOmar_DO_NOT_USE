package com.facebook.redex;

import X.AnonymousClass1ZI;
import X.AnonymousClass2Wj;
import X.AnonymousClass4S4;
import X.C13680ns;
import X.C14550pN;
import X.C15830rv;
import X.C16010sH;
import X.C30341cC;
import X.C49572Tv;
import X.C78483y9;
import X.C83714Ht;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.lang.ref.Reference;

public class IDxCCallbackShape66S0200000_2_I1 implements AnonymousClass1ZI {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCCallbackShape66S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void AWT(boolean z2) {
        Context context;
        AnonymousClass4S4 r5;
        int i2;
        int i3;
        switch (this.A02) {
            case 0:
                Activity activity = (Activity) this.A00;
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (z2) {
                    ((C14550pN) activity).Afb(dialogFragment, "SharePhoneNumberBottomSheet");
                    return;
                }
                return;
            case 1:
                Reference reference = (Reference) this.A00;
                Intent intent = (Intent) this.A01;
                if (z2 && (context = (Context) reference.get()) != null) {
                    context.startActivity(intent);
                    return;
                }
                return;
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                C15830rv r1 = (C15830rv) this.A01;
                CallInfo A06 = C30341cC.A06();
                if (A06 != null) {
                    InCallBannerViewModel inCallBannerViewModel = voipActivityV2.A0u;
                    boolean z3 = A06.videoEnabled;
                    C16010sH A0A = inCallBannerViewModel.A02.A0A(r1);
                    Object[] A1b = C13680ns.A1b();
                    A1b[0] = inCallBannerViewModel.A03.A08(A0A);
                    if (z2) {
                        C78483y9 r4 = new C78483y9(A1b, R.string.str0345);
                        C78483y9 r3 = new C78483y9(new Object[0], R.string.str0366);
                        int i4 = R.color.color0802;
                        if (z3) {
                            i4 = R.color.color05d8;
                        }
                        r5 = new AnonymousClass4S4(r4, r3, 5, i4);
                        i2 = R.drawable.vec_ic_calling_user_blocked;
                        i3 = R.color.color05c6;
                    } else {
                        C78483y9 r42 = new C78483y9(A1b, R.string.str0363);
                        C78483y9 r32 = new C78483y9(new Object[0], R.string.str0368);
                        int i5 = R.color.color0802;
                        if (z3) {
                            i5 = R.color.color05d8;
                        }
                        r5 = new AnonymousClass4S4(r42, r32, 6, i5);
                        i2 = R.drawable.vec_ic_remove_user_warning;
                        i3 = R.color.color069f;
                    }
                    C83714Ht r7 = new C83714Ht(i2, i3);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    r5.A01 = r7;
                    r5.A00 = scaleType;
                    inCallBannerViewModel.A0A(new C49572Tv(scaleType, r7, r5.A06, r5.A05, (AnonymousClass2Wj) null, r5.A02, r5.A04, r5.A03, false, false, false));
                    return;
                }
                return;
        }
    }
}
