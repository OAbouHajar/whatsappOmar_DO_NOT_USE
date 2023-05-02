package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public class FileSystemUtils {
    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        int i2;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property != null) {
                String lowerCase = property.toLowerCase(Locale.ENGLISH);
                if (lowerCase.indexOf("windows") != -1) {
                    i2 = 1;
                } else {
                    if (lowerCase.indexOf("linux") == -1 && lowerCase.indexOf("mpe/ix") == -1 && lowerCase.indexOf("freebsd") == -1 && lowerCase.indexOf("irix") == -1 && lowerCase.indexOf("digital unix") == -1 && lowerCase.indexOf("unix") == -1) {
                        if (lowerCase.indexOf("mac os x") == -1) {
                            if (lowerCase.indexOf("sun os") == -1 && lowerCase.indexOf("sunos") == -1) {
                                if (lowerCase.indexOf("solaris") == -1) {
                                    if (lowerCase.indexOf("hp-ux") == -1) {
                                        if (lowerCase.indexOf("aix") == -1) {
                                            i2 = 0;
                                        }
                                    }
                                    i2 = 3;
                                }
                            }
                            i2 = 3;
                            str = "/usr/xpg4/bin/df";
                        }
                    }
                    i2 = 2;
                }
                OS = i2;
                DF = str;
                return;
            }
            throw new IOException("os.name not found");
        } catch (Exception e2) {
            i2 = -1;
        }
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return INSTANCE.freeSpaceOS(str, OS, false, -1);
    }

    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1);
    }

    public static long freeSpaceKb(long j2) throws IOException {
        return freeSpaceKb(new File(".").getAbsolutePath(), j2);
    }

    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1);
    }

    public static long freeSpaceKb(String str, long j2) throws IOException {
        return INSTANCE.freeSpaceOS(str, OS, true, j2);
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceOS(String str, int i2, boolean z2, long j2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be empty");
        } else if (i2 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        } else if (i2 == 1) {
            long freeSpaceWindows = freeSpaceWindows(str, j2);
            return z2 ? freeSpaceWindows / FileUtils.ONE_KB : freeSpaceWindows;
        } else if (i2 == 2) {
            return freeSpaceUnix(str, z2, false, j2);
        } else {
            if (i2 == 3) {
                return freeSpaceUnix(str, z2, true, j2);
            }
            throw new IllegalStateException("Exception caught when determining operating system");
        }
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceUnix(String str, boolean z2, boolean z3, long j2) throws IOException {
        String str2 = str;
        if (str.length() != 0) {
            String str3 = "-";
            if (z2) {
                str3 = str3 + "k";
            }
            if (z3) {
                str3 = str3 + "P";
            }
            List<String> performCommand = performCommand(str3.length() > 1 ? new String[]{DF, str3, str2} : new String[]{DF, str2}, 3, j2);
            if (performCommand.size() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(performCommand.get(1), " ");
                if (stringTokenizer.countTokens() >= 4) {
                    stringTokenizer.nextToken();
                } else if (stringTokenizer.countTokens() != 1 || performCommand.size() < 3) {
                    throw new IOException("Command line '" + DF + "' did not return data as expected " + "for path '" + str2 + "'- check path is valid");
                } else {
                    stringTokenizer = new StringTokenizer(performCommand.get(2), " ");
                }
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                return parseBytes(stringTokenizer.nextToken(), str2);
            }
            throw new IOException("Command line '" + DF + "' did not return info as expected " + "for path '" + str2 + "'- response was " + performCommand);
        }
        long j3 = j2;
        throw new IllegalArgumentException("Path must not be empty");
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceWindows(String str, long j2) throws IOException {
        String normalize = FilenameUtils.normalize(str, false);
        if (normalize.length() > 0 && normalize.charAt(0) != '\"') {
            normalize = "\"" + normalize + "\"";
        }
        List<String> performCommand = performCommand(new String[]{"cmd.exe", "/C", "dir /a /-c " + normalize}, Integer.MAX_VALUE, j2);
        for (int size = performCommand.size() - 1; size >= 0; size--) {
            String str2 = performCommand.get(size);
            if (str2.length() > 0) {
                return parseDir(str2, normalize);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + normalize + "'");
    }

    /* access modifiers changed from: package-private */
    public Process openProcess(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    /* access modifiers changed from: package-private */
    public long parseBytes(String str, String str2) throws IOException {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new IOException("Command line '" + DF + "' did not find free space in response " + "for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e2) {
            throw new IOExceptionWithCause("Command line '" + DF + "' did not return numeric data as expected " + "for path '" + str2 + "'- check path is valid", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public long parseDir(String str, String str2) throws IOException {
        int i2 = 0;
        int i3 = 0;
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                break;
            } else if (Character.isDigit(str.charAt(length))) {
                i3 = length + 1;
                break;
            } else {
                length--;
            }
        }
        while (true) {
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i2 = length + 1;
                break;
            }
            length--;
        }
        if (length >= 0) {
            StringBuilder sb = new StringBuilder(str.substring(i2, i3));
            int i4 = 0;
            while (i4 < sb.length()) {
                if (sb.charAt(i4) == ',' || sb.charAt(i4) == '.') {
                    sb.deleteCharAt(i4);
                    i4--;
                }
                i4++;
            }
            return parseBytes(sb.toString(), str2);
        }
        throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
    }

    /* access modifiers changed from: package-private */
    public List<String> performCommand(String[] strArr, int i2, long j2) throws IOException {
        ArrayList arrayList = new ArrayList(20);
        Process process = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        InputStream inputStream2 = null;
        BufferedReader bufferedReader = null;
        try {
            Thread start = ThreadMonitor.start(j2);
            process = openProcess(strArr);
            inputStream = process.getInputStream();
            outputStream = process.getOutputStream();
            inputStream2 = process.getErrorStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            for (String readLine = bufferedReader.readLine(); readLine != null && arrayList.size() < i2; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine.toLowerCase(Locale.ENGLISH).trim());
            }
            process.waitFor();
            ThreadMonitor.stop(start);
            if (process.exitValue() != 0) {
                throw new IOException("Command line returned OS error code '" + process.exitValue() + "' for command " + Arrays.asList(strArr));
            } else if (!arrayList.isEmpty()) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly((Reader) bufferedReader);
                if (process != null) {
                    process.destroy();
                }
                return arrayList;
            } else {
                throw new IOException("Command line did not return any info for command " + Arrays.asList(strArr));
            }
        } catch (InterruptedException e2) {
            throw new IOExceptionWithCause("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j2, e2);
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(inputStream2);
            IOUtils.closeQuietly((Reader) bufferedReader);
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }
}
