package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.3La  reason: invalid class name and case insensitive filesystem */
public abstract class C63663La extends Binder implements IInterface {
    public C63663La(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IGoogleMapDelegate r1;
        View ACm;
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        if (i2 <= 16777215) {
            AnonymousClass3K4.A0l(this, parcel);
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        if (this instanceof C66753aR) {
            C66753aR r3 = (C66753aR) this;
            if (i2 != 1) {
                return false;
            }
            r3.A00.ATH((LatLng) AnonymousClass3K2.A0N(parcel, LatLng.CREATOR));
        } else if (this instanceof C66743aQ) {
            C66743aQ r32 = (C66743aQ) this;
            if (i2 != 1) {
                return false;
            }
            r32.A00.AO1();
        } else {
            if (this instanceof C66733aP) {
                C66733aP r33 = (C66733aP) this;
                if (i2 != 1) {
                    return false;
                }
                directorySetLocationMapActivity = ((C98624si) r33.A00).A00;
            } else if (this instanceof C66723aO) {
                C66723aO r34 = (C66723aO) this;
                if (i2 != 1) {
                    return false;
                }
                r34.A00.AO3(parcel.readInt());
            } else if (this instanceof C66713aN) {
                C66713aN r35 = (C66713aN) this;
                if (i2 != 1) {
                    return false;
                }
                directorySetLocationMapActivity = ((C98654sl) r35.A00).A00;
            } else if (this instanceof C66703aM) {
                C66703aM r36 = (C66703aM) this;
                if (i2 == 1) {
                    ACm = r36.A00.ACm(new C32451gN(C66763aS.A00(parcel.readStrongBinder())));
                } else if (i2 != 2) {
                    return false;
                } else {
                    new C32451gN(C66763aS.A00(parcel.readStrongBinder()));
                    ACm = null;
                }
                C58032sR r0 = new C58032sR(ACm);
                parcel2.writeNoException();
                C90334dy.A00(r0, parcel2);
                return true;
            } else if (this instanceof C66693aL) {
                C66693aL r37 = (C66693aL) this;
                if (i2 != 1) {
                    return false;
                }
                r37.A00.ASF(new C32451gN(C66763aS.A00(parcel.readStrongBinder())));
            } else if (this instanceof C66683aK) {
                C66683aK r38 = (C66683aK) this;
                if (i2 != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    r1 = queryLocalInterface instanceof IGoogleMapDelegate ? (IGoogleMapDelegate) queryLocalInterface : new C66613aD(readStrongBinder);
                }
                r38.A00.ATK(new AnonymousClass2NT(r1));
            } else if (this instanceof C66673aJ) {
                C66673aJ r39 = (C66673aJ) this;
                if (i2 == 1) {
                    r39.A00.ARM();
                } else if (i2 != 2) {
                    return false;
                } else {
                    r39.A00.AO4();
                }
            } else {
                C66663aI r310 = (C66663aI) this;
                if (i2 != 1) {
                    return false;
                }
                boolean ATM = r310.A00.ATM(new C32451gN(C66763aS.A00(parcel.readStrongBinder())));
                parcel2.writeNoException();
                parcel2.writeInt(ATM ? 1 : 0);
                return true;
            }
            directorySetLocationMapActivity.A36();
        }
        parcel2.writeNoException();
        return true;
    }
}
