package m;

import android.preference.Preference;
import android.widget.Toast;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.BasePreferenceActivity;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import com.obwhatsapp.youbasha.ui.YoSettings.UniversalSettings;

public final /* synthetic */ class d implements Preference.OnPreferenceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1806a;

    /* renamed from: b  reason: collision with root package name */
    public final BasePreferenceActivity f1807b;

    public /* synthetic */ d(BasePreferenceActivity basePreferenceActivity, int i2) {
        this.f1806a = i2;
        this.f1807b = basePreferenceActivity;
    }

    public final boolean onPreferenceClick(Preference preference) {
        int i2 = this.f1806a;
        BasePreferenceActivity basePreferenceActivity = this.f1807b;
        switch (i2) {
            case 0:
                HideMedia hideMedia = (HideMedia) basePreferenceActivity;
                hideMedia.f1169k = true;
                hideMedia.f1166h.setChecked(false);
                hideMedia.f1167i.setChecked(false);
                hideMedia.f1168j.setChecked(false);
                try {
                    hideMedia.c(hideMedia.f1163e, HideMedia.IMAGES, false);
                } catch (Exception e2) {
                }
                try {
                    hideMedia.c(hideMedia.f1164f, HideMedia.VIDEOS, false);
                } catch (Exception e3) {
                }
                try {
                    hideMedia.c(hideMedia.f1165g, HideMedia.VIDEOS, false);
                } catch (Exception e4) {
                }
                Toast.makeText(hideMedia, yo.getString("done"), 0).show();
                hideMedia.f1169k = false;
                break;
            default:
                UniversalSettings universalSettings = (UniversalSettings) basePreferenceActivity;
                int i3 = UniversalSettings.f1221g;
                universalSettings.getClass();
                yo.clearWALogs();
                preference.setSummary(UniversalSettings.c() + " MB");
                Toast.makeText(universalSettings, yo.getString("done"), 0).show();
                break;
        }
        return false;
    }
}
