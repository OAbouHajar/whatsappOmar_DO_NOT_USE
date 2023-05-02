package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass5xC;
import X.AnonymousClass609;
import X.C110105dW;
import X.C110305dq;
import X.C111755hM;
import X.C111765hN;
import X.C111775hO;
import X.C111785hP;
import X.C111795hQ;
import X.C111805hR;
import X.C111815hS;
import X.C111825hT;
import X.C111835hU;
import X.C111845hV;
import X.C111855hW;
import X.C119505ya;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class IDxCreatorShape17S0000000_3_I1 implements Parcelable.Creator {
    public final int A00;

    public IDxCreatorShape17S0000000_3_I1(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new C110305dq(parcel);
            case 1:
                C111835hU r1 = new C111835hU();
                r1.A08 = parcel.readString();
                r1.A02 = parcel.readString();
                r1.A06 = parcel.readString();
                r1.A03 = parcel.readString();
                r1.A04 = parcel.readString();
                r1.A00 = C110105dW.A0I(parcel);
                r1.A02 = parcel.readString();
                r1.A01 = (C111805hR) parcel.readParcelable(C111805hR.class.getClassLoader());
                return r1;
            case 2:
                return new C111785hP(parcel);
            case 3:
                return new C111765hN(parcel);
            case 4:
                C111805hR r12 = new C111805hR();
                r12.A0A = parcel.readString();
                r12.A03 = C110105dW.A0I(parcel);
                r12.A05 = C110105dW.A0I(parcel);
                r12.A07 = C110105dW.A0I(parcel);
                r12.A04 = C110105dW.A0I(parcel);
                r12.A08 = C110105dW.A0I(parcel);
                boolean z2 = false;
                r12.A0H = AnonymousClass000.A1R(parcel.readInt(), 1);
                r12.A06 = C110105dW.A0I(parcel);
                r12.A03 = parcel.readString();
                r12.A04 = parcel.readString();
                r12.A09 = C110105dW.A0I(parcel);
                r12.A0F = parcel.readString();
                r12.A0C = parcel.readString();
                r12.A01 = parcel.readInt();
                r12.A0D = parcel.readString();
                r12.A0E = parcel.readString();
                ArrayList A0u = AnonymousClass000.A0u();
                r12.A0G = A0u;
                parcel.readStringList(A0u);
                int readInt = parcel.readInt();
                if (readInt != 0) {
                    byte[] bArr = new byte[readInt];
                    r12.A09 = bArr;
                    parcel.readByteArray(bArr);
                }
                r12.A06 = parcel.readString();
                r12.A01 = C110105dW.A0I(parcel);
                r12.A02 = C110105dW.A0I(parcel);
                r12.A00 = parcel.readLong();
                r12.A07 = AnonymousClass000.A1R(parcel.readInt(), 1);
                r12.A08 = AnonymousClass000.A1R(parcel.readInt(), 1);
                r12.A0B = parcel.readString();
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                r12.A0I = z2;
                return r12;
            case 5:
                Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
                C111775hO r13 = new C111775hO();
                r13.A00 = readBundle;
                return r13;
            case 6:
                return new AnonymousClass609(parcel);
            case 7:
                Class<String> cls = String.class;
                C111855hW r14 = new C111855hW();
                r14.A0S(parcel);
                r14.A0A = C110105dW.A0I(parcel);
                r14.A0P = parcel.readString();
                r14.A0N = parcel.readString();
                r14.A0L = parcel.readString();
                r14.A0M = parcel.readString();
                r14.A08 = C110105dW.A0J(C110105dW.A0L(), cls, parcel.readString(), "legalName");
                r14.A0J = parcel.readString();
                r14.A0K = parcel.readString();
                r14.A07 = C110105dW.A0J(C110105dW.A0L(), cls, parcel.readString(), "legalName");
                r14.A05 = parcel.readLong();
                r14.A0E = parcel.readString();
                r14.A04 = parcel.readLong();
                r14.A01 = parcel.readInt();
                r14.A00 = parcel.readInt();
                r14.A02 = parcel.readInt();
                r14.A0Q = parcel.readString();
                r14.A09 = C110105dW.A0I(parcel);
                r14.A0F = parcel.readString();
                r14.A0O = parcel.readString();
                r14.A0H = parcel.readString();
                r14.A0I = parcel.readString();
                String readString = parcel.readString();
                if (readString != null) {
                    r14.A0B = new AnonymousClass5xC(readString);
                }
                int readInt2 = parcel.readInt();
                r14.A0D = readInt2 > 0 ? Boolean.TRUE : readInt2 == 0 ? Boolean.FALSE : null;
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    r14.A0C = new AnonymousClass609(readString2);
                }
                r14.A0G = parcel.readString();
                r14.A06 = C110105dW.A0I(parcel);
                return r14;
            case 8:
                C111795hQ r15 = new C111795hQ();
                r15.A01 = C110105dW.A0I(parcel);
                r15.A02 = parcel.readString();
                r15.A00 = parcel.readInt();
                r15.A03 = parcel.readString();
                r15.A03 = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                r15.A04 = z3;
                r15.A05 = parcel.readString();
                r15.A06 = parcel.readString();
                r15.A02 = C110105dW.A0I(parcel);
                r15.A00 = parcel.readLong();
                return r15;
            case 9:
                C111815hS r16 = new C111815hS();
                boolean z4 = false;
                r16.A0a = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A08 = C110105dW.A0I(parcel);
                r16.A0B = parcel.readString();
                r16.A0A = parcel.readString();
                r16.A0O = parcel.readString();
                r16.A0Q = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A03 = parcel.readInt();
                r16.A0Y = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0U = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A06 = parcel.readLong();
                r16.A04 = parcel.readInt();
                r16.A0G = parcel.readString();
                r16.A0H = parcel.readString();
                r16.A00 = parcel.readInt();
                r16.A0W = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0V = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0S = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0R = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0J = parcel.readString();
                r16.A05 = parcel.readLong();
                r16.A01 = parcel.readInt();
                r16.A07 = AnonymousClass000.A1R(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z4 = true;
                }
                r16.A08 = z4;
                r16.A03 = parcel.readString();
                r16.A06 = parcel.readString();
                r16.A00 = parcel.readInt();
                r16.A04 = parcel.readString();
                r16.A01 = parcel.readInt();
                r16.A0C = parcel.readString();
                r16.A0E = parcel.readString();
                r16.A0D = parcel.readString();
                r16.A09 = Long.valueOf(parcel.readLong());
                r16.A05 = parcel.readString();
                r16.A0F = parcel.readString();
                r16.A0I = parcel.readString();
                boolean z5 = false;
                r16.A0P = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0Z = AnonymousClass000.A1R(parcel.readByte(), 1);
                r16.A0X = AnonymousClass000.A1R(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z5 = true;
                }
                r16.A0T = z5;
                r16.A0N = parcel.readString();
                r16.A0M = parcel.readString();
                r16.A0L = parcel.readString();
                r16.A0K = parcel.readString();
                return r16;
            case 10:
                return new C111755hM(parcel);
            case 11:
                C111825hT r17 = new C111825hT();
                r17.A00 = parcel.readInt();
                r17.A08 = parcel.readString();
                r17.A0B = parcel.readString();
                r17.A02 = parcel.readString();
                r17.A02 = parcel.readString();
                r17.A06 = parcel.readString();
                r17.A03 = parcel.readString();
                r17.A04 = parcel.readString();
                r17.A01 = parcel.readLong();
                r17.A00 = parcel.readInt();
                r17.A01 = parcel.readString();
                r17.A05 = parcel.readString();
                r17.A03 = parcel.readString();
                boolean z6 = false;
                r17.A0D = AnonymousClass000.A1R(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z6 = true;
                }
                r17.A0E = z6;
                r17.A0A = parcel.readString();
                r17.A07 = parcel.readString();
                return r17;
            case 12:
                C111845hV r18 = new C111845hV();
                r18.A0S(parcel);
                r18.A04 = parcel.readString();
                r18.A03 = parcel.readString();
                r18.A02 = parcel.readString();
                r18.A01 = (Boolean) parcel.readSerializable();
                return r18;
            default:
                return new C119505ya(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        switch (this.A00) {
            case 0:
                return new C110305dq[i2];
            case 1:
                return new C111835hU[i2];
            case 2:
                return new C111785hP[i2];
            case 3:
                return new C111765hN[i2];
            case 4:
                return new C111805hR[i2];
            case 5:
                return new C111775hO[i2];
            case 6:
                return new AnonymousClass609[i2];
            case 7:
                return new C111855hW[i2];
            case 8:
                return new C111795hQ[i2];
            case 9:
                return new C111815hS[i2];
            case 10:
                return new C111755hM[i2];
            case 11:
                return new C111825hT[i2];
            case 12:
                return new C111845hV[0];
            default:
                return new C119505ya[i2];
        }
    }
}
