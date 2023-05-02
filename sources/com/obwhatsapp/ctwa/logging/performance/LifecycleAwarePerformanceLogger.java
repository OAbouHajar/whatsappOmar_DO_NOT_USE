package com.obwhatsapp.ctwa.logging.performance;

import X.AnonymousClass000;
import X.C003501o;
import X.C011405n;
import androidx.lifecycle.OnLifecycleEvent;

public final class LifecycleAwarePerformanceLogger implements C003501o {
    @OnLifecycleEvent(C011405n.ON_STOP)
    private final void markerEndByEvent() {
        throw AnonymousClass000.A0W("isMarkerOn");
    }
}
