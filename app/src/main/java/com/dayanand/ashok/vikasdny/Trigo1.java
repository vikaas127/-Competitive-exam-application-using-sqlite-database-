package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Trigo1 extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdz);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewz);
pdfView.fromAsset("trigo.pdf").load();
}}
