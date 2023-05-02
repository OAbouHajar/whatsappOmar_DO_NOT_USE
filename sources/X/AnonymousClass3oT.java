package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.3oT  reason: invalid class name */
public class AnonymousClass3oT extends C49182Rm implements SectionIndexer {
    public List A00 = AnonymousClass000.A0u();
    public List A01 = AnonymousClass000.A0u();

    public AnonymousClass3oT(ContactPickerFragment contactPickerFragment, AnonymousClass01D r3) {
        super(contactPickerFragment, r3);
    }

    public int getPositionForSection(int i2) {
        List list = this.A00;
        if (i2 >= list.size() || i2 < 0) {
            return -1;
        }
        return AnonymousClass000.A0D(list.get(i2));
    }

    public int getSectionForPosition(int i2) {
        List list = this.A02;
        List list2 = this.A01;
        List list3 = this.A00;
        if (i2 < 0) {
            return 0;
        }
        if (i2 >= list.size()) {
            return list2.size() - 1;
        }
        int size = list3.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
        } while (AnonymousClass000.A0D(list3.get(size)) > i2);
        return size;
    }

    public Object[] getSections() {
        return this.A01.toArray(new String[1]);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = AnonymousClass388.A00(this.A03.A1H, this.A02);
        this.A01 = (List) A002.first;
        this.A00 = (List) A002.second;
    }
}
