package X;

import com.facebook.redex.IDxEnumerationShape16S0101000_2_I1;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: X.4YA  reason: invalid class name */
public class AnonymousClass4YA {
    public static String A00(Object obj) {
        C32051fZ Agm;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof C32051fZ) {
            Agm = (C32051fZ) obj;
        } else if (obj instanceof C32071fb) {
            Agm = ((C32071fb) obj).Agm();
        } else {
            return AnonymousClass000.A0h(obj.toString(), AnonymousClass000.A0r("unknown object type "));
        }
        A01("", stringBuffer, Agm);
        return stringBuffer.toString();
    }

    public static void A01(String str, StringBuffer stringBuffer, C32051fZ r16) {
        StringBuilder A0q;
        StringBuilder A0q2;
        byte[] bArr;
        String str2;
        StringBuilder A0q3;
        String A02;
        String obj;
        String A0A;
        byte[] bArr2;
        StringBuilder A0q4;
        int i2;
        String str3;
        C32051fZ r4 = r16;
        String str4 = C32941ha.A00;
        if (r4 instanceof C32411gJ) {
            Enumeration A0B = ((C32411gJ) r4).A0B();
            String A0h = AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str));
            stringBuffer.append(str);
            stringBuffer.append(r4 instanceof C107545Ip ? "BER Sequence" : r4 instanceof C32401gI ? "DER Sequence" : "Sequence");
            while (true) {
                stringBuffer.append(str4);
                while (A0B.hasMoreElements()) {
                    Object nextElement = A0B.nextElement();
                    if (nextElement == null || nextElement.equals(C107275Hc.A00)) {
                        stringBuffer.append(A0h);
                        stringBuffer.append("NULL");
                    } else {
                        A01(A0h, stringBuffer, nextElement instanceof C32051fZ ? (C32051fZ) nextElement : ((C32071fb) nextElement).Agm());
                    }
                }
                return;
            }
        } else if (r4 instanceof C107525In) {
            String A0h2 = AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str));
            stringBuffer.append(str);
            stringBuffer.append(r4 instanceof C107605Iv ? "BER Tagged [" : "Tagged [");
            C107525In r42 = (C107525In) r4;
            stringBuffer.append(Integer.toString(r42.A00));
            stringBuffer.append(']');
            if (!r42.A02) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str4);
            A01(A0h2, stringBuffer, C107525In.A00(r42));
        } else if (r4 instanceof C107595Iu) {
            IDxEnumerationShape16S0101000_2_I1 iDxEnumerationShape16S0101000_2_I1 = new IDxEnumerationShape16S0101000_2_I1((C107595Iu) r4);
            String A0h3 = AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str));
            stringBuffer.append(str);
            stringBuffer.append(r4 instanceof C107565Ir ? "BER Set" : r4 instanceof C107585It ? "DER Set" : "Set");
            while (true) {
                stringBuffer.append(str4);
                while (iDxEnumerationShape16S0101000_2_I1.hasMoreElements()) {
                    Object nextElement2 = iDxEnumerationShape16S0101000_2_I1.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(A0h3);
                        stringBuffer.append("NULL");
                    } else {
                        A01(A0h3, stringBuffer, nextElement2 instanceof C32051fZ ? (C32051fZ) nextElement2 : ((C32071fb) nextElement2).Agm());
                    }
                }
                return;
            }
        } else {
            if (r4 instanceof C107405Ib) {
                C107405Ib r3 = (C107405Ib) r4;
                boolean z2 = r4 instanceof AnonymousClass5IU;
                A0q4 = AnonymousClass000.A0o();
                if (z2) {
                    A0q4.append(str);
                    str3 = "BER Constructed Octet String[";
                } else {
                    A0q4.append(str);
                    str3 = "DER Octet String[";
                }
                A0q4.append(str3);
                i2 = r3.A00.length;
            } else {
                if (r4 instanceof C32041fY) {
                    A0q3 = AnonymousClass000.A0q(str);
                    A0q3.append("ObjectIdentifier(");
                    A02 = ((C32041fY) r4).A01;
                } else {
                    if (r4 instanceof C33051hr) {
                        A0q3 = AnonymousClass000.A0q(str);
                        A0q3.append("Boolean(");
                        A0q3.append(AnonymousClass000.A1O(((C33051hr) r4).A00));
                    } else {
                        if (r4 instanceof C33041hq) {
                            A0q2 = AnonymousClass000.A0q(str);
                            A0q2.append("Integer(");
                            bArr = ((C33041hq) r4).A01;
                        } else if (r4 instanceof AnonymousClass5HY) {
                            C107515Im r43 = (C107515Im) r4;
                            A0q4 = AnonymousClass000.A0q(str);
                            A0q4.append("DER Bit String[");
                            A0q4.append(r43.A0A().length);
                            A0q4.append(", ");
                            i2 = r43.A00;
                        } else {
                            if (r4 instanceof C33021ho) {
                                A0q = AnonymousClass000.A0q(str);
                                A0q.append("IA5String(");
                                A0A = ((C33021ho) r4).AGJ();
                            } else if (r4 instanceof C107495Ik) {
                                A0q = AnonymousClass000.A0q(str);
                                A0q.append("UTF8String(");
                                A0A = ((C107495Ik) r4).AGJ();
                            } else {
                                if (r4 instanceof C107485Ij) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("PrintableString(");
                                    bArr2 = ((C107485Ij) r4).A00;
                                } else if (r4 instanceof C107475Ii) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("VisibleString(");
                                    bArr2 = ((C107475Ii) r4).A00;
                                } else if (r4 instanceof C107435Ie) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("BMPString(");
                                    A0A = new String(((C107435Ie) r4).A00);
                                } else if (r4 instanceof C107465Ih) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("T61String(");
                                    bArr2 = ((C107465Ih) r4).A00;
                                } else if (r4 instanceof C107415Ic) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("GraphicString(");
                                    bArr2 = ((C107415Ic) r4).A00;
                                } else if (r4 instanceof C107425Id) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("VideotexString(");
                                    bArr2 = ((C107425Id) r4).A00;
                                } else if (r4 instanceof AnonymousClass5IX) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("UTCTime(");
                                    A0A = ((AnonymousClass5IX) r4).A0A();
                                } else if (r4 instanceof C107395Ia) {
                                    A0q = AnonymousClass000.A0q(str);
                                    A0q.append("GeneralizedTime(");
                                    A0A = ((C107395Ia) r4).A0A();
                                } else {
                                    if (r4 instanceof AnonymousClass5HV) {
                                        str2 = "BER";
                                    } else if (r4 instanceof AnonymousClass5HW) {
                                        str2 = "";
                                    } else if (r4 instanceof AnonymousClass5IZ) {
                                        A0q2 = AnonymousClass000.A0q(str);
                                        A0q2.append("DER Enumerated(");
                                        bArr = ((AnonymousClass5IZ) r4).A01;
                                    } else if (r4 instanceof AnonymousClass5IY) {
                                        AnonymousClass5IY r44 = (AnonymousClass5IY) r4;
                                        StringBuilder A0q5 = AnonymousClass000.A0q(str);
                                        A0q5.append("External ");
                                        stringBuffer.append(AnonymousClass000.A0h(str4, A0q5));
                                        String A0h4 = AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str));
                                        C32041fY r2 = r44.A02;
                                        if (r2 != null) {
                                            StringBuilder A0q6 = AnonymousClass000.A0q(A0h4);
                                            A0q6.append("Direct Reference: ");
                                            A0q6.append(r2.A01);
                                            stringBuffer.append(AnonymousClass000.A0h(str4, A0q6));
                                        }
                                        C33041hq r22 = r44.A01;
                                        if (r22 != null) {
                                            StringBuilder A0q7 = AnonymousClass000.A0q(A0h4);
                                            A0q7.append("Indirect Reference: ");
                                            AnonymousClass000.A1I(r22, A0q7);
                                            stringBuffer.append(AnonymousClass000.A0h(str4, A0q7));
                                        }
                                        C32051fZ r0 = r44.A03;
                                        if (r0 != null) {
                                            A01(A0h4, stringBuffer, r0);
                                        }
                                        StringBuilder A0q8 = AnonymousClass000.A0q(A0h4);
                                        A0q8.append("Encoding: ");
                                        A0q8.append(r44.A00);
                                        stringBuffer.append(AnonymousClass000.A0h(str4, A0q8));
                                        A01(A0h4, stringBuffer, r44.A04);
                                        return;
                                    } else {
                                        A0q = AnonymousClass000.A0q(str);
                                        AnonymousClass000.A1I(r4, A0q);
                                        obj = AnonymousClass000.A0h(str4, A0q);
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    AnonymousClass5IW A00 = AnonymousClass5IW.A00(r4);
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    if (A00.A01) {
                                        try {
                                            byte[] A01 = A00.A01();
                                            int i3 = 1;
                                            if ((A01[0] & 31) == 31) {
                                                i3 = 2;
                                                byte b2 = A01[1] & 255;
                                                if ((b2 & Byte.MAX_VALUE) == 0) {
                                                    throw AnonymousClass3K3.A0e("corrupted stream - invalid high tag number found");
                                                }
                                                while ((b2 & 128) != 0) {
                                                    b2 = A01[i3] & 255;
                                                    i3++;
                                                }
                                            }
                                            int length = (A01.length - i3) + 1;
                                            byte[] bArr3 = new byte[length];
                                            System.arraycopy(A01, i3, bArr3, 1, length - 1);
                                            byte b3 = (byte) 16;
                                            bArr3[0] = b3;
                                            if ((A01[0] & 32) != 0) {
                                                bArr3[0] = (byte) (b3 | 32);
                                            }
                                            C32411gJ A002 = C32411gJ.A00(C32051fZ.A02(bArr3));
                                            StringBuilder A0q9 = AnonymousClass000.A0q(str);
                                            A0q9.append(str2);
                                            A0q9.append(" ApplicationSpecific[");
                                            A0q9.append(A00.A00);
                                            A0q9.append("]");
                                            stringBuffer2.append(AnonymousClass000.A0h(str4, A0q9));
                                            Enumeration A0B2 = A002.A0B();
                                            while (A0B2.hasMoreElements()) {
                                                A01(AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str)), stringBuffer2, (C32051fZ) A0B2.nextElement());
                                            }
                                        } catch (IOException e2) {
                                            stringBuffer2.append(e2);
                                        }
                                        obj = stringBuffer2.toString();
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    A0q3 = AnonymousClass000.A0q(str);
                                    A0q3.append(str2);
                                    A0q3.append(" ApplicationSpecific[");
                                    A0q3.append(A00.A00);
                                    A0q3.append("] (");
                                    byte[] A022 = C33111hx.A02(A00.A02);
                                    A02 = C32941ha.A02(C90584eP.A03(A022, 0, A022.length));
                                }
                                A0A = C32941ha.A02(bArr2);
                            }
                            A0q.append(A0A);
                            A0q.append(") ");
                            obj = AnonymousClass000.A0h(str4, A0q);
                            stringBuffer.append(obj);
                            return;
                        }
                        A0q3.append(new BigInteger(bArr));
                    }
                    A0q.append(")");
                    obj = AnonymousClass000.A0h(str4, A0q);
                    stringBuffer.append(obj);
                    return;
                }
                A0q3.append(A02);
                A0q.append(")");
                obj = AnonymousClass000.A0h(str4, A0q);
                stringBuffer.append(obj);
                return;
            }
            A0q4.append(i2);
            stringBuffer.append(AnonymousClass000.A0h("] ", A0q4));
            stringBuffer.append(str4);
        }
    }
}
