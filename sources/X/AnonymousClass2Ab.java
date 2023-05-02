package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Ab  reason: invalid class name */
public class AnonymousClass2Ab extends BaseAdapter implements Filterable {
    public long A00 = 4;
    public Filter A01;
    public final Map A02 = new HashMap();
    public final /* synthetic */ StatusesFragment A03;

    public AnonymousClass2Ab(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    public int getCount() {
        return this.A03.A12.size();
    }

    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter != null) {
            return filter;
        }
        C56822oZ r1 = new C56822oZ(this.A03);
        this.A01 = r1;
        return r1;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A03.A12.get(i2);
    }

    public long getItemId(int i2) {
        AnonymousClass5QM r1 = (AnonymousClass5QM) this.A03.A12.get(i2);
        if (r1 instanceof C63303Gx) {
            UserJid userJid = ((C63303Gx) r1).A01.A0B;
            Map map = this.A02;
            Number number = (Number) map.get(userJid);
            if (number == null) {
                long j2 = this.A00;
                this.A00 = 1 + j2;
                number = Long.valueOf(j2);
                map.put(userJid, number);
            }
            return number.longValue();
        } else if (r1 instanceof C63293Gw) {
            return ((C63293Gw) r1).A00;
        } else {
            if (r1 instanceof C63313Gy) {
                return 3;
            }
            throw new UnsupportedOperationException("Each list item must have an id");
        }
    }

    public int getItemViewType(int i2) {
        Object obj = this.A03.A12.get(i2);
        if (obj instanceof C63303Gx) {
            return 0;
        }
        if (obj instanceof C63293Gw) {
            return 1;
        }
        if (obj instanceof C63313Gy) {
            return 2;
        }
        throw new UnsupportedOperationException("Each list item type must have a itemType");
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((AnonymousClass5QM) statusesFragment.A12.get(i2)).AGx(statusesFragment.A0u(), view, viewGroup, statusesFragment.A0H, statusesFragment.A1F, statusesFragment.A1G, statusesFragment.A1E, statusesFragment.A11, statusesFragment.A17);
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (yo.mIGStatusesView != null) {
            yo.mIGStatusesView.notifyStatusesUpdated();
        }
    }
}
