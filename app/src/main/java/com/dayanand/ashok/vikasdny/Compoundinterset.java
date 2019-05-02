package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Compoundinterset extends Activity {
    PDFView pdfView;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdf);
        PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewf);
        pdfView.fromAsset("compound.pdf").load();}}




