package X;

import android.net.Uri;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0100000_I0_3;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.370  reason: invalid class name */
public class AnonymousClass370 extends C16690tT {
    public final C16000sG A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;
    public final C16820th A03;
    public final AnonymousClass1QZ A04;
    public final C84924Mk A05;
    public final WeakReference A06;

    public AnonymousClass370(C16000sG r2, C16980tz r3, AnonymousClass013 r4, C16820th r5, AnonymousClass1QZ r6, C84924Mk r7, ViewSharedContactArrayActivity viewSharedContactArrayActivity) {
        super(viewSharedContactArrayActivity, true);
        this.A01 = r3;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = C13690nt.A0h(viewSharedContactArrayActivity);
        this.A05 = r7;
    }

    public static Object A03(AbstractCollection abstractCollection, Iterator it, C39701sv r5, int i2, int i3) {
        Object next = it.next();
        abstractCollection.add(new C84914Mj(next, r5.A08.A08, i2, i3));
        return next;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C39701sv r2;
        List<C39711sw> list;
        List list2;
        List A022;
        C84924Mk r22 = this.A05;
        C28381Vw r1 = r22.A01;
        if (r1 != null) {
            C16740tZ A032 = this.A03.A03(r1);
            if (A032 == null) {
                return null;
            }
            C16980tz r4 = this.A01;
            AnonymousClass1QZ r12 = this.A04;
            C16000sG r3 = this.A00;
            AnonymousClass013 r23 = this.A02;
            if (A032 instanceof C38741rL) {
                C39691su A042 = new C39681st(r3, r4, r23).A04((C38741rL) A032);
                if (A042 != null) {
                    return Collections.singletonList(A042);
                }
                return null;
            } else if (A032 instanceof C38811rS) {
                C39681st r13 = new C39681st(r3, r4, r23);
                C38811rS r5 = (C38811rS) A032;
                List list3 = r5.A02;
                if (list3 != null) {
                    return list3;
                }
                List A023 = r13.A02(r5.A12());
                r5.A02 = A023;
                return A023;
            } else if (!C42941yx.A02(A032) || (A022 = AnonymousClass2QA.A02(A032, r12)) == null) {
                return null;
            } else {
                return new C39681st(r3, r4, r23).A02(A022);
            }
        } else {
            List list4 = r22.A03;
            if (list4 != null) {
                return new C39681st(this.A00, this.A01, this.A02).A02(list4);
            }
            Uri uri = r22.A00;
            if (uri != null) {
                try {
                    AnonymousClass1QZ r14 = this.A04;
                    return r14.A00(r14.A01(uri)).A02;
                } catch (AnonymousClass25G | IOException e2) {
                    Log.e((Throwable) new AnonymousClass25H(e2));
                    return null;
                }
            } else {
                List<C93474jG> list5 = r22.A02;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0u = AnonymousClass000.A0u();
                for (C93474jG r15 : list5) {
                    UserJid nullable = UserJid.getNullable(r15.A01);
                    C16740tZ A002 = this.A03.A00(r15.A00);
                    if (!(nullable == null || A002 == null)) {
                        List A024 = AnonymousClass2QA.A02(A002, this.A04);
                        if (A024 == null) {
                            list2 = Collections.emptyList();
                        } else {
                            ArrayList A0u2 = AnonymousClass000.A0u();
                            Iterator it = A024.iterator();
                            while (it.hasNext()) {
                                String A0m = AnonymousClass000.A0m(it);
                                if (A0m.contains(AnonymousClass000.A0h(nullable.user, AnonymousClass000.A0r("waid=")))) {
                                    try {
                                        C39681st r0 = new C39681st(this.A00, this.A01, this.A02);
                                        r0.A06(A0m);
                                        r2 = r0.A03;
                                    } catch (AnonymousClass25G e3) {
                                        Log.e("Failed to get contact from VCard.", e3);
                                        r2 = null;
                                    }
                                    if (!(r2 == null || (list = r2.A05) == null)) {
                                        for (C39711sw r02 : list) {
                                            if (nullable.equals(r02.A01)) {
                                                A0u2.add(new C39691su(A0m, r2));
                                            }
                                        }
                                    }
                                }
                            }
                            list2 = A0u2;
                        }
                        A0u.addAll(list2);
                    }
                }
                return A0u;
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        C16010sH A08;
        List<C39691su> list = (List) obj;
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A06.get();
        if (viewSharedContactArrayActivity != null) {
            viewSharedContactArrayActivity.Ac1();
            if (list == null || list.isEmpty()) {
                Log.w("viewsharedcontactarrayactivity/oncreate/no vcards to display");
                viewSharedContactArrayActivity.A05.A09(R.string.str0856, 0);
                viewSharedContactArrayActivity.finish();
                return;
            }
            HashSet A0o = C13680ns.A0o();
            for (C39691su r0 : list) {
                C39701sv r7 = r0.A01;
                String A022 = r7.A02();
                if (!A0o.contains(A022)) {
                    viewSharedContactArrayActivity.A0M.add(r7);
                    viewSharedContactArrayActivity.A0N.add(new SparseArray());
                    A0o.add(A022);
                } else if (r7.A05 != null) {
                    ArrayList arrayList = viewSharedContactArrayActivity.A0M;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C39701sv r2 = (C39701sv) it.next();
                        if (r2.A02().equals(A022) && r2.A05 != null && r7.A05.size() > r2.A05.size()) {
                            arrayList.set(arrayList.indexOf(r2), r7);
                        }
                    }
                }
            }
            if (viewSharedContactArrayActivity.A0H == null) {
                Collections.sort(viewSharedContactArrayActivity.A0M, new AnonymousClass575(viewSharedContactArrayActivity.A0A));
            }
            ImageView imageView = (ImageView) viewSharedContactArrayActivity.findViewById(R.id.send_btn);
            if (viewSharedContactArrayActivity.A0L) {
                imageView.setVisibility(0);
                C447725m.A01(viewSharedContactArrayActivity, imageView, viewSharedContactArrayActivity.A0A, R.drawable.input_send);
                C13690nt.A0N(viewSharedContactArrayActivity).A0J(viewSharedContactArrayActivity.getResources().getQuantityString(R.plurals.plurals012a, viewSharedContactArrayActivity.A0M.size()));
            } else {
                imageView.setVisibility(8);
                int size = list.size();
                C005402i A0N = C13690nt.A0N(viewSharedContactArrayActivity);
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, size, 0);
                A0N.A0J(viewSharedContactArrayActivity.A0A.A0J(A1b, R.plurals.plurals0183, (long) size));
            }
            RecyclerView recyclerView = (RecyclerView) viewSharedContactArrayActivity.findViewById(R.id.rvContacts);
            ArrayList arrayList2 = viewSharedContactArrayActivity.A0M;
            List list2 = viewSharedContactArrayActivity.A0H;
            ArrayList A0u = AnonymousClass000.A0u();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                C39701sv r12 = (C39701sv) arrayList2.get(i3);
                SparseArray sparseArray = (SparseArray) viewSharedContactArrayActivity.A0N.get(i3);
                A0u.add(new AnonymousClass4FP(r12));
                ArrayList A0u2 = AnonymousClass000.A0u();
                List<C39711sw> list3 = r12.A05;
                if (list3 != null) {
                    i2 = 0;
                    for (C39711sw r22 : list3) {
                        if (r22.A01 == null) {
                            A0u2.add(r22);
                        } else {
                            A0u.add(new C84914Mj(r22, r12.A08.A08, i3, i2));
                            ViewSharedContactArrayActivity.A02(sparseArray, i2).A00 = r22;
                            i2++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                List list4 = r12.A02;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        ViewSharedContactArrayActivity.A02(sparseArray, i2).A00 = A03(A0u, it2, r12, i3, i2);
                        i2++;
                    }
                }
                Iterator it3 = A0u2.iterator();
                while (it3.hasNext()) {
                    ViewSharedContactArrayActivity.A02(sparseArray, i2).A00 = A03(A0u, it3, r12, i3, i2);
                    i2++;
                }
                List list5 = r12.A06;
                if (list5 != null) {
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        ViewSharedContactArrayActivity.A02(sparseArray, i2).A00 = A03(A0u, it4, r12, i3, i2);
                        i2++;
                    }
                }
                if (r12.A07 != null) {
                    ArrayList A0n = C13680ns.A0n(r12.A07.keySet());
                    Collections.sort(A0n);
                    ArrayList A0u3 = AnonymousClass000.A0u();
                    Iterator it5 = A0n.iterator();
                    while (it5.hasNext()) {
                        List<C87294We> list6 = (List) r12.A07.get(it5.next());
                        if (list6 != null) {
                            for (C87294We r1 : list6) {
                                if (r1.A01.equals("URL")) {
                                    r1.toString();
                                    Pattern pattern = viewSharedContactArrayActivity.A0I;
                                    if (pattern == null) {
                                        pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?");
                                        viewSharedContactArrayActivity.A0I = pattern;
                                    }
                                    if (pattern.matcher(r1.A02).matches()) {
                                        A0u3.add(r1);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it6 = A0n.iterator();
                    while (it6.hasNext()) {
                        List<C87294We> list7 = (List) r12.A07.get(it6.next());
                        if (list7 != null) {
                            for (C87294We r13 : list7) {
                                if (!r13.A01.equals("URL")) {
                                    r13.toString();
                                    A0u3.add(r13);
                                }
                            }
                        }
                    }
                    Iterator it7 = A0u3.iterator();
                    while (it7.hasNext()) {
                        ViewSharedContactArrayActivity.A02(sparseArray, i2).A00 = A03(A0u, it7, r12, i3, i2);
                        i2++;
                    }
                }
                if (list2 != null) {
                    C93474jG r14 = (C93474jG) list2.get(i3);
                    UserJid nullable = UserJid.getNullable(r14.A02);
                    if (!(nullable == null || (A08 = viewSharedContactArrayActivity.A03.A08(nullable)) == null)) {
                        A0u.add(new C55622k3(A08, nullable, viewSharedContactArrayActivity, r14.A00));
                    }
                }
                A0u.add(new AnonymousClass4FO());
            }
            ((AnonymousClass4FO) A0u.get(A0u.size() - 1)).A00 = true;
            recyclerView.setAdapter(new C55632k4(viewSharedContactArrayActivity, A0u));
            recyclerView.setLayoutManager(new LinearLayoutManager());
            imageView.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(viewSharedContactArrayActivity, 9));
        }
    }
}
