package X;

import com.obwhatsapp.R;
import com.obwhatsapp.settings.SettingsPrivacy;

/* renamed from: X.3yr  reason: invalid class name and case insensitive filesystem */
public class C78893yr extends C16690tT {
    public final /* synthetic */ C26131Ml A00;
    public final /* synthetic */ SettingsPrivacy A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78893yr(C001300o r1, C26131Ml r2, SettingsPrivacy settingsPrivacy, String str) {
        super(r1);
        this.A01 = settingsPrivacy;
        this.A00 = r2;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Integer.valueOf(this.A00.A03().size());
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Number number = (Number) obj;
        int intValue = number.intValue();
        if (intValue == 0) {
            SettingsPrivacy settingsPrivacy = this.A01;
            settingsPrivacy.A3F(this.A02, settingsPrivacy.getString(R.string.str12f7));
            return;
        }
        SettingsPrivacy settingsPrivacy2 = this.A01;
        settingsPrivacy2.A3F(this.A02, settingsPrivacy2.A01.A0J(AnonymousClass000.A1a(number), R.plurals.plurals00a1, (long) intValue));
    }
}
