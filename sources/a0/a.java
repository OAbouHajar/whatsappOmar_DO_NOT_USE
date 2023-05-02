package a0;

import X.C57012pj;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import rc.whatsapp.conversation.attachImageButton;
import rc.whatsapp.conversation.dialogAttachment.DialogAttachContent;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f173a;

    /* renamed from: b  reason: collision with root package name */
    public final attachImageButton f174b;

    public /* synthetic */ a(attachImageButton attachimagebutton, int i2) {
        this.f173a = i2;
        this.f174b = attachimagebutton;
    }

    public final void onClick(View view) {
        int i2 = this.f173a;
        attachImageButton attachimagebutton = this.f174b;
        switch (i2) {
            case 0:
                int i3 = attachImageButton.f2452b;
                attachimagebutton.getClass();
                String str = "ۘۚۙۧ۬ۦۘۛۥۥۦۡۚۚۤۚ۠ۥ۫ۤۜۢ";
                while (true) {
                    try {
                        switch (str.hashCode() ^ -1155593827) {
                            case -1127219297:
                                View inflate = LayoutInflater.from(attachimagebutton.getContext()).inflate(yo.getID("rc_attachment", "layout"), (ViewGroup) null);
                                DialogAttachContent dialogAttachContent = (DialogAttachContent) inflate.findViewById(yo.getID("mHolder", "id"));
                                dialogAttachContent.setBackground(others.coloredDrawable("rc_dialog_bg", ColorStore.getPrimaryColorAttachPopupBackground(), PorterDuff.Mode.SRC_IN));
                                C57012pj r3 = new C57012pj(attachimagebutton.getContext(), yo.getID("BottomDialog", "style"));
                                dialogAttachContent.setBottomSheetDialog(r3);
                                r3.setContentView(inflate);
                                r3.show();
                                return;
                            case -895768961:
                                if (!shp.getBoolean("newAttach_BottomDesign")) {
                                    str = "۫ۚۦۘۚۖۜۦۖۜۘۨۗۜۙۚۤ۫ۛۖ۠ۧۘۘ";
                                    break;
                                } else {
                                    str = "۠ۘۚۧۜ۟ۛۢ۫ۘۖۥۘۖۛۨۘۚۘۘۡۜۗ";
                                    break;
                                }
                            case -818817647:
                                attachimagebutton.a(view);
                                return;
                            case 921996665:
                                str = "ۗ۠ۘ۬۟ۥۘۘ۬ۙۢۦۤ۠ۨ۠ۨۖۢۨۖۚ۠ۥۧ";
                                break;
                        }
                    } catch (Exception e2) {
                        return;
                    }
                }
                break;
            default:
                int i4 = attachImageButton.f2452b;
                attachimagebutton.a(view);
                return;
        }
    }
}
