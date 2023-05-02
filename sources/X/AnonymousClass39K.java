package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.39K  reason: invalid class name */
public final class AnonymousClass39K {
    public Bundle A00;
    public C107835Lp A01;
    public C107845Lq A02;
    public LinkedList A03;
    public final Context A04;
    public final ViewGroup A05;
    public final C107845Lq A06 = new C98094r5(this);
    public final GoogleMapOptions A07;
    public final List A08 = AnonymousClass000.A0u();

    public AnonymousClass39K(Context context, ViewGroup viewGroup, GoogleMapOptions googleMapOptions) {
        this.A05 = viewGroup;
        this.A04 = context;
        this.A07 = googleMapOptions;
    }

    public final void A00(int i2) {
        while (!this.A03.isEmpty() && ((AnonymousClass5RE) this.A03.getLast()).AiM() >= i2) {
            this.A03.removeLast();
        }
    }

    public final void A01(Bundle bundle, AnonymousClass5RE r6) {
        IMapViewDelegate iMapViewDelegate;
        C107835Lp r0 = this.A01;
        if (r0 != null) {
            r6.AiR(r0);
            return;
        }
        LinkedList linkedList = this.A03;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.A03 = linkedList;
        }
        linkedList.add(r6);
        if (bundle != null) {
            Bundle bundle2 = this.A00;
            if (bundle2 == null) {
                this.A00 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        C107845Lq r02 = this.A06;
        this.A02 = r02;
        if (r02 != null && this.A01 == null) {
            try {
                Context context = this.A04;
                C438721w.A00(context);
                AnonymousClass5U9 A012 = C87874Yz.A01(context);
                C58032sR r2 = new C58032sR(context);
                GoogleMapOptions googleMapOptions = this.A07;
                C31361e1 r3 = (C31361e1) A012;
                Parcel A013 = r3.A01();
                C90334dy.A00(r2, A013);
                C90334dy.A01(A013, googleMapOptions);
                Parcel A022 = r3.A02(3, A013);
                IBinder readStrongBinder = A022.readStrongBinder();
                if (readStrongBinder == null) {
                    iMapViewDelegate = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    iMapViewDelegate = queryLocalInterface instanceof IMapViewDelegate ? (IMapViewDelegate) queryLocalInterface : new C66623aE(readStrongBinder);
                }
                A022.recycle();
                if (iMapViewDelegate != null) {
                    C107845Lq r22 = this.A02;
                    C98084r4 r03 = new C98084r4(this.A05, iMapViewDelegate);
                    AnonymousClass39K r32 = ((C98094r5) r22).A00;
                    r32.A01 = r03;
                    Iterator it = r32.A03.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass5RE) it.next()).AiR(r32.A01);
                    }
                    r32.A03.clear();
                    r32.A00 = null;
                    List<AnonymousClass5OF> list = this.A08;
                    for (AnonymousClass5OF A002 : list) {
                        ((C98084r4) this.A01).A00(A002);
                    }
                    list.clear();
                }
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            } catch (C47092Hl unused) {
            }
        }
    }
}
