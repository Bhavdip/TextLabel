package com.example.dsk02.textlabel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.dsk02.textlabel.textlabel.TextLabelView;

public class MainActivity extends AppCompatActivity {
  private TextLabelView mTextLabelView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTextLabelView = (TextLabelView) findViewById(R.id.textView);
    TextLabelView.Builder builder = new TextLabelView.Builder();
    builder.setText("Hello, world");
    builder.setTextSize(20);
    mTextLabelView.setTextLayout(builder.build());
  }
}
