package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Hightand extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdk);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewk);
pdfView.fromAsset("handd.pdf").load();
}}
