package X;

import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.18s  reason: invalid class name and case insensitive filesystem */
public class C226418s implements C17420v3 {
    public void A4u(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: annotationKeyTooLong for marker: ");
        sb.append(i2);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void A4v(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: annotationMisuse ");
        sb.append(i2);
        sb.append(" : ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A4w(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder("QPL: annotationSizeLimitExceeded for marker: ");
        sb.append(i2);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(i3);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void A5I() {
        Log.e("QPL: backgroundListenerEventsFull");
    }

    public void A8c(String str) {
        StringBuilder sb = new StringBuilder("QPL: errorCompressingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A8d(String str) {
        StringBuilder sb = new StringBuilder("QPL: errorDeletingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A8e(String str) {
        StringBuilder sb = new StringBuilder("QPL: errorParsingConfig: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A8f(String str) {
        StringBuilder sb = new StringBuilder("QPL: errorUploadingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A8g(String str) {
        StringBuilder sb = new StringBuilder("QPL: errorWritingToFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void A8m(int i2) {
        StringBuilder sb = new StringBuilder("QPL: eventBuilderRepeatedSubmit ");
        sb.append(i2);
        Log.e(sb.toString());
    }

    public void AHs(String str, double d2, int i2) {
        StringBuilder sb = new StringBuilder("QPL: illegalDoubleAnnotation for marker: ");
        sb.append(i2);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(d2);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void AK1(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: jsonFormatError for marker: ");
        sb.append(i2);
        sb.append(" msg: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void ALO() {
        Log.e("QPL: maxFileCountReached");
    }

    public void ALQ(int i2) {
        StringBuilder sb = new StringBuilder("QPL: maxMarkerCountExceeded for marker: ");
        sb.append(i2);
        Log.e(sb.toString());
    }

    public void ALR(int i2) {
        StringBuilder sb = new StringBuilder("QPL: maxPointCountExceeded for marker: ");
        sb.append(i2);
        Log.e(sb.toString());
    }

    public void ALp(int i2) {
        StringBuilder sb = new StringBuilder("QPL: noPointName ");
        sb.append(i2);
        Log.e(sb.toString());
    }

    public void Aaa(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: pointDataTooLong for marker: ");
        sb.append(i2);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void Aab(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: pointNameTooLong for marker: ");
        sb.append(i2);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void Aac(int i2, String str) {
        StringBuilder sb = new StringBuilder("QPL: pointToEndAtNotFound for marker: ");
        sb.append(i2);
        sb.append(" and pointName: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void AcD(String str) {
        StringBuilder sb = new StringBuilder("QPL: reportWarning ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void Ah0(Collection collection) {
        StringBuilder sb = new StringBuilder("QPL: tooManyOpenMarkersToWrite: ");
        sb.append(collection);
        Log.e(sb.toString());
    }

    public void AhB() {
        Log.e("QPL: unfinishedListenerEventRemaining");
    }
}
