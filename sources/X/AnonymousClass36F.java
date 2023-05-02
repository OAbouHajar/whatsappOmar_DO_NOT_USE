package X;

import android.database.Cursor;
import com.obwhatsapp.mentions.MentionPickerView;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.36F  reason: invalid class name */
public class AnonymousClass36F extends C16690tT {
    public final C16460t6 A00;
    public final UserJid A01;
    public final CharSequence A02;
    public final /* synthetic */ MentionPickerView A03;

    public AnonymousClass36F(C16460t6 r1, UserJid userJid, MentionPickerView mentionPickerView, CharSequence charSequence) {
        this.A03 = mentionPickerView;
        this.A00 = r1;
        this.A01 = userJid;
        this.A02 = charSequence;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list;
        C16050sL[] r4 = (C16050sL[]) objArr;
        HashSet A0o = C13680ns.A0o();
        C16460t6 r9 = this.A00;
        Cursor cursor = r9.A0C(r4[0], 15, 1, -1, true).A00;
        try {
            cursor.moveToPrevious();
            int i2 = 0;
            while (cursor.moveToNext() && i2 < 15) {
                C16740tZ A0G = r9.A0G(cursor, r4[0]);
                AnonymousClass00B.A06(A0G);
                if (!(A0G instanceof AnonymousClass1WU) && (list = A0G.A0q) != null && list.contains(this.A01)) {
                    A0o.add((UserJid) A0G.A0B());
                }
                i2++;
            }
            cursor.close();
            return A0o;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Set set = (Set) obj;
        MentionPickerView mentionPickerView = this.A03;
        mentionPickerView.A0G = true;
        C55502ji r3 = mentionPickerView.A0D;
        AnonymousClass576 r2 = r3.A04;
        if (r2 == null) {
            r2 = new AnonymousClass576(r3.A0B, r3.A0D, r3);
            r3.A04 = r2;
        }
        r2.A00 = set;
        mentionPickerView.A0D.getFilter().filter(this.A02);
    }
}
