package X;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: X.2k0  reason: invalid class name and case insensitive filesystem */
public abstract class C55592k0 extends AnonymousClass2S6 implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C55592k0(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        if (!this.A01) {
            this.A01 = true;
            ((C55582jz) this).A09 = (AnonymousClass01V) ((C52652eD) ((C52642eC) generatedComponent())).A07.AOi.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
