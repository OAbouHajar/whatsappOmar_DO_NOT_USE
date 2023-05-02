package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: X.5fV  reason: invalid class name and case insensitive filesystem */
public class C111205fV extends C115845qP {
    public C111155fQ A00;
    public AnonymousClass5xJ A01;

    public C111205fV(Camera.Parameters parameters, Camera camera, C111155fQ r9, C111175fS r10, int i2) {
        this.A00 = r9;
        this.A01 = new AnonymousClass5xJ(parameters, camera, r9, r10, i2);
    }

    public static boolean A00(AnonymousClass5xJ r1, C115835qO r2, int i2, boolean z2) {
        return z2 | r1.A02(r2, Integer.valueOf(i2));
    }

    public static boolean A01(AnonymousClass5xJ r0, C115835qO r1, Object obj, boolean z2) {
        return z2 | r0.A02(r1, obj);
    }

    public void A02() {
        A04(this.A00.A00());
    }

    public void A03() {
        List A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0k, this.A00);
        int i2 = 4;
        if (!C110115dX.A1E(A012, 4)) {
            i2 = 1;
            if (!C110115dX.A1E(A012, 1)) {
                i2 = 6;
                if (!C110115dX.A1E(A012, 6)) {
                    return;
                }
            }
        }
        this.A00.A01(AnonymousClass5wI.A0C, Integer.valueOf(i2));
    }

    public void A04(C117775tX r39) {
        C111175fS r2;
        this.A00 = new C118845vL();
        AnonymousClass5xJ r15 = this.A01;
        try {
            r2 = (C111175fS) r15.A04.clone();
        } catch (CloneNotSupportedException e2) {
            Log.e("ParametersModificationApplier", "Could not clone the camera settings", e2);
            r2 = null;
        }
        C117775tX r9 = r39;
        boolean z2 = r9.A0w;
        boolean A02 = z2 ? r15.A02(AnonymousClass5wI.A0C, Integer.valueOf(r9.A0D)) : false;
        boolean z3 = r9.A0a;
        boolean z4 = z3;
        if (z3) {
            A02 = A00(r15, AnonymousClass5wI.A00, r9.A07, A02);
        }
        boolean z5 = r9.A0n;
        boolean z6 = z5;
        if (z5) {
            A02 = A00(r15, AnonymousClass5wI.A06, r9.A09, A02);
        }
        boolean z7 = r9.A0u;
        boolean z8 = z7;
        if (z7) {
            A02 = A00(r15, AnonymousClass5wI.A0A, r9.A0C, A02);
        }
        boolean z9 = r9.A0q;
        boolean z10 = z9;
        if (z9) {
            A02 = A00(r15, AnonymousClass5wI.A08, r9.A0B, A02);
        }
        boolean z11 = r9.A0v;
        boolean z12 = z11;
        if (z11) {
            A02 = A01(r15, AnonymousClass5wI.A0B, r9.A0Y, A02);
        }
        boolean z13 = r9.A18;
        boolean z14 = z13;
        if (z13) {
            A02 = A00(r15, AnonymousClass5wI.A0X, r9.A0F, A02);
        }
        boolean z15 = r9.A19;
        if (z15) {
            A02 = A00(r15, AnonymousClass5wI.A0Y, r9.A0G, A02);
        }
        boolean z16 = r9.A1A;
        if (z16) {
            A02 = A01(r15, AnonymousClass5wI.A0Z, r9.A0R, A02);
        }
        boolean z17 = r9.A1C;
        boolean z18 = z17;
        if (z17) {
            A02 = A01(r15, AnonymousClass5wI.A0b, r9.A0Z, A02);
        }
        boolean z19 = r9.A1G;
        boolean z20 = z19;
        if (z19) {
            A02 = A00(r15, AnonymousClass5wI.A0e, r9.A0I, A02);
        }
        boolean z21 = r9.A1H;
        boolean z22 = z21;
        if (z21) {
            A02 = A01(r15, AnonymousClass5wI.A0g, r9.A0S, A02);
        }
        boolean z23 = r9.A1I;
        boolean z24 = z23;
        if (z23) {
            A02 = A00(r15, AnonymousClass5wI.A0i, r9.A0J, A02);
        }
        boolean z25 = r9.A1K;
        boolean z26 = z25;
        if (z25) {
            A02 = A00(r15, AnonymousClass5wI.A0k, r9.A0K, A02);
        }
        boolean z27 = r9.A1J;
        boolean z28 = z27;
        if (z27) {
            A02 = A01(r15, AnonymousClass5wI.A0j, r9.A1b, A02);
        }
        boolean z29 = r9.A1L;
        boolean z30 = z29;
        if (z29) {
            A02 = A01(r15, AnonymousClass5wI.A0m, r9.A0T, A02);
        }
        boolean z31 = r9.A1Q;
        boolean z32 = z31;
        if (z31) {
            A02 = A00(r15, AnonymousClass5wI.A0o, r9.A0L, A02);
        }
        boolean z33 = r9.A1V;
        boolean z34 = z33;
        if (z33) {
            A02 = A01(r15, AnonymousClass5wI.A0W, Boolean.valueOf(r9.A1U), A02);
        }
        boolean z35 = r9.A1T;
        boolean z36 = z35;
        if (z35) {
            A02 = A01(r15, AnonymousClass5wI.A0s, r9.A0U, A02);
        }
        boolean z37 = r9.A1W;
        boolean z38 = z37;
        if (z37) {
            A02 = A00(r15, AnonymousClass5wI.A0t, r9.A0N, A02);
        }
        boolean z39 = r9.A1Y;
        boolean z40 = z39;
        if (z39) {
            A02 = A00(r15, AnonymousClass5wI.A0v, r9.A0O, A02);
        }
        boolean z41 = r9.A15;
        boolean z42 = z41;
        if (z41) {
            A02 = A01(r15, AnonymousClass5wI.A0T, Boolean.valueOf(r9.A14), A02);
        }
        boolean z43 = r9.A1P;
        if (z43) {
            A02 = A01(r15, AnonymousClass5wI.A0n, Boolean.valueOf(r9.A1O), A02);
        }
        boolean z44 = r9.A0z;
        if (z44) {
            A02 = A01(r15, AnonymousClass5wI.A0D, Double.valueOf(r9.A01), A02);
        }
        boolean z45 = r9.A10;
        if (z45) {
            A02 = A01(r15, AnonymousClass5wI.A0E, Double.valueOf(r9.A02), A02);
        }
        boolean z46 = r9.A11;
        if (z46) {
            A02 = A01(r15, AnonymousClass5wI.A0F, Double.valueOf(r9.A03), A02);
        }
        boolean z47 = r9.A12;
        if (z47) {
            A02 = A01(r15, AnonymousClass5wI.A0G, r9.A0W, A02);
        }
        boolean z48 = r9.A13;
        if (z48) {
            A02 = A01(r15, AnonymousClass5wI.A0H, Long.valueOf(r9.A0Q), A02);
        }
        boolean z49 = r9.A1F;
        boolean z50 = z49;
        if (z49) {
            A02 = A00(r15, AnonymousClass5wI.A0c, r9.A0H, A02);
        }
        if (r9.A1S) {
            A02 = A00(r15, AnonymousClass5wI.A0r, r9.A0M, A02);
        }
        boolean z51 = r9.A17;
        if (z51) {
            A02 = A00(r15, AnonymousClass5wI.A0I, r9.A0E, A02);
        }
        if (r9.A0p) {
            A02 = A01(r15, AnonymousClass5wI.A0h, (Object) null, A02);
        }
        boolean z52 = r9.A16;
        if (z52) {
            A02 = A01(r15, AnonymousClass5wI.A0S, Boolean.valueOf(z52), A02);
        }
        if (r9.A0g) {
            A02 = A01(r15, AnonymousClass5wI.A0K, Boolean.valueOf(r9.A0f), A02);
        }
        if (A02) {
            AnonymousClass5xJ.A05.incrementAndGet();
            try {
                AnonymousClass5xH.A00();
                r15.A02.setParameters(r15.A01);
                AnonymousClass5xH.A00();
            } catch (RuntimeException e3) {
                AnonymousClass5xH.A00();
                Object[] objArr = new Object[4];
                objArr[0] = r2 != null ? r2.A06() : "null";
                objArr[1] = r15.A04.A06();
                objArr[2] = r15.A01.flatten();
                StringBuilder A0o = AnonymousClass000.A0o();
                if (z2) {
                    A0o.append("focusMode=");
                    A0o.append(r9.A0D);
                }
                if (r9.A1B) {
                    A0o.append("lensFocusDistance=");
                    A0o.append(r9.A05);
                }
                if (r9.A00) {
                    A0o.append(",autoExposureEnabled=");
                    A0o.append(r9.A0h);
                }
                if (z4) {
                    A0o.append(",antibanding=");
                    A0o.append(r9.A07);
                }
                if (z6) {
                    A0o.append(",colorEffect=");
                    A0o.append(r9.A09);
                }
                if (z8) {
                    A0o.append(",flashMode=");
                    A0o.append(r9.A0C);
                }
                if (z10) {
                    A0o.append(",exposureCompensation=");
                    A0o.append(r9.A0B);
                }
                if (z12) {
                    A0o.append(",focusAreas=");
                    A0o.append(C119385xd.A01(r9.A0Y));
                }
                if (z14) {
                    A0o.append(",jpegQuality=");
                    A0o.append(r9.A0F);
                }
                if (z15) {
                    A0o.append(",jpegThumbnailQuality=");
                    A0o.append(r9.A0G);
                }
                if (z16) {
                    A0o.append(",jpegThumbnailSize=");
                    AnonymousClass5vQ.A01(r9.A0R, A0o);
                }
                if (z18) {
                    A0o.append(",meteringAreas=");
                    A0o.append(C119385xd.A01(r9.A0Z));
                }
                if (z20) {
                    A0o.append(",pictureFormat=");
                    A0o.append(r9.A0I);
                }
                if (z22) {
                    A0o.append(",pictureSize=");
                    AnonymousClass5vQ.A01(r9.A0S, A0o);
                }
                if (r9.A1X) {
                    A0o.append(",yuvPictureSize=");
                    AnonymousClass5vQ.A01(r9.A0V, A0o);
                }
                if (z24) {
                    A0o.append(",previewFormat=");
                    A0o.append(r9.A0J);
                }
                if (z26) {
                    A0o.append(",previewFrameRate=");
                    A0o.append(r9.A0K);
                }
                if (z28) {
                    A0o.append(",previewFrameRateRange=");
                    int[] iArr = r9.A1b;
                    A0o.append(iArr[0]);
                    A0o.append('-');
                    A0o.append(iArr[1]);
                }
                if (z30) {
                    A0o.append(",previewSize=");
                    AnonymousClass5vQ.A01(r9.A0T, A0o);
                }
                if (z32) {
                    A0o.append(",sceneMode=");
                    A0o.append(r9.A0L);
                }
                if (z34) {
                    A0o.append(",videoStabilizationEnabled=");
                    A0o.append(r9.A1U);
                }
                if (r9.A1N) {
                    A0o.append(",previewStabilizationEnabled=");
                    A0o.append(r9.A1M);
                }
                if (r9.A1E) {
                    A0o.append(",opticalStabilizationEnabled=");
                    A0o.append(r9.A1D);
                }
                if (z36) {
                    A0o.append(",videoSize=");
                    AnonymousClass5vQ.A01(r9.A0U, A0o);
                }
                if (z38) {
                    A0o.append(",whiteBalance=");
                    A0o.append(r9.A0N);
                }
                if (z40) {
                    A0o.append(",zoom=");
                    A0o.append(r9.A0O);
                }
                if (r9.A1R) {
                    A0o.append(",smoothZoom=");
                    A0o.append(r9.A06);
                }
                if (z42) {
                    A0o.append(",hdrEnabled=");
                    A0o.append(r9.A14);
                }
                if (z43) {
                    A0o.append(",recordingHint=");
                    A0o.append(r9.A1O);
                }
                if (z44) {
                    A0o.append(",gpsAltitude=");
                    A0o.append(r9.A01);
                }
                if (z45) {
                    A0o.append(",gpsLatitude=");
                    A0o.append(r9.A02);
                }
                if (z46) {
                    A0o.append(",gpsLongitude=");
                    A0o.append(r9.A03);
                }
                if (z47) {
                    A0o.append(",gpsProcessingMethod=");
                    A0o.append(r9.A0W);
                }
                if (z48) {
                    A0o.append(",gpsTimestamp=");
                    A0o.append(r9.A0Q);
                }
                if (z50) {
                    A0o.append(",photoRotation=");
                    A0o.append(r9.A0H);
                }
                if (z51) {
                    A0o.append(",isoSensitivity=");
                    A0o.append(r9.A0E);
                }
                if (r9.A0t) {
                    A0o.append(",exposureTime=");
                    A0o.append(r9.A0P);
                }
                if (r9.A0o) {
                    A0o.append(",control3aMode=");
                    A0o.append(r9.A0A);
                }
                if (r9.A0b) {
                    A0o.append(",aperture=");
                    A0o.append(r9.A04);
                }
                if (r9.A0k) {
                    A0o.append(",colorCorrectionGains=");
                    A0o.append(r9.A1Z);
                }
                if (r9.A0l) {
                    A0o.append(",colorCorrectionMode=");
                    A0o.append(r9.A08);
                }
                if (r9.A0m) {
                    A0o.append(",colorCorrectionTransform=");
                    A0o.append(r9.A1a);
                }
                if (r9.A0y) {
                    A0o.append(",frameMetaDataEnabled=");
                    A0o.append(r9.A0x);
                }
                if (r9.A0e) {
                    A0o.append(",arCoreEnabled=");
                    A0o.append(r9.A0d);
                }
                objArr[3] = A0o.toString();
                throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", objArr), e3);
            }
        }
    }
}
