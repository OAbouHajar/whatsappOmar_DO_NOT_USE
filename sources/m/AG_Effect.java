package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class AG_Effect implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1779b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1780c;

    public /* synthetic */ AG_Effect(AllSettings allSettings, View view, int i2) {
        this.f1778a = i2;
        this.f1779b = allSettings;
        this.f1780c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1778a;
        AllSettings allSettings = this.f1779b;
        View view2 = this.f1780c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.AG_Effect.class));
    }
}
