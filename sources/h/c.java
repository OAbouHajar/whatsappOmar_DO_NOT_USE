package h;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.c1;
import com.obwhatsapp.yo.massmsger.MassSender;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1739a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1740b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1741c;

    public /* synthetic */ c(e eVar, d dVar, int i2) {
        this.f1739a = i2;
        this.f1740b = eVar;
        this.f1741c = dVar;
    }

    public final void onClick(View view) {
        int i2 = this.f1739a;
        d dVar = this.f1741c;
        e eVar = this.f1740b;
        switch (i2) {
            case 0:
                eVar.getClass();
                Activity activity = eVar.f1751a;
                Intent intent = new Intent(activity, MassSender.class);
                Intent putExtra = intent.putExtra("full_name", dVar.f1747f);
                String str = dVar.f1747f;
                putExtra.putExtra("display_name", str.substring(str.indexOf("_") + 1)).putExtra("participants_jids", dVar.f1748g);
                activity.startActivity(intent);
                return;
            default:
                Activity activity2 = eVar.f1751a;
                try {
                    String string = yo.getString("delete");
                    new CustomAlertDialogBuilder(activity2).setTitle((CharSequence) string).setPositiveButton((CharSequence) string, (DialogInterface.OnClickListener) new c1(eVar, dVar, 1)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(9)).create().show();
                    return;
                } catch (Exception e2) {
                    Toast.makeText(activity2, "Error", 0).show();
                    e2.printStackTrace();
                    return;
                }
        }
    }
}
