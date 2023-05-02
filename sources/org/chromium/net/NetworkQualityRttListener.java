package org.chromium.net;

import X.AnonymousClass000;
import java.util.concurrent.Executor;

public abstract class NetworkQualityRttListener {
    public final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw AnonymousClass000.A0V("Executor must not be null");
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i2, long j2, int i3);
}
