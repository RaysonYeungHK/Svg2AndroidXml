package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.android.ide.common.vectordrawable.Svg2Vector;

/**
 * Created by Rayson Yeung on 20/9/2017.
 */

public class Main {
	public static void main(String[] args) {
		File sourceFolder = new File(args[0]);
		File outputFolder = new File(args[1]);

		File[] filesToConvert = sourceFolder.listFiles();

		for (File svgFile : filesToConvert) {
			if (svgFile.getName().endsWith(".svg")) {
				File xmlFile = new File(outputFolder, svgFile.getName().replace(".svg", ".xml"));
				System.out.println("Convert '" + svgFile.getName() + "' to '" + xmlFile.getName() + "'");
				try {
					OutputStream outStream = new FileOutputStream(xmlFile);
					Svg2Vector.parseSvgToXml(svgFile, outStream);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
