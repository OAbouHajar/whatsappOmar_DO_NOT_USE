package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3Ok  reason: invalid class name and case insensitive filesystem */
public abstract class C64353Ok extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C64353Ok(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSProfilePhoto) this).setWhatsAppLocale(C16150sX.A0Z(((C52652eD) ((C52642eC) generatedComponent())).A07));
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
