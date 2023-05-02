package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass12W;
import X.AnonymousClass15W;
import X.AnonymousClass1BY;
import X.AnonymousClass1Y3;
import X.AnonymousClass1Y4;
import X.AnonymousClass1YB;
import X.AnonymousClass29D;
import X.AnonymousClass37C;
import X.C14550pN;
import X.C14730pf;
import X.C15860rz;
import X.C16010sH;
import X.C16050sL;
import X.C16320sq;
import X.C17130ua;
import X.C17220uj;
import X.C18160wF;
import X.C23251Bb;
import X.C24461Ga;
import X.C32241fu;
import X.C39701sv;
import X.C39711sw;
import X.C46202Cw;
import X.C55632k4;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.obwhatsapp.support.DescribeProblemActivity;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.List;

public class ViewOnClickCListenerShape4S0200000_I0_1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape4S0200000_I0_1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        int length;
        switch (this.A02) {
            case 0:
                ((C14550pN) this.A00).Afb((DialogFragment) this.A01, (String) null);
                return;
            case 1:
                ((View) this.A01).setEnabled(false);
                C24461Ga r3 = ((DownloadableWallpaperPickerActivity) this.A00).A05;
                r3.A04.execute(new RunnableRunnableShape14S0100000_I0_13((Object) r3, 41));
                return;
            case 2:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
                TextView textView = (TextView) this.A01;
                String A35 = describeProblemActivity.A35();
                int length2 = A35.getBytes().length;
                boolean A002 = AnonymousClass1Y4.A00(describeProblemActivity.A0M);
                if (describeProblemActivity.A0O || !DescribeProblemActivity.A02(A35, A002)) {
                    describeProblemActivity.A02.setBackground(AnonymousClass00T.A04(describeProblemActivity, R.drawable.description_field_background_state_list));
                    textView.setVisibility(8);
                    int i2 = describeProblemActivity.A00;
                    if (i2 == 2 || i2 == 3 || "voip-dev@whatsapp.com".equals(describeProblemActivity.A0L) || AnonymousClass1Y4.A00(describeProblemActivity.A0M)) {
                        describeProblemActivity.A36();
                        return;
                    }
                    C16320sq r10 = describeProblemActivity.A05;
                    AnonymousClass37C r0 = describeProblemActivity.A0B;
                    if (r0 != null && r0.A03() == 1) {
                        describeProblemActivity.A0B.A06(false);
                    }
                    C17130ua r17 = describeProblemActivity.A05;
                    C18160wF r15 = describeProblemActivity.A0J;
                    C14730pf r14 = describeProblemActivity.A06;
                    C17220uj r13 = describeProblemActivity.A0H;
                    AnonymousClass013 r9 = describeProblemActivity.A01;
                    C23251Bb r8 = describeProblemActivity.A0I;
                    AnonymousClass12W r7 = describeProblemActivity.A06;
                    AnonymousClass15W r6 = describeProblemActivity.A09;
                    C15860rz r5 = describeProblemActivity.A09;
                    AnonymousClass1BY r4 = describeProblemActivity.A0F;
                    String str = describeProblemActivity.A0M;
                    String str2 = describeProblemActivity.A0N;
                    AnonymousClass1YB r02 = describeProblemActivity.A0D;
                    AnonymousClass013 r20 = r9;
                    C14730pf r21 = r14;
                    AnonymousClass12W r18 = r7;
                    C15860rz r19 = r5;
                    AnonymousClass37C r152 = new AnonymousClass37C(describeProblemActivity, r17, r18, r19, r20, r21, (AnonymousClass1Y3) null, r6, describeProblemActivity, (C16050sL) null, r4, r13, r8, r15, str, str2, describeProblemActivity.A35(), r02 != null ? r02.AEN() : null, describeProblemActivity.A0P);
                    describeProblemActivity.A0B = r152;
                    r10.Ack(r152, new Void[0]);
                    return;
                }
                describeProblemActivity.A02.setBackground(AnonymousClass00T.A04(describeProblemActivity, R.drawable.describe_problem_edittext_bg_error));
                int i3 = R.string.str06c7;
                if (length2 == 0) {
                    i3 = R.string.str06c6;
                }
                textView.setText(i3);
                textView.setVisibility(0);
                return;
            case 3:
                C46202Cw.A0B((C46202Cw) this.A00, (AnonymousClass29D) this.A01);
                return;
            case 4:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = ((C55632k4) this.A00).A01;
                viewSharedContactArrayActivity.A02.A01(viewSharedContactArrayActivity, (C16010sH) this.A01, 15, true);
                return;
            case 5:
                C55632k4 r32 = (C55632k4) this.A00;
                C39701sv r62 = (C39701sv) this.A01;
                byte[] bArr = r62.A09;
                Bitmap decodeByteArray = (bArr == null || (length = bArr.length) <= 0) ? null : BitmapFactory.decodeByteArray(bArr, 0, length);
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = r32.A01;
                viewSharedContactArrayActivity2.A0J = r62;
                List list = viewSharedContactArrayActivity2.A0P;
                list.clear();
                ArrayList arrayList = viewSharedContactArrayActivity2.A0O;
                arrayList.clear();
                List<C39711sw> list2 = r62.A05;
                if (list2 != null) {
                    for (C39711sw r1 : list2) {
                        arrayList.add(r1.A02);
                        UserJid userJid = r1.A01;
                        if (userJid != null) {
                            list.add(userJid);
                        } else {
                            list.add((Object) null);
                        }
                    }
                }
                r62.toString();
                C32241fu r33 = new C32241fu(viewSharedContactArrayActivity2);
                r33.A01(R.string.str00a7);
                r33.setPositiveButton(R.string.str0dd2, new IDxCListenerShape22S0300000_2_I1(decodeByteArray, viewSharedContactArrayActivity2, r62, 2));
                r33.setNegativeButton(R.string.str087a, new IDxCListenerShape22S0300000_2_I1(decodeByteArray, viewSharedContactArrayActivity2, r62, 3));
                r33.create().show();
                return;
            case 6:
                ((View.OnClickListener) this.A01).onClick(view);
                ((VoipActivityV2) this.A00).A3I();
                return;
            default:
                C14550pN r2 = (C14550pN) this.A00;
                int i4 = 10;
                if (VoipActivityV2.A0u((CallInfo) this.A01)) {
                    i4 = 11;
                }
                r2.Afc(VoipActivityV2.E2EEInfoDialogFragment.A01(i4));
                return;
        }
    }
}
