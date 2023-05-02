package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* renamed from: X.0GX  reason: invalid class name */
public abstract class AnonymousClass0GX extends AnonymousClass012 {
    public AnonymousClass050 A00 = null;
    public AnonymousClass01A A01 = null;
    public ArrayList A02 = AnonymousClass000.A0u();
    public ArrayList A03 = AnonymousClass000.A0u();
    public boolean A04;
    public final AnonymousClass02C A05;

    public AnonymousClass0GX(AnonymousClass02C r3) {
        this.A05 = r3;
    }

    public Parcelable A03() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            AnonymousClass0Y8[] r1 = new AnonymousClass0Y8[arrayList.size()];
            arrayList.toArray(r1);
            bundle.putParcelableArray("states", r1);
        } else {
            bundle = null;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.A02;
            if (i2 >= arrayList2.size()) {
                return bundle;
            }
            AnonymousClass01A r2 = (AnonymousClass01A) arrayList2.get(i2);
            if (r2 != null && r2.A0c()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.A05.A0Q(bundle, r2, AnonymousClass000.A0l(AnonymousClass000.A0r("f"), i2));
            }
            i2++;
        }
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        AnonymousClass0Y8 r1;
        Object obj;
        ArrayList arrayList = this.A02;
        if (arrayList.size() > i2 && (obj = arrayList.get(i2)) != null) {
            return obj;
        }
        if (this.A00 == null) {
            this.A00 = new AnonymousClass050(this.A05);
        }
        AnonymousClass01A A0F = A0F(i2);
        ArrayList arrayList2 = this.A03;
        if (arrayList2.size() > i2 && (r1 = (AnonymousClass0Y8) arrayList2.get(i2)) != null) {
            if (A0F.A0H == null) {
                Bundle bundle = r1.A00;
                if (bundle == null) {
                    bundle = null;
                }
                A0F.A06 = bundle;
            } else {
                throw AnonymousClass000.A0V("Fragment already added");
            }
        }
        while (arrayList.size() <= i2) {
            arrayList.add((Object) null);
        }
        A0F.A0b(false);
        arrayList.set(i2, A0F);
        this.A00.A09(A0F, viewGroup.getId());
        this.A00.A0B(A0F, C011005f.STARTED);
        return A0F;
    }

    public void A09(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable add : parcelableArray) {
                    arrayList.add(add);
                }
            }
            Iterator it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                if (A0m.startsWith("f")) {
                    int parseInt = Integer.parseInt(A0m.substring(1));
                    AnonymousClass01A A09 = this.A05.A09(bundle, A0m);
                    if (A09 == null) {
                        Log.w("FragmentStatePagerAdapt", AnonymousClass000.A0h(A0m, AnonymousClass000.A0r("Bad fragment at key ")));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add((Object) null);
                        }
                        A09.A0b(false);
                        arrayList2.set(parseInt, A09);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0A(ViewGroup viewGroup) {
        AnonymousClass050 r2 = this.A00;
        if (r2 != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    r2.A04();
                    this.A04 = false;
                } catch (Throwable th) {
                    this.A04 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    public void A0B(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0r = AnonymousClass000.A0r("ViewPager with adapter ");
            A0r.append(this);
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(" requires a view id", A0r));
        }
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass01A r6 = (AnonymousClass01A) obj;
        AnonymousClass01A r1 = this.A01;
        if (r6 != r1) {
            if (r1 != null) {
                r1.A0b(false);
                AnonymousClass050 r2 = this.A00;
                if (r2 == null) {
                    r2 = new AnonymousClass050(this.A05);
                    this.A00 = r2;
                }
                r2.A0B(this.A01, C011005f.STARTED);
            }
            r6.A0b(true);
            AnonymousClass050 r12 = this.A00;
            if (r12 == null) {
                r12 = new AnonymousClass050(this.A05);
                this.A00 = r12;
            }
            r12.A0B(r6, C011005f.RESUMED);
            this.A01 = r6;
        }
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        ArrayList arrayList;
        AnonymousClass01A r5 = (AnonymousClass01A) obj;
        if (this.A00 == null) {
            this.A00 = new AnonymousClass050(this.A05);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i2) {
                break;
            }
            arrayList.add((Object) null);
        }
        arrayList.set(i2, r5.A0c() ? this.A05.A07(r5) : null);
        this.A02.set(i2, (Object) null);
        this.A00.A07(r5);
        if (r5.equals(this.A01)) {
            this.A01 = null;
        }
    }

    public boolean A0E(View view, Object obj) {
        return AnonymousClass000.A1Y(((AnonymousClass01A) obj).A0A, view);
    }

    public abstract AnonymousClass01A A0F(int i2);
}
