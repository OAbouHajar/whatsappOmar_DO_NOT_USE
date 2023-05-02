package X;

import android.os.Parcel;

/* renamed from: X.4qr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97954qr implements C108405Nv {
    public final /* synthetic */ AnonymousClass3X4 A00;
    public final /* synthetic */ AnonymousClass3WU A01;

    public /* synthetic */ C97954qr(AnonymousClass3X4 r1, AnonymousClass3WU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A4O(Object obj, Object obj2) {
        AnonymousClass3X4 r4 = this.A00;
        C66253Yq r1 = new C66253Yq((C14370p3) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r1);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        ((C92064gx) ((C15770rp) obj).A01()).A00(10, obtain);
    }
}
