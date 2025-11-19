package New.Fox.Style;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;

public class MainActivity extends Activity {
  TextView A;
  TextView B;
  TextView C;
  TextView D;
  TextView E;
  EditText Hax;
  EditText Hax2;
  LinearLayout Main;
  Button OK;
  SeekBar X;
  SeekBar X2;
  SeekBar X3;
  SeekBar X4;
  SeekBar X5;

  static /* synthetic */ void access$1000019(MainActivity mainActivity) {
    mainActivity.Draw();
  }

  static /* synthetic */ void access$1000020(MainActivity mainActivity) {
    mainActivity.AlertDialog();
  }

  protected void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setGravity(17);
    linearLayout.setPadding(7, 7, 7, 7);
    linearLayout.setOrientation(1);
    GradientDrawable gradientDrawable = new GradientDrawable();
    gradientDrawable.setStroke(3, -65536);
    gradientDrawable.setColor(-1);
    gradientDrawable.setCornerRadius(12);
    linearLayout.setBackground(gradientDrawable);
    Button button = new Button(this);
    button.setTextColor(-16777216);
    button.setAllCaps(false);
    button.setTextSize(11.0f);
    button.setText(Html.fromHtml("GradientDrawable", Html.FROM_HTML_MODE_LEGACY));
    GradientDrawable gradientDrawable2 = new GradientDrawable();
    gradientDrawable2.setStroke(3, -65536);
    gradientDrawable2.setColor(-1);
    gradientDrawable2.setCornerRadius(12);
    button.setBackground(gradientDrawable2);
    button.setOnClickListener(new _100000000(this));
    linearLayout.addView(button);
    setContentView(linearLayout);
  }

  class _100000000 implements View.OnClickListener {
    private final MainActivity this$0;

    _100000000(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onClick(View view) {
      MainActivity.access$1000019(this.this$0);
    }
  }

  private void Draw() {
    AlertDialog create = new AlertDialog.Builder(this).create();
    create.setCancelable(false);
    create.setTitle("GradientDrawable");
    this.Main = new LinearLayout(this);
    this.Main.setOrientation(1);
    this.Main.setGravity(17);
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setOrientation(0);
    GradientDrawable gradientDrawable = new GradientDrawable();
    gradientDrawable.setColor(-1);
    gradientDrawable.setStroke(3, Color.rgb(30, 232, 255));
    linearLayout.setBackground(gradientDrawable);
    this.Hax = new EditText(this);
    this.Hax.setText("000000");
    this.Hax.setLayoutParams(new LinearLayout.LayoutParams(IQ(150), -2));
    this.Hax.setGravity(17);
    this.Hax.setTextColor(-16777216);
    this.Hax.setTextSize(13.0f);
    this.Hax.setBackgroundColor(0);
    this.Hax2 = new EditText(this);
    this.Hax2.setText("FF0000");
    this.Hax2.setLayoutParams(new LinearLayout.LayoutParams(IQ(-1), -2));
    this.Hax2.setGravity(17);
    this.Hax2.setTextColor(-16777216);
    this.Hax2.setTextSize(13.0f);
    this.Hax2.setBackgroundColor(0);
    Button button = new Button(this);
    button.setText("OK");
    button.setTextColor(Color.rgb(30, 232, 255));
    button.setTextSize(14.0f);
    button.setBackgroundColor(0);
    button.setOnClickListener(new _100000001(this));
    GradientDrawable gradientDrawable2 = new GradientDrawable();
    gradientDrawable2.setColor(
        Color.parseColor(
            new StringBuffer().append("#").append(this.Hax.getText().toString()).toString()));
    gradientDrawable2.setStroke(
        3,
        Color.parseColor(
            new StringBuffer().append("#").append(this.Hax2.getText().toString()).toString()));
    this.OK = new Button(this);
    LiTob(this.OK, 5, 5, 6, 6);
    this.OK.setTextSize(14.0f);
    this.OK.setBackground(gradientDrawable2);
    this.Main.addView(this.OK);
    this.A = new TextView(this);
    this.A.setText(Html.fromHtml("0", Html.FROM_HTML_MODE_LEGACY));
    this.A.setTextColor(-16777216);
    this.A.setTextSize(11.0f);
    this.X = new SeekBar(this);
    SeekDraw(this.A, this.X, "CornerRadii");
    setThumb(this.X, 150);
    this.X.setOnSeekBarChangeListener(new _100000002(this));
    this.B = new TextView(this);
    this.B.setText(Html.fromHtml("0", Html.FROM_HTML_MODE_LEGACY));
    this.B.setTextColor(-16777216);
    this.B.setTextSize(11.0f);
    this.X2 = new SeekBar(this);
    SeekDraw(this.B, this.X2, "CornerRadii");
    setThumb(this.X2, 150);
    this.X2.setOnSeekBarChangeListener(new _100000003(this));
    this.C = new TextView(this);
    this.C.setText(Html.fromHtml("0", Html.FROM_HTML_MODE_LEGACY));
    this.C.setTextColor(-16777216);
    this.C.setTextSize(11.0f);
    this.X3 = new SeekBar(this);
    SeekDraw(this.C, this.X3, "CornerRadii");
    setThumb(this.X3, 150);
    this.X3.setOnSeekBarChangeListener(new _100000004(this));
    this.D = new TextView(this);
    this.D.setText(Html.fromHtml("0", Html.FROM_HTML_MODE_LEGACY));
    this.D.setTextColor(-16777216);
    this.D.setTextSize(11.0f);
    this.X4 = new SeekBar(this);
    SeekDraw(this.D, this.X4, "CornerRadii");
    setThumb(this.X4, 150);
    this.X4.setOnSeekBarChangeListener(new _100000005(this));
    this.E = new TextView(this);
    this.E.setText(Html.fromHtml("0", Html.FROM_HTML_MODE_LEGACY));
    this.E.setTextColor(-16777216);
    this.E.setTextSize(11.0f);
    this.X5 = new SeekBar(this);
    SeekDraw(this.E, this.X5, "Size Stroke");
    setThumb(this.X5, 80);
    this.X5.setOnSeekBarChangeListener(new _100000006(this));
    LinearLayout linearLayout2 = new LinearLayout(this);
    linearLayout2.setOrientation(0);
    Button button2 = new Button(this);
    button2.setText("Copy the code");
    button2.setTextColor(-16777216);
    button2.setTextSize(14.0f);
    button2.setBackgroundColor(0);
    button2.setOnClickListener(new _100000007(this));
    Button button3 = new Button(this);
    button3.setText("Close");
    button3.setTextColor(-16777216);
    button3.setTextSize(14.0f);
    button3.setBackgroundColor(0);
    button3.setOnClickListener(new _100000008(this, create));
    GradientDrawable gradientDrawable3 = new GradientDrawable();
    gradientDrawable3.setColor(-1);
    gradientDrawable3.setStroke(3, Color.rgb(30, 232, 255));
    this.Main.setBackground(gradientDrawable3);
    linearLayout.addView(button);
    linearLayout.addView(this.Hax);
    linearLayout.addView(this.Hax2);
    this.Main.addView(linearLayout);
    this.Main.addView(linearLayout2);
    linearLayout2.addView(button2);
    linearLayout2.addView(button3);
    create.setView(this.Main);
    create.show();
  }

  class _100000001 implements View.OnClickListener {

    private final MainActivity this$0;

    _100000001(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onClick(View view) {
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          this.this$0.X.getProgress(),
          this.this$0.X2.getProgress(),
          this.this$0.X3.getProgress(),
          this.this$0.X4.getProgress(),
          this.this$0.X5.getProgress());
    }
  }

  class _100000002 implements SeekBar.OnSeekBarChangeListener {

    private final MainActivity this$0;

    _100000002(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {}

    public void onStopTrackingTouch(SeekBar seekBar) {}

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
      this.this$0.A.setText(String.valueOf(i));
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          i,
          this.this$0.X2.getProgress(),
          this.this$0.X3.getProgress(),
          this.this$0.X4.getProgress(),
          this.this$0.X5.getProgress());
    }
  }

  class _100000003 implements SeekBar.OnSeekBarChangeListener {

    private final MainActivity this$0;

    _100000003(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {}

    public void onStopTrackingTouch(SeekBar seekBar) {}

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
      this.this$0.B.setText(String.valueOf(i));
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          this.this$0.X.getProgress(),
          i,
          this.this$0.X3.getProgress(),
          this.this$0.X4.getProgress(),
          this.this$0.X5.getProgress());
    }
  }

  class _100000004 implements SeekBar.OnSeekBarChangeListener {

    private final MainActivity this$0;

    _100000004(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {}

    public void onStopTrackingTouch(SeekBar seekBar) {}

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
      this.this$0.C.setText(String.valueOf(i));
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          this.this$0.X.getProgress(),
          this.this$0.X2.getProgress(),
          i,
          this.this$0.X4.getProgress(),
          this.this$0.X5.getProgress());
    }
  }

  class _100000005 implements SeekBar.OnSeekBarChangeListener {

    private final MainActivity this$0;

    _100000005(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {}

    public void onStopTrackingTouch(SeekBar seekBar) {}

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
      this.this$0.D.setText(String.valueOf(i));
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          this.this$0.X.getProgress(),
          this.this$0.X2.getProgress(),
          this.this$0.X3.getProgress(),
          i,
          this.this$0.X5.getProgress());
    }
  }

  class _100000006 implements SeekBar.OnSeekBarChangeListener {

    private final MainActivity this$0;

    _100000006(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {}

    public void onStopTrackingTouch(SeekBar seekBar) {}

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
      this.this$0.E.setText(String.valueOf(i));
      this.this$0.Bost(
          this.this$0.Hax.getText().toString(),
          this.this$0.Hax2.getText().toString(),
          this.this$0.X.getProgress(),
          this.this$0.X2.getProgress(),
          this.this$0.X3.getProgress(),
          this.this$0.X4.getProgress(),
          i);
    }
  }

  class _100000007 implements View.OnClickListener {

    private final MainActivity this$0;

    _100000007(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onClick(View view) {
      MainActivity.access$1000020(this.this$0);
    }
  }

  class _100000008 implements View.OnClickListener {

    private final MainActivity this$0;
    private final AlertDialog val$Picker;

    class _100000007 implements DialogInterface.OnClickListener {
      private final _100000008 this$0;

      _100000007(_100000008 r6) {
        this.this$0 = r6;
      }

      public void onClick(DialogInterface dialogInterface, int i) {}
    }

    _100000008(MainActivity mainActivity, AlertDialog alertDialog) {
      this.this$0 = mainActivity;
      this.val$Picker = alertDialog;
    }

    public void onClick(View view) {
      this.val$Picker.dismiss();
    }
  }

  private void AlertDialog() {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setOrientation(1);
    TextNew(linearLayout, "GradientDrawable ID = new GradientDrawable();");
    TextNew(
        linearLayout,
        new StringBuffer()
            .append(
                new StringBuffer()
                    .append(
                        new StringBuffer()
                            .append("ID.setColor(Color.parseColor(")
                            .append("#")
                            .toString())
                    .append(this.Hax.getText().toString())
                    .toString())
            .append("));")
            .toString());
    TextNew(
        linearLayout,
        new StringBuffer()
            .append(
                new StringBuffer()
                    .append(
                        new StringBuffer()
                            .append(
                                new StringBuffer()
                                    .append(
                                        new StringBuffer()
                                            .append(
                                                new StringBuffer()
                                                    .append("ID.setStroke(")
                                                    .append(this.X5.getProgress())
                                                    .toString())
                                            .append(",")
                                            .toString())
                                    .append("Color.parseColor(")
                                    .toString())
                            .append("#")
                            .toString())
                    .append(this.Hax2.getText().toString())
                    .toString())
            .append("));")
            .toString());
    TextNew(
        linearLayout,
        new StringBuffer()
            .append(
                new StringBuffer()
                    .append(
                        new StringBuffer()
                            .append(
                                new StringBuffer()
                                    .append(
                                        new StringBuffer()
                                            .append(
                                                new StringBuffer()
                                                    .append(
                                                        new StringBuffer()
                                                            .append(
                                                                new StringBuffer()
                                                                    .append(
                                                                        new StringBuffer()
                                                                            .append(
                                                                                new StringBuffer()
                                                                                    .append(
                                                                                        new StringBuffer()
                                                                                            .append(
                                                                                                new StringBuffer()
                                                                                                    .append(
                                                                                                        new StringBuffer()
                                                                                                            .append(
                                                                                                                new StringBuffer()
                                                                                                                    .append(
                                                                                                                        new StringBuffer()
                                                                                                                            .append(
                                                                                                                                new StringBuffer()
                                                                                                                                    .append(
                                                                                                                                        "ID.setCornerRadii(new float[]{")
                                                                                                                                    .append(
                                                                                                                                        this
                                                                                                                                            .X
                                                                                                                                            .getProgress())
                                                                                                                                    .toString())
                                                                                                                            .append(
                                                                                                                                ",")
                                                                                                                            .toString())
                                                                                                                    .append(
                                                                                                                        this
                                                                                                                            .X
                                                                                                                            .getProgress())
                                                                                                                    .toString())
                                                                                                            .append(
                                                                                                                ",")
                                                                                                            .toString())
                                                                                                    .append(
                                                                                                        this
                                                                                                            .X2
                                                                                                            .getProgress())
                                                                                                    .toString())
                                                                                            .append(
                                                                                                ",")
                                                                                            .toString())
                                                                                    .append(
                                                                                        this.X2
                                                                                            .getProgress())
                                                                                    .toString())
                                                                            .append(",")
                                                                            .toString())
                                                                    .append(this.X3.getProgress())
                                                                    .toString())
                                                            .append(",")
                                                            .toString())
                                                    .append(this.X3.getProgress())
                                                    .toString())
                                            .append(",")
                                            .toString())
                                    .append(this.X4.getProgress())
                                    .toString())
                            .append(",")
                            .toString())
                    .append(this.X4.getProgress())
                    .toString())
            .append("});")
            .toString());
    TextNew(linearLayout, "View.setBackground(ID);");
    builder.setView(linearLayout);
    builder.show();
  }

  class _100000009 implements View.OnClickListener {

    final MainActivity this$0; // final добавлено для безопасности

    _100000009(MainActivity mainActivity) {
      this.this$0 = mainActivity;
    }

    public void onClick(View view) {}
  }

  private void TextNew(LinearLayout linearLayout, String str) {
    TextView textView = new TextView(this);
    textView.setText(Html.fromHtml(str, Html.FROM_HTML_MODE_LEGACY));
    textView.setTextColor(-16777216);
    textView.setTextIsSelectable(true);
    textView.setTextSize(11.0f);
    linearLayout.addView(textView);
  }

  class _100000010 implements View.OnClickListener {

    private final MainActivity this$0;
    private final AlertDialog val$Picker;

    _100000010(MainActivity mainActivity, AlertDialog alertDialog) {
      this.this$0 = mainActivity;
      this.val$Picker = alertDialog;
    }

    public void onClick(View view) {
      this.val$Picker.dismiss();
    }
  }

  public void Bost(String str, String str2, double d, double d2, double d3, double d4, double d5) {
    GradientDrawable gradientDrawable = new GradientDrawable();
    gradientDrawable.setColor(
        Color.parseColor(new StringBuffer().append("#").append(str).toString()));
    gradientDrawable.setStroke(
        (int) d5, Color.parseColor(new StringBuffer().append("#").append(str2).toString()));
    gradientDrawable.setCornerRadii(
        new float[] {(int) d, (int) d, (int) d2, (int) d2, (int) d3, (int) d3, (int) d4, (int) d4});
    this.OK.setBackground(gradientDrawable);
  }

  private void SeekDraw(TextView textView, SeekBar seekBar, String str) {
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setOrientation(0);
    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, IQ(30)));
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(IQ(60), -2);
    TextView textView2 = new TextView(this);
    textView2.setLayoutParams(layoutParams);
    textView2.setText(Html.fromHtml(str, Html.FROM_HTML_MODE_LEGACY));
    textView2.setTextColor(-16777216);
    textView2.setTextSize(11.0f);
    this.Main.addView(linearLayout);
    linearLayout.addView(textView2);
    linearLayout.addView(seekBar);
    linearLayout.addView(textView);
  }

  public void setThumb(SeekBar seekBar, int i) {
    LinearLayout.LayoutParams seekParams = new LinearLayout.LayoutParams(355, -2, 0f);
    GradientDrawable gradientDrawable = new GradientDrawable();
    gradientDrawable.setColor(-16777216);
    gradientDrawable.setStroke(2, -65536);
    gradientDrawable.setCornerRadius(100);
    gradientDrawable.setSize(IQ(17), IQ(17));
    seekBar.setThumb(gradientDrawable);
    GradientDrawable gradientDrawable2 = new GradientDrawable();
    gradientDrawable2.setColor(-1);
    gradientDrawable2.setStroke(1, -65536);
    gradientDrawable2.setCornerRadius(6);
    seekBar.setProgressDrawable(gradientDrawable2);
    seekBar.setLayoutParams(seekParams);
    seekBar.setMax(i);
    if (Build.VERSION.SDK_INT >= 21) {
      seekBar.setMin(0);
    }
  }

  private void LiTob(View view, int i, int i2, int i3, int i4) {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    layoutParams.setMargins(i3, i, i4, i2);
    view.setLayoutParams(layoutParams);
  }

  private void setImageFromAssets(ImageView imageView, String str) {
    try {
      imageView.setImageDrawable(
          Drawable.createFromStream(getBaseContext().getAssets().open(str), (String) null));
    } catch (IOException e) {
      Toast.makeText(this, new StringBuffer().append("\n").append(e.getMessage()).toString(), 0)
          .show();
    }
  }

  private int IQ(int i) {
    return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
  }
}
