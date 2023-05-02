package rc.whatsapp.dialog;

import X.C57012pj;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class DialogAdd {
    public DialogAdd(Activity activity) {
    }

    public void show() {
        try {
            View inflate = LayoutInflater.from(yo.getCtx()).inflate(yo.getID("rc_create_dialog", "layout"), (ViewGroup) null);
            C57012pj r1 = new C57012pj(yo.Homeac, yo.getID("BottomDialog", "style"));
            r1.setContentView(inflate);
            DialogAddContent dialogAddContent = (DialogAddContent) inflate.findViewById(yo.getID("mHolder", "id"));
            dialogAddContent.setBackground(others.coloredDrawable("rc_dialog_bg", HomeUI.dialog_bg(), PorterDuff.Mode.SRC_IN));
            dialogAddContent.getViewTreeObserver().addOnGlobalLayoutListener(dialogAddContent);
            r1.create();
            r1.show();
        } catch (Exception e2) {
        }
    }
}
