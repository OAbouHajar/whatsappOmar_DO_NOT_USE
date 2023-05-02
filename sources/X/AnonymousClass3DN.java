package X;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.3DN  reason: invalid class name */
public class AnonymousClass3DN implements C009804r {
    public MenuItem A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public AnonymousClass3DN(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r5) {
        if (menuItem.getItemId() != R.id.menuitem_share) {
            return false;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0M;
        if (list.isEmpty()) {
            return false;
        }
        documentPickerActivity.A3A(list);
        return false;
    }

    public boolean APA(Menu menu, AnonymousClass05J r5) {
        MenuItem add = menu.add(0, R.id.menuitem_share, 0, R.string.str14e6);
        this.A00 = add;
        add.setShowAsAction(2);
        return true;
    }

    public void APd(AnonymousClass05J r3) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0M.clear();
        documentPickerActivity.A03 = null;
        documentPickerActivity.A0B.notifyDataSetChanged();
    }

    public boolean AV8(Menu menu, AnonymousClass05J r10) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0M;
        if (list.isEmpty()) {
            r10.A08(R.string.str14cd);
        } else {
            Resources resources = documentPickerActivity.getResources();
            int size = list.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, list.size(), 0);
            r10.A0B(resources.getQuantityString(R.plurals.plurals00e2, size, objArr));
        }
        this.A00.setVisible(C13700nu.A0i(list));
        return true;
    }
}
