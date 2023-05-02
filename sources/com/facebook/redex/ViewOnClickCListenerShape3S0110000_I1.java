package com.facebook.redex;

import X.AnonymousClass135;
import X.AnonymousClass13G;
import X.AnonymousClass22N;
import X.AnonymousClass2E5;
import X.C14550pN;
import X.C14750ph;
import X.C16440t3;
import X.C16590tJ;
import X.C19220xx;
import X.C30031bd;
import X.C41471vy;
import X.C46352Dw;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment;
import com.obwhatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class ViewOnClickCListenerShape3S0110000_I1 implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape3S0110000_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public final void onClick(View view) {
        GreenAlertActivity greenAlertActivity;
        View findViewById;
        switch (this.A02) {
            case 0:
                boolean z2 = this.A01;
                C14550pN A022 = AnonymousClass22N.A02((View) this.A00);
                if (A022 != null) {
                    A022.Afb(ChatWithBusinessInDirectoryDialogFragment.A01(z2), (String) null);
                    return;
                }
                return;
            case 1:
                C30031bd r4 = (C30031bd) this.A00;
                boolean z3 = this.A01;
                Activity A012 = AnonymousClass22N.A01(r4.getContext(), C14550pN.class);
                if (A012 != null && z3) {
                    A012.startActivity(C14750ph.A0q().A0s(A012, 2, r4.A0L.A00()));
                    return;
                }
                return;
            case 2:
                greenAlertActivity = (GreenAlertActivity) this.A00;
                boolean z4 = this.A01;
                AnonymousClass13G r1 = greenAlertActivity.A0B;
                int i2 = 15;
                if (z4) {
                    i2 = 14;
                }
                r1.A01(Integer.valueOf(i2));
                int max = Math.max(-1, greenAlertActivity.A06.getCurrentLogicalItem() - 1);
                if (max >= 0) {
                    greenAlertActivity.A06.setCurrentLogicalItem(max);
                    greenAlertActivity.A37(max);
                    greenAlertActivity.A38(max);
                    break;
                } else {
                    greenAlertActivity.A35();
                    break;
                }
            default:
                greenAlertActivity = (GreenAlertActivity) this.A00;
                boolean z5 = this.A01;
                int min = Math.min(greenAlertActivity.A06.getCurrentLogicalItem() + 1, 2);
                if (min != 2) {
                    greenAlertActivity.A0B.A01(13);
                    greenAlertActivity.A06.setCurrentLogicalItem(min);
                    greenAlertActivity.A37(min);
                    greenAlertActivity.A38(min);
                    break;
                } else {
                    C16440t3 r7 = greenAlertActivity.A05;
                    AnonymousClass13G r2 = greenAlertActivity.A0B;
                    C19220xx r12 = greenAlertActivity.A0C;
                    AnonymousClass135 r5 = greenAlertActivity.A0E;
                    C46352Dw A013 = r12.A05.A01();
                    if (A013 == null || !String.valueOf(A013.A01).startsWith("202102")) {
                        A013 = new C46352Dw(20210210, 1, 1, r7.A00());
                        Log.i("UserNoticeManager/agreePhonyUserNotice");
                        r12.A06(20210210, 5, 1);
                    } else {
                        r12.A02();
                    }
                    r5.A08.A01("20210210", 1);
                    Iterator A002 = C16590tJ.A00(r5.A07);
                    while (A002.hasNext()) {
                        C41471vy r13 = (C41471vy) A002.next();
                        if ("20210210".equals("20210210")) {
                            r13.A00.A01.A0B((Object) null);
                        }
                    }
                    int i3 = 9;
                    if (z5) {
                        i3 = 6;
                    }
                    r2.A00(A013, Integer.valueOf(i3));
                    greenAlertActivity.finish();
                    break;
                }
                break;
        }
        int currentLogicalItem = greenAlertActivity.A06.getCurrentLogicalItem();
        View findViewWithTag = greenAlertActivity.A06.findViewWithTag(Integer.valueOf(currentLogicalItem));
        if (currentLogicalItem != 0) {
            if (currentLogicalItem == 1) {
                greenAlertActivity.A07.performAccessibilityAction(128, (Bundle) null);
                findViewById = greenAlertActivity.A02;
            } else {
                return;
            }
        } else if (AnonymousClass2E5.A02(greenAlertActivity.A0C)) {
            findViewById = greenAlertActivity.A03;
        } else if (findViewWithTag != null) {
            findViewById = findViewWithTag.findViewById(R.id.green_alert_education_title);
        } else {
            return;
        }
        findViewById.sendAccessibilityEvent(8);
    }
}
