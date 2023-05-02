package X;

import android.view.MenuItem;
import com.obwhatsapp.group.GroupAddBlacklistPickerActivity;
import com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.obwhatsapp.profile.AboutStatusBlockListPickerActivity;
import com.obwhatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.obwhatsapp.status.audienceselector.StatusRecipientsActivity;
import com.obwhatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.35w  reason: invalid class name */
public class AnonymousClass35w extends C16690tT {
    public final Set A00;
    public final /* synthetic */ C32501gU A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass35w(C32501gU r2, Set set) {
        super(r2, true);
        this.A01 = r2;
        HashSet A0o = C13680ns.A0o();
        this.A00 = A0o;
        A0o.addAll(set);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List linkedList;
        AnonymousClass4K2 r4 = new AnonymousClass4K2();
        ArrayList A0u = AnonymousClass000.A0u();
        r4.A00 = A0u;
        C32501gU r5 = this.A01;
        r5.A09.A0U(A0u);
        r4.A01 = new HashSet(r4.A00.size(), 1.0f);
        Iterator it = r4.A00.iterator();
        while (it.hasNext()) {
            r4.A01.add(C16010sH.A03(C13680ns.A0U(it)));
        }
        boolean z2 = r5 instanceof StatusRecipientsActivity;
        if (r5.A0K) {
            if (z2) {
                StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) r5;
                if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                    StatusTemporalRecipientsActivity statusTemporalRecipientsActivity = (StatusTemporalRecipientsActivity) statusRecipientsActivity;
                    C35541m6 r0 = statusTemporalRecipientsActivity.A00;
                    if (r0 == null) {
                        r0 = statusTemporalRecipientsActivity.A01.A00(statusTemporalRecipientsActivity.getIntent().getExtras());
                        statusTemporalRecipientsActivity.A00 = r0;
                    }
                    linkedList = r0.A02;
                } else {
                    linkedList = statusRecipientsActivity.A02.A09();
                }
            } else {
                linkedList = r5 instanceof ProfilePhotoBlockListPickerActivity ? new ArrayList(((ProfilePhotoBlockListPickerActivity) r5).A00.A03()) : r5 instanceof AboutStatusBlockListPickerActivity ? new ArrayList(((AboutStatusBlockListPickerActivity) r5).A00.A03()) : r5 instanceof LastSeenBlockListPickerActivity ? new ArrayList(((LastSeenBlockListPickerActivity) r5).A00.A03()) : new ArrayList(((GroupAddBlacklistPickerActivity) r5).A00.A03());
            }
        } else if (z2) {
            StatusRecipientsActivity statusRecipientsActivity2 = (StatusRecipientsActivity) r5;
            if (statusRecipientsActivity2 instanceof StatusTemporalRecipientsActivity) {
                StatusTemporalRecipientsActivity statusTemporalRecipientsActivity2 = (StatusTemporalRecipientsActivity) statusRecipientsActivity2;
                C35541m6 r02 = statusTemporalRecipientsActivity2.A00;
                if (r02 == null) {
                    r02 = statusTemporalRecipientsActivity2.A01.A00(statusTemporalRecipientsActivity2.getIntent().getExtras());
                    statusTemporalRecipientsActivity2.A00 = r02;
                }
                linkedList = r02.A01;
            } else {
                linkedList = statusRecipientsActivity2.A02.A08();
            }
        } else {
            linkedList = new LinkedList();
        }
        r4.A02 = new HashSet(linkedList.size());
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            C15830rv A0B = C13700nu.A0B(it2);
            boolean z3 = z2 ? !r5.A0K : !(r5 instanceof LastSeenBlockListPickerActivity) && !(r5 instanceof GroupAddBlacklistPickerActivity);
            boolean contains = r4.A01.contains(A0B);
            if (z3) {
                if (!contains) {
                }
            } else if (!contains) {
                r4.A01.add(A0B);
                r4.A00.add(r5.A09.A0A(A0B));
            }
            r4.A02.add(A0B);
        }
        Collections.sort(r4.A00, new C73603oQ(r4, this, r5.A0B, r5.A01));
        if (linkedList.size() != r4.A02.size()) {
            StringBuilder A0r = AnonymousClass000.A0r("statusrecipients/update old:");
            C13700nu.A0b(A0r, linkedList);
            A0r.append(" new:");
            A0r.append(r4.A02.size());
            C13680ns.A1V(A0r);
            Set set = r4.A02;
            if (z2) {
                StatusRecipientsActivity statusRecipientsActivity3 = (StatusRecipientsActivity) r5;
                AnonymousClass11G r2 = statusRecipientsActivity3.A02;
                int i2 = 1;
                if (statusRecipientsActivity3.A0K) {
                    i2 = 2;
                }
                r2.A0F(set, i2);
            }
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4K2 r8 = (AnonymousClass4K2) obj;
        C32501gU r4 = this.A01;
        r4.A04 = null;
        Set set = r4.A0T;
        set.clear();
        set.addAll(r8.A02);
        Set set2 = r4.A0R;
        set2.clear();
        set2.addAll(set);
        Set set3 = this.A00;
        if (!set3.isEmpty()) {
            for (Object next : set3) {
                if (!(r4 instanceof StatusRecipientsActivity) ? !((r4 instanceof LastSeenBlockListPickerActivity) || (r4 instanceof GroupAddBlacklistPickerActivity)) : (!r4.A0K)) {
                    if (!r8.A01.contains(next)) {
                    }
                }
                set.add(next);
            }
            HashSet A0o = C13680ns.A0o();
            for (Object next2 : r8.A02) {
                if (!set3.contains(next2)) {
                    A0o.add(next2);
                }
            }
            set.removeAll(A0o);
        }
        r4.A37();
        ArrayList arrayList = r8.A00;
        r4.A0I = arrayList;
        r4.A0J = r8.A01;
        MenuItem menuItem = r4.A00;
        if (menuItem != null) {
            menuItem.setVisible(!arrayList.isEmpty());
        }
        C32501gU.A02(r4);
    }
}
