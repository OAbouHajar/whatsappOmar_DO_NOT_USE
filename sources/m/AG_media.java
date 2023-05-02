package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class AG_media implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1785b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1786c;

    public /* synthetic */ AG_media(AllSettings allSettings, View view, int i2) {
        this.f1784a = i2;
        this.f1785b = allSettings;
        this.f1786c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1784a;
        AllSettings allSettings = this.f1785b;
        View view2 = this.f1786c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.AG_media.class));
    }
}
