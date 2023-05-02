package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.38M  reason: invalid class name */
public class AnonymousClass38M {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final /* synthetic */ AudioPickerActivity A08;

    public AnonymousClass38M(AudioPickerActivity audioPickerActivity, String str, String str2, String str3, int i2, int i3, int i4) {
        int i5 = i4;
        this.A08 = audioPickerActivity;
        this.A00 = i2;
        this.A02 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : str;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i5;
        int i6 = i3;
        this.A05 = DateUtils.formatElapsedTime(C13690nt.A09((long) i6));
        AnonymousClass013 r8 = audioPickerActivity.A01;
        long A022 = ((long) audioPickerActivity.A06.A02(C15910s6.A1f)) * SearchActionVerificationClientService.MS_TO_NS;
        long j2 = (long) i5;
        if (j2 >= A022 - 60000 && j2 < A022) {
            i5 = (int) (j2 - 60000);
        }
        this.A06 = (String) AnonymousClass2GQ.A00(r8, (long) i5, true).first;
        this.A04 = C28961Zl.A06(audioPickerActivity.A01, (long) Math.max(0, i6));
    }
}
