package com.obwhatsapp.yo.x;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.yo.freqids;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import org.apache.commons.io.IOUtils;

final class df extends AsyncTask {
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C12241rlf f108a;

    /* renamed from: b  reason: collision with root package name */
    private String f109b;

    private df(C12241rlf rlf) {
        this.f108a = rlf;
    }

    /* synthetic */ df(C12241rlf rlf, byte b2) {
        this(rlf);
    }

    private String a(String str) {
        String[] strArr;
        String str2;
        try {
            String replace = str.replace(str.substring(str.indexOf("[") - 12, str.indexOf("]") + 1), "");
            String[] split = replace.split(" ");
            if (split[0].equals(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()))) {
                String substring = replace.substring(11, replace.length());
                strArr = substring.split(" ");
                str2 = substring;
            } else {
                strArr = split;
                str2 = replace;
            }
            if (strArr[2].contains("handle_available") || strArr[2].contains("handle_unavailable") || strArr[2].contains("/available") || strArr[2].contains("/unavailable")) {
                return null;
            }
            if (strArr[1].contains("handle_available")) {
                strArr[2] = String.valueOf(c(strArr[2].replace("@s.whatsapp.net", ""))) + " " + this.f108a.getString(freqids.contactOnlineString());
                str2 = String.valueOf(strArr[0]) + " " + strArr[2];
            }
            if (strArr[1].contains("/available")) {
                if (this.f108a.f120i) {
                    return null;
                }
                if (strArr[2].contains("@g.us")) {
                    return null;
                }
                strArr[2] = String.valueOf(c(strArr[2].replace("@s.whatsapp.net", ""))) + " " + this.f108a.getString(freqids.contactOnlineString());
                str2 = String.valueOf(strArr[0]) + " " + strArr[2];
            }
            if (strArr[1].contains("/unavailable")) {
                if (this.f108a.f119h) {
                    return null;
                }
                if (!strArr[4].equals("0")) {
                    String a2 = a(strArr[4], strArr[0]);
                    if (a2 == null) {
                        return null;
                    }
                    strArr[4] = String.valueOf(this.f108a.getString(freqids.contactLasSeenString())) + " " + a2;
                } else if (this.f108a.f119h) {
                    return null;
                } else {
                    strArr[4] = String.valueOf(this.f108a.getString(freqids.contactLasSeenString())) + " " + this.f108a.getString(freqids.contactOfflineString());
                }
                strArr[2] = c(strArr[2].replace("@s.whatsapp.net", ""));
                str2 = String.valueOf(strArr[0]) + " " + strArr[2] + " " + strArr[4];
            }
            if (strArr[1].contains("handle_unavailable")) {
                if (this.f108a.f119h) {
                    return null;
                }
                if (strArr[4].equals("last:0")) {
                    return null;
                }
                strArr[4] = strArr[4].replace("last:", "");
                String a3 = a(strArr[4], strArr[0]);
                if (a3 == null) {
                    return null;
                }
                strArr[4] = String.valueOf(this.f108a.getString(freqids.contactLasSeenString())) + " " + a3;
                strArr[2] = c(strArr[2].replace("@s.whatsapp.net", ""));
                str2 = String.valueOf(strArr[0]) + " " + strArr[2] + " " + strArr[4];
            }
            if (this.f109b.contains("db_write") && strArr[3].contains("status")) {
                strArr[4] = c(strArr[4].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[5] = b(strArr[5].replace("status_timestamp=", ""));
                if (strArr[5] == null) {
                    return null;
                }
                strArr[6] = str2.substring(str2.indexOf(" status=") + 8, str2.indexOf("|"));
                str2 = String.valueOf(strArr[0]) + " " + strArr[4] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.contactStatusString()) + ": " + strArr[6] + " " + strArr[5];
            }
            if (this.f109b.contains("db_write") && strArr[4].contains("status")) {
                strArr[5] = c(strArr[5].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[6] = b(strArr[6].replace("status_timestamp=", ""));
                if (strArr[6] == null) {
                    return null;
                }
                strArr[7] = str2.substring(str2.indexOf(" status=") + 8, str2.indexOf("|"));
                str2 = String.valueOf(strArr[0]) + " " + strArr[1] + " " + strArr[5] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.contactStatusString()) + ": " + strArr[7] + " " + strArr[6];
            }
            if (this.f109b.contains("db_write") && strArr[2].contains("photo")) {
                if (strArr[9].equals("thumb_ts=0") || strArr[9].equals("thumb_ts=-1")) {
                    return null;
                }
                strArr[6] = c(strArr[6].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[9] = b(String.valueOf(strArr[9].replace("thumb_ts=", "")) + "000");
                if (strArr[9] == null) {
                    return null;
                }
                String str3 = String.valueOf(strArr[0]) + " " + strArr[6] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.ppUpdatedString()) + " " + strArr[9];
                if (this.f108a.f115d.size() > 0 && str3.substring(10, str3.length()).equals(((String) this.f108a.f115d.get(this.f108a.f115d.size() - 1)).substring(10, ((String) this.f108a.f115d.get(this.f108a.f115d.size() - 1)).length()))) {
                    return null;
                }
                str2 = str3;
            }
            if (this.f109b.contains("db_write") && strArr[3].contains("photo")) {
                if (strArr[10].equals("thumb_ts=0") || strArr[10].equals("thumb_ts=-1")) {
                    return null;
                }
                strArr[7] = c(strArr[7].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[10] = b(String.valueOf(strArr[10].replace("thumb_ts=", "")) + "000");
                if (strArr[10] == null) {
                    return null;
                }
                String str4 = String.valueOf(strArr[0]) + " " + strArr[1] + " " + strArr[7] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.ppUpdatedString()) + " " + strArr[10];
                if (this.f108a.f115d.size() > 0 && str4.substring(10, str4.length()).equals(((String) this.f108a.f115d.get(this.f108a.f115d.size() - 1)).substring(10, ((String) this.f108a.f115d.get(this.f108a.f115d.size() - 1)).length()))) {
                    return null;
                }
                str2 = str4;
            }
            if (this.f109b.contains("db_write") && strArr[3].contains(FacebookFacade.RequestParameter.NAME)) {
                strArr[6] = c(strArr[6].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[7] = str2.substring(str2.indexOf("wa_name=") + 8, str2.indexOf("|"));
                str2 = String.valueOf(strArr[0]) + " " + strArr[6] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.profileNameString()) + " " + strArr[7];
            }
            if (this.f109b.contains("db_write") && strArr[4].contains(FacebookFacade.RequestParameter.NAME)) {
                strArr[7] = c(strArr[7].replace("@s.whatsapp.net", "").replace("jid=", ""));
                strArr[8] = str2.substring(str2.indexOf("wa_name=") + 8, str2.indexOf("|"));
                str2 = String.valueOf(strArr[0]) + " " + strArr[1] + " " + strArr[7] + IOUtils.LINE_SEPARATOR_UNIX + this.f108a.getString(freqids.profileNameString()) + " " + strArr[8];
            }
            if (this.f108a.f115d.size() <= 0 || !str2.equals(this.f108a.f115d.get(this.f108a.f115d.size() - 1))) {
                return str2;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(String str, String str2) {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        try {
            instance.setTimeInMillis(Long.parseLong(str));
            String[] split = simpleDateFormat.format(instance.getTime()).split(" ");
            if (!split[1].equals(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()))) {
                return null;
            }
            if (str2.equals(split[0])) {
                return split[0];
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss");
            instance.add(13, -1);
            if (str2.equals(simpleDateFormat2.format(instance.getTime()))) {
                return split[0];
            }
            instance.add(13, -1);
            if (str2.equals(simpleDateFormat2.format(instance.getTime()))) {
                return split[0];
            }
            return null;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public StringBuilder doInBackground(File... fileArr) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileArr[0]));
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains("@") && !readLine.contains("getMediaMessages") && !readLine.contains("contact fetched") && !readLine.contains("/subscription") && !readLine.contains("/blocklist") && readLine.length() >= 19) {
                    try {
                        Date parse = simpleDateFormat.parse(readLine.substring(0, 19));
                        if (this.f108a.f121j && date.getTime() - 7200000 > parse.getTime()) {
                        }
                    } catch (ParseException e2) {
                        e2.printStackTrace();
                    }
                    if (readLine.contains("@") && !readLine.contains("found 0")) {
                        if (this.f108a.f122k || ((readLine.contains("db_write") && !readLine.contains("unseen")) || ((readLine.contains("/available") && !this.f108a.f120i) || (readLine.contains("unavailable") && !this.f108a.f119h)))) {
                            this.f109b = readLine;
                            String a2 = a(readLine);
                            publishProgress(new String[]{a2});
                            if (a2 != null) {
                                this.f108a.f115d.add(a2);
                                this.f108a.f116e.add(this.f109b);
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (OutOfMemoryError e3) {
            this.f108a.finish();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return this.f108a.f112a;
    }

    private static String b(String str) {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        try {
            instance.setTimeInMillis(Long.parseLong(str));
            String format = simpleDateFormat.format(instance.getTime());
            String[] split = format.split(" ");
            return split[1].equals(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime())) ? split[0] : format;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String c(String str) {
        String str2;
        if (!this.f108a.f123l) {
            return str;
        }
        Cursor query = this.f108a.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name", "_id"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            String string = query.moveToFirst() ? query.getString(query.getColumnIndex("display_name")) : null;
            query.close();
            if (string != null) {
                return string.length() < 24 ? string : String.valueOf(string.substring(0, 24)) + ".";
            }
            str2 = string;
        } else {
            str2 = null;
        }
        Cursor query2 = this.f108a.getContentResolver().query(Uri.withAppendedPath(Contacts.Phones.CONTENT_FILTER_URL, Uri.encode(str)), new String[]{"display_name", "number"}, (String) null, (String[]) null, (String) null);
        String string2 = query2.moveToFirst() ? query2.getString(query2.getColumnIndex("display_name")) : str2;
        return string2 != null ? string2 : str;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
        this.f108a.f113b.setProgress(0);
        this.f108a.f117f.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        try {
            if (this.f108a.f113b != null && this.f108a.f113b.isShowing()) {
                this.f108a.f113b.dismiss();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Collections.reverse(this.f108a.f115d);
        Collections.reverse(this.f108a.f116e);
        this.f108a.f117f = new ArrayAdapter(this.f108a, freqids.readlogrow(), this.f108a.f115d);
        this.f108a.f114c.setAdapter(this.f108a.f117f);
        this.f108a.f114c.setOnItemClickListener(new dg(this));
        this.f108a.f114c.setOnItemLongClickListener(new dh(this));
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        super.onPreExecute();
        this.f108a.f113b = new ProgressDialog(this.f108a);
        this.f108a.f113b.setMessage("Loading");
        this.f108a.f113b.setIndeterminate(false);
        this.f108a.f113b.setCancelable(true);
        if (!this.f108a.isFinishing()) {
            this.f108a.f113b.show();
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onProgressUpdate(Object... objArr) {
        this.f108a.f113b.setMessage(((String[]) objArr)[0]);
    }
}
