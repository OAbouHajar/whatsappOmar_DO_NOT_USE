package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.4uj  reason: invalid class name and case insensitive filesystem */
public class C99874uj implements C14600pS {
    public final AnonymousClass1ZA A00;

    public C99874uj(AnonymousClass1ZA r1) {
        this.A00 = r1;
    }

    public void A00() {
        UserJid nullable;
        C49582Tw r0;
        if (this instanceof AnonymousClass3oU) {
            AnonymousClass3oU r02 = (AnonymousClass3oU) this;
            VoipActivityV2 voipActivityV2 = r02.A01;
            voipActivityV2.A3J();
            Intent intent = r02.A00;
            if (intent != null && (nullable = UserJid.getNullable(intent.getStringExtra("contact"))) != null) {
                VoipActivityV2.A0T(nullable, voipActivityV2);
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = voipActivityV2.A1d;
                if (voipCallControlBottomSheetV2 != null && (r0 = voipCallControlBottomSheetV2.A0I) != null) {
                    r0.A0I(nullable);
                    return;
                }
                return;
            }
            return;
        }
        this.A00.finish();
    }

    public void A01(Intent intent) {
        if (this instanceof AnonymousClass3oU) {
            ((AnonymousClass3oU) this).A00 = intent;
        } else {
            this.A00.setResult(-1, intent);
        }
    }

    public boolean AIm() {
        return this.A00.AIm();
    }

    public void Ac1() {
        this.A00.Ac1();
    }

    public void Afb(DialogFragment dialogFragment, String str) {
        this.A00.Afb(dialogFragment, (String) null);
    }

    public void Afc(DialogFragment dialogFragment) {
        this.A00.Afc(dialogFragment);
    }

    public void Afg(int i2) {
        this.A00.Afg(i2);
    }

    public void Afh(String str) {
        this.A00.Afh(str);
    }

    public void Afi(AnonymousClass2Sv r7, Object[] objArr, int i2, int i3, int i4) {
        this.A00.Afi(r7, objArr, i2, i3, R.string.str0ca7);
    }

    public void Afj(Object[] objArr, int i2, int i3) {
        this.A00.Afj(objArr, i2, i3);
    }

    public void Afr(int i2, int i3) {
        this.A00.Afr(i2, i3);
    }

    public void AhY(String str) {
        this.A00.AhY(str);
    }
}
