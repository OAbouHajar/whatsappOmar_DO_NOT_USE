package com.whatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass12W;
import X.AnonymousClass1QS;
import X.AnonymousClass20O;
import X.C17970vw;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class Mp4Ops {
    public final AnonymousClass12W A00;

    public class LibMp4CheckAndRepairResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;

        public LibMp4CheckAndRepairResult(boolean z2, boolean z3, boolean z4, int i2, String str, boolean z5, long j2, long j3, long j4, int i3, long j5, long j6, long j7, int i4) {
            this.success = z2;
            this.repaired = z3;
            this.repairRequired = z4;
            this.errorCode = i2;
            this.errorMessage = str;
            this.ioException = z5;
            this.oldMajorVersion = j2;
            this.oldMinorVersion = j3;
            this.oldReleaseVersion = j4;
            this.oldOriginator = i3;
            this.newMajorVersion = j5;
            this.newMinorVersion = j6;
            this.newReleaseVersion = j7;
            this.newOriginator = i4;
        }
    }

    public class LibMp4OperationResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final int rotationDegrees;
        public final boolean success;

        public LibMp4OperationResult(boolean z2, boolean z3, int i2, int i3, String str) {
            this.success = z2;
            this.ioException = z3;
            this.errorCode = i2;
            this.errorMessage = str;
            this.rotationDegrees = i3;
        }
    }

    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z2, boolean z3, int i2, String str, long j2) {
            this.success = z2;
            this.ioException = z3;
            this.errorCode = i2;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j2;
        }
    }

    public Mp4Ops(AnonymousClass12W r1) {
        this.A00 = r1;
    }

    public static void A00(AnonymousClass12W r6, File file) {
        AnonymousClass20O r0;
        try {
            if (AnonymousClass1QS.A04(file, false).A00 != 0) {
                File A01 = r6.A01(file);
                LibMp4OperationResult removeAudioTracks = removeAudioTracks(file.getAbsolutePath(), A01.getAbsolutePath());
                if (!removeAudioTracks.success) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mp4ops/remove-audio-tracks");
                    sb.append(removeAudioTracks.errorMessage);
                    Log.e(sb.toString());
                    int i2 = removeAudioTracks.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("invalid result, error_code: ");
                    sb2.append(i2);
                    r0 = new AnonymousClass20O(i2, sb2.toString());
                } else if (!C17970vw.A0N(r6, A01, file)) {
                    Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                    r0 = new AnonymousClass20O(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                } else {
                    return;
                }
                throw r0;
            }
        } catch (IOException e2) {
            Log.e("Could not access file or failed to move files properly", e2);
            throw new AnonymousClass20O(0, "Could not access file or failed to move files properly");
        }
    }

    public static void A01(File file, File file2) {
        try {
            Log.i("mp4ops/removeExifData/start");
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, 0.0f, -1.0f, -1.0f, -1, file.getAbsolutePath(), 0.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/removeExifData/finished success=");
            sb.append(mp4mux.success);
            Log.i(sb.toString());
            if (mp4mux.success) {
                return;
            }
            if (mp4mux.ioException) {
                throw new IOException("mp4ops/removeExifData/No space");
            }
            int i2 = mp4mux.errorCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mp4ops/removeExifData failed, error_code: ");
            sb2.append(i2);
            throw new AnonymousClass20O(i2, sb2.toString());
        } catch (Error e2) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e2);
            throw new AnonymousClass20O(0, e2.getMessage());
        }
    }

    public static void A02(File file, File file2, File file3, File file4, int i2, long j2, long j3, long j4, long j5) {
        String absolutePath;
        Log.i("mp4ops/mux/start");
        float f2 = ((float) j2) / 1000.0f;
        float f3 = ((float) j5) / 1000.0f;
        float f4 = ((float) j4) / 1000.0f;
        float f5 = ((float) j3) / 1000.0f;
        String str = "";
        if (file2 == null) {
            absolutePath = str;
        } else {
            try {
                absolutePath = file2.getAbsolutePath();
            } catch (Error e2) {
                Log.e("mp4ops/mux/failed: mp4mux error, exiting", e2);
                throw new AnonymousClass20O(0, e2.getMessage());
            }
        }
        if (file3 != null) {
            str = file3.getAbsolutePath();
        }
        LibMp4OperationResult mp4mux = mp4mux(absolutePath, str, file.getAbsolutePath(), f2, 0.0f, f4, f5, i2, file4.getAbsolutePath(), f3);
        StringBuilder sb = new StringBuilder("mp4ops/mux/result: ");
        sb.append(mp4mux.success);
        Log.i(sb.toString());
        if (!mp4mux.success) {
            StringBuilder sb2 = new StringBuilder("mp4ops/mux/error_message/");
            sb2.append(mp4mux.errorMessage);
            Log.e(sb2.toString());
            if (mp4mux.ioException) {
                throw new IOException("No space");
            }
            StringBuilder sb3 = new StringBuilder("invalid result, error_code: ");
            int i3 = mp4mux.errorCode;
            sb3.append(i3);
            throw new AnonymousClass20O(i3, sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder("mp4ops/mux/finished, size:");
        sb4.append(file.length());
        Log.i(sb4.toString());
    }

    public static void A03(File file, boolean z2) {
        LibMp4OperationResult mp4check;
        Log.i("mp4ops/check/start");
        int i2 = 0;
        do {
            try {
                mp4check = mp4check(file.getAbsolutePath(), z2);
                if (mp4check.success || !mp4check.ioException) {
                    AnonymousClass00B.A06(mp4check);
                } else {
                    SystemClock.sleep(100);
                    i2++;
                }
            } catch (Error e2) {
                Log.e("mp4ops/integration fail/", e2);
                throw new AnonymousClass20O(0, "integrity check error");
            }
        } while (i2 < 5);
        AnonymousClass00B.A06(mp4check);
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return;
        }
        StringBuilder sb = new StringBuilder("mp4ops/check/error_message/");
        sb.append(mp4check.errorMessage);
        Log.e(sb.toString());
        int i3 = mp4check.errorCode;
        StringBuilder sb2 = new StringBuilder("integrity check failed, error_code: ");
        sb2.append(i3);
        throw new AnonymousClass20O(i3, sb2.toString());
    }

    public static native LibMp4OperationResult mp4check(String str, boolean z2);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native boolean mp4forensic(int i2, String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f2, float f3, float f4, float f5, int i2, String str4, float f6);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z2, long j2);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public boolean A04(File file) {
        Log.i("mp4ops/checkAndRepair/start");
        AnonymousClass12W r4 = this.A00;
        File A01 = r4.A01(file);
        StringBuilder sb = new StringBuilder("mp4ops/checkAndRepair/repairFileName.exists");
        sb.append(A01.exists());
        Log.i(sb.toString());
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath(), A01.getAbsolutePath());
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired) {
                    A01.delete();
                }
                StringBuilder sb2 = new StringBuilder("mp4ops/checkAndRepair/error_message/");
                sb2.append(mp4checkAndRepair.errorMessage);
                Log.e(sb2.toString());
                if (mp4checkAndRepair.ioException) {
                    throw new IOException("No space");
                }
                int i2 = mp4checkAndRepair.errorCode;
                StringBuilder sb3 = new StringBuilder("integrity check/repair failed, error_code: ");
                sb3.append(i2);
                throw new AnonymousClass20O(i2, sb3.toString());
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder sb4 = new StringBuilder("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                sb4.append(A01.getAbsolutePath());
                Log.i(sb4.toString());
                A01(A01, file);
                return true;
            }
            Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
            File A012 = r4.A01(file);
            A01(file, A012);
            if (file.length() == A012.length()) {
                return false;
            }
            if (A012.renameTo(file)) {
                return true;
            }
            Log.i("mp4ops/checkAndRepair/rename_failed");
            throw new IOException("unable to rename file");
        } catch (Error e2) {
            Log.e("mp4ops/integration fail/", e2);
            throw new AnonymousClass20O(0, "integrity check error");
        }
    }
}
