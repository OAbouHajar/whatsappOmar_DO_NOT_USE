package X;

import com.whatsapp.AbstractConsumerAppShell;

/* renamed from: X.002  reason: invalid class name */
public abstract class AnonymousClass002 extends AbstractConsumerAppShell implements AnonymousClass006 {
    public final AnonymousClass00A componentManager = new AnonymousClass00A(new AnonymousClass009(this));
    public boolean injected = false;

    public final AnonymousClass00A componentManager() {
        return this.componentManager;
    }

    public final Object generatedComponent() {
        return this.componentManager.generatedComponent();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            generatedComponent();
        }
    }

    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }
}
