package android.support.v4.view;

import android.view.ViewGroup;

class ViewGroupCompatHC {
    private ViewGroupCompatHC() {
    }

    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z2) {
        viewGroup.setMotionEventSplittingEnabled(z2);
    }
}