package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Timeandwork2 extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdy);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewy);
pdfView.fromAsset("tws.pdf").load();
}}
