package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5xm  reason: invalid class name and case insensitive filesystem */
public class C119415xm {
    public static final Range A00;
    public static final boolean A01;
    public static final int[] A02 = new int[0];

    static {
        boolean z2 = false;
        Float valueOf = Float.valueOf(0.0f);
        A00 = Range.create(valueOf, valueOf);
        if (Build.VERSION.SDK_INT >= 30) {
            z2 = true;
        }
        A01 = z2;
    }

    public static int A00(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 18;
            case 18:
                return 17;
            default:
                return -1;
        }
    }

    public static int A01(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        Number number = (Number) cameraCharacteristics.get(key);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static Range A02(CameraCharacteristics cameraCharacteristics) {
        Float valueOf;
        Float valueOf2;
        if (!A01) {
            List A0F = A0F(cameraCharacteristics);
            valueOf = (Float) C13690nt.A0Z(A0F);
            valueOf2 = (Float) A0F.get(A0F.size() - 1);
        } else {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                Number number = (Number) range.getLower();
                Number number2 = (Number) range.getUpper();
                if (!(number == null || number2 == null)) {
                    valueOf = Float.valueOf(number.floatValue() * 100.0f);
                    valueOf2 = Float.valueOf(number2.floatValue() * 100.0f);
                }
            }
            return A00;
        }
        return new Range(valueOf, valueOf2);
    }

    public static List A03(float f2) {
        if (f2 <= 0.0f) {
            return null;
        }
        double d2 = (double) f2;
        int log = (int) ((Math.log(1.0E-11d + d2) * 20.0d) / Math.log(2.0d));
        double d3 = 1.0d;
        double pow = Math.pow(d2, 1.0d / ((double) log));
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(Float.valueOf(100.0f));
        for (int i2 = 0; i2 < log - 1; i2++) {
            d3 *= pow;
            A0u.add(Float.valueOf((float) (100.0d * d3)));
        }
        A0u.add(Float.valueOf(f2 * 100.0f));
        return A0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r1 != 5) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A04(android.hardware.camera2.CameraCharacteristics r6) {
        /*
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r6 = r6.get(r0)
            int[] r6 = (int[]) r6
            if (r6 != 0) goto L_0x000c
            int[] r6 = A02
        L_0x000c:
            int r5 = r6.length
            if (r5 <= 0) goto L_0x003e
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r3 = 0
            r2 = 0
        L_0x0015:
            r1 = r6[r2]
            if (r1 == 0) goto L_0x0036
            r0 = 1
            if (r1 == r0) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x0031
            r0 = 3
            if (r1 == r0) goto L_0x0031
            r0 = 4
            if (r1 == r0) goto L_0x0031
            r0 = 5
            if (r1 == r0) goto L_0x0031
        L_0x0028:
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0015
            java.util.List r0 = X.C110105dW.A0j(r4)
            return r0
        L_0x0031:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003a
        L_0x0036:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x003a:
            r4.add(r0)
            goto L_0x0028
        L_0x003e:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119415xm.A04(android.hardware.camera2.CameraCharacteristics):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r1 != 3) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A05(android.hardware.camera2.CameraCharacteristics r6) {
        /*
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES
            java.lang.Object r6 = r6.get(r0)
            int[] r6 = (int[]) r6
            if (r6 != 0) goto L_0x000c
            int[] r6 = A02
        L_0x000c:
            int r5 = r6.length
            if (r5 != 0) goto L_0x0014
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0014:
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r3 = 0
            r2 = 0
        L_0x001a:
            r1 = r6[r2]
            if (r1 == 0) goto L_0x0035
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 2
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x0030
        L_0x0027:
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x001a
            java.util.List r0 = X.C110105dW.A0j(r4)
            return r0
        L_0x0030:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0039
        L_0x0035:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0039:
            r4.add(r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119415xm.A05(android.hardware.camera2.CameraCharacteristics):java.util.List");
    }

    public static List A06(CameraCharacteristics cameraCharacteristics) {
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (float valueOf : fArr) {
            A0u.add(Float.valueOf(valueOf));
        }
        return C110105dW.A0j(A0u);
    }

    public static List A07(CameraCharacteristics cameraCharacteristics) {
        int i2;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_EFFECTS);
        if (iArr == null) {
            iArr = A02;
        }
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int i3 = 0;
        do {
            switch (iArr[i3]) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                default:
                    i3++;
                    break;
            }
            C13690nt.A1O(A0u, i2);
            i3++;
        } while (i3 < length);
        return C110105dW.A0j(A0u);
    }

    public static List A08(CameraCharacteristics cameraCharacteristics) {
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range == null) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(range.getLower());
        A0u.add(range.getUpper());
        return C110105dW.A0j(A0u);
    }

    public static List A09(CameraCharacteristics cameraCharacteristics) {
        ArrayList A0u = AnonymousClass000.A0u();
        C13690nt.A1O(A0u, 0);
        if (A0M(CameraCharacteristics.FLASH_INFO_AVAILABLE, cameraCharacteristics)) {
            C13690nt.A1O(A0u, 3);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null) {
                iArr = A02;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = 2;
                if (iArr[i2] != 2) {
                    if (iArr[i2] == 3) {
                        i3 = 1;
                    }
                }
                C13690nt.A1O(A0u, i3);
            }
        }
        return C110105dW.A0j(A0u);
    }

    public static List A0A(CameraCharacteristics cameraCharacteristics) {
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range == null) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(range.getLower());
        A0u.add(range.getUpper());
        return C110105dW.A0j(A0u);
    }

    public static List A0B(CameraCharacteristics cameraCharacteristics) {
        return C119035vo.A00((Size[]) cameraCharacteristics.get(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES));
    }

    public static List A0C(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr == null) {
            iArr = A02;
        }
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        do {
            C110105dW.A1S(A0u, A00(iArr[i2]));
            i2++;
        } while (i2 < length);
        return C110105dW.A0j(A0u);
    }

    public static List A0D(CameraCharacteristics cameraCharacteristics) {
        int i2;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            iArr = A02;
        }
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int i3 = 0;
        do {
            switch (iArr[i3]) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                default:
                    i3++;
                    break;
            }
            C13690nt.A1O(A0u, i2);
            i3++;
        } while (i3 < length);
        return C110105dW.A0j(A0u);
    }

    public static List A0E(CameraCharacteristics cameraCharacteristics) {
        ArrayList arrayList;
        List<Object> A03;
        float A04 = AnonymousClass000.A04(A02(cameraCharacteristics).getLower());
        Float valueOf = Float.valueOf(100.0f);
        if (A04 <= 0.0f || A04 >= 100.0f || (A03 = A03(100.0f / A04)) == null || A03.isEmpty()) {
            List singletonList = Collections.singletonList(valueOf);
            if (singletonList == null) {
                return Collections.emptyList();
            }
            arrayList = C13680ns.A0n(singletonList);
        } else {
            float f2 = -1.0f;
            ArrayList A0u = AnonymousClass000.A0u();
            for (Object A042 : A03) {
                float A043 = (100.0f / AnonymousClass000.A04(A042)) * 100.0f;
                if (A043 != f2) {
                    A0u.add(Float.valueOf(A043));
                    f2 = A043;
                }
            }
            arrayList = C13680ns.A0n(A0u);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List A0F(CameraCharacteristics cameraCharacteristics) {
        Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        List A03 = A03(number != null ? number.floatValue() : 0.0f);
        return A03 == null ? Collections.emptyList() : C110105dW.A0j(A03);
    }

    public static List A0G(CameraCharacteristics cameraCharacteristics, boolean z2) {
        int length;
        int A0D;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null || (length = rangeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0i = C13690nt.A0i(length);
        int i2 = 0;
        do {
            Range range = rangeArr[i2];
            int[] iArr = new int[2];
            int A0D2 = AnonymousClass000.A0D(range.getLower());
            if (z2) {
                iArr[0] = A0D2 * 1000;
                A0D = AnonymousClass000.A0D(range.getUpper()) * 1000;
            } else {
                iArr[0] = A0D2;
                A0D = AnonymousClass000.A0D(range.getUpper());
            }
            iArr[1] = A0D;
            A0i.add(iArr);
            i2++;
        } while (i2 < length);
        return C110105dW.A0j(A0i);
    }

    public static List A0H(CameraCharacteristics cameraCharacteristics, boolean z2) {
        int length;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null || (length = rangeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        do {
            Range range = rangeArr[i2];
            if (range.getLower() == range.getUpper()) {
                Number number = (Number) range.getUpper();
                if (z2) {
                    number = Integer.valueOf(number.intValue() * 1000);
                }
                A0u.add(number);
            }
            i2++;
        } while (i2 < length);
        return Collections.unmodifiableList(A0u);
    }

    public static List A0I(StreamConfigurationMap streamConfigurationMap) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (streamConfigurationMap == null) {
            return Collections.emptyList();
        }
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        for (int A1O : outputFormats) {
            C13690nt.A1O(A0u, A1O);
        }
        return Collections.unmodifiableList(A0u);
    }

    public static List A0J(StreamConfigurationMap streamConfigurationMap) {
        if (streamConfigurationMap == null) {
            return Collections.emptyList();
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        if (outputFormats != null) {
            for (int i2 = 0; i2 < outputFormats.length; i2++) {
                if (outputFormats[i2] == 35) {
                    C13690nt.A1O(A0u, outputFormats[i2]);
                }
            }
        }
        return Collections.unmodifiableList(A0u);
    }

    public static List A0K(StreamConfigurationMap streamConfigurationMap, int i2) {
        Size[] sizeArr;
        int length;
        if (streamConfigurationMap == null) {
            sizeArr = null;
        } else if (Build.VERSION.SDK_INT >= 23) {
            Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i2);
            sizeArr = streamConfigurationMap.getOutputSizes(i2);
            if (!(highResolutionOutputSizes == null || (length = highResolutionOutputSizes.length) == 0)) {
                int length2 = sizeArr.length;
                Size[] sizeArr2 = new Size[(length + length2)];
                System.arraycopy(highResolutionOutputSizes, 0, sizeArr2, 0, length);
                System.arraycopy(sizeArr, 0, sizeArr2, length, length2);
                sizeArr = sizeArr2;
            }
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(i2);
        }
        return C119035vo.A00(sizeArr);
    }

    public static List A0L(StreamConfigurationMap streamConfigurationMap, Class cls) {
        return C119035vo.A00(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(cls) : null);
    }

    public static boolean A0M(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        Boolean bool = (Boolean) cameraCharacteristics.get(key);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean A0N(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i2) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            iArr = A02;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0O(CameraCharacteristics cameraCharacteristics) {
        return A01 && cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null && A0R(cameraCharacteristics, 0) && A0P(cameraCharacteristics);
    }

    public static boolean A0P(CameraCharacteristics cameraCharacteristics) {
        Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        return number != null && number.floatValue() > 0.0f;
    }

    public static boolean A0Q(CameraCharacteristics cameraCharacteristics) {
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null || rangeArr.length == 0) {
            return false;
        }
        Range range = rangeArr[0];
        return AnonymousClass000.A0D(range.getLower()) < 1000 && AnonymousClass000.A0D(range.getUpper()) < 1000;
    }

    public static boolean A0R(CameraCharacteristics cameraCharacteristics, int i2) {
        int A0D = AnonymousClass000.A0D(cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
        return A0D != 2 && A0D >= i2;
    }
}
