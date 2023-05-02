package com.obwhatsapp.location;

import X.AnonymousClass291;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class GroupChatLiveLocationsUi$13 extends BottomSheetBehavior {
    public final /* synthetic */ AnonymousClass291 A00;

    public GroupChatLiveLocationsUi$13(AnonymousClass291 r1) {
        this.A00 = r1;
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return this.A00.A0a.A0B == 5 && super.A0B(motionEvent, view, coordinatorLayout);
    }
}
