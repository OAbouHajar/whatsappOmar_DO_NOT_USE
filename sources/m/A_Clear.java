package m;

import android.preference.Preference;
import android.widget.Toast;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.Assem_Clear;
import com.obwhatsapp.youbasha.ui.YoSettings.BasePreferenceActivity;
import java.util.Objects;

public final /* synthetic */ class A_Clear implements Preference.OnPreferenceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1788b;

    public /* synthetic */ A_Clear(BasePreferenceActivity basePreferenceActivity, int i2) {
        this.f1787a = i2;
        this.f1788b = basePreferenceActivity;
    }

    public final boolean onPreferenceClick(Preference preference) {
        int i2 = this.f1787a;
        Assem_Clear assem_Clear = (Assem_Clear) this.f1788b;
        int i3 = Assem_Clear.f1140g;
        Objects.requireNonNull(assem_Clear);
        yo.clearWALogs();
        preference.setSummary(assem_Clear.c() + " MB");
        Toast.makeText(assem_Clear, yo.getString("done"), 0).show();
        return false;
    }
}
