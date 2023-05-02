package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass291;
import X.AnonymousClass5OB;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;

public class IDxSListenerShape367S0100000_2_I0 implements AnonymousClass5OB {
    public Object A00;
    public final int A01;

    public IDxSListenerShape367S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AO3(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            if (i2 == 1) {
                AnonymousClass00B.A06(groupChatLiveLocationsActivity2.A06);
                AnonymousClass291 r0 = groupChatLiveLocationsActivity2.A0N;
                r0.A0u = true;
                int i4 = 0;
                r0.A0s = false;
                View view = r0.A0U;
                if (r0.A0m != null) {
                    i4 = 8;
                }
                view.setVisibility(i4);
                groupChatLiveLocationsActivity2.A06.A04();
                groupChatLiveLocationsActivity2.A0N.A0t = true;
                return;
            }
            return;
        }
        DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) obj;
        if (i2 == 1) {
            directorySetLocationMapActivity.A09.A01.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) directorySetLocationMapActivity.A09.A01.getHeight(), 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(120);
            directorySetLocationMapActivity.A09.A02.startAnimation(translateAnimation);
            directorySetLocationMapActivity.A09.A03.setVisibility(0);
        }
    }
}
