package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.1fy  reason: invalid class name and case insensitive filesystem */
public class C32281fy {
    public static int A00(Parcel parcel) {
        int readInt = parcel.readInt();
        int A02 = A02(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C105545Aa(parcel, valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"));
        }
        int i2 = A02 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new C105545Aa(parcel, sb.toString());
    }

    public static int A01(Parcel parcel, int i2) {
        A0E(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int A02(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static long A03(Parcel parcel, int i2) {
        A0E(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Bundle A04(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A02);
        return readBundle;
    }

    public static IBinder A05(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A02);
        return readStrongBinder;
    }

    public static Parcelable A06(Parcel parcel, Parcelable.Creator creator, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A02);
        return parcelable;
    }

    public static Float A07(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        if (A02 == 0) {
            return null;
        }
        A0D(parcel, A02, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static String A08(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A02);
        return readString;
    }

    public static ArrayList A09(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A02);
        return createStringArrayList;
    }

    public static ArrayList A0A(Parcel parcel, Parcelable.Creator creator, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A02);
        return createTypedArrayList;
    }

    public static void A0B(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new C105545Aa(parcel, sb.toString());
        }
    }

    public static void A0C(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + A02(parcel, i2));
    }

    public static void A0D(Parcel parcel, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C105545Aa(parcel, sb.toString());
        }
    }

    public static void A0E(Parcel parcel, int i2, int i3) {
        int A02 = A02(parcel, i2);
        if (A02 != i3) {
            String hexString = Integer.toHexString(A02);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(A02);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C105545Aa(parcel, sb.toString());
        }
    }

    public static boolean A0F(Parcel parcel, int i2) {
        A0E(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] A0G(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A02);
        return createByteArray;
    }

    public static int[] A0H(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A02);
        return createIntArray;
    }

    public static Object[] A0I(Parcel parcel, Parcelable.Creator creator, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A02);
        return createTypedArray;
    }

    public static String[] A0J(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A02);
        return createStringArray;
    }

    public static byte[][] A0K(Parcel parcel, int i2) {
        int A02 = A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i3 = 0; i3 < readInt; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A02);
        return bArr;
    }
}
