package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2XK  reason: invalid class name */
public class AnonymousClass2XK extends C49192Rn implements SectionIndexer {
    public List A00;
    public List A01;
    public List A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public final Context A05;
    public final C17160ud A06;
    public final AnonymousClass2Ao A07;
    public final AnonymousClass013 A08;

    public AnonymousClass2XK(Context context, C17160ud r3, AnonymousClass2Ao r4, AnonymousClass013 r5, List list) {
        this.A01 = list;
        this.A05 = context;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = list;
        this.A08 = r5;
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A01.get(i2);
    }

    public int getPositionForSection(int i2) {
        List list = this.A03;
        if (i2 >= list.size() || i2 < 0) {
            return -1;
        }
        return ((Number) list.get(i2)).intValue();
    }

    public int getSectionForPosition(int i2) {
        List list = this.A02;
        List list2 = this.A04;
        List list3 = this.A03;
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
        } while (((Number) list3.get(size)).intValue() > i2);
        return size;
    }

    public Object[] getSections() {
        return this.A04.toArray(new String[1]);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4ND r3;
        String str;
        AnonymousClass2XJ r6 = (AnonymousClass2XJ) this.A01.get(i2);
        AnonymousClass00B.A06(r6);
        if (r6 instanceof C56022kp) {
            if (view == null) {
                view = LayoutInflater.from(this.A05).inflate(R.layout.layout0398, viewGroup, false);
                C004601z.A0d(view, 2);
            }
            TextView textView = (TextView) view.findViewById(R.id.title);
            AnonymousClass1UP.A06(textView);
            textView.setText(((C56022kp) r6).A00);
            return view;
        }
        if (view == null) {
            view = LayoutInflater.from(this.A05).inflate(R.layout.layout048f, viewGroup, false);
            r3 = new AnonymousClass4ND(view);
            view.setTag(r3);
        } else {
            r3 = (AnonymousClass4ND) view.getTag();
        }
        if (r6 instanceof AnonymousClass2XI) {
            C004601z.A0d(view, 2);
            r3.A01.setVisibility(4);
            r3.A02.setText(((AnonymousClass2XI) r6).A00);
            r3.A03.setVisibility(8);
            return view;
        }
        C56002kn r62 = (C56002kn) r6;
        ImageView imageView = r3.A01;
        imageView.setVisibility(0);
        this.A06.A05(imageView, R.drawable.avatar_contact);
        C16010sH AAn = r62.AAn();
        this.A07.A06(imageView, AAn);
        r3.A02.A0I(this.A00, r62.A00);
        TextEmojiLabel textEmojiLabel = r3.A03;
        textEmojiLabel.setVisibility(0);
        List list = r62.A01;
        if (list.size() > 1) {
            String[] strArr = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                strArr[i3] = C24561Gk.A01((C16010sH) list.get(i3));
            }
            str = TextUtils.join(", ", strArr);
        } else {
            str = C24561Gk.A01(AAn);
        }
        textEmojiLabel.setText(str);
        return view;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = AnonymousClass388.A00(this.A08, this.A02);
        this.A04 = (List) A002.first;
        this.A03 = (List) A002.second;
    }
}
