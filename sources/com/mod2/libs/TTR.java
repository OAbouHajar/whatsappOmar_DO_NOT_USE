package com.mod2.libs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.v4.view.MotionEventCompat;
import android.telephony.SmsManager;
import android.text.method.ScrollingMovementMethod;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.VideoView;
import com.mod2.fblibs.FacebookFacade;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

@SuppressLint({"DefaultLocale"})
public class TTR {
    public boolean DisableClose = true;
    public String Host;
    public String SQLText;
    private List<String> comboList;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public ProgressDialog thisDLG;

    public TTR(Context context2) {
        this.context = context2;
    }

    public static Bitmap ArrayToBitmap(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static byte[] BitmapToArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean EnzyIsValid(String str) {
        try {
            if (str.isEmpty()) {
                return false;
            }
            int length = str.length();
            return HexToInt(str.substring(length + -4, str.length())) == length;
        } catch (Exception e2) {
            return false;
        }
    }

    public static char GetCharAt(String str, int i2) {
        return str.toCharArray()[i2];
    }

    public static int HexToInt(String str) {
        return Integer.parseInt(str, 16);
    }

    public static String HexToText(String str) {
        return new String(new BigInteger(str, 16).toByteArray());
    }

    public static String IntToHex(int i2) {
        return Integer.toHexString(i2);
    }

    public static String IntToHex(int i2, int i3) {
        return String.format(String.valueOf("%0") + String.valueOf(i3) + "x", new Object[]{Integer.valueOf(i2)});
    }

    public static String SetCharAt(String str, int i2, char c2) {
        char[] charArray = str.toCharArray();
        charArray[i2] = c2;
        return new String(charArray);
    }

    public static void Splash(Context context2, String str) {
        Toast.makeText(context2, str, 0).show();
    }

    public static String TextToHex(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            sb.append(String.format("%x", new Object[]{Byte.valueOf(bytes[i2])}));
        }
        return sb.toString();
    }

    public Boolean ActivityEquals(int i2, int i3, int i4) {
        return i2 == i4 && i3 == -1;
    }

    public void AddSpinnerFromTable(TTable tTable, String str, String str2) {
        tTable.OpenSQL();
        while (tTable.GetData()) {
            if (str.isEmpty()) {
                AddSpinnerList(tTable.GetFieldValue(str2));
            } else {
                AddSpinnerList(String.valueOf(tTable.GetFieldValue(str)) + " - " + tTable.GetFieldValue(str2));
            }
        }
    }

    public void AddSpinnerFromTable(TTable tTable, String str, String str2, String str3) {
        tTable.OpenSQL(str);
        while (tTable.GetData()) {
            if (str2.isEmpty()) {
                AddSpinnerList(tTable.GetFieldValue(str3));
            } else {
                AddSpinnerList(String.valueOf(tTable.GetFieldValue(str2)) + " - " + tTable.GetFieldValue(str3));
            }
        }
    }

    public void AddSpinnerList(String str) {
        this.comboList.add(str);
    }

    public void AddSpinnerList(String str, String str2) {
        this.comboList.add(String.valueOf(str2) + " - " + str);
    }

    public void AddViewAttr(View view, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(i2);
        view.setLayoutParams(layoutParams);
    }

    public void AddViewAttr(View view, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(i2, i3);
        view.setLayoutParams(layoutParams);
    }

    public Boolean AppMinimize() {
        ((Activity) this.context).moveTaskToBack(true);
        return true;
    }

    public boolean AttachExist() {
        return ((Activity) this.context).getIntent().getExtras() != null;
    }

    public Boolean BackPress(int i2, KeyEvent keyEvent) {
        return i2 == 4 && keyEvent.getRepeatCount() == 0;
    }

    public void ClearSharedContains(String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.remove(str);
        edit.commit();
    }

    public void CloseProgressDLG() {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                TTR.this.thisDLG.dismiss();
            }
        });
    }

    public int ColorToInt(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e2) {
            return 0;
        }
    }

    public Boolean CompareEdit(EditText editText, String str) {
        return Boolean.valueOf(editText.getText().toString().equals(str));
    }

    public void CopyFile(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        FileChannel fileChannel = null;
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            long j2 = 0;
            long size = channel.size();
            do {
                j2 += channel2.transferFrom(channel, j2, size - j2);
            } while (j2 < size);
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (channel2 != null) {
                try {
                    channel2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (fileChannel2 != null) {
                try {
                    fileChannel2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            if (fileChannel2 != null) {
                try {
                    fileChannel2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            if (fileChannel2 != null) {
                try {
                    fileChannel2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void CreateDir(String str) {
        new File(DefDir(str)).mkdirs();
    }

    public void CreateSpinnerList() {
        this.comboList = new ArrayList();
    }

    public Bitmap CropImage(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        try {
            return Bitmap.createBitmap(bitmap, (i2 - i4) / 2, (i3 - i5) / 2, i4, i5);
        } catch (Exception e2) {
            return null;
        }
    }

    public String DefDir(String str) {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + str;
    }

    public File DefFilePath(String str, String str2) {
        return new File(DefDir(str), str2);
    }

    public String DefFilePathStr(String str, String str2) {
        return DefFilePath(str, str2).toString();
    }

    public String DefFileStr(String str) {
        return DefDir(str).toString();
    }

    public boolean DeleteFile(String str) {
        return new File(str).delete();
    }

    public void Dial(String str) {
        this.context.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ((!str.startsWith("*") || !str.endsWith("#")) ? str : String.valueOf(str.substring(0, str.length() - 1)) + Uri.encode("#")))));
    }

    public Boolean DirExists(String str) {
        return new File(DefDir(str)).exists();
    }

    public void DoEnterKey(EditText editText) {
        editText.dispatchKeyEvent(new KeyEvent(0, 0, 0, 66, 0));
    }

    public void DoShout(Runnable runnable) {
        ((Activity) this.context).runOnUiThread(runnable);
    }

    public EditText DoShowInputDlg(String str, EditText editText, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle(str);
        builder.setView(editText);
        builder.setNegativeButton(str3, onClickListener);
        builder.setPositiveButton(str2, onClickListener);
        builder.show();
        return editText;
    }

    public boolean ExecApp(String str) {
        try {
            Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.addFlags(268435456);
            launchIntentForPackage.addFlags(67108864);
            this.context.startActivity(launchIntentForPackage);
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    public Boolean FileExists(String str) {
        return new File(str).exists();
    }

    public String FindXmlValue(Document document, String str, String str2) {
        int i2 = 0;
        while (i2 < GetXmlElementCount(document, str)) {
            try {
                if (GetXmlAttrValue(document, str, i2, FacebookFacade.RequestParameter.NAME).equals(str2)) {
                    return GetXmlAttrValue(document, str, i2, "value");
                }
                i2++;
            } catch (Exception e2) {
                return "";
            }
        }
        return "";
    }

    public String FormatDecimal(int i2, String str) {
        return new DecimalFormat("##" + str).format((long) i2);
    }

    public String FormatFloat(String str, double d2) {
        return new DecimalFormat(str).format(d2);
    }

    public Boolean FreshSharedVar(String str) {
        return !GetSharedContains(str).booleanValue();
    }

    public String GetAttachActivity(String str) {
        return ((Activity) this.context).getIntent().getExtras().getString(str);
    }

    public String GetBackPackVal(Document document, String str) {
        return FindXmlValue(document, "backpack", str);
    }

    public int GetColorFromRes(String str) {
        return this.context.getResources().getColor(GetColorID(str));
    }

    public int GetColorID(String str) {
        return this.context.getResources().getIdentifier(str, "color", this.context.getPackageName());
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public String GetDateFromPicker(DatePicker datePicker) {
        int dayOfMonth = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();
        DecimalFormat decimalFormat = new DecimalFormat("##00");
        return (year + "-" + decimalFormat.format((long) (month + 1)) + "-" + decimalFormat.format((long) dayOfMonth)).trim();
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetDateTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetDateTime(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j2));
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetDateTime(long j2, String str) {
        return new SimpleDateFormat(str).format(Long.valueOf(j2));
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetDateTimeFormat(String str) {
        return new SimpleDateFormat(str).format(new Date());
    }

    public Drawable GetDrawableFromFile(String str) {
        return new BitmapDrawable(BitmapFactory.decodeFile(str));
    }

    public Drawable GetDrawableFromRes(String str) {
        return this.context.getResources().getDrawable(GetDrawableID(str));
    }

    public int GetDrawableID(String str) {
        return this.context.getResources().getIdentifier(str, "drawable", this.context.getPackageName());
    }

    public String GetEditText(EditText editText) {
        return editText.getText().toString().trim();
    }

    public String GetGalleryFileName(Intent intent) {
        String[] strArr = {"_data"};
        Cursor query = this.context.getContentResolver().query(intent.getData(), strArr, (String) null, (String[]) null, (String) null);
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(strArr[0]));
        query.close();
        return string;
    }

    public int GetID(String str) {
        return this.context.getResources().getIdentifier(str, "id", this.context.getPackageName());
    }

    public String GetLatitude(Location location) {
        return Double.valueOf(location.getLatitude()).toString();
    }

    public int GetLayout(String str) {
        return this.context.getResources().getIdentifier(str, "layout", this.context.getPackageName());
    }

    public String GetListViewStr(View view) {
        return ((TextView) view).getText().toString();
    }

    public String GetListViewStr(AdapterView<?> adapterView, int i2) {
        return (String) adapterView.getItemAtPosition(i2);
    }

    public String GetLongitude(Location location) {
        return Double.valueOf(location.getLongitude()).toString();
    }

    public String GetOwner(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public String GetParentClass() {
        return ((Activity) this.context).getClass().getName();
    }

    public String GetPicFolder() {
        String str = String.valueOf(DefDir(String.valueOf(Const.DataFolder) + this.context.getPackageName() + Const.TargetPicFolder)) + "/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String GetResString(String str) {
        return this.context.getResources().getString(this.context.getResources().getIdentifier(str, "string", this.context.getPackageName()));
    }

    public Bitmap GetSharedBitmap(String str) {
        return ArrayToBitmap(GetSharedData(str));
    }

    public Boolean GetSharedBool(String str) {
        return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(str, false));
    }

    public Boolean GetSharedContains(String str) {
        return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(this.context).contains(str));
    }

    public byte[] GetSharedData(String str) {
        return Base64.decode(PreferenceManager.getDefaultSharedPreferences(this.context).getString(str, ""), 0);
    }

    public int GetSharedInteger(String str) {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getInt(str, 0);
    }

    public int GetSharedInteger(String str, int i2) {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getInt(str, i2);
    }

    public Intent GetSharedIntent(String str) {
        try {
            return Intent.parseUri(PreferenceManager.getDefaultSharedPreferences(this.context).getString(str, ""), 0);
        } catch (Exception e2) {
            return null;
        }
    }

    public long GetSharedLong(String str, long j2) {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getLong(str, j2);
    }

    public String GetSharedString(String str) {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getString(str, "");
    }

    public int GetSpinnerItemIndex(Spinner spinner) {
        return spinner.getSelectedItemPosition();
    }

    public String GetSpinnerItemOnChange(AdapterView<?> adapterView, View view, int i2) {
        return adapterView.getItemAtPosition(i2).toString();
    }

    public String GetSpinnerItemSelected(Spinner spinner) {
        return spinner.getSelectedItem().toString().trim();
    }

    public String GetSpinnerKeySelected(Spinner spinner) {
        String str = "";
        try {
            str = StrToParams(GetSpinnerItemSelected(spinner), " - ")[1].trim();
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetTempPicFile() {
        return String.valueOf(GetPicFolder()) + "temp.jpg";
    }

    public String GetTempPicFolder() {
        String str = String.valueOf(DefDir(String.valueOf(Const.DataFolder) + this.context.getPackageName() + Const.TempPicFolder)) + "/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetTime() {
        return new SimpleDateFormat("HH:mm").format(new Date());
    }

    public String GetTimeFromPicker(TimePicker timePicker) {
        int intValue = timePicker.getCurrentHour().intValue();
        int intValue2 = timePicker.getCurrentMinute().intValue();
        DecimalFormat decimalFormat = new DecimalFormat("##00");
        return (decimalFormat.format((long) intValue) + ":" + decimalFormat.format((long) intValue2)).trim();
    }

    @SuppressLint({"SimpleDateFormat"})
    public String GetTimes() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public int GetXmlAttrCount(Document document, String str, int i2) {
        return document.getElementsByTagName(str).item(i2).getAttributes().getLength();
    }

    public String GetXmlAttrKey(Document document, String str, int i2, int i3) {
        return document.getElementsByTagName(str).item(i2).getAttributes().item(i3).getNodeName();
    }

    public String GetXmlAttrValue(Document document, String str, int i2, int i3) {
        return document.getElementsByTagName(str).item(i2).getAttributes().item(i3).getNodeValue();
    }

    public String GetXmlAttrValue(Document document, String str, int i2, String str2) {
        return document.getElementsByTagName(str).item(i2).getAttributes().getNamedItem(str2).getNodeValue();
    }

    public int GetXmlElementCount(Document document, String str) {
        return document.getElementsByTagName(str).getLength();
    }

    public Document GetXmlFromFile(String str) {
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new FileInputStream(new File(str).getPath())));
            parse.getDocumentElement().normalize();
            return parse;
        } catch (Exception e2) {
            return null;
        }
    }

    public void Halt() {
        ((Activity) this.context).finish();
    }

    public void Hide(final View view) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                view.setVisibility(8);
            }
        });
    }

    public void Image(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    public byte[] ImageToArray(ImageView imageView) {
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @SuppressLint({"SimpleDateFormat"})
    public String IncDate(String str, int i2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str));
        } catch (ParseException e2) {
        }
        instance.add(5, i2);
        int i3 = instance.get(1);
        int i4 = instance.get(2);
        int i5 = instance.get(5);
        DecimalFormat decimalFormat = new DecimalFormat("##00");
        return (i3 + "-" + decimalFormat.format((long) (i4 + 1)) + "-" + decimalFormat.format((long) i5)).trim();
    }

    public void InitActivity(String str) {
        ((Activity) this.context).setContentView(GetLayout(str));
    }

    public void InitGPS(int i2, int i3, LocationListener locationListener) {
        ((LocationManager) this.context.getSystemService("location")).requestLocationUpdates("gps", (long) i2, (float) i3, locationListener);
    }

    public ListView InitListViewItems(String str, int i2, String[] strArr) {
        ListView listView = (ListView) InitView(str);
        listView.setAdapter(new ArrayAdapter((Activity) this.context, i2, strArr));
        return listView;
    }

    public Spinner InitSpinner(String str) {
        return (Spinner) InitView(str);
    }

    public Spinner InitSpinner(String str, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        Spinner InitSpinner = InitSpinner(str);
        InitSpinner.setOnItemSelectedListener(onItemSelectedListener);
        return InitSpinner;
    }

    public View InitView(String str) {
        return ((Activity) this.context).findViewById(GetID(str));
    }

    public void PlaySoundFromAsset(String str) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
            }
            AssetFileDescriptor openFd = this.context.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            mediaPlayer.prepare();
            mediaPlayer.setVolume(1.0f, 1.0f);
            mediaPlayer.setLooping(false);
            mediaPlayer.start();
        } catch (Exception e2) {
        }
    }

    public void PlayVideo(String str, String str2) {
        VideoView videoView = (VideoView) InitView(str);
        MediaController mediaController = new MediaController((Activity) this.context);
        mediaController.setAnchorView(videoView);
        Uri parse = Uri.parse(str2);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(parse);
        videoView.requestFocus();
        videoView.start();
    }

    public String QuotedStr(String str) {
        return "\"" + str + "\"";
    }

    public String ReadRawAsset(String str) {
        String str2 = "";
        try {
            InputStream open = this.context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            str2 = new String(bArr);
        } catch (Exception e2) {
        }
        return str2.trim();
    }

    public Spinner RefreshSpinnerList(Spinner spinner) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.context, 17367048, this.comboList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        return spinner;
    }

    @SuppressLint({"NewApi"})
    public void RemoveViewAttr(View view, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(i2);
        view.setLayoutParams(layoutParams);
    }

    public Bitmap ResizeImageDown(String str, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outWidth <= i2 && options.outHeight <= i3) {
            return BitmapFactory.decodeFile(str);
        }
        int round = Math.round(((float) options.outWidth) / ((float) i2));
        int round2 = Math.round(((float) options.outHeight) / ((float) i3));
        int i4 = round2 < round ? round2 : round;
        options.inJustDecodeBounds = false;
        options.inSampleSize = i4;
        return CropImage(BitmapFactory.decodeFile(str, options), options.outWidth, options.outHeight, i2, i3);
    }

    public void SaveDrawableToFile(String str, String str2) {
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), GetDrawableID(str2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            decodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
        }
    }

    public void SaveImageToFile(Bitmap bitmap, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
        }
    }

    public void SaveImageToFile(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
        }
    }

    public void SendSMS(String str, String str2) {
        SmsManager.getDefault().sendTextMessage(str, (String) null, str2, (PendingIntent) null, (PendingIntent) null);
    }

    public void SetActionBarBackgroundFromFile(String str) {
        if (FileExists(str).booleanValue()) {
            ((Activity) this.context).getActionBar().setBackgroundDrawable(GetDrawableFromFile(str));
        }
    }

    public void SetActionBarBackgroundFromRes(String str) {
        if (!str.isEmpty()) {
            ((Activity) this.context).getActionBar().setBackgroundDrawable(GetDrawableFromRes(str));
        }
    }

    public void SetBackgroundProp(View view, String str) {
        String GetSharedString = GetSharedString(str);
        if (GetSharedString != "") {
            try {
                if (FileExists(GetSharedString).booleanValue()) {
                    view.setBackground(GetDrawableFromFile(GetSharedString));
                }
            } catch (Exception e2) {
            }
        }
    }

    public void SetColBackgroundProp(View view, String str) {
        String GetSharedString = GetSharedString(str);
        if (GetSharedString != "") {
            try {
                view.setBackgroundColor(GetColorFromRes(GetSharedString));
            } catch (Exception e2) {
            }
        }
    }

    public EditText SetEditPasswdText(EditText editText) {
        editText.setInputType(129);
        return editText;
    }

    public void SetFonts(View view, String str) {
        if (str != "") {
            try {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(Typeface.createFromFile(str));
                }
                if (view instanceof Button) {
                    ((Button) view).setTypeface(Typeface.createFromFile(str));
                }
                if (view instanceof EditText) {
                    ((EditText) view).setTypeface(Typeface.createFromFile(str));
                }
                if (view instanceof Switch) {
                    ((Switch) view).setTypeface(Typeface.createFromFile(str));
                }
            } catch (Exception e2) {
            }
        } else {
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(Typeface.DEFAULT);
            }
            if (view instanceof Button) {
                ((Button) view).setTypeface(Typeface.DEFAULT);
            }
            if (view instanceof EditText) {
                ((EditText) view).setTypeface(Typeface.DEFAULT);
            }
            if (view instanceof Switch) {
                ((Switch) view).setTypeface(Typeface.DEFAULT);
            }
        }
    }

    public void SetImageFromArray(ImageView imageView, byte[] bArr) {
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public void SetResBackgroundProp(View view, String str) {
        String GetSharedString = GetSharedString(str);
        if (GetSharedString != "") {
            try {
                view.setBackgroundResource(GetDrawableID(GetSharedString));
            } catch (Exception e2) {
            }
        }
    }

    public void SetScrollbarTextView(TextView textView, int i2) {
        textView.setMaxLines(i2);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void SetSharedBitmap(String str, Bitmap bitmap) {
        SetSharedData(str, BitmapToArray(bitmap));
    }

    public void SetSharedBool(String str, Boolean bool) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
    }

    public void SetSharedData(String str, byte[] bArr) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putString(str, Base64.encodeToString(bArr, 0));
        edit.commit();
    }

    public void SetSharedInteger(String str, int i2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putInt(str, i2);
        edit.commit();
    }

    public void SetSharedIntent(String str, Intent intent) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putString(str, intent.toURI());
        edit.commit();
    }

    public void SetSharedLong(String str, long j2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putLong(str, j2);
        edit.commit();
    }

    public void SetSharedString(String str, String str2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void SetViewAboveOf(View view, String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(2, GetID(str));
        layoutParams.removeRule(3);
        view.setLayoutParams(layoutParams);
    }

    public void SetViewAboveOfProp(View view, String str, String str2) {
        SetViewAboveOf(view, GetSharedString(str));
        ClearSharedContains(str2);
    }

    public void SetViewBelowAboveOf(View view, String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.removeRule(3);
        String[] StrToParams = StrToParams(str, "|");
        String trim = StrToParams[0].trim();
        String trim2 = StrToParams[1].trim();
        layoutParams.addRule(3, GetID(trim));
        layoutParams.addRule(2, GetID(trim2));
        view.setLayoutParams(layoutParams);
    }

    public void SetViewBelowAboveOfProp(View view, String str) {
        SetViewBelowAboveOf(view, GetSharedString(str));
    }

    public void SetViewBelowOf(View view, String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(3, GetID(str));
        layoutParams.removeRule(2);
        view.setLayoutParams(layoutParams);
    }

    public void SetViewBelowOfProp(View view, String str, String str2) {
        SetViewBelowOf(view, GetSharedString(str));
        ClearSharedContains(str2);
    }

    public void SetViewTop(View view, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.removeRule(12);
        } else {
            layoutParams.addRule(12);
            layoutParams.removeRule(10);
        }
        view.setLayoutParams(layoutParams);
    }

    public void SetViewTopProp(View view, String str) {
        SetViewTop(view, GetSharedBool(str).booleanValue());
    }

    public void SetVisibledProp(View view, String str) {
        if (GetSharedBool(str).booleanValue()) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public void SetVisibledView(View view, boolean z2) {
        if (z2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public void Show(final View view) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                view.setVisibility(0);
            }
        });
    }

    public DatePicker ShowDatePickerDlg(EditText editText, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        DatePicker datePicker = new DatePicker(this.context);
        String[] StrToParams = StrToParams(GetEditText(editText), "-");
        datePicker.init(Integer.valueOf(StrToParams[0]).intValue(), Integer.valueOf(StrToParams[1]).intValue() - 1, Integer.valueOf(StrToParams[2]).intValue(), (DatePicker.OnDateChangedListener) null);
        builder.setView(datePicker);
        builder.setPositiveButton("Done", onClickListener);
        builder.show();
        return datePicker;
    }

    public EditText ShowInputDlg(String str, EditText editText, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        return DoShowInputDlg(str, new EditText(this.context), str2, str3, onClickListener);
    }

    public EditText ShowInputDlg(String str, EditText editText, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        EditText editText2 = new EditText(this.context);
        editText2.setText(str2);
        return DoShowInputDlg(str, editText2, str3, str4, onClickListener);
    }

    public EditText ShowInputNumberPasswdDlg(String str, EditText editText, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        EditText editText2 = new EditText(this.context);
        editText2.setInputType(18);
        return DoShowInputDlg(str, editText2, str2, str3, onClickListener);
    }

    public EditText ShowInputPasswdDlg(String str, EditText editText, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        EditText editText2 = new EditText(this.context);
        editText2.setInputType(129);
        return DoShowInputDlg(str, editText2, str2, str3, onClickListener);
    }

    public void ShowMessage(final String str) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(TTR.this.context);
                builder.setCancelable(true);
                builder.setMessage(str);
                builder.show();
            }
        });
    }

    public DialogInterface ShowMessageDlg(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setCancelable(false);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setNegativeButton(str4, onClickListener);
        builder.setPositiveButton(str3, onClickListener);
        return builder.show();
    }

    public void ShowOptionDlg(CharSequence[] charSequenceArr, String str, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle(str);
        builder.setItems(charSequenceArr, onClickListener);
        builder.show();
    }

    public void ShowProgressDLG(final String str) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                TTR.this.thisDLG = ProgressDialog.show(TTR.this.context, "", str, true);
            }
        });
    }

    public TimePicker ShowTimePickerDlg(EditText editText, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        TimePicker timePicker = new TimePicker(this.context);
        String[] StrToParams = StrToParams(GetEditText(editText), ":");
        int intValue = Integer.valueOf(StrToParams[0]).intValue();
        int intValue2 = Integer.valueOf(StrToParams[1]).intValue();
        timePicker.setCurrentHour(Integer.valueOf(intValue));
        timePicker.setCurrentMinute(Integer.valueOf(intValue2));
        builder.setView(timePicker);
        builder.setPositiveButton("Done", onClickListener);
        builder.show();
        return timePicker;
    }

    public void ShowToast(final int i2) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(TTR.this.context, String.valueOf(i2), 0).show();
            }
        });
    }

    public void ShowToast(final long j2) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(TTR.this.context, String.valueOf(j2), 0).show();
            }
        });
    }

    public void ShowToast(final String str) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(TTR.this.context, str, 0).show();
            }
        });
    }

    public void ShowToast(final boolean z2) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(TTR.this.context, String.valueOf(z2), 0).show();
            }
        });
    }

    public void Sleep(long j2) {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException e2) {
        }
    }

    public void StartActivity(Class<?> cls) {
        ((Activity) this.context).startActivity(new Intent(this.context, cls));
    }

    public void StartAttachActivity(Class<?> cls, String str, String str2) {
        Intent intent = new Intent(this.context, cls);
        intent.putExtra(str, str2);
        ((Activity) this.context).startActivity(intent);
    }

    public void StartCameraActivity(int i2, String str) {
        ((Activity) this.context).startActivityForResult(hndCamera(str), i2);
    }

    public void StartCameraActivity(int i2, String str, String str2) {
        ((Activity) this.context).startActivityForResult(hndCamera(str, str2), i2);
    }

    public void StartGalleryActivity(int i2) {
        ((Activity) this.context).startActivityForResult(hndGallery(), i2);
    }

    public void StartService(Class<?> cls) {
        ((Activity) this.context).startService(new Intent(this.context, cls));
    }

    public void StartVideoGalleryActivity(int i2) {
        ((Activity) this.context).startActivityForResult(hndVideoGallery(), i2);
    }

    public void StopService(String str) {
        ((Activity) this.context).stopService(GetSharedIntent(str));
    }

    public double StrToFloat(String str) {
        return !str.isEmpty() ? Double.parseDouble(str) : Double.parseDouble("0");
    }

    public int StrToInt(String str) {
        return !str.isEmpty() ? Integer.parseInt(str) : Integer.parseInt("0");
    }

    public String[] StrToParams(String str, String str2) {
        return str.split("\\" + str2);
    }

    public void Text(final TextView textView, final int i2) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                textView.setText(String.valueOf(i2));
            }
        });
    }

    public void Text(final TextView textView, final String str) {
        ((Activity) this.context).runOnUiThread(new Runnable() {
            public void run() {
                textView.setText(str);
            }
        });
    }

    public boolean UnZIP(String str, String str2) {
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        File file = new File(str);
        File file2 = new File(str2);
        try {
            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                File file3 = new File(file2, nextEntry.getName());
                File parentFile = nextEntry.isDirectory() ? file3 : file3.getParentFile();
                if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                    throw new FileNotFoundException("Failed to ensure directory: " + parentFile.getAbsolutePath());
                } else if (!nextEntry.isDirectory()) {
                    fileOutputStream = new FileOutputStream(file3);
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                }
            }
        } catch (Exception e2) {
            return false;
        } catch (Throwable th) {
            zipInputStream.close();
            throw th;
        }
    }

    public Intent hndCamera(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", fromFile);
        return intent;
    }

    public Intent hndCamera(String str, String str2) {
        Uri fromFile = Uri.fromFile(DefFilePath(str, str2));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", fromFile);
        return intent;
    }

    public Intent hndGallery() {
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public Intent hndVideoGallery() {
        return new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
    }

    public int mrNO() {
        return -2;
    }

    public int mrOK() {
        return -1;
    }

    public void resetImageFilter(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
        imageView.setAlpha(MotionEventCompat.ACTION_MASK);
    }

    public void setGrayScale(ImageView imageView) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        imageView.setAlpha(MotionEventCompat.ACTION_MASK);
    }
}
