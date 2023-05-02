package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.IDxVHolderShape36S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2VF  reason: invalid class name */
public class AnonymousClass2VF extends AnonymousClass01X implements AnonymousClass2VG {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass2X4 A02;
    public LinkedHashMap A03 = new LinkedHashMap();
    public List A04 = new ArrayList();
    public final /* synthetic */ AnonymousClass2Ur A05;

    public AnonymousClass2VF(AnonymousClass2Ur r2) {
        this.A05 = r2;
    }

    public void A07(C005602k r3) {
        if (r3 instanceof AnonymousClass3SL) {
            ((AnonymousClass3SL) r3).A01.setImageDrawable((Drawable) null);
        } else if (r3 instanceof AnonymousClass3SK) {
            ((AnonymousClass3SK) r3).A00.setImageDrawable((Drawable) null);
        }
    }

    public int A0C() {
        AnonymousClass2Ur r1 = this.A05;
        boolean z2 = true;
        boolean A052 = r1.A0P.A05(1);
        AnonymousClass2X3 r3 = r1.A0O;
        int i2 = 0;
        if (r3 == null || !r3.A05()) {
            z2 = false;
        }
        int size = this.A04.size();
        if (z2 && ((String) r3.A02.A01()).isEmpty()) {
            i2 = this.A01 + (A052 ? 1 : 0);
        }
        return size + i2;
    }

    public final C89934dB A0E(int i2) {
        Object obj;
        if (i2 < this.A04.size()) {
            obj = this.A04.get(i2);
        } else if (this.A05.A0P.A05(1) && i2 == A0C() - 1) {
            return new C89934dB(4);
        } else {
            int size = i2 - this.A04.size();
            for (List list : this.A03.values()) {
                if (size < list.size()) {
                    obj = list.get(size);
                } else {
                    size -= list.size();
                }
            }
            StringBuilder sb = new StringBuilder("Could not translate adapter position ");
            sb.append(i2);
            sb.append(" to a grid item.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (C89934dB) obj;
    }

    public final List A0F(C37771pi r6) {
        Collection<C102814zZ> collection = (Collection) this.A05.A0c.get(r6.A0F);
        AnonymousClass00B.A06(collection);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C89934dB(r6.A0H, 1));
        int i2 = 0;
        for (C102814zZ r1 : collection) {
            arrayList.add(new C89934dB((AnonymousClass2V1) r1, i2));
            i2++;
        }
        return arrayList;
    }

    public void A0G() {
        ArrayList arrayList;
        int size = this.A04.size();
        this.A04.clear();
        AnonymousClass2Ur r8 = this.A05;
        int i2 = this.A00 << 1;
        if (r8.A0O.A05()) {
            AnonymousClass334 r7 = r8.A0U;
            if (r7 != null && !r7.A01) {
                r7.A01 = true;
                C57502rH r2 = r7.A09;
                r2.A02.add(0);
                Collections.sort(r2.A02);
                r2.A01();
                r2.A0E();
                r7.A01();
            }
            C26211Mt r3 = r8.A0F;
            boolean z2 = false;
            if (r3.A03 != null) {
                z2 = true;
            }
            if (!z2) {
                arrayList.add(new C89934dB(r8.A05.getString(R.string.str0782), 1));
                arrayList.add(new C89934dB(3));
            } else if (r3.A00() > 0) {
                arrayList.add(new C89934dB(r8.A05.getString(R.string.str0782), 1));
                int i3 = 0;
                for (AnonymousClass2V1 r1 : r3.A03(i2)) {
                    arrayList.add(new C89934dB(r1, i3));
                    i3++;
                }
            } else if (r7 != null && r7.A01) {
                r7.A01 = false;
                C57502rH r12 = r7.A09;
                r12.A02.remove(0);
                Collections.sort(r12.A02);
                r12.A01();
                r12.A0E();
                r7.A01();
            }
            for (AnonymousClass410 r32 : AnonymousClass410.values()) {
                arrayList.add(new C89934dB(r8.A05.getString(r32.sectionResId), 1));
                int i4 = 0;
                for (AnonymousClass2V1 r13 : r32.shapeData) {
                    arrayList.add(new C89934dB(r13, i4));
                    i4++;
                }
            }
            AnonymousClass027 r14 = r8.A0P.A00;
            AnonymousClass2VE r0 = (AnonymousClass2VE) r14.A01();
            if (r0 != null && r0.A01) {
                Set<C102814zZ> set = r8.A0d;
                if (set.size() > 0) {
                    arrayList.add(new C89934dB(r8.A05.getString(R.string.str15eb), 1));
                    int i5 = 0;
                    for (C102814zZ r15 : set) {
                        arrayList.add(new C89934dB((AnonymousClass2V1) r15, i5));
                        i5++;
                    }
                }
            }
            AnonymousClass2VE r02 = (AnonymousClass2VE) r14.A01();
            if (r02 == null || !r02.A01) {
                arrayList.add(new C89934dB(r8.A05.getString(R.string.str15eb), 1));
                arrayList.add(new C89934dB(3));
            }
        } else {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass2HU r33 : r8.A0D.A0E(C16620tM.A02, 2880) ? AnonymousClass2HT.A08 : AnonymousClass2HT.A09) {
                arrayList2.add(Integer.valueOf(arrayList.size()));
                arrayList.add(new C89934dB(r8.A05.getString(r33.A02), 1));
                int i6 = 0;
                for (C37781pj r16 : (List) r33.A03.get()) {
                    C102804zY r22 = new C102804zY(r16, r8.A0C);
                    arrayList.add(new C89934dB((AnonymousClass2V1) r22, i6));
                    i6++;
                    r8.A0g.put(r22.AGT(), r22);
                }
            }
            AnonymousClass335 r34 = r8.A0T;
            boolean z3 = false;
            if (arrayList2.size() == AnonymousClass335.A01.length) {
                z3 = true;
            }
            AnonymousClass00B.A0F(z3);
            C57502rH r03 = r34.A09;
            r03.A02 = arrayList2;
            Collections.sort(arrayList2);
            r03.A01();
            r03.A0E();
            r34.A01();
        }
        this.A04 = arrayList;
        this.A01.A04((Object) null, 0, Math.max(size, arrayList.size()));
        if (size != this.A04.size()) {
            A0I();
        }
    }

    public final void A0H() {
        this.A01 = 0;
        for (List list : this.A03.values()) {
            if (list.size() > 1) {
                this.A01 += list.size();
            } else {
                return;
            }
        }
    }

    public final void A0I() {
        AnonymousClass2Ur r6 = this.A05;
        AnonymousClass334 r2 = r6.A0U;
        if (r2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry : this.A03.entrySet()) {
                if (i2 >= this.A01 - 1) {
                    break;
                }
                arrayList.add(r6.A0b.get(entry.getKey()));
                arrayList2.add(Integer.valueOf(this.A04.size() + i2));
                i2 += ((List) entry.getValue()).size();
            }
            boolean z2 = false;
            if (arrayList.size() == arrayList2.size()) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            List list = r2.A03;
            list.clear();
            list.addAll(arrayList);
            ArrayList arrayList3 = new ArrayList(arrayList2);
            if (r2.A01) {
                arrayList3.add(0);
            }
            C57502rH r0 = r2.A09;
            r0.A02 = arrayList3;
            Collections.sort(arrayList3);
            r0.A01();
            r0.A0E();
            r2.A01();
        }
    }

    public void A0J(C455829l r3) {
        if (r3.A0J()) {
            r3.A09(this.A05.A01);
        }
        AnonymousClass2Ur r1 = this.A05;
        r3.A0O(r1.A00);
        r1.A0I.AX9(r3);
    }

    public void A0K(String str) {
        List list = (List) this.A03.get(str);
        if (list != null) {
            int i2 = 0;
            for (Map.Entry entry : this.A03.entrySet()) {
                if (str.equals(entry.getKey())) {
                    int size = i2 + this.A04.size();
                    this.A03.remove(str);
                    A0H();
                    this.A01.A03(size, list.size());
                    A0I();
                    return;
                }
                i2 += ((List) entry.getValue()).size();
            }
            StringBuilder sb = new StringBuilder("Sticker pack id ");
            sb.append(str);
            sb.append(" is not contained in data set");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void ANf(C005602k r11, int i2) {
        String A0H;
        AnonymousClass4IG r1;
        C89934dB A0E = A0E(i2);
        int i3 = A0E.A02;
        if (i3 == 0) {
            AnonymousClass3SL r112 = (AnonymousClass3SL) r11;
            ShapeItemView shapeItemView = r112.A01;
            AnonymousClass2V1 r5 = A0E.A03;
            AnonymousClass00B.A06(r5);
            r112.A00 = r5;
            shapeItemView.A01 = r5.AGT();
            AnonymousClass2V1 r4 = r112.A00;
            if (r4.AcK()) {
                AnonymousClass2Ur r2 = this.A05;
                Reference reference = (Reference) r2.A0e.get(r5.AGT());
                if (reference == null || (r1 = (AnonymousClass4IG) reference.get()) == null) {
                    shapeItemView.setImageDrawable(new AnonymousClass3L3());
                    shapeItemView.setContentDescription((CharSequence) null);
                    C63893Lx r22 = r2.A0L;
                    Message obtain = Message.obtain(r22, 0, 0, 0, shapeItemView);
                    obtain.setData(AnonymousClass2Ur.A00(r5.AGT()));
                    r22.sendMessageAtFrontOfQueue(obtain);
                    return;
                }
                shapeItemView.setImageDrawable(r1.A00);
                A0H = r1.A01;
            } else {
                Context context = shapeItemView.getContext();
                AnonymousClass2Ur r23 = this.A05;
                C455829l A7b = r4.A7b(context, r23.A0B, true);
                A7b.A09(r23.A01);
                if (A7b.A0K()) {
                    A7b.A0O(r23.A00);
                }
                shapeItemView.setImageDrawable(new AnonymousClass3L4(A7b));
                A0H = A7b.A0H(r23.A05);
            }
            shapeItemView.setContentDescription(A0H);
        } else if (i3 == 1) {
            ((AnonymousClass3S7) r11).A00.setText(A0E.A04);
        } else if (i3 == 2) {
            AnonymousClass2Ur r0 = this.A05;
            C17250um r9 = r0.A0C;
            Activity activity = r0.A05;
            Drawable A052 = r9.A05(activity.getResources(), new C434420a(new int[]{129335}), -1);
            AnonymousClass3SK r113 = (AnonymousClass3SK) r11;
            r113.A01.setText(activity.getString(R.string.str16ed, new Object[]{A0E.A04}));
            r113.A00.setImageDrawable(A052);
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new AnonymousClass3SL(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout054e, viewGroup, false), this);
        }
        if (i2 == 1) {
            return new AnonymousClass3S7(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0552, viewGroup, false), this);
        }
        if (i2 == 2) {
            return new AnonymousClass3SK(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0551, viewGroup, false), this);
        }
        if (i2 == 3) {
            return new IDxVHolderShape36S0100000_2_I0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0550, viewGroup, false), this, 0);
        }
        if (i2 == 4) {
            return new IDxVHolderShape36S0100000_2_I0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0553, viewGroup, false), this, 1);
        }
        StringBuilder sb = new StringBuilder("shapepicker/onCreateViewHolder/invalid state ");
        sb.append(i2);
        Log.e(sb.toString());
        return null;
    }

    public void AWX(AnonymousClass2X4 r6) {
        if (r6.equals(this.A02)) {
            this.A04 = new ArrayList();
            List list = r6.A01;
            if (list.size() > 0) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    AnonymousClass2V1 r2 = (AnonymousClass2V1) list.get(i2);
                    this.A05.A0g.put(r2.AGT(), r2);
                    this.A04.add(new C89934dB((AnonymousClass2V1) list.get(i2), i2));
                }
            } else {
                this.A04.add(new C89934dB((String) this.A05.A0O.A02.A01(), 2));
            }
            A01();
        }
    }

    public int getItemViewType(int i2) {
        return A0E(i2).A02;
    }
}
